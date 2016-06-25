package com.aptoto.thrift.client;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.aptoto.thrift.exception.ThriftException;

/**
 * 
 * Thrift客户端抽象工厂
 * @author  hgq
 * @date    2016年6月24日
 */
public abstract class BaseClientFactory {
	private TTransport transport;

	/**
	 * Thrift 服务类名(含包名）
	 */
	protected String thriftService;

	/**
	 * 服务端主机
	 */
	protected String hostIp;

	/**
	 * 服务端端口
	 */
	protected int port;

	/**
	 * 超时时长
	 */
	protected int timeout = 2000;

	public BaseClientFactory() {
	}

	public BaseClientFactory(String hostIp, int port, int timeout, String thriftService) {
		this.hostIp = hostIp;
		this.port = port;
		this.timeout = timeout;
		this.thriftService = thriftService;
	}

	/**
	 * 初始化，创建TTransport实例
	 * 
	 * @throws ThriftException
	 */
	public void init() throws ThriftException {
		try {
			Socket s = new Socket(hostIp, port);
			s.setReuseAddress(true);
			s.setSoTimeout(timeout);
			transport = new TSocket(s);
			if (!transport.isOpen()) {
				transport.open();
			}
		} catch (TTransportException e) {
			throw new ThriftException(e);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 获取Thrift Client对象， 反映射机制。
	 * @return
	 * @throws ThriftException
	 */
	public abstract Object getClient() throws ThriftException;

	/**
	 * 销毁资源，关闭TTransport连接。
	 * 
	 * @throws ThriftException
	 */
	public void destroy() throws ThriftException {
		try {
			if (transport != null) {
				transport.close();
				transport = null;
			}
		} catch (Exception e) {
			throw new ThriftException(e);
		}
	}

	public String getThriftService() {
		return thriftService;
	}

	public void setThriftService(String thriftService) {
		this.thriftService = thriftService;
	}

	public String getHostIp() {
		return hostIp;
	}

	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public TTransport getTransport() {
		return transport;
	}

	public void setTransport(TTransport transport) {
		this.transport = transport;
	}
}



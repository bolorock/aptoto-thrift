package com.aptoto.thrift.client;

import java.util.List;

import com.aptoto.thrift.client.BaseClientFactory;
import com.aptoto.thrift.client.ThriftBinaryClientFactory;
import com.aptoto.thrift.exception.ThriftException;
import com.aptoto.thrift.rpc.user.SysUser;
import com.aptoto.thrift.rpc.user.SysUserService;

/**
 * Description：<br> 
 * 测试客户端调用
 * @author  hgq
 * @date    2016年6月24日
 */
public class ClientTest {
	public static String rpcPackage = "com.aptoto.thrift.rpc";
	public static String serviceModuel = "user";
	public static String serverIp = "127.0.0.1";
	public static int serverPort = 19191;
	public static int timeout = 200000;
	
	public static void main(String[] args) {
		ClientTest test = new ClientTest();
		test.execute();
	}
	
	public void execute(){
		BaseClientFactory clientFactory = null;
		try {
			clientFactory = getFactory("SysUserService");
			SysUserService.Client client = (SysUserService.Client) clientFactory.getClient();
		
			//client.addSysUser(sysUser);
			//client.deleteSysUser(sysUser);
			List<SysUser> userList = client.getSysUserList();
			System.out.println(userList.size());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(clientFactory!=null){
				try {
					clientFactory.destroy();
				} catch (ThriftException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public BaseClientFactory getFactory(String serviceName){
		String service = new StringBuffer().append(rpcPackage).append(".").append(serviceModuel).append(".").append(serviceName).toString();
		BaseClientFactory clientFactory = new ThriftBinaryClientFactory(serverIp, serverPort,timeout, service);
		return clientFactory;
	}

}



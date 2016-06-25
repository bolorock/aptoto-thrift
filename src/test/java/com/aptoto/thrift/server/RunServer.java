package com.aptoto.thrift.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description：<br> 
 * Thrift 服务端启动
 * @author  hgq
 * @date    2016年6月24日
 */
public class RunServer extends Thread {
	private Logger logger = LoggerFactory.getLogger(RunServer.class);
	
	public static void main(String[] args) {
		Thread thread = new RunServer();
		thread.start();
	}
	
	@SuppressWarnings("resource")
	@Override
	public void run() {
		try{
			new ClassPathXmlApplicationContext(new String[] {"config/app.xml"});
		} catch (SecurityException e) {
			logger.debug(e.getMessage());
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			logger.debug(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



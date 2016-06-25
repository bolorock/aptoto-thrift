package com.aptoto.thrift.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/** 
 * Spring ApplicationContext
 * @author  hgq
 * @date    2016年6月24日
 */
public class SpringApplicationContext implements ApplicationContextAware {
	//声明一个静态变量保存
	private static ApplicationContext context;
	
	@SuppressWarnings("static-access")
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
	}
	
	public static ApplicationContext getContext(){
		  return context;
	}

	public static Object getBean(String beanName){
		  return context.getBean(beanName);
	}
}



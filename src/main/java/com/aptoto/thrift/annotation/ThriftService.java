package com.aptoto.thrift.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Thrift Service实现注解
*  
* @author hgq 
* @date 2016年6月24日
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.TYPE})
@Inherited
public @interface ThriftService {
	/**
	 * Thrift 服务实现的全名
	 * @return
	 */
	public String service();
}



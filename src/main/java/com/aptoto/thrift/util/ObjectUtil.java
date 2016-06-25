package com.aptoto.thrift.util;

/**
 * Description：<br> 
 * 对象操作工具
 * @author  hgq
 * @date    2016年6月24日
 */
public class ObjectUtil {

	/**
	 * 如前传入的对象t为null，则通过返映实例货传入的类型实例
	 * @param c
	 * @param t
	 * @return
	 */
	public static <T> T getNotNullObject(Class<T> c,T t){
		if(t==null){
			try {
				t = c.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return t;
	}
}



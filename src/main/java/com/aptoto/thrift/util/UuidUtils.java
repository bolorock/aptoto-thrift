package com.aptoto.thrift.util;

import java.util.UUID;

/**
 * Description：<br> 
 * UUID工具类
 * @author  hgq
 * @date    2016年6月24日
 */
public class UuidUtils {
	public static String getUUid() {
		String uuid = null;
		try {
			uuid = UUID.randomUUID().toString().replaceAll("-", "");
		} catch (Exception ex) {

		}
		return uuid;
	}
}



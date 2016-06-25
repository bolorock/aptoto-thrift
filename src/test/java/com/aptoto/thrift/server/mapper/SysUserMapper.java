package com.aptoto.thrift.server.mapper;

import org.mybatis.spring.annotation.MapperScan;

import com.aptoto.thrift.mybatis.BaseMapper;

/**
 * Description：<br> 
 * 
 * @author  hgq
 * @date    2016年6月24日
 */
@MapperScan("sysUserMapper")
public interface SysUserMapper<T, PK> extends BaseMapper<T, PK> {

}



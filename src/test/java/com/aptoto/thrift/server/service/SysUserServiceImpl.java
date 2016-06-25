package com.aptoto.thrift.server.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aptoto.thrift.annotation.ThriftService;
import com.aptoto.thrift.rpc.common.ThriftServiceException;
import com.aptoto.thrift.rpc.user.SysUser;
import com.aptoto.thrift.rpc.user.SysUserService.Iface;
import com.aptoto.thrift.server.mapper.SysUserMapper;

/**
 * Description：<br> 
 * 
 * @author hgq
 * @date    2014年12月13日
 * 
 */
@Service("sysUserServiceImpl")
@ThriftService(service = "com.aptoto.thrift.rpc.user.SysUserService")
public class SysUserServiceImpl implements Iface {
	
	@Autowired
	private SysUserMapper<SysUser,String> sysUserMapper;

	@Override
	public int addSysUser(SysUser sysUser) throws ThriftServiceException,
			TException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteSysUser(SysUser sysUser) throws ThriftServiceException,
			TException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSysUser(SysUser sysUser) throws ThriftServiceException,
			TException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysUser querySysUserByName(String userName) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysUser> getSysUserList() throws TException {
		// TODO Auto-generated method stub
//		List<SysUser> users= new ArrayList<SysUser>();
//		SysUser user=new SysUser();
//		user.setPid(1);
//		user.setDepartment("开发部");
//		user.setMemberId("23");
//		users.add(user);
//		return users;
	    List<SysUser> users=sysUserMapper.selectAll();
	    return users;
	}

	@Override
	public List<SysUser> getSysUserByParameter(Map<String, String> parameter)
			throws TException {
		// TODO Auto-generated method stub
		return null;
	}

}



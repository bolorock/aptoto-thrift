package com.aptoto.thrift.mybatis;

import java.util.List;
import java.util.Map;

/**
 * Description：<br> 
 * 通用Mapper接口
 * @author  hgq
 * @date    2016年6月24日
 */
public interface BaseMapper<T, PK> {
	/**
	 * 添加对象
	 * @param o
	 * @return
	 */
	public int insert(T o);
	
	/**
	 * 根据主键删除对象
	 * @param pk
	 * @return
	 */
	public int deleteByPrimaryKey(PK pk);
	
	/**
	 * 根据条件删除对象
	 * @param params
	 * @return
	 */
	public int deleteByMap(Map<String, Object> params);
	
	/**
	 * 删除对象
	 * @param o
	 * @return
	 */
	public int delete(T o);

	/**
	 * 根据主键查询对象
	 * @param pk
	 * @return
	 */
	public T selectByPrimaryKey(PK pk);
	
	/**
	 * 根据条件查询对象列表
	 * @param params
	 * @return
	 */
	public List<T> selectByMap(Map<String, Object> params);
	
	/**
	 * 查询所有对象
	 * @return
	 */
	public List<T> selectAll();
	
	
	/**
	 * 查询所有记录总数
	 * @return
	 */
	public Long selectAllCnt();
	
	
	
	/**
	 * 根据主键更新对象
	 * @param o
	 * @return
	 */
	public int updateByPrimaryKey(T o);

	/**
	 * 根据条件更新对象
	 * @param o
	 * @param params
	 * @return
	 */
	public int updateWithMap(T o,Map<String, Object> params);
}



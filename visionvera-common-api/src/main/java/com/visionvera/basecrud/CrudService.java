package com.visionvera.basecrud;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * Service基类
 * @author zhanghui
 * @version 2018-05-25
 */

public abstract class CrudService<D extends CrudDao<T>, T> implements BaseService<T> {
	
	/**
	 * 持久层对象
	 */
	@Autowired
	protected D dao;
	
	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(String id) {
		return dao.selectByPrimaryKey(id);
	}
	
	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T get(T entity) {
		return dao.get(entity);
	}
	
	/**
	 * 查询列表数据不分页
	 * @param entity
	 * @return
	 */
	public List<T> queryList(T entity) {
		return dao.queryList(entity);
	}
	
	/**
	 * 查询列表数据分页
	 * @param entity
	 * @return
	 */
	public PageInfo<T> queryListPage(T entity,Integer pageNum,Integer pageSize) {
		if (pageNum != -1) {
			PageHelper.startPage(pageNum, pageSize);
		}
		List<T> centerPageList =dao.queryList(entity);
		PageInfo<T> pageInfo = new PageInfo<T>(centerPageList);
		return pageInfo;
	}
	
	/**
	 * 保存数据
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public int save(T entity) {
		if(entity==null)return -1;
		return dao.insertSelective(entity);

	}

	/**
	 * 更新数据
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public int update(T entity) {
		if(entity==null)return -1;
		return dao.updateByPrimaryKeySelective(entity);
	}
	
	/**
	 * 删除数据
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public int delete(T entity) {
		return dao.delete(entity);
	}
	/**
	 * 删除数据
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public int deleteByPrimaryKey(T entity) {
		return dao.delete(entity);
	}
	/**
	 * 获取记录总数
	 * @param entity
	 */
	public int queryCount(T entity) {
		return dao.queryCount(entity);
	}

}

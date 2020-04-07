package com.visionvera.basecrud;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * Service 接口基类
 * ClassName: BaseService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2018年5月25日 <br/>
 *
 * @author zhanghui
 * @version @param <T>
 * @since JDK 1.7
 */
public interface BaseService <T> {
		
		/**
		 * 获取单条数据
		 * @param id
		 * @return
		 */
		public T get(String id) ;

		
		/**
		 * 获取单条数据
		 * @param entity
		 * @return
		 */
		public T get(T entity) ;
		
		/**
		 * 查询数据列表
		 * @param entity
		 * @return
		 */
		public List<T> queryList(T entity);
		/**
		 * 分页查询数据列表
		 * @param entity
		 * @return
		 */
		public PageInfo<T> queryListPage(T entity,Integer pageNum,Integer pageSize);
		
	
		/**
		 * 保存数据（插入或更新）
		 * @param entity
		 */
		public int save(T entity) ;
		
		/**
		 * 更新数据
		 * @param entity
		 */
		public int update(T entity) ;
		
		/**
		 * 删除数据
		 * @param entity
		 */
		public int delete(T entity) ;
		/**
		 * 查询总记录数
		 * @param entity
		 */
		public int queryCount(T entity) ;
}

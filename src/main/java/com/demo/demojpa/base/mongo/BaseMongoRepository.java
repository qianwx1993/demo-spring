package com.demo.demojpa.base.mongo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @Auther: qian
 * 在此类中添加自定义的方法
 * @Date: 2019/3/25 14:24
 * @Company Bangsun
 * @Description:
 */
@NoRepositoryBean
public interface BaseMongoRepository <T, ID extends Serializable>
		extends MongoRepository<T, ID> {
	/**
	 * 自定义分页查询
	 * @param query
	 * @param pageable
	 * @return
	 */
	Page<T> findPageByQuery(Query query, Pageable pageable);

	/**
	 * 自定义分页查询
	 *
	 * @param criteria
	 * @param pageable
	 * @return
	 */
	Page<T> findPageByCriteria(Criteria criteria, Pageable pageable);
}

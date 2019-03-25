package com.demo.demojpa.repo.mongo;

import com.demo.demojpa.base.mongo.BaseMongoRepository;
import com.demo.demojpa.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Auther: qian
 * @Date: 2019/3/25 14:36
 * @Company Bangsun
 * @Description:
 */
public interface StudentRepository extends BaseMongoRepository<Student, String> {
	/**
	 * 根据地址查询所有
	 *
	 * @param id
	 * @return
	 */
	List<Student> findAllById(String id);

	/**
	 * 根据实体类中的属性进行模糊查询
	 *
	 * @param name
	 * @return
	 */
	List<Student> findByNameLike(String name);

	/**
	 * 根据实体类中的属性进行模糊查询带分页
	 * 带分页的模糊查询，其实是把模糊查询以及分页进行合并，
	 * 定义方法名的规则和模糊查询的规则一致，只是参数不同而已。
	 *
	 * @param name
	 * @param pageable
	 * @return
	 */
	Page<Student> findByNameLike(String name, Pageable pageable);

	/**
	 * 查询年龄小于某值的所有数据
	 *
	 * @param maxAge
	 * @return
	 */
//    @Query("")
	List<Student> findAllByIdLessThan(int maxAge);
}

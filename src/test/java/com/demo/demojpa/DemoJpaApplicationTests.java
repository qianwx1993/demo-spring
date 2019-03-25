package com.demo.demojpa;

import com.demo.demojpa.model.Student;
import com.mongodb.MongoClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoJpaApplicationTests {
	@Autowired
	private MongoTemplate mongoTemplate;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findStudents(){
		List<Student> students = mongoTemplate.findAll(Student.class);
		for (Student student : students) {
			System.out.println(student.getId()+","+student.getName());
		}
	}

	@Test
	public void saveStudent(){
		Student student=new Student();
		student.setId("2");
		student.setName("梁博");
		mongoTemplate.save(student);
	}

}

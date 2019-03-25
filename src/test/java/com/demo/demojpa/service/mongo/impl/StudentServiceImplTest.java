package com.demo.demojpa.service.mongo.impl;

import com.demo.demojpa.model.Student;
import com.demo.demojpa.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/9
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentServiceImplTest {

    @Autowired
    private IStudentService studentService;

    @Test
    public void queryAll() {

        List<Student> studentList = studentService.queryAll();
        for (Student student : studentList) {
            System.out.println(student.getId()+","+student.getName());
        }
    }

    @Test
    public void batchSave() {
        List<Student> studentList = new ArrayList<Student>() {{
        }};
        studentService.batchSave(studentList);
    }

    @Test
    public void queryByNameLike() {
        String name = "马";
        List<Student> studentList = studentService.queryByNameLike(name);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void queryByNameAndPage() {
        String name = "马";
        Page<Student> studentPage = studentService.queryByNameAndPage(0, 10, name);
        System.out.println("总条数" + studentPage.getTotalElements());
        System.out.println("总页数" + studentPage.getTotalPages());
        //数据列表
        List<Student> studentList = studentPage.getContent();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }


}
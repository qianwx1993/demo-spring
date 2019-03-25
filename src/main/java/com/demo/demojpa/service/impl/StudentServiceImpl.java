package com.demo.demojpa.service.impl;

import com.demo.demojpa.model.Student;
import com.demo.demojpa.repo.mongo.StudentRepository;
import com.demo.demojpa.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * jpa-demo
 *
 * @Author 孙龙
 * @Date 2018/7/9
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> queryAll() {

        return studentRepository.findAll();
    }

    @Override
    public void batchSave(List<Student> studentList) {
        studentRepository.insert(studentList);
    }


    @Override
    public List<Student> queryByNameLike(String name) {
        return studentRepository.findByNameLike(name);
    }

    @Override
    public Page<Student> queryByNameAndPage(int page, int rows, String name) {
//        Sort sort = new Sort(Sort.DESc, )
        PageRequest pageRequest = new PageRequest(page, rows);
        return studentRepository.findByNameLike(name, pageRequest);
    }


}

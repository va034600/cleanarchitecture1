package com.gmail.va034600.cleanarchitecture1.gateway.database.impl;

import com.gmail.va034600.cleanarchitecture1.business.entity.Student;
import com.gmail.va034600.cleanarchitecture1.gateway.database.jpa.StudentRepositoryJpa;
import com.gmail.va034600.cleanarchitecture1.gateway.database.model.StudentModel;
import com.gmail.va034600.cleanarchitecture1.business.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentRepositoryImpl implements StudentRepository {
    @Autowired
    public StudentRepositoryJpa studentRepositoryJpa;

    @Override
    public void registerTaro() {
        StudentModel student1 = new StudentModel();
        student1.setId(0);
        student1.setName("abc");
        studentRepositoryJpa.save(student1);

        StudentModel student2 = new StudentModel();
        student2.setId(1);
        student2.setName("taro");
        studentRepositoryJpa.save(student2);
    }

    @Override
    public Student findTaro() {
        Student result = new Student();
        result.setName(studentRepositoryJpa.findById(1L).get().getName());
        return result;
    }
}

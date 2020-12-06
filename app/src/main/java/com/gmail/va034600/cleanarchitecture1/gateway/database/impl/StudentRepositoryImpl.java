package com.gmail.va034600.cleanarchitecture1.gateway.database.impl;

import com.gmail.va034600.cleanarchitecture1.business.entity.Student;
import com.gmail.va034600.cleanarchitecture1.gateway.database.jpa.StudentRepositoryJpa;
import com.gmail.va034600.cleanarchitecture1.gateway.database.model.StudentModel;
import com.gmail.va034600.cleanarchitecture1.business.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentRepositoryImpl implements StudentRepository {
    @Autowired
    public StudentRepositoryJpa studentRepositoryJpa;

    @Override
    public Long create(Student student) {
        StudentModel studentModel = new StudentModel();
        studentModel.setName(student.getName());
        studentRepositoryJpa.save(studentModel);
        return studentModel.getId();
    }

    @Override
    public Optional<Student> findByName(String name) {
        Optional<StudentModel> studentModel = studentRepositoryJpa.findByName(name);
        return studentModel.map(a -> {
            Student s = new Student();
            s.setId(a.getId());
            s.setName(a.getName());
            return s;
        });
    }
}

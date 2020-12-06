package com.gmail.va034600.cleanarchitecture1.business.repository;

import com.gmail.va034600.cleanarchitecture1.business.entity.Student;

import java.util.Optional;

public interface StudentRepository{
    Long create(Student student);
    Optional<Student> findByName(String name);
}

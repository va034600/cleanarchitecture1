package com.gmail.va034600.cleanarchitecture1.business.interactor;

import com.gmail.va034600.cleanarchitecture1.business.entity.Student;
import com.gmail.va034600.cleanarchitecture1.business.repository.StudentRepository;
import com.gmail.va034600.cleanarchitecture1.business.usecase.RegistrationStudentUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationStudentUseCaseImpl implements RegistrationStudentUseCase {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Long register(String name) {
        Student student = new Student();
        student.setName(name);
        return studentRepository.create(student);
    }
}

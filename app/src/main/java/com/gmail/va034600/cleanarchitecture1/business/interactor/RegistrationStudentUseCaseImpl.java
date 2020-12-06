package com.gmail.va034600.cleanarchitecture1.business.interactor;

import com.gmail.va034600.cleanarchitecture1.business.entity.Student;
import com.gmail.va034600.cleanarchitecture1.business.repository.StudentRepository;
import com.gmail.va034600.cleanarchitecture1.business.service.MailService;
import com.gmail.va034600.cleanarchitecture1.business.usecase.RegistrationStudentUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationStudentUseCaseImpl implements RegistrationStudentUseCase {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    MailService mailService;

    @Override
    public Long register(String name, String email) {
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        Long id = studentRepository.create(student);

        mailService.sendMail(email, "registration mail");

        return id;
    }
}

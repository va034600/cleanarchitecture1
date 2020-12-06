package com.gmail.va034600.cleanarchitecture1.business.interactor;

import com.gmail.va034600.cleanarchitecture1.business.entity.Student;
import com.gmail.va034600.cleanarchitecture1.business.repository.StudentRepository;
import com.gmail.va034600.cleanarchitecture1.business.service.MailService;
import com.gmail.va034600.cleanarchitecture1.business.usecase.RegistrationStudentUseCase;
import org.springframework.stereotype.Component;

@Component
public class RegistrationStudentUseCaseImpl implements RegistrationStudentUseCase {
    private final StudentRepository studentRepository;
    private final MailService mailService;

    public RegistrationStudentUseCaseImpl(
            StudentRepository studentRepository,
            MailService mailService
    ){
        this.studentRepository = studentRepository;
        this.mailService = mailService;
    }

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

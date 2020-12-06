package com.gmail.va034600.cleanarchitecture1.business.interactor;

import com.gmail.va034600.cleanarchitecture1.business.entity.Student;
import com.gmail.va034600.cleanarchitecture1.business.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class RegistrationStudentUseCaseImplTest {
    @Resource
    RegistrationStudentUseCaseImpl sut;
    @Autowired
    StudentRepository studentRepository;

    @Test
    void register() {
        sut.register("taro", "a@a.com");
        Student student = studentRepository.findByName("taro").get();
        assertThat(student.getName()).isEqualTo("taro");
        assertThat(student.getEmail()).isEqualTo("a@a.com");
    }
}
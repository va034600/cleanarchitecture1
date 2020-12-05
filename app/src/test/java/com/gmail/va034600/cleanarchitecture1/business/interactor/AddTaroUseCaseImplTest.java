package com.gmail.va034600.cleanarchitecture1.business.interactor;

import com.gmail.va034600.cleanarchitecture1.business.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class AddTaroUseCaseImplTest {
    @Resource
    AddTaroUseCaseImpl sut;
    @Autowired
    StudentRepository studentRepository;

    @Test
    void register_and_find() {
        sut.register_and_find();
        assertThat(studentRepository.findTaro().getName()).isEqualTo("taro");
    }
}
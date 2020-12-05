package com.gmail.va034600.cleanarchitecture1;

import com.gmail.va034600.cleanarchitecture1.business.entity.Student;
import com.gmail.va034600.cleanarchitecture1.gateway.database.impl.StudentRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class StudentRepositoryImplTest {
    @Resource
    StudentRepositoryImpl sut;

    @Test
    void register_and_find() {
        sut.registerTaro();
        Student student = sut.findTaro();
        System.out.println(student);
        assertThat(student.getName()).isEqualTo("taro");
    }
}

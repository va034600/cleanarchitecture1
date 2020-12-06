package com.gmail.va034600.cleanarchitecture1.business.interactor;

import com.gmail.va034600.cleanarchitecture1.business.entity.Student;
import com.gmail.va034600.cleanarchitecture1.business.repository.StudentRepository;
import com.gmail.va034600.cleanarchitecture1.business.usecase.AddTaroUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddTaroUseCaseImpl implements AddTaroUseCase {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Long registerTaro() {
        Student student = new Student();
        student.setName("taro");
        studentRepository.create(student);
        return studentRepository.findByName("taro").get().getId();
    }
}

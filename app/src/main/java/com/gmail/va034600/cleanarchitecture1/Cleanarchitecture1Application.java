package com.gmail.va034600.cleanarchitecture1;

import com.gmail.va034600.cleanarchitecture1.business.usecase.RegistrationStudentUseCase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Cleanarchitecture1Application {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx = SpringApplication.run(Cleanarchitecture1Application.class, args)) {
            RegistrationStudentUseCase registrationStudentUseCase = ctx.getBean(RegistrationStudentUseCase.class);
            registrationStudentUseCase.register("aa", "b@b.com");
        }
    }
}

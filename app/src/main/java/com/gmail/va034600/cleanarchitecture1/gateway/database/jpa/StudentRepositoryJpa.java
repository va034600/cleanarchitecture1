package com.gmail.va034600.cleanarchitecture1.gateway.database.jpa;

import com.gmail.va034600.cleanarchitecture1.gateway.database.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositoryJpa extends JpaRepository<StudentModel, Long>{
}

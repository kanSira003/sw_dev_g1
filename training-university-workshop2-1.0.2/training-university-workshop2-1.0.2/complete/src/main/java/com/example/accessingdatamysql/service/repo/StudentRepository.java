package com.example.accessingdatamysql.service.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.service.repo.entity.StudentEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

    @Query("SELECT COUNT(u.id) FROM STUDENTS u WHERE u.state=?1")
    public Integer countStudents(Integer state);    
    
}

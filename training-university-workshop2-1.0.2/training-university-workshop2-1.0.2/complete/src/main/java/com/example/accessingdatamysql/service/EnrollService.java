package com.example.accessingdatamysql.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accessingdatamysql.model.Enroll;
import com.example.accessingdatamysql.service.repo.EnrollRepository;
import com.example.accessingdatamysql.service.repo.entity.EnrollEntity;
import com.example.accessingdatamysql.service.repo.entity.EnrollEntity;

@Service
public class EnrollService {
    @Autowired 
  private EnrollRepository enrollRepository;
   
    private void SaveEnroll(int Stuid, int C_ID ){
        EnrollEntity EnrollEntity = new EnrollEntity();
        EnrollEntity.setCid(C_ID );
	    EnrollEntity.setStuid(Stuid);
		EnrollEntity resultEnrollEntity = enrollRepository.save(EnrollEntity);
   }  
}

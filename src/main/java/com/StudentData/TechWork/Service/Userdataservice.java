package com.StudentData.TechWork.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentData.TechWork.Entity.Userdata;
import com.StudentData.TechWork.Repo.Userdatarepo;

@Service
public class Userdataservice {

    @Autowired
    private Userdatarepo repository;   

    public void saveUserData(Userdata userData) {
        repository.save(userData);
    }  
} 

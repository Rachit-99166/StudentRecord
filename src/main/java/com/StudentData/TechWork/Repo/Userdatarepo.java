package com.StudentData.TechWork.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentData.TechWork.Entity.Userdata;

@Repository
public interface Userdatarepo extends JpaRepository<Userdata, Long> {

}  
  
 

package com.example.hello.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hello.model.HelloModel;

@Repository
public interface CustomerRepository  extends JpaRepository<HelloModel,Long>{

}

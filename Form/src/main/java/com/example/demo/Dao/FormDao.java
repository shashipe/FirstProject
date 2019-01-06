package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.FormDetails;

public interface FormDao extends JpaRepository<FormDetails, String> {

}

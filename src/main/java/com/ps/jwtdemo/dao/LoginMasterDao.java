package com.ps.jwtdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.jwtdemo.model.LoginMasterEntity;

@Repository
public interface LoginMasterDao extends JpaRepository<LoginMasterEntity, Integer> {

}

package com.ps.jwtdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.jwtdemo.model.ClientMaster;

@Repository
public interface ClientMasterDao extends JpaRepository<ClientMaster, Integer> {

}

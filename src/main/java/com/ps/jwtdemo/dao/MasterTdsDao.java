package com.ps.jwtdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.jwtdemo.model.TDSEntity;

@Repository
public interface MasterTdsDao extends JpaRepository<TDSEntity, Integer> {

}

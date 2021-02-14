package com.ps.jwtdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.jwtdemo.model.ROIEntity;
@Repository
public interface MasterRoiDao extends JpaRepository<ROIEntity, Integer> {

}

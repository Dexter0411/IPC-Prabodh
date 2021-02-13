package com.ps.jwtdemo.dao;

import org.springframework.stereotype.Repository;

import com.ps.jwtdemo.model.PrefixEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
@Repository
public interface PrefixDao extends JpaRepository<PrefixEntity,Integer> {

}

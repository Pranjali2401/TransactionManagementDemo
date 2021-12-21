package com.isystango.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isystango.demo.model.PassengerInfo;

@Repository
public interface PassangerDao extends JpaRepository<PassengerInfo, Long> {

}

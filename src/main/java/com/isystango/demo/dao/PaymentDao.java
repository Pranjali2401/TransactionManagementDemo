package com.isystango.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isystango.demo.model.PaymentInfo;


@Repository
public interface PaymentDao extends JpaRepository<PaymentInfo, Long>{

}

package com.bigdecimal.BigDecimalDemo.model;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;


public interface NumbersJpaRepository extends JpaRepository<Numbers, BigDecimal>{

}

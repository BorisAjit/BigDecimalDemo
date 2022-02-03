package com.bigdecimal.BigDecimalDemo.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Numbers {
	
	@Id
	private BigDecimal num1;
	private BigDecimal num2;
	private BigDecimal ActualValue;
	private BigDecimal FloorValue; 
	private BigDecimal CeilValue; 
	
	public Numbers() {
	}

	public Numbers(BigDecimal num1, BigDecimal num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		
		this.ActualValue = num1.divide(num2,2,RoundingMode.CEILING);
		this.CeilValue = ActualValue.setScale(0, RoundingMode.CEILING);
		this.FloorValue = ActualValue.setScale(0, RoundingMode.FLOOR);
		
	}

	@Override
	public String toString() {
		return "Numbers [num1=" + num1 + ", num2=" + num2 + ", ActualValue=" + ActualValue + ", FloorValue="
				+ FloorValue + ", CeilValue=" + CeilValue + "]";
	}

	public BigDecimal getNum1() {
		return num1;
	}

	public void setNum1(BigDecimal num1) {
		this.num1 = num1;
	}

	public BigDecimal getNum2() {
		return num2;
	}

	public void setNum2(BigDecimal num2) {
		this.num2 = num2;
	}

	public BigDecimal getActualValue() {
		return ActualValue;
	}

	public void setActualValue(BigDecimal actualValue) {
		ActualValue = actualValue;
	}

	public BigDecimal getFloorValue() {
		return FloorValue;
	}

	public void setFloorValue(BigDecimal floorValue) {
		FloorValue = floorValue;
	}

	public BigDecimal getCeilValue() {
		return CeilValue;
	}

	public void setCeilValue(BigDecimal ceilValue) {
		CeilValue = ceilValue;
	}
	
}

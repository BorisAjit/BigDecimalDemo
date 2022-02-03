package com.bigdecimal.BigDecimalDemo.conroller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigdecimal.BigDecimalDemo.model.Numbers;
import com.bigdecimal.BigDecimalDemo.model.NumbersJpaRepository;

@RestController
@RequestMapping("/numbers")
public class NumbersController {

	@Autowired
	NumbersJpaRepository repository;
	
	@PostMapping
	public void saveNumbers(@RequestBody Numbers number) {
		repository.save(new Numbers(number.getNum1(),number.getNum2()));
	}
	
	@GetMapping
	public List<Numbers> findNumbers(){
		return repository.findAll();
	}
	
	@DeleteMapping(path = "{id}")
	public void deletePersonById(@PathVariable("id") BigDecimal id) {
		repository.deleteById(id);
	}
}

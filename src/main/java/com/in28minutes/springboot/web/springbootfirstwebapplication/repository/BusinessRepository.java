package com.in28minutes.springboot.web.springbootfirstwebapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.in28minutes.springboot.web.springbootfirstwebapplication.model.Business;


public interface BusinessRepository extends CrudRepository <Business, Long> {

}
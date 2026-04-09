package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	boolean addStudent();

	List<Student> findAll();

	boolean deleteById(int id);

	

}

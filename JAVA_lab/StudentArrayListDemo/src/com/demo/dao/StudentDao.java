package com.demo.dao;

import java.util.List;

import com.demo.model.Student;

public interface StudentDao {

	boolean save(Student student);

	List<Student> getAll();

	boolean removeById(int id);





}

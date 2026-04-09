package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.model.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao sdao;

	public StudentServiceImpl() {
		super();
		this.sdao=new StudentDaoImpl();
	}

	@Override
	public boolean addStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter date");
		String jd=sc.next();
		LocalDate jdt=LocalDate.parse(jd,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("enter m1");
		int m1=sc.nextInt();
		System.out.println("enter m2");
		int m2=sc.nextInt();
		System.out.println("enter m3");
		int m3=sc.nextInt();
		return sdao.save(new Student(id,nm,jdt,m1,m2,m3));
		
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return sdao.getAll();
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return sdao.removeById(id);
	}
	

	

}

package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.model.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudent {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		int choice=0;
		do {
		System.out.println("1.Add Student\n2.Delete By Id\n3.Modify By Id\n4.Display All\n5.Display By Id\n6.Display By name\n7.Sort By Id\n 8.Sort By Name\n9.Sort By m1\n 10.Exit\nEnter Choice:");
		choice=sc.nextInt();
		StudentService sservice=new StudentServiceImpl();
		switch(choice)
		{
		case 1->
		{
			boolean status=sservice.addStudent();
			if(status)
			{
				System.out.println("student added");
			}
			else
			{
				System.out.println("not added");
			}
			
			
		}
		case 2->
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			boolean status=sservice.deleteById(id);
			if(status)
			{
				System.out.println("student data deleted");
			}
			else
			{
				System.out.println("not deleted");
			}
			
			
		}
		case 3->
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("which marks to update 1.m1\n2.m2\n3.m3");
			int ch=sc.nextInt();
			boolean status=sservice.updateById(id);
			if(status)
			{
				System.out.println("student data updated");
			}
			else
			{
				System.out.println("not updated");
			}
			
			
		}
		
		case 4->
		{
			List<Student> slst=sservice.findAll();
			if(slst!=null)
			{
				slst.forEach(System.out::println);
			}
		}
		case 5->
		{
			
		}
		case 6->
		{
			
		}
		case 7->
		{
			
		}
		case 8->
		{
			
		}
		case 9->
		{
			
		}
		case 10->
		{
		sc.close();
		System.out.println("Thanks");
		}
		default->
		{
			System.out.println("wrong choice");
		}
		}
		}
		while (choice!=10);
		}
		
	}
	
	



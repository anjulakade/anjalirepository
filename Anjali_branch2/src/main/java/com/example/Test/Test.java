package com.example.Test;

import com.example.model.Student;

public class Test 
{ 
	public void m1() {
	Student s =new Student();
		s.setName("anjali");
		s.setId(1);
		s.setEmail("anjuemail.com");
		System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.getEmail());
	}

public static void main(String[] args)
{
	Test t=new Test();
	t.m1();
	
}
}

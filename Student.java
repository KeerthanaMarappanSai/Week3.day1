package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Student Name");	
	}
	
	public void studentDept()
	{
		System.out.println("Student Department");
	}
	
	public void studentId()
	{
		System.out.println("Student ID");
	}
	
	public static void main(String[] args) {
		
		College college=new College();
		Department department=new Department();
		Student student=new Student();
		
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		
		department.departmentName();
		
		student.studentName();
		student.studentDept();
		student.studentId();
		
	}
}

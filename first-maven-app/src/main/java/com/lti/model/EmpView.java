package com.lti.model;

public class EmpView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee  emp = new Employee();
		emp.setEmpId(1001);
		emp.setEmpName("James");
		
		System.out.println("Id: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());
	}
	
	

}

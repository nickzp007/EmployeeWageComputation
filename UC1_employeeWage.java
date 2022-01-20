package com.bridgelabz;

public class UC1_employeeWage {
	public static void main(String[] args) {

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		if (empCheck ==1 )
			System.out.println("Employee is Present");
		else if (empCheck==2)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");


	}

}

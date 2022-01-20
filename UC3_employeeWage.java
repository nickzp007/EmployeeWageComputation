package com.bridgelabz;

public class UC3_employeeWage {

	final static int wagePerHr=20;
	final static int fullTimeHrs=8;
	final static int partTimeHrs=4;
	static int empCheck;

	public static void main(String[] args) {

		empCheck = (int) Math.floor(Math.random() * 10) % 3;
		if (empCheck ==1 )
			System.out.println("Employee is Present");
		else if (empCheck==2)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");


	}
}

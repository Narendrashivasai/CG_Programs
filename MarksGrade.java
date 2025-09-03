package com.codegnan.fundamentals;

import java.util.Scanner;

public class MarksGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks:");
		int marks = sc.nextInt();
		String grade = (marks >= 100)?"invalid marks":(marks >= 90) ? "o" :(marks >= 80) ? "s" :(marks >= 70) ? "a" :(marks >= 60) ? "b" :(marks >= 50) ? "c" :(marks >= 40) ? "d" :"f";
		System.out.println("The grade is:"+grade);
		sc.close();
	}

}

package com.cg.lb5.ui;

import java.util.Scanner;

class InvalidException extends Exception {
	public InvalidException(String str) {
		System.out.println(str);
	}
}

public class EmployeeException {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name:");
		String firstname = scan.nextLine();
		System.out.println("Enter last name:");
		String lastname = scan.nextLine();
		try {
			if (firstname.length() == 0 || lastname.length() == 0) {
				throw new InvalidException("Invalid name");
			} else
				System.out.println("valid name");
		} catch (InvalidException a) {
			System.out.println(a);
		}
	}
}
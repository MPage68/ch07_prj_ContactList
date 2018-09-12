package ch07_prj_ContactList;

import java.util.Scanner;

public class ContactList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the contact list application");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (!choice.equalsIgnoreCase("n")) {
			System.out.print("Enter irst name:     ");
			String firstName = sc.next();
			System.out.print("Enter last name:     ");
			String lastName = sc.next();
			System.out.print("Enter email address:     ");
			String email = sc.next();
			System.out.print("Enter phone number:     ");
			String phoneNumber = sc.next();
			Contact current = new Contact(firstName, lastName, email, phoneNumber);
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println("----Current Contact-------------------------");
			System.out.println("--------------------------------------------");
			System.out.println();

			System.out.println("Name:           "+ current.getFirstName()+" "+current.getLastName());
			System.out.println("Email Address:  " + current.getEmail());
			System.out.println("Phone Number:   " + current.getPhoneNumber());

		

			//System.out.println("Continue: (y/n)");
			choice = Console.getString("Continue: (y/n)");

		}

		System.out.println("Bye");

		sc.close();
	}

}

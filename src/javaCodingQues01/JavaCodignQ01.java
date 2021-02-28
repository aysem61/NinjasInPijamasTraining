package javaCodingQues01;

import java.util.Scanner;

public class JavaCodignQ01 {
	
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Ask the user to enter an email If it doesn't contain the @ sign, print
		 * "enter a valid email" If it only says "gmail.com" after the @ sign, print
		 * "email approved" If it says anything other than "gmail.com" after the @ sign,
		 * write "Please enter your gmail account" INPUT : techproed.com OUTPUT : “enter
		 * a valid email” INPUT : techproed@gmail.com OUTPUT : “email approved” INPUT :
		 * techproed@hotmail.com OUTPUT : “Please enter your gmail account”
		 */

		
		email01();
		
		
		
		
		System.out.println("Please enter an email with gmail ");
		
		
		
		String pass=s.nextLine();
		
		
		if(pass.contains("@gmail.com")) {
			
			System.out.println(" email approved ");
		}else if(!pass.contains("@")) {
			
			System.out.println(" enter a valid email  ");
			
		}else if( !pass.endsWith("@gmail.com")) {
			
			System.out.println(" Please enter your gmail account  ");
		}
		
		
		
	}

	private static void email01() {
		
		
		System.out.println("Please enter an email");
		
		
		String pass=s.nextLine();
		
		if(!pass.contains("@")) {
			System.out.println("Enter a valid email");
			
		}else if(pass.contains("@gmail.com")) {
			
			System.out.println("email approved");
			
		}else if(!pass.contains("gmail.com")) {
			
			System.out.println("Please eneter your gmail account");
		}
		


		
		s.close();
		
		
		
	
		
	}

}

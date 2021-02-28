package javaCodingQues01;

import java.util.Scanner;

public class JobTitle02 {

	public static void main(String[] args) {
		
		
		/*
        Print “Please enter your job title” 
        Create a String variable named “jobTitle” and get the data from the user. 
        Use the below test data to print the correct jobTitle. Example :
        if job Title is qa then print “Your job title is Quality Analyst” 
        test data: qa then print Quality Analyst 
        dev then print Developer 
        ba then print Business Analyst 
        pm then print Project Manager
       */


		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your job title");
		
		String title=scan.nextLine().toLowerCase();
		
		
		switch(title) {
		
		case "qa":
			System.out.println("Quality Analyst");
			break;
			
		case "dev":	
			System.out.println("Developer");
			
			break;
			
		case "ba":
			System.out.println("Business Analyst");
			
			break;
			
		case "pm":
			System.out.println("Project Manager");
			
			break;
			
		default:
			System.out.println("it is not elligible");
		
		
		}
		
		
		
		
		
		
		
		
		
	}

}

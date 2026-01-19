package internship;

import java.util.Scanner;

public class Task3 {
	//To calculate percentage
	public static double calculatePercentage(double totalMarks,int sub) {
		double percentage=totalMarks/sub;
		return percentage;
	}
	
	//Assign a grade
	public static char getGrade(double percentage) {
		if(percentage>=85) return 'A';
		else if(percentage>=65) return 'B';
		else if(percentage>=35) return 'C';
		else return 'F';
	}
	
	//to check valid marks
	public static boolean validMarks(int marks) {
		return marks>=0 && marks<=100;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.print("\nEnter Student Name: ");
            String name = sc.next();

            System.out.print("Enter number of subjects: ");
			int sub=sc.nextInt();
            
            double totalMarks=0;
            for(int i=1;i<=sub;i++) {
            	System.out.println("Enter marks for subject"+i+":");
            	int marks=sc.nextInt();
            	
            	// Validation logic
                if (!validMarks(marks)) {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                    i--; 
                    continue;
                }
            	totalMarks=totalMarks+marks;
            }
            
            double per=calculatePercentage(totalMarks,sub);
            char grade=getGrade(per);
            
         // Final Result Summary
            System.out.println("\n----- Result Summary -----");
            System.out.println("Student Name : " + name);
            System.out.println("Total Marks : " + totalMarks);
            System.out.println("Percentage  : " + per+ "%");
            System.out.println("Grade       : " + grade);
           
         // Continue or exit
            System.out.print("\nDo you want to enter another student? (y/n): ");
            char ch = sc.next().charAt(0);
            
		}while(true);
}
}

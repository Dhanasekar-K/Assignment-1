package assignment;

import java.util.Scanner;

public class Floydnumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		int rows=scan.nextInt();
	        scan.close();
		    for(int i=1; i<=rows; i++){
		    for(int j=1; j<=i; j++){
		    System.out.print(j);    
		  }
		    System.out.println();
		  }
		
		  }
		}

	



package com.crime.usecases;

import java.util.Scanner;

public class crimeSolution {

	public static void main(String[] args) {
	 
		System.out.println("Welcome Crime solution Management");
           
		Scanner sc = new Scanner(System.in);
		
		
		  
		  for(int i = 0; i < 100; i++) {
			  System.out.println("1. Login");
			  System.out.println("2. Create an account");
			  int value = sc.nextInt();
			  if(value == 1) {
				  AdminLogin l = new AdminLogin();
				    if (l.login() == "Login Sucessfully.....") {
				    	 System.out.println("Login Sucessfully....."); 
				         break;
				    }
				    System.out.println(" Incorrect Email or password ....."); 
				    
				     
			  }
			  if(value == 2) {
				  RegisterAdmin r = new RegisterAdmin();
				     if( r.register() == "Registeration Sucessfully...") {
				    	    System.out.println("Registeration Sucessfully...");
				    	 break;
				     }
				     
				
				    
			  }
			 
		  }
		  for(int i = 0; i< 100; i++) {
		  
		  System.out.println("1. Case Register");
		  System.out.println("2. Show all case");
		  System.out.println("3. Find crimnal  whose age is less than 20");
		  System.out.println("4. Insert criminaldata ");
		  System.out.println("5. Show all Criminal Records");

		     
		     int  val = sc.nextInt();
		     
		     if(val == 1) {
		    	 CaseRegister c = new CaseRegister ();
		    	  System.out.println(c.registerCase()); 
		     }
		     if(val == 2) {
		    	 ShowAllCase s = new ShowAllCase();
		    	 s.main(args);
		    	       
		     }
		     if(val== 4) {
		    	 AddCriminal ad = new AddCriminal();
		    	   System.out.println(ad.CriminalData());
		    	  
		     }
		     if(val == 5) {
		    	 ShowAllCriminal s = new ShowAllCriminal();
		    	 s.main(args);
		    	       
		     }
		  }
		  
	}

}

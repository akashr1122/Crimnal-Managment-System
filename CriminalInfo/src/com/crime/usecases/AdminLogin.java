package com.crime.usecases;

import java.util.Scanner;

import com.crime.dao.AdminDao;
import com.crime.dao.AdminDaoImpl;
import com.crime.exception.AdminException;

public class AdminLogin {

	public static  String  login() {
		
	Scanner sc = new Scanner(System.in);
		    System.out.println("Enter email :");
		    String email = sc.next();
		    System.out.println("Enter password :");
		    String password = sc.next();
		    
		      String result = null;
		    
		    AdminDao dao = new AdminDaoImpl();
            
            try {
				result = dao.signInAdmin(email, password);
				 
				
			} catch (AdminException e) {
				System.out.println(e.getMessage());
			}
               return result;
			
		    
		    
		
	}

}

package com.crime.usecases;

import java.util.Scanner;

import com.crime.dao.AdminDao;
import com.crime.dao.AdminDaoImpl;
import com.crime.exception.AdminException;
import com.crime.model.Admin;



public class RegisterAdmin {

	public  String register() {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Name :");
			  String name = sc.nextLine();

			System.out.println("Enter Address :");
			String  address = sc.next();

			
			System.out.println("Enter email :");
			String email = sc.next();

			System.out.println("Enter Password :");
			 String password = sc.next();
			 
			 
	           Admin admin = new Admin();
	            admin.setName(name);
	            admin.setAddress(address);
	            admin.setEmail(email);
	            admin.setPassword(password);
	            
	            AdminDao dao = new AdminDaoImpl();
	            String result = null;
	            
	            try {
					 result = dao.registerAdmin(admin);
					 
					
				} catch (AdminException e) {
					System.out.println(e.getMessage());
				}
				return  result;
	            

		
	}

}

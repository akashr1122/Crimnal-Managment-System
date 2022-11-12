package com.crime.usecases;

import java.util.Scanner;

import com.crime.dao.AdminDao;
import com.crime.dao.AdminDaoImpl;
import com.crime.exception.CaseException;
import com.crime.model.CaseFile;

public class CaseRegister {
	public  String registerCase() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Victim Name :");
		  String name = sc.nextLine();

		System.out.println("Enter description of crime  :");
		String  address = sc.nextLine();

		
		System.out.println("Enter palce of crime :");
		String place = sc.nextLine();

		System.out.println("Enter date in format yy-mm-dd :");
		 String date = sc.nextLine();
		 
		 System.out.println("Enter name of suspected :");
		 String suspected = sc.nextLine();
		 
		 System.out.println("Enter  details of crime :");
		 String details = sc.nextLine();
		 
		 
		 
           CaseFile casefile = new CaseFile(name,address,place,date,suspected,details);
          
            
            AdminDao dao = new AdminDaoImpl();
            String result = null;
            
            try {
				 result = dao.CrimeCase(casefile);
				 
				
			} catch (CaseException e) {
				System.out.println(e.getMessage());
			}
			return  result;
            

	
}
}

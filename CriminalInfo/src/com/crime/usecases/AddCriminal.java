package com.crime.usecases;

import java.util.Scanner;

import com.crime.dao.AdminDao;
import com.crime.dao.AdminDaoImpl;
import com.crime.exception.CriminalException;
import com.crime.model.criminalRecord;



public class AddCriminal {

public  String CriminalData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name :");
		  String name = sc.nextLine();

		System.out.println("Enter Age  :");
		 int age = sc.nextInt();
       
		 
		 System.out.println("Enter gender :");
		 sc.next();
		 String gender = sc.nextLine();
		 
		
		System.out.println("Enter Address :");
		String address = sc.nextLine();

		System.out.println("Enter Indentification Mark :");
		 String im = sc.nextLine();
		
		 System.out.println("Area where crimnal arrested first time");
		  String cr = sc.nextLine();
		 
		 System.out.println("Enter crime description :");
		 String crime = sc.nextLine();
		 
		 
		 criminalRecord cri = new criminalRecord();
		     
                 cri.setName(name);
                 cri.setAge(age);
                 cri.setGender(gender);
                 cri.setAddress(address);
                 cri.setIndentitfy_mark(im);
                 cri.setArea_where_arrested(cr);
                  cri.setCrime(crime);
          
            
            AdminDao dao = new AdminDaoImpl();
            String result = null;
            
            try {
				 result = dao.addCriminalRecord(cri);
				 
				
			} catch (CriminalException e) {
				System.out.println(e.getMessage());
			}
			return  result;
            
}
	
}

package com.crime.usecases;

import java.util.List;

import com.crime.dao.AdminDao;
import com.crime.dao.AdminDaoImpl;

import com.crime.exception.CriminalException;
import com.crime.model.criminalRecord;

public class ShowAllCriminal {
public static void main(String[] args) {
		
		AdminDao show = new AdminDaoImpl();
		
		   try {
		 List<criminalRecord> gac =  show.getAllCrinimal();
		    gac.forEach(i -> System.out.println(i));
		    
		} catch (CriminalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

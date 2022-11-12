package com.crime.usecases;

import java.util.List;

import com.crime.dao.AdminDao;
import com.crime.dao.AdminDaoImpl;
import com.crime.exception.CaseException;
import com.crime.model.CaseFile;

public class ShowAllCase {

	public static void main(String[] args) {
		
		AdminDao show = new AdminDaoImpl();
		
		   try {
		  List<CaseFile> sc = show.getAllCase();
		  sc.forEach(i -> System.out.println(i));
		} catch (CaseException e) {
			
			e.printStackTrace();
		}

	}

}

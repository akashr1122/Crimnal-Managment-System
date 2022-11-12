package com.crime.dao;

import java.util.List;

import com.crime.exception.AdminException;
import com.crime.exception.CaseException;
import com.crime.exception.CriminalException;
import com.crime.model.Admin;
import com.crime.model.CaseFile;
import com.crime.model.criminalRecord;

public interface AdminDao {
	public String registerAdmin(Admin admin)throws AdminException;
    public String signInAdmin(String email , String password) throws AdminException;
    public String  CrimeCase (CaseFile casefile) throws CaseException;
    public List<CaseFile>getAllCase() throws CaseException; 
    public String addCriminalRecord(criminalRecord cr)throws CriminalException;
    public List< criminalRecord>getAllCrinimal() throws CriminalException; 
    

}

package com.crime.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crime.exception.AdminException;
import com.crime.exception.CaseException;
import com.crime.exception.CriminalException;
import com.crime.model.Admin;
import com.crime.model.CaseFile;
import com.crime.model.criminalRecord;
import com.crime.utlity.DbUtil;


public class AdminDaoImpl implements AdminDao {

	@Override
	public String registerAdmin(Admin admin) throws AdminException {
		
		  String result = "Registeration failed....";
		  
		  
		  try(Connection conn = DbUtil.provideconnection()) {
			  
			 PreparedStatement ps =  conn.prepareStatement("insert into admin(name,address,email,password) value(?,?,?,?)");
			   
			  ps.setString(1, admin.getName());
			  ps.setString(2,admin.getAddress());
			  ps.setString(3,admin.getEmail());
			  ps.setString(4,admin.getPassword());
			  
			   int x =  ps.executeUpdate();
			  
			   if(x > 0) {
				   result = "Registeration Sucessfully...";
			   }
			  
			  
			  
		  }
		  catch(SQLException e) {
//			  e.printStackTrace();
			  throw new AdminException(e.getMessage());
			  
		  }
		  
		  
		  
		
		  return result;
		  
		
		
		
		
	}

	@Override
	public String signInAdmin(String email, String password) throws AdminException {
		 
		String result = "Invalid Username or Password...";
		try(Connection conn = DbUtil.provideconnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from admin where email=? And password = ?");
			ps.setString(1,email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				result = "Login Sucessfully.....";
			}
			
		} catch (SQLException e) {
			
//			e.printStackTrace();
			 throw new AdminException(e.getMessage());
		}
		
		
		return  result;
		
	}

	
	public String CrimeCase(CaseFile casefile) throws CaseException {
		
		String result = "Case Not Registered.....";
		  
		  
		  try(Connection conn = DbUtil.provideconnection()) {
			  
			 PreparedStatement ps =  conn.prepareStatement("insert into casefile value(?,?,?,?,?,?)");
			   
			  ps.setString(1,casefile.getVictim_name());
			  ps.setString(2,casefile.getDescrption_of_crime());
			  ps.setString(3,casefile.getPlace_of_crime());
			  ps.setString(4,casefile.getDate());
			  ps.setString(5,casefile.getName_of_suspected());
			  ps.setString(6,casefile.getDescrption_of_crime());
			  
			   int x =  ps.executeUpdate();
			  
			   if(x > 0) {
				   result = "Case Registered Sucessfully....";
			   }
			  
			  
			  
		  }
		  catch(SQLException e) {
//			  e.printStackTrace();
			  throw new CaseException(e.getMessage());
			  
		  }
		  
		  
		  
		
		        return result;
		  
		
	}

	@Override
	public List<CaseFile> getAllCase() throws CaseException {
		List<CaseFile> casefiles = new ArrayList<>();
	    
	    try(Connection conn = DbUtil.provideconnection()){
	    	
	    	PreparedStatement ps = conn.prepareStatement("select * from casefile");
	    	 
	    	ResultSet rs = ps.executeQuery();
	    	
	    	while(rs.next()) {
	    		
	    		String vn = rs.getString("victim_name");
	    		String dc = rs.getString("descrption_of_crime");
	    		String pc = rs.getString("place_of_crime");
	    		String cd = rs.getString("crime_date");
	    		String ns = rs.getString("name_of_suspected");
	    		String sd = rs.getString("details_descrption");
	    		
	    		
	    		  CaseFile casefile = new CaseFile(vn,dc,pc,cd,ns,sd);
	    		  
	    		         casefiles.add(casefile);
	    		  
	    	}
	    	       
	    	
	    	
	    } catch (SQLException e) {
			
			throw new CaseException(e.getMessage());
		}
	    
		     return casefiles;
	}

	@Override
	public String addCriminalRecord(criminalRecord cr) throws CriminalException {
		
		 String result = "insertion failed....";
		  
		  
		  try(Connection conn = DbUtil.provideconnection()) {
			  
			 PreparedStatement ps =  conn.prepareStatement("insert into  criminal_record(name,age,gender,address, Indentitfy_mark,Area_where_arrested,crime) value(?,?,?,?,?,?,?)");
			   
			  ps.setString(1,cr.getName());
			  ps.setInt(2,cr.getAge());
			  ps.setString(3,cr.getGender());
			  ps.setString(4,cr.getAddress());
			  ps.setString(5,cr.getIndentitfy_mark());
			  ps.setString(6,cr.getArea_where_arrested());
			  ps.setString(7,cr.getCrime());
			  
			   int x =  ps.executeUpdate();
			  
			   if(x > 0) {
				   result = "Criminal data inserted Sucessfully..";
			   }
			  
			  
			  
		  }
		  catch(SQLException e) {
//			  e.printStackTrace();
			  throw new CriminalException(e.getMessage());
			  
		  }
		  
		  
		  
		
		  return result;
		  
		
		
		
		
		
	}

	@Override
	public List<criminalRecord> getAllCrinimal() throws CriminalException {
	
List<criminalRecord> criminalData = new ArrayList<>();
	    
	    try(Connection conn = DbUtil.provideconnection()){
	    	
	    	PreparedStatement ps = conn.prepareStatement("select * from criminal_record");
	    	 
	    	ResultSet rs = ps.executeQuery();
	    	
	    	 while(rs.next()) {
	    		
	    		String name = rs.getString("name");
	    		int age = rs.getInt("age");
	    		String gender = rs.getString("gender");
	    		String address = rs.getString("address");
	    		String im = rs.getString("Indentitfy_mark");
	    		String awa = rs.getString("Area_where_arrested");
	    		String crime = rs.getString("crime");
	    		
	    		criminalRecord cr = new criminalRecord(name,age,gender,address,im,awa,crime);
	    		  
	    		  
	    		  criminalData.add(cr);
	    		  
	    	}
	    	       
	    	
	    	
	    } catch (SQLException e) {
			
			throw new CriminalException(e.getMessage());
		}
	    
		     return criminalData;
	}

}

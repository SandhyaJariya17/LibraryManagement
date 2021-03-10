/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.StaffDAO;
import Util.SqlUtil;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Staff;

/**
 *
 * @author 1711j
 */
public class StaffDAOimpl implements StaffDAO{

    @Override
    public int add(Staff staff) {
       int result=0;
        try{
            int id=staff.getId();
            String fname=staff.getFname();
            String lname=staff.getLname();
            String mobile=staff.getMobile();
            String password=staff.getPassword();
            String role= staff.getRole();
            
            String query="INSERT INTO STAFF VALUES('"+id+"', '"+fname+"', '"+lname+"', '"+mobile+"', '"+password+"','"+role+"')";
            SqlUtil.connectDB();
            result=SqlUtil.insert(query);
           }
        catch(Exception ex){
            ex.printStackTrace();
            
        }
        finally{
            try{
                SqlUtil.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return result;
    }

    @Override
    public int remove(int id) {
        int result=0;
        try{
            
            String query="DELETE FROM STAFF WHERE id='"+id+"'";
            SqlUtil.connectDB();
            result=SqlUtil.delete(query);
           }
        catch(Exception ex){
            ex.printStackTrace();
            
        }
        finally{
            try{
                SqlUtil.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return result;
       
    }

    @Override
    public ArrayList<Staff> getAll() {
        ArrayList<Staff> stafflist=new ArrayList<Staff>();
        
        try{
            
            String query="SELECT * FROM STAFF";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                Staff staff=new Staff();
                staff.setId(rs.getInt("id"));
                staff.setFname(rs.getString("fname"));
                staff.setLname(rs.getString("lname"));
                staff.setMobile(rs.getString("mobile"));
                staff.setPassword(rs.getString("password"));
                staff.setRole(rs.getString("role"));
              
                stafflist.add(staff);
                
                
            }
        }
        catch(Exception ex){
             ex.printStackTrace();
        }
        finally{
            try{
                SqlUtil.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        
       return stafflist;
        
    }

    @Override
    public Staff get(int id) {
         Staff staff=null;
        
        try{
            
            String query="SELECT *  FROM STAFF WHERE id='"+id+"'";
            SqlUtil.connectDB();
             ResultSet rs=SqlUtil.fetch(query);
             if(rs.next()){
                staff=new Staff();
                staff.setId(rs.getInt("id"));
                staff.setFname(rs.getString("fname"));
                staff.setLname(rs.getString("lname"));
                staff.setMobile(rs.getString("mobile"));
                staff.setPassword(rs.getString("password"));
                staff.setRole(rs.getString("role"));
                
             }
           }
        catch(Exception ex){
            ex.printStackTrace();
            
        }
        finally{
            try{
                SqlUtil.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return staff;
       
    }

    @Override
    public ArrayList<Staff> getByRole(String role) {
        ArrayList<Staff> stafflist=new ArrayList<Staff>();
        
        try{
            
            String query="SELECT * FROM STAFF WHERE role='"+role+"'";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                 Staff staff=new Staff();
                staff.setId(rs.getInt("id"));
                staff.setFname(rs.getString("fname"));
                staff.setLname(rs.getString("lname"));
                staff.setMobile(rs.getString("mobile"));
                staff.setPassword(rs.getString("password"));
                staff.setRole(rs.getString("role"));
              
                stafflist.add(staff);
                 
               }
        }
        catch(Exception ex){
             ex.printStackTrace();
        }
        finally{
            try{
                SqlUtil.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        
       return stafflist;
        
    }
    
}

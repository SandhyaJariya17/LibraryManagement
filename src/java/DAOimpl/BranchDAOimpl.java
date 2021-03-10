/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.BranchDAO;
import Util.SqlUtil;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Branch;

/**
 *
 * @author 1711j
 */
public class BranchDAOimpl implements BranchDAO{

    @Override
    public int add(Branch branch) {
         
        int result=0;
        try{
            int id=branch.getId();
            int cid=branch.getCid();
            String name=branch.getName();
           
          
            String query="INSERT INTO BRANCH VALUES('"+id+"', '"+cid+"', '"+name+"')";
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
            
            String query="DELETE FROM BRANCH WHERE id='"+id+"'";
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
    public ArrayList<Branch> getAll() {
        
         ArrayList<Branch> branchlist=new ArrayList<Branch>();
        
        try{
            
            String query="SELECT * FROM BRANCH";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                Branch branch=new Branch();
                branch.setId(rs.getInt("id"));
                branch.setCid(rs.getInt("cid"));
                branch.setName(rs.getString("name"));
                branchlist.add(branch);
                
                
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
        
       return branchlist;
        
    }

    @Override
    public Branch get(int id) {
        Branch branch=null;
        
        try{
            
            String query="SELECT *  FROM BRANCH WHERE id='"+id+"'";
            SqlUtil.connectDB();
             ResultSet rs=SqlUtil.fetch(query);
             if(rs.next()){
                branch=new Branch();
                branch.setId(rs.getInt("id"));
                branch.setCid(rs.getInt("cid"));
                branch.setName(rs.getString("name"));
              
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
        return branch;
        
    }

    @Override
    public ArrayList<Branch> getByCourse(int courseId) {
         ArrayList<Branch> branchlist=new ArrayList<Branch>();
        
        try{
            
            String query="SELECT * FROM BRANCH Where cid='"+courseId+"'";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                Branch branch=new Branch();
                branch.setId(rs.getInt("id"));
                branch.setCid(rs.getInt("cid"));
                branch.setName(rs.getString("name"));
                branchlist.add(branch);
                
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
        
       return branchlist;
       
    }
    
}

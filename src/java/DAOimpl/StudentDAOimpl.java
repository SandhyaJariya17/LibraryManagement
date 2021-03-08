/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.StudentDAO;
import Util.SqlUtil;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author 1711j
 */
public class StudentDAOimpl implements StudentDAO{

    @Override
    public int add(Student student) {
        
        int result=0;
        try{
            int id=student.getId();
            String roll=student.getName();
            String name=student.getName();
            int bid=student.getBid();
            int semNumber=student.getSemNumber();
            String query="INSERT INTO STUDENT VALUES('"+id+"', '"+roll+"', '"+name+"', '"+bid+"', '"+semNumber+"')";
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
            
            String query="DELETE FROM STUDENT WHERE id='"+id+"'";
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
    public ArrayList<Student> getAll() {
        ArrayList<Student> studentslist=new ArrayList<Student>();
        
        try{
            
            String query="SELECT * FROM STUDENT";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                Student student=new Student();
                student.setId(rs.getInt("id"));
                student.setRoll(rs.getString("roll"));
                student.setBid(rs.getInt("bid"));
                student.setSemNumber(rs.getInt("semNumber"));
                studentslist.add(student);
                
                
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
        
       return studentslist;
    }

    @Override
    public Student get(int id) {
        Student student=null;
        
        try{
            
            String query="SELECT *  FROM STUDENT WHERE id='"+id+"'";
            SqlUtil.connectDB();
             ResultSet rs=SqlUtil.fetch(query);
             if(rs.next()){
                student=new Student();
                student.setId(rs.getInt("id"));
                student.setRoll(rs.getString("roll"));
                student.setBid(rs.getInt("bid"));
                student.setSemNumber(rs.getInt("semNumber"));
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
        return student;
    }

    @Override
    public ArrayList<Student> getByCourse(int courseId) {
       
          ArrayList<Student> studentslist=new ArrayList<Student>();
        
        try{
            
            String query="SELECT * FROM STUDENT Where cid='"+courseId+"'";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                Student student=new Student();
                student.setId(rs.getInt("id"));
                student.setRoll(rs.getString("roll"));
                student.setBid(rs.getInt("bid"));
                student.setSemNumber(rs.getInt("semNumber"));
                studentslist.add(student);
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
        
       return studentslist;
    }

    @Override
    public ArrayList<Student> getByBranch(int branchId) {
           ArrayList<Student> studentslist=new ArrayList<Student>();
        
        try{
            
            String query="SELECT * FROM STUDENT Where bid='"+branchId+"'";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                Student student=new Student();
                student.setId(rs.getInt("id"));
                student.setRoll(rs.getString("roll"));
                student.setBid(rs.getInt("bid"));
                student.setSemNumber(rs.getInt("semNumber"));
                studentslist.add(student);
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
        
       return studentslist;
      
    }
    
}

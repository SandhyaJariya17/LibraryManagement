/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.CourseDAO;
import Util.SqlUtil;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Course;

/**
 *
 * @author 1711j
 */
public class CourseDAOimpl implements CourseDAO{

    @Override
    public int add(Course course) {
         
        int result=0;
        try{
            int id=course.getId();
            String name=course.getName();
            String description=course.getDescription();
            
            String query="INSERT INTO COURSE VALUES('"+id+"', '"+name+"', '"+description+"')";
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
            
            String query="DELETE FROM COURSE WHERE id='"+id+"'";
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
    public ArrayList<Course> getAll() {
          ArrayList<Course> courselist=new ArrayList<Course>();
        
        try{
            
            String query="SELECT * FROM COURSE ";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                Course course=new Course();
                course.setId(rs.getInt("id"));
                course.setName(rs.getString("name"));
               course.setDescription(rs.getString("description"));
                courselist.add(course);
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
        
       return courselist;
       
    }

    @Override
    public Course get(int id) {
       Course course=null;
        
        try{
            
            String query="SELECT *  FROM COURSE WHERE id='"+id+"'";
            SqlUtil.connectDB();
             ResultSet rs=SqlUtil.fetch(query);
             if(rs.next()){
                course=new Course();
                course.setId(rs.getInt("id"));
                course.setName(rs.getString("name"));
                course.setDescription(rs.getString("description"));
                
               
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
        return course;
    }
    
}

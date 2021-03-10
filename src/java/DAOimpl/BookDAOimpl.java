/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOimpl;

import DAO.BookDAO;
import Util.SqlUtil;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Book;

/**
 *
 * @author 1711j
 */
public class BookDAOimpl implements BookDAO{

    @Override
    public int add(Book book) {
        int result=0;
        try{
            int id=book.getId();
            String name=book.getName();
            String publisher=book.getPublisher();
            String author=book.getAuthor();
            int copies=book.getCopies();
            String subject=book.getSubject();
            
            String query="INSERT INTO BOOK VALUES('"+id+"', '"+name+"', '"+publisher+"','"+author+"','"+copies+"','"+subject+"')";
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
            
            String query="DELETE FROM BOOK WHERE id='"+id+"'";
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
    public ArrayList<Book> getAll() {
        
         ArrayList<Book> booklist=new ArrayList<Book>();
        
        try{
            
            String query="SELECT * FROM BOOK ";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                Book book=new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setPublisher(rs.getString("publisher"));
                book.setAuthor(rs.getString("author"));
                book.setCopies(rs.getInt("copies"));
                book.setSubject(rs.getString("subject"));
                booklist.add(book);
                
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
        
       return booklist;
       
    }

    @Override
    public Book get(int id) {
         Book book=null;
        
        try{
            
            String query="SELECT *  FROM BOOK WHERE id='"+id+"'";
            SqlUtil.connectDB();
             ResultSet rs=SqlUtil.fetch(query);
             if(rs.next()){
                book=new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setPublisher(rs.getString("publisher"));
                book.setAuthor(rs.getString("author"));
                book.setCopies(rs.getInt("copies"));
                book.setSubject(rs.getString("subject"));
                
               
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
        return book;
       
    }

    @Override
    public ArrayList<Book> getByname(String name) {
        
          ArrayList<Book> booklist=new ArrayList<Book>();
        
        try{
            
            String query="SELECT * FROM BOOK Where name='"+name+"'";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                Book book=new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setPublisher(rs.getString("publisher"));
                book.setAuthor(rs.getString("author"));
                book.setCopies(rs.getInt("copies"));
                book.setSubject(rs.getString("subject"));
                booklist.add(book);
                
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
        
       return booklist;
        
    }

    @Override
    public ArrayList<Book> getByAuthor(String author) {
         ArrayList<Book> booklist=new ArrayList<Book>();
        
        try{
            
            String query="SELECT * FROM BOOK Where author='"+author+"'";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                Book book=new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setPublisher(rs.getString("publisher"));
                book.setAuthor(rs.getString("author"));
                book.setCopies(rs.getInt("copies"));
                book.setSubject(rs.getString("subject"));
                booklist.add(book);
                
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
        
       return booklist;
       
    }

    @Override
    public ArrayList<Book> getByPublisher(String publisher) {
         ArrayList<Book> booklist=new ArrayList<Book>();
        
        try{
            
            String query="SELECT * FROM BOOK WHERE publisher='"+publisher+"'";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                 Book book=new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setPublisher(rs.getString("publisher"));
                book.setAuthor(rs.getString("author"));
                book.setCopies(rs.getInt("copies"));
                book.setSubject(rs.getString("subject"));
                booklist.add(book);
                
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
        
       return booklist;
    }
    
        

    @Override
    public ArrayList<Book> getBySubject(String subject) {
         ArrayList<Book> booklist=new ArrayList<Book>();
        
        try{
            
            String query="SELECT * FROM BOOK Where subject='"+subject+"'";
            SqlUtil.connectDB();
            
            ResultSet rs=SqlUtil.fetch(query);
            while(rs.next()){
                 Book book=new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setPublisher(rs.getString("publisher"));
                book.setAuthor(rs.getString("author"));
                book.setCopies(rs.getInt("copies"));
                book.setSubject(rs.getString("subject"));
                booklist.add(book);
                
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
        
       return booklist;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.Book;

/**
 *
 * @author 1711j
 */
public interface BookDAO {
    int add(Book book);
    int remove(int id);
    ArrayList<Book> getAll();
    Book get(int id);
    ArrayList<Book> getByname(String name);
    ArrayList<Book> getByAuthor(String author);
    ArrayList<Book> getByPublisher(String publisher);
    ArrayList<Book> getBySubject(String subject);
            
    
}

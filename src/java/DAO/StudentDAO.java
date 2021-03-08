/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.Student;

/**
 *
 * @author 1711j
 */
public interface StudentDAO {
    
    int add(Student student);
    int remove(int id);
    ArrayList<Student> getAll();
    Student get(int id);
    ArrayList<Student> getByCourse(int courseId);
    ArrayList<Student> getByBranch(int branchId);
            
    
}

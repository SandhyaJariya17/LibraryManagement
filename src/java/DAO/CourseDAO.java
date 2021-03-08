/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.Course;

/**
 *
 * @author 1711j
 */
public interface CourseDAO {
    int add(Course course);
    int remove(int id);
    ArrayList<Course> getAll();
    Course get(int id);
    
    
}

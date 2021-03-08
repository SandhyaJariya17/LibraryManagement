/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.Staff;

/**
 *
 * @author 1711j
 */
public interface StaffDAO {
     int add(Staff staff);
    int remove(int id);
    ArrayList<Staff> getAll();
    Staff get(int id);
    ArrayList<Staff> getByRole(String role);
    
            
}

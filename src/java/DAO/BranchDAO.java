/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.Branch;

/**
 *
 * @author 1711j
 */
public interface BranchDAO  {
    int add(Branch branch);
    int remove(int id);
    ArrayList<Branch> getAll();
    Branch get(int id);
    ArrayList<Branch> getByCourse(int courseId);
    
}

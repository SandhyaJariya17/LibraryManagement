/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAOimpl.StudentDAOimpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;

/**
 *
 * @author 1711j
 */
public class AddStudentController extends HttpServlet {
    

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student=new Student();
        
        student.setId(Integer.parseInt(req.getParameter("id")));
        student.setRoll(req.getParameter("roll"));
        student.setName(req.getParameter("name"));
        student.setBid(Integer.parseInt(req.getParameter("bid")));
        student.setSemNumber(Integer.parseInt(req.getParameter("semNumber")));
        
        StudentDAOimpl impl=new StudentDAOimpl();
        int result=impl.add(student);
        
        resp.sendRedirect("index.html");
        
    }
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 1711j
 */
public class Borrow {
    private int id;
    private int sid;
     private int bid;
    private date issue_date;
    private date expectedReturnDate;
    private date actualReturndate;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public date getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(date issue_date) {
        this.issue_date = issue_date;
    }

    public date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(date expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public date getActualReturndate() {
        return actualReturndate;
    }

    public void setActualReturndate(date actualReturndate) {
        this.actualReturndate = actualReturndate;
    }
   
     
    
}

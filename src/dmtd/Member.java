/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmtd;

/**
 *
 * @author Eric
 */
public class Member extends User{
    private int mid;
    private String schedule;
    private String classes;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    
    public Member() {
        
    }
    
    public void makePayment(){
        
    }
    
    public void checkClasses(){
        
    }
    
    public void viewSchedules(){
        
    }
}

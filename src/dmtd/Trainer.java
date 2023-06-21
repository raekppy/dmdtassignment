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
public class Trainer extends User{
    private int tid;
    private String routines;
    private String memberschedule;
    private String memberclasses;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getRoutines() {
        return routines;
    }

    public void setRoutines(String routines) {
        this.routines = routines;
    }

    public String getMemberschedule() {
        return memberschedule;
    }

    public void setMemberschedule(String memberschedule) {
        this.memberschedule = memberschedule;
    }

    public String getMemberclasses() {
        return memberclasses;
    }

    public void setMemberclasses(String memberclasses) {
        this.memberclasses = memberclasses;
    }
    
    public Trainer() {
        
    }
    
    public void checkMembers(){
        
    }
    
    public void viewMemberSchedule(){
        
    }
    
    public void checkRoutines(){
        
    }
    
}

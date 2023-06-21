/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmtd;

public class User {
  private String username;
  private String password;  
  private String role;
  private String name;
  private int telnumber;
  private String email;
  
  public User(String Uid,String Upw, String Pos, String Una, int TelNo, String Mail)
    {
       username = Uid;
       password = Upw;
       role = Pos;
       name = Una;
       telnumber = TelNo;
       email = Mail;
    }
  
   public User(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(int telnumber) {
        this.telnumber = telnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  

    public String toString() {
        return username + "," + password + "," + role + "," + name + "," + telnumber + "," + email;
    }
  
}

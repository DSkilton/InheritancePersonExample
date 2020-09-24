/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author MC03353
 */
public class Person {
    
    //Private variable 
    private String firstName; 
    private String lastName;
    private String address;
    private String mobile;
    private String email;
    
    //constructor
    public Person (String fullName, String lastName, String address, String mobile, String email ) {
        this.lastName = fullName;
        this.firstName = lastName;  
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
    
    public String getFullName(){
        return lastName;
    }
    
    public void setFullName(String fullName){
        this.lastName = fullName;
    }
    
    public String getMobile(){
        return firstName;
    }
    
    public void setMobile(String mobile){
        this.firstName = mobile;
    }
  
    @Override
    public String toString(){
        return lastName + " " + firstName + " " + address + " " + mobile + " " + email;
    } 
}

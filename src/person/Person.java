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
    private String mobile; 
    private String fullName;
    
    //constructor
    public Person (String fullName, String mobile) {
        this.fullName = fullName;
        this.mobile = mobile;  
    }
    
    public String getFullName(){
        return fullName;
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public String getMobile(){
        return mobile;
    }
    
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
  
    @Override
    public String toString(){
        return fullName + " " + mobile;
    } 
}

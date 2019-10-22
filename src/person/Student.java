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
public class Student extends Person {
    
    private String course;
    
    public Student(String fullName, String mobile) {
        super(fullName, mobile);
    } 
    
    public Student(String fullName, String mobile, String course) {
        super(fullName, mobile);
        this.course = course; 
    } 

    public String getCourse(){
        return course;
    }
    
    public void setCourse(String course){
        this.course = course; 
    }
    
        @Override
    public String toString(){
        return getFullName() + " " + getMobile() + " " + course;
    } 
    
}

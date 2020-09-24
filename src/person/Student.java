package person;

import java.util.Date;

/**
 *
 * @author MC03353
 */
public class Student extends Person {
    private String grades;
    private Date dateCreated;
    
     public Student (String firstName, String lastName, String address, String mobile, String email, String grades, Date dateCreated) {
         super(firstName, lastName, address, mobile, email);
         this.grades = grades;
         this.dateCreated = dateCreated;
    }
     
    public String getGrades(){
        return grades;
    }
    
    public void setGrades(String grades){
        this.grades = grades; 
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public void setDateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
        
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName() + " " + getAddress() + " " + getMobile()  + " " + getEmail()  + " " + getGrades();
    }     
}

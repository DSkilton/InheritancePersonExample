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
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Person Dave = new Person("Dave", "04485159456"); 
        Person Cheryl = new Person("Cheryl", "87984562389");
        System.out.println(Dave);
        System.out.println(Cheryl);
    }
    
}

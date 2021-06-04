/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personneldirectory;

/**
 *
 * @author Omar Tarek
 */
public class Person {
    protected String last;
    protected String first;
    protected String middle;


    public Person(String last, String first, String middle) {
            this.last = last;
            this.first = first;
            this.middle = middle;

    }
    
    public String getLastName(){
        return last;
    }
    
    public String getFirstName(){
        return first;
    }
    
    public String getMiddleName(){
        return middle;
    }
}

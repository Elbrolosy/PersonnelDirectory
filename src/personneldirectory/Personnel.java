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
import java.util.*;
public class Personnel {
    private ArrayList<Person> personList;

    public Personnel() {
       personList = new ArrayList<>();
    }

    public void addPersonnel(Person p)
    {
            this.personList.add(p);
    }
    
    public int getTotalObjects(){
        return this.personList.size();
    }
    
    public ArrayList<Person> clonePersons(){
        return new ArrayList<>(this.personList);
    }
    
    public int find(String fname, String lname){
        for(int i =0; i <this.personList.size(); i++)
        {
            if( this.personList.get(i).first.equals(fname) && this.personList.get(i).last.equals(lname))
            {
                return i;
            }
        }
        return -1;
    }
    
    public Person getPersonAt(int i){
        return personList.get(i);
    }
}

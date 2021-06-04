/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personneldirectory;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Omar Tarek
 */
public class PersonnelUI {
    public void printName(int order, Person p)
    {
        switch (order) {
            case 0:
                System.out.println(p.getFirstName() + "  " + p.getMiddleName() + "  " + p.getLastName());
                break;
            case 1:
                System.out.println(p.getFirstName() + " ," + p.getLastName()+ " " + p.getMiddleName());
                break;
            case 2:
                System.out.println(p.getLastName() + " ," + p.getFirstName() + " " + p.getMiddleName());
                break;
            default:
                break;
        }
    }
    
    public void printPersons(ArrayList<Person> ps){
        Scanner scan = new Scanner(System.in);
        int order = scan.nextInt();
        for(int i=0; i<ps.size(); i++)
        {
            printName(order, ps.get(i));
        }
    }
}

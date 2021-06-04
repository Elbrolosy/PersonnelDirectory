/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personneldirectory;

import java.util.Scanner;

/**
 *
 * @author Omar Tarek
 */
public class PersonnelFactory {
    public Person getPerson(PersonTypes type){
        Scanner scan = new Scanner(System.in);
        if (null == type){
            return null;
        }
        else switch (type) {
            case Employee:
            {
                String firstN, lastN, middleN;
                int empID; double salary;
                System.out.println("Enter first name: ");
                firstN = scan.nextLine();
                System.out.println("Enter last name: ");
                lastN = scan.nextLine();
                System.out.println("Enter middle name: ");
                middleN = scan.nextLine();
                
                System.out.println("Enter empploy id : ");
                empID = scan.nextInt();
                System.out.println("Enter base salary" );
                salary = scan.nextDouble();
                scan.nextLine();
                return new Employee(lastN, firstN, middleN, empID, salary);
            }
            case Person:
            {
                String firstN, lastN, middleN;
                System.out.println("Enter first name: ");
                firstN = scan.nextLine();
                System.out.println("Enter last name: ");
                lastN = scan.nextLine();
                System.out.println("Enter middle name: ");
                middleN = scan.nextLine();
                
                return new Person(lastN, firstN, middleN);
            }
            default:
                return null;
        }
    }
    
    public Person getPerson(PersonTypes type, String firstN, String lastN, String middleN){
        Scanner scan = new Scanner(System.in);
        if (null == type){
            return null;
        }
        else switch (type) {
            case Employee:
            {
                int empID; double salary;
                System.out.println("Enter empploy id : ");
                empID = scan.nextInt();
                System.out.println("Enter base salary" );
                salary = scan.nextDouble();
                scan.nextLine();
                return new Employee(lastN, firstN, middleN, empID, salary);
            }
            case Person:
            {
                return new Person(lastN, firstN, middleN);
            }
            default:
                return null;
        }
    }
    
    public Person getPerson(PersonTypes type, String firstN, String lastN, String middleN, int empID, double salary){
        Scanner scan = new Scanner(System.in);
        if (null == type){
            return null;
        }
        else switch (type) {
            case Employee:
            {
                return new Employee(lastN, firstN, middleN, empID, salary);
            }
            case Person:
            {
                return new Person(lastN, firstN, middleN);
            }
            default:
                return null;
        }
    }
}

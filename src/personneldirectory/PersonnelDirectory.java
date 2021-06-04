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
import java.util.Scanner;
public class PersonnelDirectory
{



   public static void main(String[] args)
   {
        Personnel per = new Personnel();
        PersonnelUI personnelUI = new PersonnelUI();
        Scanner scan = new Scanner(System.in);
        String firstN, lastN, middleN;
        int empID;
        double salary;
        int choice = -1;


        do
        {
            System.out.println("Welcome to the Personnel Directory Management System");
            System.out.println("====================================================");

            System.out.println("\n\n\t 1. Add Personel");
            System.out.println("\n\t 2. Find Personel");
            System.out.println("\n\t 3. Print Names");
            System.out.println("\n\t 4. Number of Entries in the Directory");

            System.out.println("\n\t Select one of the options above (1, 2, 3, 4)");
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice)
            {
                case 1:
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

                    Employee e1  = new Employee(lastN, firstN, middleN, empID, salary);


                    per.addPersonnel(e1);

                break;

                case 2:

                    System.out.println("Enter firts name : ");
                    firstN = scan.nextLine();

                    System.out.println("Enter last name : ");
                    lastN = scan.nextLine();
                    
                    int loc =-1;
                    loc = per.find(firstN, lastN);
                    boolean found = loc != -1;

                    if(found)
                    {
                        System.out.println("Found");
                        personnelUI.printName(0, per.getPersonAt(loc));

                    }else
                    {
                        System.out.println("not found");
                        Person p1  = new Person(lastN, firstN, " ");
                        per.addPersonnel(p1);
                    }

                break;

                case 3:

                    System.out.println("Enter the order 0: first, middle,  last, 1: first, last, middle, 2: last, first , middle ");
                    personnelUI.printPersons(per.clonePersons());

                break;

                case 4:
                    System.out.println("Total Entries : " + per.getTotalObjects());

                break;

            }

        } while(true);


  }

}
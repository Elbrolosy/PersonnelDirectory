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
public class Employee extends Person{
	private int empID;
	private double baseSalary;


	public Employee(String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		empID = id;
		baseSalary = sal;

	}

	public int getID()
	{
		return empID;

	}

}

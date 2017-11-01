package org.com.datastructure.sortingTechniqe;

class Employee {
	private String name;
	private String id;
	private int salary;

	// Employee constructor
	public Employee(String name, String id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	// return employe name
	public String getName() {
		return name;
	}

	void display() {
		System.out.println("Name :" + name);
		System.out.println("ID :" + id);
		System.out.println("salary :" + salary);
	}
}

// this class will hold the reference to employee
class InsertionSortEmployeeArray {
	private Employee[] ar;
	private int index;

	// Constructor for intialinzing Employee array
	public InsertionSortEmployeeArray(int maxSize) {
		ar = new Employee[maxSize];
		index = 0;
	}

	public void insert(String id, String name, int salary) {
		ar[index++] = new Employee(name, id, salary);

	}

	// this method disply array
	public void display() {

		for (int i = 0; i < index; i++)
			ar[i].display();
		System.out.println("");
	}

	// this method Sort Employee Array using Insertion sort
	public void sortEmployee() {
		int i, j;
		Employee temp;
		for (i = 0; i < index; i++) {
			temp = ar[i];
			j = i;
			while (j > 0 && ar[j - 1].getName().compareTo(temp.getName()) > 0) {
				ar[j] = ar[j - 1];

				--j;
			}
			ar[j] = temp;
		}
	}

}

public class SortingObjects_InsertionApp {
	public static void main(String arg[]) {

		int size = 10;
		InsertionSortEmployeeArray sortEmployeeArray;
		sortEmployeeArray = new InsertionSortEmployeeArray(size);
		sortEmployeeArray.insert("01", "Sam", 100000);
		sortEmployeeArray.insert("02", "Kat", 100000);
		sortEmployeeArray.insert("03", "Amy", 200000);
		sortEmployeeArray.insert("04", "Rick", 200000);
		sortEmployeeArray.insert("05", "Ab", 200000);
		sortEmployeeArray.insert("06", "Sym", 300000);
		sortEmployeeArray.insert("07", "John", 400000);
		sortEmployeeArray.insert("08", "Henry", 200000);
		sortEmployeeArray.insert("09", "", 200000);

		System.out.println("Display Employee before sorting: ");
		sortEmployeeArray.display();

		sortEmployeeArray.sortEmployee();
		;

		System.out.println("Display Employee after sorting(on basis of name): ");
		sortEmployeeArray.display();

	}
}

package com.employeehashtables;

public class Main {
 public static void main(String[] args)
 {
	 HashTables ht = new HashTables();
	 Employee e1 = new Employee(100,"shweta","jain");
	 Employee e2 = new Employee(101,"suskan","jain");
	 Employee e3 = new Employee(102,"kiu","jain");
	 Employee e4 = new Employee(103,"kiya","jain");
	 Employee e5 = new Employee(104,"rajesh","jain");
	 Employee e6 = new Employee(105,"preeti","jain");
	 Employee e7 = new Employee(106,"mayank","jain");
	 Employee e8 = new Employee(107,"kanta","jain");
	 Employee e9 = new Employee(108,"amit","jain");
	 Employee e10 = new Employee(109,"deepali","jain");
	 
	 ht.put("shweta", e1);
	 ht.put("suskan", e2);
	 ht.put("kiu", e3);
	 ht.put("kiya", e4);
	 ht.put("rajesh",e5);
	 ht.put("preeti", e6);
	 ht.put("mayank",e7);
	 ht.put("kanta", e8);
	 ht.put("amit",e9);
	 ht.put("deepali", e10);
	sz
	 
	 ht.display();
	 
	 System.out.println("Employee with Key shweta "+ht.get("shweta"));
	 System.out.println("Emloyee with Key suskan "+ht.get("suskan"));

	 
 }
}

package com.employeehashtables;

public class TestHash {

	public static void main(String[] args) {
		HashTableDemo myHashTable = new HashTableDemo();
		myHashTable.printTable();
		myHashTable.set("shweta", 15);
		myHashTable.set("Shradha", 3);
		myHashTable.set("Riyaa", 3);
		myHashTable.set("Mahak", 26);
        myHashTable.set("Namisha", 10);	
        myHashTable.printTable();
        System.out.println(myHashTable.get("Riyaa"));
        System.out.println(myHashTable.get("Riya"));
        System.out.println(myHashTable.keys());

	}

}

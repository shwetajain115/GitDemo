package com.employeehashtables;

public class HashTables {
private Employee [] hashTable;//Array based data structure
public HashTables()
{
	hashTable = new Employee[10];
}
//hash function 
public int getHashKey(String rawKey)//raw key first name
{
	return ((int)rawKey.charAt(0)%10);//example : ayushi A-65 hashcode =5	
}
public void put(String rawKey,Employee employee)
{
	int hashKey = getHashKey(rawKey);
	int stopIndex = hashKey;
//	if(occupied(hashKey))
//	{
//		if(hashKey ==hashTable.length-1)
//		{
//			hashKey =0;
//		}
//		else 
//		{
//			hashKey++;
//		}
//	}
//	while(occupied(hashKey) && hashKey!=stopIndex)
//	 {
//		 if(hashKey==hashTable.length-1)
//		 {
//			 hashKey =0;
//		 }
//		 else {
//			 hashKey++;
//		 }
//	 }
	do {
		 if(hashKey==hashTable.length-1)
		 {
			 hashKey =0;
		 }
		 else {
			 hashKey++;
		 }
	 }while(occupied(hashKey) && hashKey!=stopIndex);
	if(occupied(hashKey))
	{
		System.out.println("Position is accupied");
	}
	else {
		
	hashTable[hashKey] = employee;
	}
   
 
}
public Employee get(String rawKey)
{
	int hashKey = getHashKey(rawKey);
	int stopIndex = hashKey;
	while(hashKey<hashTable.length)
	{
		Employee e  = hashTable[hashKey];
		if(e!=null)
		{
			if(e.getFirstName().equals(rawKey))
			{
				return e;
			}
		}
		if(hashKey==hashTable.length-1)
		{
			hashKey=0;
		}
		else {
			hashKey++;
			if(hashKey ==stopIndex)
			{
				return null;
			}
		}
	}
	
	return hashTable[hashKey];
}
public boolean occupied(int hashKey)
{
	return hashTable[hashKey]!=null;//if occupied return trues
}
public void display()
{ 
	System.out.println("=========================================================");
	for(int i=0;i<hashTable.length;i++)
	{
		int j = hashTable[i].getFirstName().charAt(0);
     System.out.println(i+".."+"ASCII "+j+"......"+hashTable[i]);
    }
	System.out.println("=========================================================");
	
}
}


package com.employeehashtables;

public class Employee {
private int eid;
private String firstName;
private String lastName;
public Employee(int eid, String firstName, String lastName) {
	super();//super class constructor
	this.eid = eid;
	this.firstName = firstName;
	this.lastName = lastName;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}

}

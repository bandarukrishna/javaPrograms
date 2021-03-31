package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
String empName;
int empid;
int age;
public Employee(String empName, int empid, int age) {
	super();
	this.empName = empName;
	this.empid = empid;
	this.age = age;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empid=" + empid + ", age=" + age + "]";
}

}

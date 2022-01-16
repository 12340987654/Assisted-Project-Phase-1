package com.AssistedProject;


public class Question5Constructor {
	int empID;
	String name;
	void display() {
		System.out.println(empID +" : "+ name);
	}


	public static void main(String[] args) {
		Question5Constructor emp1 = new Question5Constructor();
		emp1.display();//default constructor gave values 0 and null



		paraConstructor emp2 = new paraConstructor(201452, "Devyani");
	}

}
class paraConstructor{
	int empID;
	String name;
	paraConstructor(int empID,String name) {// parametrized constructor
		this.empID=empID;
		this.name=name;
		System.out.println(empID +" : "+ name);
	}
}
 
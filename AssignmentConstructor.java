package com.AssistedProject;
import java.util.Scanner;

public class AssignmentConstructor{
public static void main(String[]args) {
new AssignmentConstructor().met();


AssignmentConstructor ref=new AssignmentConstructor
();//method overloading
int result=ref.add(45,10);
System.out.println("Addition is:"+result);

new AssignmentConstructor().takeInput();
}
int add(int firstNumber,int secondNumber) {
return firstNumber+secondNumber;
}
  void takeInput() {
  	Scanner scan=new Scanner(System.in);
  	System.out.println("Enter two number");
  	multiply(scan.nextInt(),scan.nextInt());
  	
  }
  void multiply(int firstNumber,int secondNumber) {
  	int result=firstNumber*secondNumber;
  	displayOutput(result);
  }
  void displayOutput(int result) {
  	System.out.println("Multiplication:"+result);
  }
//method declaration
void met() {
System.out.println("Inside met...");
}}
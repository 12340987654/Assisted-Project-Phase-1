package com.AssistedProject;
import java.util.Scanner;
 
public class WorkingOnJavaExceptionHandling {

	public static void main(String[] args) {
		int a= 7;
		int b = 5;
		String s =null;
		
		try {
			
			int c = a/b;
			//s.length();
				
		} catch(ArithmeticException e) {
			System.out.println("Internal error occurred");
			e.printStackTrace();
			
		} catch(Exception e) {
			System.out.println("404 --Internal error");
		} finally {
			System.out.println("This is  final block code");
		}
			
		System.out.println("This is end of statement");

	}

}
	
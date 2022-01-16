package com.AssistedProject;

public class Question2AccessModifier {
	public int flag;// Public Scope
	private int data=40;
	private void msg() {// Private Access Modifier
		System.out.println("Private Scope...");
	}

	public static void main(String[] args) {
		Question2AccessModifier obj=new Question2AccessModifier();
	     System.out.println(obj.data);
		 obj.msg();
		 new Other().func();
	}
	protected void func() {// Protected Scope
		System.out.println("Protected Scope....");
	}
	void met() {// Package Scope
		System.out.println("Package Scope....");
	}
}
class Other{
	void func() {
		Question2AccessModifier ref=new Question2AccessModifier();
		ref.flag=80;
		ref.met();
		ref.func();
	}
}



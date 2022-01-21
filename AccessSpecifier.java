package com.AssistedProject;

public class AccessSpecifier {
	
		public int flag;// Public Scope
		private int data=40;
		private void msg() {// Private Access Modifier
			System.out.println("Private Scope...");
		}

		public static void main(String[] args) {
			AccessSpecifier obj=new AccessSpecifier();
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
			AccessSpecifier ref=new AccessSpecifier();
			ref.flag=80;
			ref.met();
			ref.func();
		}
	}






package com.AssistedProject;
 
import java.util.Scanner;
public class Question8InnerClass {
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		devyani dev = new devyani() {

						@Override
						public void anjali() {
							System.out.println("annonymous inner class");// annonymous inner class
						}
					};
					dev.anjali();

					govindam gov = new govindam();
					gov.home(new devyani() {
						@Override
						public void anjali() {
							System.out.println();
							System.out.println("Argument based annonymous inner class");
						}

					});

					System.out.println();

					new outer().new inner().print();

					System.out.println();



				}

			}


			interface devyani{
				void anjali();
			}


			class govindam {
				void home(devyani ref) {
				ref.anjali();}
			}

			class outer{
				class inner{
					void print() {
						System.out.println("Regular inner class");
					}
				}
			}



			class Outer{
				void func() {
					class Inner{
						void print() {
							System.out.println("Method local inner class");
						}
					}
					new Inner().print();
				}
			


	}



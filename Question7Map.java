package com.AssistedProject;
import java.util.*;

	public class Question7Map {

		public static void main(String[] args) {

			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"devyani");    
		      hm.put(2,"nisha");    
		      hm.put(3,"Anjali");   

		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }



		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  

		      ht.put(4,"alis");  
		      ht.put(5,"kriss");  
		      ht.put(6,"spidy");  
		      ht.put(7,"canny");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }





		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(8,"rax");    
		      map.put(9,"Camel");    
		      map.put(10,"king");       

		      System.out.println("\nThe elements of TreeMap are ");  
		      for(Map.Entry l:map.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      } 


		}

	}
	



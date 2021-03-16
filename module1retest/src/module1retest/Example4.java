package module1retest;

import java.util.*;

public class Example4 {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		list1.add("apple");
	    list1.add("orange");
		list1.add("grapes");
	
		list2.add("apple");
		list2.add("mango");
		list2.add("melon");
	
		
		for(int i=0;i<list1.size();i++) {
			String s=list1.get(i);
			 if(s.charAt(0)=='a'||s.charAt(0)=='g') {
				list1.remove(i);
			}
			
			
		}
		for(int i=0;i<list2.size();i++) {
			String s=list2.get(i);
			if(s.charAt(s.length()-1)=='e'||s.charAt(s.length()-1)=='n') {
				list2.remove(i);
			}
		}
		list1.addAll(list2);
		
		
		System.out.println(list1);
	}

}

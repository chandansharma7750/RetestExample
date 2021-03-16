package module1retest;
import java.util.*;
public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> list1=new ArrayList<>();
     ArrayList<Integer> list2=new ArrayList<>();
     list1.add(1);
     list1.add(2);
     list1.add(3);
     list1.add(4);
     list1.add(5);
     list2.add(6);
     list2.add(7);
     list2.add(8);
     list2.add(9);
     list2.add(10);
     ArrayList<Integer> result=new ArrayList<>();
     for(int i=0;i<list1.size();i++) {
    	 if(i%2==0) {
    		 result.add(list1.get(i));
    	 }else {
    		 result.add(list2.get(i));
    	 }
     }
     System.out.print(result);
	}

}

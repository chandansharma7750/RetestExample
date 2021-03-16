package module1retest;
import java.util.*;

public class Example3 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		List<Integer> list3=new ArrayList<>();//temp list
		List<Integer> list4=new ArrayList<>();//temp list
		list3.addAll(list1);
		list4.addAll(list2);
		list3.removeAll(list2);
		list4.removeAll(list1);
		list3.addAll(list4);
		Integer []common=new Integer[list1.size()];
		list3.toArray(common);
		for(int i=0;i<list3.size();i++)
		System.out.println(common[i]);
		
		

	}

}

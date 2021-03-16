package module1retest;
import java.util.*;
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer,Integer>h1=new HashMap<>();
     h1.put(1, 4);
     h1.put(2, 6);
     h1.put(4, 7);
     h1.put(5, 9);
    
     int sum=0,count=0;
     for(Integer i:h1.keySet()) {
    	sum=sum+(int)i;
    	count++;
     }
     System.out.print("Avg= "+sum/count);
	}

}

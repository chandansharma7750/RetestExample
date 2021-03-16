package module1retest;
import java.util.*;
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String,Integer> hashmap1=new HashMap<>();
      hashmap1.put("abc", 50);
      hashmap1.put("efg", 60);
      HashMap<String,String>result=new HashMap<>();
      Iterator<String> i=hashmap1.keySet().iterator();
      while(i.hasNext()) {
    	 String name=(String)i.next();
    	 int marks=hashmap1.get(name);
    	 String finalresult="";
    	 if(marks>60) {
    		 finalresult="pass";
    	 }else {
    		 finalresult="fail";
    	 }
    	 result.put(name, finalresult);
      }
      System.out.print(result);
	}

}

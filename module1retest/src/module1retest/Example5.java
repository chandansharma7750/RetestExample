package module1retest;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str="Hello*world";
 boolean flag=false;
 for(int i=0;i<str.length();i++) {
	if(str.charAt(i)=='*') {
		if(str.charAt(i-1)==str.charAt(i+1)) {
			flag=true;
		}
	}
 }
 System.out.println(flag);
	}
}

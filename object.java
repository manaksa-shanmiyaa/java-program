package oops;
import java.util.*;
/*class Restraunt{
	String  name ="pizza";
	int price =300;
	int quantity=2 ;
	void order() {
		System.out.println("enter your order:"+name);
		System.out.println("the price of the dish:"+price);
		System.out.println("the quantity:"+quantity);
	}
	
}
public class object {
	public static void main(String[] args) {
		  Restraunt r1= new Restraunt();
		  r1.order();
		
	}
}*/

/*public class object{
	public static int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(add(100,200));
	}
	
}*/

//scanner input
public class object{
	public static int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a values");
		int inp1 = s1.nextInt();
		int inp2 = s1.nextInt();
		System.out.println(add(inp1,inp2));
		
	
	}
	
}

package day2;
import java.util.*;

public class wrapper {
	public static void main(String[] args) {
		/*Integer myInt = Integer.valueOf(100);
		Double myDouble = Double.valueOf(12.34);
		Character myChar = Character.valueOf('a');
		Boolean myBool = Boolean.valueOf(true);*/
		
		//AUTOBOXING: converting primitive to wrapper class
		Integer intobj = 50;
		
		//UNBOXING:converting wrapper object to primitive
		int intValue= intobj;
		System.out.println(intValue);
	}

}

package day2;
import java.util.*;
public class Userinput {
	public static void main(String[] args) {
		/*Scanner s1 = new Scanner(System.in);
		System.out.print("enter a name");
		String name= s1.nextLine();
		System.out.println(name);*/
		
		//LENGTH
		/*String str= "java ";
		System.out.print(str.length());*/
		
		//SUB STRING
		/*String str= "java programming";
		System.out.println(str.substring(3));	// starting index
		System.out.println(str.substring(0,7));*/
		
		//STRING INDEXOF
		/*String str= "java programming";
		System.out.println(str.indexOf("prog"));	
		System.out.println(str.indexOf("x"));*/
		
		//UPPER CASE LOWER CASE
		/*String str= "java programming";
		System.out.println(str.toUpperCase());	
		System.out.println(str.toLowerCase());*/
		
		//REPLACE
		/*String str= "java programming";
		System.out.println(str.replace('a','A'));	*/
		
		//EQUAL
		/*String str= "java";
		String str1= "JAVA";
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));	*/
		
		//CHAR AT
		/*String str= "JAVA";
		System.out.println(str.charAt(1));*/
		
		//SPLIT
		/*String str="java,c,c++";
				String []language = str.split(",");
				
				for(String s1:language) {
				System.out.println(s1);
				}*/
		
		//CONCAT
		
		/*String str="java";
		String str1="programming";
		
		System.out.println("concat String:"+str.concat(str1));*/
		
		//TRIM
		/*String str="  JAVA  ";
		System.out.println(str.length());
		String str1= str.trim();
		Sys
		System.out.println(str1.length());*/
		
		//COMPARE
		/*String str="java";
		String str2="java";
		
		System.out.println(str.compareTo(str2));*/
		
		//CONTAINS
		/*String str="java program";
		
		System.out.println(str.contains("java"));
		System.out.println(str.contains("python"));*/
		
		//STRING INTERN
		/*String s1 = new String("JavaDeveloper");
		String s2 = "JavaDeveloper";
		String s3 = s1.intern();
		System.out.println(s1==s2);
		System.out.println(s1==s3);*/
		
		//STRING BUILDER
		/*StringBuilder sb= new StringBuilder("hello");
	sb.append("world");
	System.out.println("After append:"+ sb);
	sb.insert(5, ",");
	System.out.println("After append:"+ sb);
		
		//REPLACE
		sb.replace(6, 11, "java");
		System.out.println("After replace:" + sb);
		
		//reverse
		sb.reverse();
		System.out.println("After reverse:" + sb);*/
		
		
		//STRING BUFFER
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println("StringBuffer :"+ sb);
		sb.insert(5, ",");
		System.out.println("After append:"+ sb);
			
			//REPLACE
			sb.replace(6, 11, "java");
			System.out.println("After replace:" + sb);
			
			//reverse
			sb.reverse();
			System.out.println("After reverse:" + sb);
	}

}

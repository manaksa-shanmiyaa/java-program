package oops;

class Student{
	public String name = "raj";
	private int age = 16;
	protected String grade = "A";
	String school = "ABC school";
	
	public void displayInfo() {
		System.out.println("Name:"+ name);
		System.out.println("Age:"+ age);
		System.out.println("Grade:"+ grade);
		System.out.println("School:"+ school);
	}
}
public class accessmodifiers {
	public static void main(String[] args) {
		Student s1 =new Student();
		s1.displayInfo();
		
		System.out.println("public name:"+s1.name);
		System.out.println("Default School:"+s1.school);
		
	}
}



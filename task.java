package library;
import java.util.*;


class Student {

    private int id;
    private String name;
    private String grade;

    public Student(int id, String name, String grade) {
    	        this.id = id;
    	        this.name = name;
    	        this.grade = grade;

    }

    public int getId() {
            return id;
            }



    public void setId(int id) {
    	this.id = id;
 }



    public String getName() {
                  return name;
                  }



    public void setName(String name) {
               this.name = name;
               }



    public String getGrade() {
    	return grade;
    	}



    public void setGrade(String grade) {
    	this.grade = grade;

    }



    

    public void displayStudentDetails() {
               System.out.println("Student ID: " + id);
               System.out.println("Name: " + name);
               System.out.println("Grade: " + grade);
  }



   

    public String toString() {
    	return "Student{id=" + id + ", name='" + name + "', grade='" + grade + "'}";

    }

}



class StudentManagementSystem {

    private HashMap<Integer, Student> studentMap; 

    private ArrayList<Student> studentList;        

    private TreeSet<Student> studentTreeSet;       



    
    public StudentManagementSystem() {

        studentMap = new HashMap<>();

        studentList = new ArrayList<>();

        studentTreeSet = new TreeSet<>(Comparator.comparingInt(Student::getId)); 
        

    }



    

    public void addStudent(int id, String name, String grade) {

        Student student = new Student(id, name, grade);

        studentMap.put(id, student);

        studentList.add(student);

        studentTreeSet.add(student);

        System.out.println("New student added successfully!");

    }



    
    public void viewAllStudents() {

        if (studentList.isEmpty()) {

            System.out.println("No students available.");

        } else {

            for (Student student : studentList) {

                student.displayStudentDetails();

                System.out.println("--------------------");

            }

        }

    }



    

    public void searchStudent(int id) {

        if (studentMap.containsKey(id)) {

            studentMap.get(id).displayStudentDetails();

        } else {

            System.out.println("Student with ID " + id + " not found.");

        }

    }



    

    public void removeStudent(int id) {

        if (studentMap.containsKey(id)) {

            Student student = studentMap.remove(id);

            studentList.remove(student);

            studentTreeSet.remove(student);

            System.out.println("Student removed successfully.");

        } else {

            System.out.println("Student with ID " + id + " not found.");

        }

    }



  

    public void sortStudents() {

        

        System.out.println("Sorted students by ID:");

        for (Student student : studentTreeSet) {

            student.displayStudentDetails();

            System.out.println("--------------------");

        }

    }

}



public class task{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentManagementSystem sms = new StudentManagementSystem(); // Creating system object



        while (true) {
                 System.out.println("Student Management System");
                 System.out.println("1. Add New Student");
                 System.out.println("2. View All Students");
                 System.out.println("3. Search for Student");
                 System.out.println("4. Remove Student");
                 System.out.println("5. Sort Students by ID");
                 System.out.println("6. Exit");
                 System.out.print("Choose an option: ");
                 int choice = scanner.nextInt();
                 scanner.nextLine(); 



            switch (choice) {

                case 1:
                	System.out.print("Enter Student ID: ");
                	int id = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Grade: ");
                    String grade = scanner.nextLine();
                    sms.addStudent(id, name, grade);
                    break;



                case 2:
                	sms.viewAllStudents();
                    break;



                case 3:
                	System.out.print("Enter Student ID to search: ");
                	int searchId = scanner.nextInt();
                	sms.searchStudent(searchId);
                    break;



                case 4:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = scanner.nextInt();
                    sms.removeStudent(removeId);
                    break;



                case 5:
                	sms.sortStudents();
                	break;



                case 6:
                	System.out.println("Exiting...");
                	scanner.close();
                	return;



                default:

                    System.out.println("Invalid choice. Please try again.");

            }

        }

    }

}


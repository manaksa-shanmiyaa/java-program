package files;
import java.io.*;
public class Filedemo {
	public static void main(String[] args) {
try {
	/*FileWriter w1=new FileWriter("file.txt");
	w1.write("welcome you all");
	w1.close();
	System.out.println("Data written to file");
	
//reading a file
	FileReader r1=new  FileReader("file.txt");
	int character;
	while((character = r1.read()) != -1) {
		System.out.print((char) character);
		
	}
	r1.close();
	
}catch(IOException e) {
	System.out.println("An error occured" +e.getMessage());
}*/
	
BufferedReader r1= new BufferedReader(new FileReader(""));
String line;
System.out.println("Reading file line by line");
while((line = r1.readLine())!= null) {
	System.out.println(line);
	}
r1.close();
}catch (IOException e) {
	System.out.println("Error reading file:"+ e.getMessage());
}
}
}

package files;
import java.io.*;
public class FileReaderExample {
public static void main(String[] args) {
	/*try {
		FileReader reader= new FileReader("file.txt");
		int character;
		System.out.println("File contents:");
		while((character = reader.read())!= -1) {
			System.out.print((char) character);
		
		}
		reader.close();
	}catch (IOException e) {
		System.out.println("Error reading the file"+e.getMessage());
	}*/
	try {
	BufferedReader r1= new BufferedReader(new FileReader("C:\\test\\sample.txt"));
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


package files;
import java.io.*;
public class fileWriterExample {
public static void main(String[] args) {
	/*try{
		FileWriter  writer= new FileWriter("out.txt");
		writer.write("hello all");
		writer.close();
		System.out.println("data succesfully written to file");
	
	}catch (IOException e) {
		System.out.println("Error writing to thr file:"+e.getMessage());
	}*/
	
	try {
		BufferedWriter writer= new BufferedWriter(new FileWriter("C:\\test\\sample.txt"));
		writer.write("java file handling example");
		writer.newLine();
		writer.write("BufferedWriter makes writing more effecient");
		writer.close();
		System.out.println("data written to file successfully");
		
	}catch(IOException e) {
		System.out.println("error writing to file"+e.getMessage());
	}
}
}

package Filesuploadinglearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreateClass {

	public static void main(String[] args) 
	{
		File file = new File("Important document");
		file.mkdir();
		
		file = new File("Important document\\Certificate.txt");
		file = new File("Important document\\Certificate2.txt");
		try {
			file.createNewFile();
			System.out.println("studyeasy file created");
		} catch (IOException e) {
			System.out.println("file not created");
			
		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write("chand");
			bw.newLine();
			bw.write("snehal");
			bw.newLine();
			bw.write("shubham");
			bw.newLine();
			bw.write("soniya");
			bw.newLine();
			bw.write("mayuri");
			bw.close();
			
			System.out.println("writing onto the file created");
		} catch (IOException e) {
			System.out.println("error occured, writing onto the file");
		}
		try {
		BufferedReader br = new BufferedReader(new FileReader("Important document\\Certificate3.txt"));
				String line; 
					while((line=br.readLine()) != null ) {
				System.out.println(line);
			}
					br.close();
		}
			catch (FileNotFoundException e1) {
				System.out.println("FileNotFoundException ");	}
		catch (IOException e) {
			System.out.println("IOException");
		}
	}
}
	

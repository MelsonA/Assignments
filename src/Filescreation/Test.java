package Filescreation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		String FILE_NAME = "src/file.text";
		String str = "hey";
//		Path newFilePath = Paths.get(FILE_NAME);
//		try {
//			Files.createFile(newFilePath);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//another way
		
//		File newFile = new File(FILE_NAME);
//		System.out.println(newFile.createNewFile());
		
//		BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
//		writer.write(str);
//		writer.close();
		
		BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
		String line=reader.readLine();
		while(line !=null) {
			System.out.println(line);
			line=reader.readLine();		
			}
	}

}

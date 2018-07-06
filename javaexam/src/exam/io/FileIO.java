package exam.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws IOException {
		
		final String FILENAME = "c:\\sample.txt"; 
		final File file = new File(FILENAME);

		//scanner
		Scanner scan = new Scanner(file);
		for (int i=0;scan.hasNext();i++){
			String line = scan.nextLine();
			System.out.println("LineNo ["+i+"] : "+line);
				
			String[] part = line.split(" ");
			System.out.println("Array size : "+part.length);
				
			//int j = 0;
			//for (String word : part){
			for (int j=0;j<part.length;j++){
				System.out.println("PartNo : ["+j+"/"+part.length+"] : "+part[j]);
				//System.out.println("Word : ["+(j++)+"] "+word);
			} 
		}
		// buffered reader
		FileReader frd = new FileReader(file);
		BufferedReader brd = new BufferedReader(frd);
		String s = null;
		while ((s = brd.readLine()) != null) {
			System.out.println(s);
		}
		scan.close();
		frd.close();
		brd.close();
	}
}

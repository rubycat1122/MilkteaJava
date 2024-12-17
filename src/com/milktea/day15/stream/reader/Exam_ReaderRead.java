package com.milktea.day15.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReaderRead {
	public static void main(String[] args) {
		try {
			Reader fr = new FileReader("C:\\Windows\\system.ini");
			int readData;
			while((readData = fr.read()) != -1) { // Add Catch clause to surrounding try
				System.out.println((char)readData);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

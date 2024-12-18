package com.milktea.day16.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exercise_TextFileCopy {
	/*
	 * C:\\Windows\\system.ini 를 복사해서
	 * C:\\Temp\\system.txt 로 만들어주세요.
	 * 단, 문자 기반 스트림을 사용하세요
	 */
	public static void main(String[] args) {
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("C:\\Windows\\system.ini");
			writer = new FileWriter("C:\\Temp\\system.txt");
//			String result [] = writer.toString();
//			writer.write(result);
			
			
			
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// close
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

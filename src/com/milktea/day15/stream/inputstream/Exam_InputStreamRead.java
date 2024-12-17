package com.milktea.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_InputStreamRead {
	public static void main(String []args) {
		try {
			InputStream is = new FileInputStream("C:\\Windows\\system.ini"); 
			// 업캐스팅>FileInputStream>InputStream-임포트
			int readByte;
			// #4
			while( (readByte = is.read()) != -1) {
				System.out.print((char)readByte);
			}
			
			// #3
			do {
				readByte = is.read();
				System.out.print((char)readByte);
			}while(readByte != -1);
			
			// #2
			while(true) { 
				readByte = is.read();
				if(readByte == -1) break;
				System.out.print((char)readByte);
			}
			// #1
			for(;;) { // 언제까지 반복? 다 읽을 때까지 -> 다 읽은건 어떻게 알지? -> is.read() == -1
				readByte = is.read();
				if(readByte == -1) break;
				System.out.print((char)readByte);
			}
//			System.out.println(is.read()); // 파일을 숫자로 읽어옴. 형변환을 통해 내용을 알 수 있음
//			System.out.println((char)is.read()); // 파일을 숫자로 읽어옴. 형변환을 통해 내용을 알 수 있음
//			System.out.println((char)is.read()); 
//			System.out.println((char)is.read()); 
//			System.out.println((char)is.read()); 
//			System.out.println((char)is.read()); 
//			is.read(); // 예외처리 해줘야 함
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

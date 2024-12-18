package com.milktea.day16.stream.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		// "파일을 읽어라"
		// 메인 메소드를 기준으로 봤을 때 읽거나 입력하면 input/ 나가면 output
		// (파일 결과물 기준으로 생각하지 말것)
		try {
			InputStream is = new FileInputStream("C:\\Windows\\system.ini"); // InputStream은 최상위 클래스, 업캐스팅 적용
			Reader fr = new FileReader("src/com/milktea/day16/stream/exercise/Exercise_MemoPad.java");
			int readCount; // 한글자씩 읽으면 (int)정수를 넣었는데 그러면 너무 오래걸리므로 byte계열로
			byte [] readBytes = new byte[1024];
			readCount = is.read(readBytes); // read는 try-catch한 번 더 써야하는데, add catch를 이용
			String result = new String(readBytes, 0, readCount); // 배열이 크면 한 번에 읽어올 수 있어서 반복하지 않아도 되나
																 // 파일이 크기가 크면 반복하여 읽어와야 한다.
			System.out.println(result);			// 결과 출력, system.ini 파일 내용 출력
			is.close();							// 자원 해제
			
			int readChar;
			char [] readChars = new char[1024]; // 파일 크기가 커지면 반복필요
//			readChar = fr.read(readChars); 		// 이 값을 반복 
			while((readChar = fr.read(readChars)) != -1 ) {
				result += new String(readChars, 0, readChar); 
			}
			System.out.println(result);
			fr.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

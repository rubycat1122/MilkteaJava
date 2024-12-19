package com.milktea.day16.stream.bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_BufferedStream {
	public static void main(String[] args) {
		Reader reader = null;
		BufferedReader bReader = null;
		
		try {
			reader = new FileReader("src/com/milktea/day16/stream/exercise/Exercise_TextFileCopy.java");
			bReader = new BufferedReader(reader); // 보조스트림 객체 생성시 주스트림(reader)을 전달해주어야 함.
			// 보조스트림에 따라서 더 많은 메소드를 사용할 수 있게 됨
//			int readCount; // 기존에는 readCount에 읽은 값을 for문 i< 에 넣어서 읽은 값이 없을때까지 불러왔었다.
//			for(int i = 0; i < 50; i++)  // (50줄까지 읽어옴)
//				System.out.println(bReader.readLine()); // readLine() 이라는 보조스트림이 제공하는 메소드 사용해보기
			String Line;	// 읽은 데이터를 저장하는 변수
			while( (Line = bReader.readLine()) != null ) // 읽은 값이 없으면 더이상 동작하지 않도록 함.
				System.out.println(Line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				bReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

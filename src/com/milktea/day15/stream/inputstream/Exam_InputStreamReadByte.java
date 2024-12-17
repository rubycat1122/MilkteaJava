package com.milktea.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_InputStreamReadByte {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Windows\\system.ini"); // 자동완성 surround try-catch
			int readByte;
			byte [] readBytes = new byte[3];  // 3자리(글자 3개씩) 출력함  /Exam_InputStreamRead 는 1글자씩 읽었음
			String result = ""; // 누적합 필요
			while( (readByte = is.read(readBytes)) != -1 ) {
				// readByte는 읽은 값이 출력되는 것이 아니라
				// 읽은 갯수를 출력함
				// readButes는 읽은 값을 가지고 있음
				// 나는 문자열로 출력을 해야함
				// 바이트 배열 -> 스트링으로 변환되어야 함
				// "1" -> 1, Integer.parseInt("1");   스트링 클래스를 이용해야 함
				result += new String(readBytes ,0, readByte);  // 마지막 공백 빼고 출력  
			}
			System.out.println(result);
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

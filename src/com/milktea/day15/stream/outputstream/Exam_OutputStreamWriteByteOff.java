package com.milktea.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_OutputStreamWriteByteOff {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("src/com/milktea/day15/stream/outputstream/writing3.txt");
			byte [] bytes = "마지막 입출력 테스트".getBytes();
			os.write(bytes, 0, 9);		// 한글은 한글자에 3byte. 6으로 설정하면 2글자만 출력됨
			os.flush();
			os.close();
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

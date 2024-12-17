package com.milktea.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_OutputStreamWriteByte {
	public static void main(String[] args) {
		try {  // 주소에 출력할 주소 지정
			OutputStream os = new FileOutputStream("src/com/milktea/day15/stream/outputstream/writing2.txt");
			// "헬로우 입출력" -> 전달하는 값이 바이트배열이어야 함. String을 바이트배열로 변환해야 함
			byte [] inputBytes = "헬로우 입출력123".getBytes(); //getBytes() 이용해서 바이트배열로 바꿔줄 수 있다
			//os.write(inputBytes[0]);  반복문으로
//			for(int i=0; i < inputBytes.length; i++) {
//				os.write(inputBytes[i]);
//			}
			os.write(inputBytes);
			os.flush(); 	// 버퍼비우기
			os.close(); 	// 자원해제
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

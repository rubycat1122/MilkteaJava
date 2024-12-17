package com.milktea.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_OutputStreamWrite {
	public static void main(String[] args) {
		try { // 주소에 출력할 주소 지정
			OutputStream os = new FileOutputStream("src/com/milktea/day15/stream/outputstream/writing.txt");
			// 상대주소값 /이후에 파일명 써주고 (/writing.txt) 실행한다음에 목차부분 패키지선택 F5키 눌러서 새로고침하면 파일 생성돼있음
			os.write(65);
			os.write(66);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

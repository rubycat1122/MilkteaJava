package com.milktea.day16.stream.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class Exam_Write {
	public static void main(String[] args) { 
		try {  	// 메인을 기준으로 생각했을 때 기재 내용이 다른 파일로 나간다. ∴ 출력스트림
			OutputStream os = new FileOutputStream("src/com/milktea/day16/stream/io/writing.txt");
			Writer fw = new FileWriter("src/com/milktea/day16/stream/io/writing2.txt");
			
			byte [] byteArrs = "헬로우 입출력".getBytes();
			os.write(byteArrs); // add catch
			os.flush(); // 버퍼비우기
			os.close(); // 자원 해제
			System.out.println("파일 쓰기 완료");
			
			fw.write("문자열 그대로 입력, 배열 변환 필요없음.");
			fw.flush();
			fw.close();
			System.out.println("패키지 클릭 후 F5를 눌러 확인해보세요.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

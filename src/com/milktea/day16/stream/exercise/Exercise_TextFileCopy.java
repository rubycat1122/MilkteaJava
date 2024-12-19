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
		/*
		 * 파일을 복사하려고 해
		 * C드라이브 밑 Window폴더 밑에 system.ini파일을 복상하려고 해
		 * main() 메소드를 기준으로 생각했을 때 해당 파일을 읽어야 하기 때문에
		 * 입력스트림을 사용해야 해
		 * 입력스트림을 사용해서 파일을 읽은 다음에 읽은 내용은
		 * 목적지 C:\\Temp\\system.txt 파일에 써야 해
		 * main() 메소드를 기준으로 생각했을 때 해당 내용을 내보내야 하기 때문에
		 * 출력 스트림을 사용해야 해
		 * 출력스트림을 사용해서 읽은 내용은 system.txt 파일에 저장 돼.
		 * 출력스트림을 쓸 때에는 flush(), close()를 해주어야 해
		 * 둘 중 하나만 써도 동작하지만 우리는 다 써야 해
		 */
		
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("C:\\Windows\\system.ini");
			writer = new FileWriter("C:\\Temp\\system.txt");
			int readCount;
			char [] cBuf = new char [1024];
			while(true) {
				readCount = reader.read(cBuf);
				if(readCount == -1) break;
				writer.write(cBuf, 0 , readCount); // 0부터 읽은 갯수만큼만 불러와라
				writer.flush(); // flush 와 close는 둘 중 하나만 써도 동작은 하지만 원칙은 둘 다 기재
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
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

package com.milktea.day15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Exam_WriterWriteChar {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("src/com/milktea/day15/stream/writer/writing.txt");
			char [] cArrs = "프론트엔드/백엔드".toCharArray();
			for(char cOne: cArrs) {
				fw.write(cOne);
			}
//			fw.write(cArrs[0]);
//			fw.write(cArrs[1]);
//			fw.write(cArrs[2]);
			fw.flush();
			fw.close();
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

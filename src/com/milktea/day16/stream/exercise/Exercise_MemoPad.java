package com.milktea.day16.stream.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_MemoPad {
/*		
 *  // 저장할 파일 입력(확장자 제외) : snow
	// 종료는 exit
	// 1 : 오늘은
	// 2 : 눈이
	// 3 : 옵니다.
	// 4 : 펑펑
	// 5 : 옵니다.
	// 6 : exit
	// 파일 저장이 완료되었습니다. F5를 눌러 확인해보세요~
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("저장할 파일명 입력(확장자 제외) : ");
		String fileName = sc.next();
		String destination = "src/com/milktea/day16/stream/exercise/"+fileName+".txt";
		try {
			Writer wr = new FileWriter(destination);
			System.out.println("종료는 exit");
			for(int i=1; ; i++ ) {
				System.out.print(i+":");
				String input = sc.next();
				if("exit".equals(input)) break;
				wr.write(input +"\n" );
			}
//			wr.write("1 : 오늘은\n");
//			wr.write("2 : 눈이\n");
//			wr.write("3 : 옵니다.\n");
//			wr.write("4 : 펑펑\n");
//			wr.write("5 : 옵니다.\n");
			wr.flush();
			wr.close();
			System.out.println("파일 저장이 완료되었습니다. F5를 눌러 확인해보세요~");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

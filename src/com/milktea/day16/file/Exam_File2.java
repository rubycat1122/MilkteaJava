package com.milktea.day16.file;

import java.io.File;

public class Exam_File2 {
	public static void main(String[]args) {
		/*
		 *  C:\Windows\Web\Wallpaper\Windows\img0.jpg 파일의
		 *  파일명, 파일용량, 상위폴더, 저장절대경로, 저장상대경로 를 출력하시오.
		 */
		File image = new File("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
		
		
		System.out.println("파일명 : " + image.getName());
		System.out.println("파일용량 : " + image.length());
		System.out.println("상위폴더 : "+ image.getParent());
		System.out.println("저장절대경로 : "+ image.getAbsolutePath()); // C드라이브부터 쭉 나오는 주소
		System.out.println("저장상대경로 : "+ image.getPath()); // 해당 폴더위치부터 나오는 주소
	}
}
// 첨부파일 업로드 할 때 정말 많이 쓰임, 용량.경로 등을 사용할때...
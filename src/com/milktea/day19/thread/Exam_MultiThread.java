package com.milktea.day19.thread;

class PrintNumbers implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<6; i++) {
			System.out.println("숫자 : " + i);
			try {
				// 밀리세크초를 전달값으로 받음, Checked Exception 예외 강제
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class DownloadFiles implements Runnable{

	@Override
	public void run() {
		String [] files = {"document.pdf", "image.jpg", "video.mp4"};
		for(String file: files) {
			System.out.println(file + " 다운로드 중...");
			try {
				Thread.sleep(2000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
	
}

public class Exam_MultiThread {
	public static void main(String[] args) {
		Thread nThread = new Thread(new PrintNumbers());
		Thread dThread = new Thread(new DownloadFiles());
		
		nThread.start();
		dThread.start();
	}
		// 기존 싱글 스레드
//		printNumbers();
//		downloadFilew();
//		
//	}
//
//	private static void downloadFilew() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void printNumbers() {
//		// TODO Auto-generated method stub
//		
//	}
}

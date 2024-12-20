package com.milktea.day18.thread;
// 해당클래스를 스레드로 만드는 방법

// 카운트업 쓰레드가 됨
class CountUp extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				// 전달값으로 밀리초를 받음, 1ms= 1/1000초, 1000ms는 1초 
				// checked Exception이기 때문에 반드시 예외처리
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
//카운트다운 쓰레드가 됨
class CountDown extends Thread{
	@Override
	public void run() {
		for(int i=69; i>=65; i--) {
			System.out.println((char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Exam_Thread1 {
	public static void main(String []args) {
		CountUp cUp = new CountUp();
		cUp.start();
		CountDown cDown = new CountDown();
		cDown.start();   
		// 동시수행
	}
}

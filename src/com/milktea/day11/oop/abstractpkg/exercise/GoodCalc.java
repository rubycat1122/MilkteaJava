package com.milktea.day11.oop.abstractpkg.exercise;
// 서브 클래스-> 오버라이딩(재정의)
public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int result = a+b;
		return result;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;  // 두 줄을 한 줄로 생략 가능
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
//		int [] a = new int[5];
		// 평균 = 합 / 크기
		// 합 : 배열에 있는 값을 꺼내서 더함( 누적합 )
		int sum = 0;
		for(int i =0; i< a.length; i++) {
			sum += a[i];
		}
		double avg = (double)sum/ a.length;
		return avg;
	}
// 슈퍼 클래스의 메소드들이 추상메소드이기 때문에 서브 클래스에서 재정의하는 것.
	
	public static void main(String [] args) {
		//Calculator cannot be resolved to a type (오류메시지)
//		Calculator calculator = new Calculator();
		Calculator calculator = new GoodCalc();
		System.out.println(calculator.add(11,18));
		System.out.println(calculator.substract(11,18));
		int [] arrs = {11, 18, 5, 2};
		System.out.println(calculator.average(arrs));
		
		GoodCalc calc = new GoodCalc();
		System.out.println(calc.add(11,18));
		System.out.println(calc.substract(11,18));
		int [] nums = {11, 18, 5, 2};
		System.out.println(calc.average(nums));
	}
	
}

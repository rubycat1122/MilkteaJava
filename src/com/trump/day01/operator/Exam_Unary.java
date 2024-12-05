package com.trump.day01.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		/*
		 * 단항연산자
		 * a++, ++a -> a = a + 1;
		 * a--, --a -> a = a - 1;
		 * b++, ++b -> b = b + 1;
		 * b--, --b -> b = b - 1;
		 */
		int num = 1;
		// ++num, num++, num -> 2 2 3
		System.out.println(++num); // num은 2가 됨
		System.out.println(num++); // +1 연산을 나중에 함. num은 여전히 2가됨
		System.out.println(num);// 여기서 num은 3이 됨
		// num++, ++num, num -> 1 3 3
		// num++, num++, num -> 1 2 3
		// ++num, ++num, num -> 2 3 3
		
		/*
		 * 문제1
		 * a가 10, b는 20, c는 30입니다.
		 * a++;
		 * a: 11, b: 20, c: 30
		 * b = (--a) + b;
		 * a: 10, b: 30, c: 30
		 * c = (a++) + (--b);
		 * a: 11, b: 29, c: 39
		 * 연산을 끝마친 후
		 * a, b, c의 값은 얼마일까요?
		 * -> a: 11, b: 29, c: 39
		 */
		int aNum = 10;
		int bNum = 20;
		int cNum = 30;
		aNum++;
		bNum = (--aNum) + bNum;
		cNum = (aNum++) + (--bNum);
		System.out.printf("a의 값 : %d, b의 값 : %d, c의 값 : %d\n", aNum, bNum, cNum);
		
		/*
		 * 문제2
		 * x는 100, y는 33, z는 0입니다
		 * x--;
		 * x: 99, y: 33, z: 0
		 * z = x-- + --y;
		 * x: 98, y: 32, z: 99+32=131
		 * x = 99 + x++ + x;
		 * x: 99+98+99=296, y: 32, z: 131
		 * y = y-- + y + ++y;
		 * x: 296, y: 32+31+32=95, z: 131
		 * 의 연산을 끝마친 후 
		 * x, y, z의 값은 얼마일까요?
		 * -> x: 296, y: 95, z: 131
		 */
		int x = 100;
		int y = 33;
		int z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		System.out.println("x의 값 : " + x + ", y의 값 : " + y + ", z의 값 : " + z);
		
		/*
		 * 문제3
		 * a는 5, b는 10입니다.
		 * c = (++a) + b;
		 * a = 6, b = 10, c = 6 + 10 = 16;
		 * d = c / a;
		 * a = 6, b = 10, c = 16, d = 16 / 6 = 2;
		 * e = c % a;
		 * a = 6, b = 10, c = 16, d = 2, e = 16 % 6 = 4;
		 * f = e++;
		 * a = 6, b = 10, c = 16, d = 2, e = 5, f = 4;
		 * g = (--b) + (d--);
		 * a = 6, b = 9, c = 16, d = 1, e = 5, f = 4, g = 9 + 2 = 11;
		 * h = 2;
		 * i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		 *   = 6   + 9 / (15 / 4) * (11 - 1) % (6 + 2);
		 *   = 
		 * a: 7, 
		 * a: ?, b: ?, c: ?, d: ?, e: ?, f: ?, g: ?, h: ?, i: ?의 값은 무엇일까요?
		 * a: 7, b: 9, c: 15, d: 1, e: 6, f: 4, g: 10, h: 2, i: 12의 값은 무엇일까요?
		 */
	}
}













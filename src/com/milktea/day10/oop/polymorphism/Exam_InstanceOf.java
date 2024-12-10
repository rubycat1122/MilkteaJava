package com.milktea.day10.oop.polymorphism;

class Car {}
class Sonata extends Car{}
class Genesis extends Car{}
class Audi extends Car{}


public class Exam_InstanceOf {
	static void print(Car car) {
		if(car instanceof Sonata) {
			System.out.println("소나타 점프!!");
		}
		if(car instanceof Genesis) {
			System.out.println("제네시스 킥!!");
		}
		if(car instanceof Audi) {
			System.out.println("아우디 펀치!!");
		}
	}
	public static void main(String[] args) {
		print(new Car());
		print(new Sonata());
		print(new Genesis());
		print(new Audi());
	}
}

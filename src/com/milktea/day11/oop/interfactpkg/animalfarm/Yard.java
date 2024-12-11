package com.milktea.day11.oop.interfactpkg.animalfarm;

public class Yard {
	public static void main(String[]args) {
		Animal animal = new Cat();
		animal = new Dog();
		animal = new Hen();
		animal.speak();
	}
}

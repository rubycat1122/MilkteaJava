package com.milktea.day11.oop.interfactpkg.zoo;

public class Zookeeper {
	public void feed(FoodInterface animal) {
		System.out.println("feed "+animal.favoriteFood());
	}	
	
//	public void feed(Bear bear) {
//		System.out.println("feed honey ");
//	}
//	public void feed(Camel camel) {
//		System.out.println("feed cactus");
//	}
//	public void feed(Deer deer) {
//		System.out.println("feed acorn");
//	}
}

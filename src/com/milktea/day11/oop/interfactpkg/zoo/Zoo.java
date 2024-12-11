package com.milktea.day11.oop.interfactpkg.zoo;

public class Zoo {
	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		Bear bear = new Bear();
		zookeeper.feed(bear);
		zookeeper.feed(new Camel());
		zookeeper.feed(new Deer());		
	}
}

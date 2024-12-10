package com.milktea.day10.oop.overriding;

public class Exam_Overriding {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		///////////////////////
		shape = new Line();
		shape.draw();
		//////////////////////
		Line line = new Line();
		line.draw();
		Rectangle rect = new Rectangle();
		rect.draw();
		Circle circle = new Circle();
		circle.draw();
	}
}

package oopInterface;

import java.awt.Point;

public class Rect 
	extends Shape // 속성, 메서드 상속 
	implements Drawable, Movable // 추상 메서드 
	{

	Point p1;
	Point p2;

	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}

	@Override
	public void move() {
		System.out.println("사각형 이동");
	}
}

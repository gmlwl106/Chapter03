package com.javaex.ex05;

public class Rectangle {

	//필드
	private int width;
	private int height;
	
	
	
	//생성자
	public Rectangle() {
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	//메소드 gs
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	//구해지는 면적이 같으면 두 객체가 같은것
	@Override
	public boolean equals(Object obj) {
		Rectangle r = ((Rectangle)obj);
		
		if(this.height*this.width == r.height*r.width) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}

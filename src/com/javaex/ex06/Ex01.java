package com.javaex.ex06;

public class Ex01 {
	public static void main(String[] args) {
		
		String s01 = new String("안녕하세요");
		String s02 = new String("안녕하세요");
		
		System.out.println(s01.toString());
		System.out.println(s02.toString());
		
		System.out.println(s01 == s02);
		
		System.out.println("================================");
		
		String s03 = "hi"; //(만들어져있는 같은 문자열이 없음)->새로운 문자열 인스턴스 만듬
		String s04 = "hi"; //같은 문자열을 찾아내서 주소 복사
		
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		
		System.out.println(s03 == s04);
		
		s03 = "hihi"; //기존 문자열 인스턴스를 두고 새로운 문자열을 만듬
		
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		
		System.out.println(s03 == s04);
	}
}

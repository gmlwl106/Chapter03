package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(30);
		
		//Short s= new Short(3);
		
		Integer iResult = new Integer(10) + new Integer(30);
		System.out.println(iResult);
		
		Integer no = 3;
		int r01 = no.parseInt("1234");
		System.out.println(r01 + no);
		
		int r02 = Integer.parseInt("1234");
		System.out.println(r02);
		
		Integer no2 = 100;
		int no3 = no2; //언박싱
		
		
		//정수->문자열
		//555->"555"
		String str = "안녕하세요";
		String str1 = str.valueOf(555);
		System.out.println(str1 + 1);
		
		String str2 = String.valueOf(555);
		System.out.println(str2);
		
	}
}

package com.javaex.ex06;

public class Ex02 {
	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		/*System.out.println(a.concat(b)); //=a+b
		System.out.println(a+b);*/
		
		a = a.concat(b); //문자 합치기
		System.out.println(a);
		
		a = a.trim(); //문자열 앞뒤 공백 제거
		System.out.println(a);
		
		a = a.replace("ab", "12"); //문자 바꾸기
		System.out.println(a);
		
		System.out.println("------------------");
		
		String[] sArray = a.split(","); //정한 문자 기준으로 문자열을 나눔 ->배열에 저장
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		
		System.out.println("------------------");
		
		String str = "Hello JAVA!";
		String result01 = str.substring(3); //지정한 숫자부터 자르기 ([3]부터)
		System.out.println(result01);
		
		String result02 = str.substring(1, 3); //[1]부터 [3]이전까지
		System.out.println(result02);
		
		char result03 = str.charAt(8); //글자 1개 지정
		System.out.println(result03);
		
	}
}

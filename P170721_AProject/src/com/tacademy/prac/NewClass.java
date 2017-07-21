package com.tacademy.prac;

public class NewClass {
	
	private int age = 26;
	
	public NewClass(){
		System.out.println("나의 나이는 " +  age + "살 입니다 엉엉ㅠㅠ");
		AClass ac = new AClass();
	}
	
	public static void main(String[] args){
		new NewClass();
	}
}

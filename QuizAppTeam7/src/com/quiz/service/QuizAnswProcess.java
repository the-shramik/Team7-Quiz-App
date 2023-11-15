package com.quiz.service;

public class QuizAnswProcess {

	public static int checkAns(String userAnswer,String answer){
		
		if(userAnswer.equalsIgnoreCase(answer)) {
			return 1;
		}
		else if(userAnswer.equals("")) {
			
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public static void correctAnswers() {
		System.out.println("Size of int: b)4");
		System.out.println("Size of double: d)8");
		System.out.println("Size of char: c)2");
		System.out.println("Size of long: a)8");
		System.out.println("Size of boolean: b)1");
	}
}

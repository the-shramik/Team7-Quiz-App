package com.quiz.service;

import java.util.Scanner;

import com.quiz.bean.Question;
import com.quiz.impl.Quiz;

public class QuizServiceCoreJava implements Quiz{
	
	String userAnswer;
	int usersPoints;
	String playerName;
	
	Question[] questions=new Question[5];
	String[] ques1_Opts= {"2","4","8","16"};
	String[] ques2_Opts= {"4","2","1","8"};
	String[] ques3_Opts= {"4","1","2","16"};
	String[] ques4_Opts= {"8","2","16","4"};
	String[] ques5_Opts= {"0","1","16","4"};
	
	public QuizServiceCoreJava() {		
		Scanner sc=new Scanner(System.in);
		
		questions[0]=new Question(1,"Size of int",ques1_Opts,"b");
		questions[1]=new Question(1,"Size of double",ques2_Opts,"d");
		questions[2]=new Question(1,"Size of char",ques3_Opts,"c");
		questions[3]=new Question(1,"Size of long",ques4_Opts,"a");
		questions[4]=new Question(1,"Size of boolean",ques5_Opts,"b");
        
		
		System.out.println("Enter your name:");
		String playerName=sc.nextLine();
		this.playerName=playerName;
	}
	
//	public void gettingName() {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter your name:");
//		String name=sc.nextLine();
//		
//		return name;
//	}
	
	public void playQuiz() {
		Scanner sc=new Scanner(System.in);
			
		
		for(Question ques:questions) {
			System.out.println("Q."+ques.getQid()+")"+ques.getTitle());
			String []options=new String[5];
			options=ques.getOptions();
			char ch='a';
			for(int i=0;i<4;i++) {
			System.out.print(ch+")"+options[i]+" ");
			ch++;
			}
			System.out.println();
			
			System.out.println("Choose a right answer to get points:");
			userAnswer=sc.nextLine();
			int x=QuizAnswProcess.checkAns(userAnswer, ques.getAnswer());
			
			if(x==1) {	
				System.out.println("correct!you got 2 points!");
				System.out.println("");
				usersPoints +=2;
			}
			else if(x==-1) {
				System.out.println("you skipped this qustion!got 0 points!");
				System.out.println("");
				usersPoints +=0;
			}
			else {	
				System.out.println("wrong answer!got -1 points!");
				System.out.println("");
				usersPoints -=1;
			}
		}
		System.out.println("");
		displayPoints();
		
		System.out.println("1-check all correct answers!");
		System.out.println("2-to play again quiz!");
		System.out.println("3-quit the quiz!");
		
		System.out.println("Enter a choice:");
		
		int userChoice=sc.nextInt();
		
		if(userChoice==1) {
			QuizAnswProcess.correctAnswers();
		}
		else if(userChoice==2) {
			playQuiz();
		}
		else if(userChoice==3){
			System.out.println("Thanks for visiting this quiz app!");
		}
		else {
			System.out.println("please enter a valid input!");
		}
		if(sc!=null)sc.close();
	}
	
	public void displayPoints() {
		
		 System.out.println("*********************YOUR RESULT********************");
		 if(usersPoints==1)System.out.println(playerName+" You get "+usersPoints+" ponit!");
		 else System.out.println(playerName+" You get "+usersPoints+" ponits!");		 
		 System.out.println("*****************************************************");
	}
}

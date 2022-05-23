package com.qa.practice230522;

public class PracticeResultsExercise {

	
	int Biology = 100;
	int Chemistry = 120;
	int Physics = 102;
	int Total = Biology + Chemistry + Physics;
	int Percent = Total * 100 / 450;
	
// unsure if I've put variables in right place or if I can use them in other methods when they're just declared in the class like this? 
// Might be the problem further down?
	
			
	public static void main(String[] args) {
		biologyResults();
	// 14 doesn't work when biologyResults is not static 
		totalPercentage();
	// same issue - static and non static errors that conflict whenever I change between static and non static
		
		
	}
	
	public static void biologyResults()
	{
	System.out.println(Biology);
	System.out.println(Total);
	// 22 and 23 don't work when biologyResults is static - need extra explanation on use of static and how to use variables
	// in other methods when declared in class 
		
		
	}
	
	public void totalPercentage()
	{
	System.out.println(Percent);
	// gives error in line 19, 'cannot make static reference'
		
		
	}	
}

package com.qa.practice230522;

public class PracticeResultsExercise {

	
	public static int Biology = 100;
	public static int Chemistry = 120;
	public static int Physics = 102;
	public static int Total = Biology + Chemistry + Physics;
	public static int Percent = Total * 100 / 450;
	

	
			
	public static void main(String[] args) {
		Results();
	totalPercentage();	
		
	}
	
	public static void Results()
	{
	System.out.println("Biology results -");
	System.out.println(Biology + "/150");
	System.out.println("Chemistry results-");
	System.out.println(Chemistry + "/150");
	System.out.println("Physics results -");
	System.out.println(Physics + "/150");
	System.out.println("Total grade - ");
	System.out.println(Total + "/450");
	}
	

	
	public static void totalPercentage()
	{
	System.out.println("Overall grade perecentage -");
	System.out.println(Percent + "%");
	
		
		
	}	
}

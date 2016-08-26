package com.session2.ass1VoteAge;

import java.util.Scanner;

public class Ass1VoteAge {
public static void main(String[] arg)
{
	int age;
	System.out.print("Enter your age:");
	Scanner sc = new Scanner(System.in);
	age = sc.nextInt();
	if (age >= 18)
		System.out.println("You are eligible to vote.");
	else
		System.out.println("You are NOT eligible to vote.");
	
}
}

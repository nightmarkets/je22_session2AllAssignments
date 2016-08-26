/*Write a program to print total number of days in the given month
 */

package com.session2.ass4SwitchStm;

import java.util.Scanner;

public class SwitchStm {

	public static void main (String[] arg)
	{
		String month;
		int numberDays;
		System.out.println("Please enter the month");
		Scanner in = new Scanner(System.in);
		month=in.nextLine();
		switch(month)
		{
		case "Jan": case "Mar": case "May": case "Jul": case "Aug": case "Oct": case "Dec":
			numberDays=31;
			System.out.println("Number of days in "+month+" is "+ numberDays);
			break;
		case "Feb":
			numberDays=29;
			System.out.println("Number of days in "+month+" is "+ numberDays);
			break;
		case "Apr": case "Jun": case "Sep": case "Nov":
			numberDays=30;
			System.out.println("Number of days in "+month+" is "+ numberDays);
			break;
		default:
			System.out.println("invalid month");
			break;
		}
		}
}

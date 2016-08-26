package com.session2.ass3PrintPattern;

public class PrintPattern {
public static void main (String[] arg)
{
	/*print first part of the pattern
	 *  1 
		12 
		123 
		1234 
		12345
	 */
	for (int row=1;row<=5;row++)
	{
		for (int column=1;column<=row;column++)
			System.out.print(column);
		for (int k=1;k<5-row;k++)
			System.out.print("");
		System.out.println();
	}
	
	/*pirnt send part of the pattern
	 * 	1234 
		123 
		12
		1
	 */
	for (int row=1;row<=4;row++)
	{
		for (int column=1;column<=5-row;column++)
			System.out.print(column);
		for (int k=1;k<row;k++)
			System.out.print("");
		System.out.println();
	}
}
}

/*To find individual small primes trial division works well.
  To test n for primality (to see if it is prime) just divide by all of the primes less than the square root of n
  square root of 100 = 10. and all the primes less than 10 are 2,3,5,7
*/

package com.session2.ass2PrimeNumbers;

public class PrimeNumbers {
public static void main (String[] arg)
{
	boolean [] primeArray = new boolean [101] ;
	primeArray[0]=false;
	primeArray[1]=true;
	primeArray[2]=true;
	primeArray[3]=true;
	primeArray[4]=false;
	primeArray[5]=true;
	primeArray[6]=false;
	primeArray[7]=true;
	for(int temp=8;temp<=100;temp++)
	{
		if ((temp%2) == 0 || (temp%3)==0 || (temp%5)==0 || (temp%7)==0 )
			primeArray[temp]=false;
		else
			primeArray[temp]=true;
	}
	
	System.out.println("prime numbers between 1 to 100 are");
		
	for (int m=1;m<=100;m++)
	{
		if (primeArray[m]==true)
			System.out.print(m+" ");
	}
}
}

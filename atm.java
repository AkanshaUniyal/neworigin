import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class atm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int cash;double bal;
		Scanner sc=new Scanner(System.in);
		cash=sc.nextInt();bal=sc.nextDouble();
		double dou=(double)cash;
		if((cash>0&&cash<=2000)&&(bal>=0.00&&bal<=2000.00))
		{
		
		if(cash%5!=0||bal<=dou-0.5)
		{System.out.println(bal);System.exit(0);}
		else
		{double d=bal-(dou+0.5);
		    System.out.printf("%.2f",d);System.exit(0);}
		
		}
	}
}

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h=sc.nextInt();
		int x=sc.nextInt();
		System.out.println();
		int a[]=new int[n];int damage[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
            damage[i]=a[i]-x;
		}int c=0;

		for(int l=0;l<n;l++)
		{int ko=damage[l]; c=0;
		    for(int m=0;m<n;m++)
		    {
 
		        if(ko<h)
		         {ko=ko+damage[m];c++;}
		         else if(ko==h)
		         {c++;  break;}
		         else if(ko>h)
		         {break;}
		        
		    }
		}System.out.println(c);System.exit(0);
		
	}
}
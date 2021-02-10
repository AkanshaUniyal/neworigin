import java.util.*;
import java.lang.*;
import java.io.*;


class abcd
{
	static int countZeroes(int n) {
	    int count = 0;
	   for (int i = 5; n / i >= 1; i *= 5)
	   count += n / i;
	    return count;	
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
		int t = 0;t = sc.nextInt();
		while(t-->0) {
		    int num = sc.nextInt();
		    int ans = countZeroes(num);
		    System.out.println(ans);
		}
	}
	
	
}

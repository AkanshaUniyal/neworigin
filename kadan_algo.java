import java.util.*;
class kadane_algo {
     public static void main(String [] rgs)
     {
	//maximum sum of contiguous subarray.
        Scanner sc=new Scanner(System.in);
        int [] a =new int[10];
        System.out.println("Enter the elements of array.");
        for(int j=0;j<10;j++)
        {
            a[j]=sc.nextInt();
        }
        int max_sum=0;int min_so_far=0;

        for(int i=0;i<a.length;i++)
        {
            min_so_far=min_so_far+a[i];
            max_sum=Math.max(min_so_far,max_sum);
            if(min_so_far<0)
            min_so_far=0;
        }

        System.out.println("The sum of largest contiguous array is "+max_sum);

     }
    
}

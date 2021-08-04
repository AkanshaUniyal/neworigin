import java.util.*;
class xorbiginteger{
    public static void main(String sdsf[]){
        Scanner sc=new Scanner(System.in);
        int n;
        int t;
        long N,m=1000000007,c;
        t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            c=0;
            n=sc.nextInt();
            N=(long)(Math.pow(2,n)-1);
            while(N>=0)
            {
                if((N^(N+1))==((N+2)^(N+3)))
                {
                    c++;
                    c=c%m;
                }
                N--;
            }
            System.out.println(c);
        }
    }
}
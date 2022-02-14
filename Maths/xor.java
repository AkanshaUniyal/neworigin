import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
class Codechef{

    long m=1000000007;

     long bigintxor(String h,long c)
    {
        BigInteger N=new BigInteger(h);
        BigInteger O=BigInteger.ONE;
        BigInteger Z=BigInteger.ZERO;
        BigInteger X,X1,X2,X3;

        while(!(N.equals(Z))){
            X=N;
            X1=N.add(O);
            X2=X1.add(O);
            X3=X2.add(O);

            if((X.xor(X1)).equals(X2.xor(X3)))
            {
                c++;
                c%=m;
            }
            N=N.subtract(O);
        }
        return c;
    }
    public static void main(String [] kl){
        Scanner sc=new Scanner(System.in);
        int t;String nn,tt;long d;
        tt=sc.next();
        nn=sc.next();
        t=Integer.parseInt(tt);
        xor xi=new xor();
        for(int i=1;i<=t;i++)
        {
            d=xi.bigintxor(nn,0);
            System.out.println(d);
        }
    }

}
import java.util.*;
import java.math.*;
class jimmyneesham
{
public static void main(String args[])throws Exception
{
long t,k=0;
BigInteger c=new BigInteger("2");BigInteger cf=new BigInteger("1");
BigInteger cfw=new BigInteger("1");
Scanner sc=new Scanner(System.in);
t=sc.nextLong();String s;

for(long i=1;i<=t;i++)
{
BigInteger b=new BigInteger(sc.next());
while(c.compareTo(b)<=0)
{
cf=c.multiply(cf);c=c.add(BigInteger.valueOf(1));
}s=cf.toString();
while(cfw.compareTo(BigInteger.valueOf(s.length()))<=0)
{
if(s.charAt(cfw.intValue())=='0')
k++;cfw=cfw.add(BigInteger.valueOf(1));
}
System.out.println(k);
}
}
}
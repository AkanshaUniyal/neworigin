import java.util.Scanner;
class hello
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=0,k=0,max=0,min=0,d=0,l=0;
System.out.println("Enter two numbers");
a=sc.nextInt();
b=sc.nextInt();
if(a>b)
{max=a;min=b;}
else
{max=b;min=a;}
c=min*2-2;d=max;
while(max>=1)
{
k=c;l=max;
while(d>l)
{
System.out.print(' ');++l;
}
System.out.print(max);--max;
while(k>0)
{
System.out.print(' ');
--k;
}
c=c-2;
if(min>0)
{
System.out.print(min);
--min;}
System.out.println();}



}
}
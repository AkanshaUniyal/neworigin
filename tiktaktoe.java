import java.util.Scanner;
class tiktaktoe
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char a[][]=new char[3][3];
int m,n,kh=0;
char ch;


System.out.println("Enter the position in the form of 'row' 'column' ");

for(int l=0;l<3;l++)
{
    for(int w=0;w<3;w++)
    {a[l][w]=' ';}
}


for(int i=0;i<5;i++)
{

    kh++;
if(a[0][0]==a[1][1] && a[1][1]==a[2][2] && a[0][0]!=' ')
{
ch=a[0][0];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[0][0]==a[1][0] && a[1][0]==a[2][0] && a[0][0]!=' ')
{
ch=a[0][0];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[0][1]==a[1][1] && a[2][1]==a[1][1] && a[0][1]!=' ')
{
ch=a[0][1];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[0][2]==a[1][2] && a[1][2]==a[2][2] && a[0][2]!=' ')
{
ch=a[0][2];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[0][0]==a[0][1] && a[0][1]==a[0][2] && a[0][0]!=' ')
{
ch=a[0][0];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[1][0]==a[1][1] && a[1][1]==a[1][2] && a[1][0]!=' ')
{
ch=a[1][0];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[2][0]==a[2][1] && a[2][1]==a[2][2] && a[2][0]!=' ')
{
ch=a[2][0];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[0][2]==a[1][1] && a[1][1]==a[2][0] && a[0][2]!=' ')
{
ch=a[0][2];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else
{
System.out.println("Player 1's position : ");
m=sc.nextInt();n=sc.nextInt();
if(a[m][n]==' ')
a[m][n]='0';
else
System.out.println("Invalid choice");
for(int i1=0;i1<3;i1++)
{
for(int j1=0;j1<3;j1++)
{
System.out.print(a[i1][j1]+" ");
}
System.out.println();
}

if(a[0][0]==a[1][1] && a[1][1]==a[2][2] && a[0][0]!=' ')
{
ch=a[0][0];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[0][0]==a[1][0] && a[1][0]==a[2][0] && a[0][0]!=' ')
{
ch=a[0][0];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[0][1]==a[1][1] && a[2][1]==a[1][1] && a[0][1]!=' ')
{
ch=a[0][1];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[0][2]==a[1][2] && a[1][2]==a[2][2] && a[0][2]!=' ')
{
ch=a[0][2];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[0][0]==a[0][1] && a[0][1]==a[0][2] && a[0][0]!=' ')
{
ch=a[0][0];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[1][0]==a[1][1] && a[1][1]==a[1][2] && a[1][0]!=' ')
{
ch=a[1][0];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[2][0]==a[2][1] && a[2][1]==a[2][2] && a[2][0]!=' ')
{
ch=a[2][0];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}
else if(a[0][2]==a[1][1] && a[1][1]==a[2][0] && a[0][2]!=' ')
{
ch=a[0][2];
if(ch=='0')
System.out.println("Player 1 wins");
else
System.out.println("Player 2 wins");
System.exit(0);
}

if(kh>=5)
{
    System.out.println("MATCH DRAWN.");
    System.exit(0);}

System.out.println("Player 2's position : ");
m=sc.nextInt();n=sc.nextInt();
if(a[m][n]==' ')
a[m][n]='x';
else
System.out.println("Invalid choice");
}

for(int ii=0;ii<3;ii++)
{
for(int jj=0;jj<3;jj++)
{
System.out.print(a[ii][jj]+" ");
}
System.out.println();
}
}
}


}

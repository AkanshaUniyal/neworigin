import java.util.*;
class stp
{
public static void main(String rhd[])
{
Scanner sc=new Scanner(System.in);
Random rd=new Random();
int ran,user;

for(int i=1;i<=3;i++)
{
System.out.println("Enter 0 for stone, 1 for paper, 2 for scissors.");
user=sc.nextInt();
ran=rd.nextInt(3);

if(user==0)
{
if(ran==1)
System.out.println(" YOU:STONE   COMPUTER:PAPER \n   COMPUTER WINS!");
else if(ran==2)
System.out.println("YOU:STONE    COMPUTER:SCISSORS \n   YOU WIN!");
else
System.out.println("YOU:STONE    COMPUTER:STONE \n   MATCH DRAWN");
}

else if(user==1)
{
if(ran==0)
System.out.println(" YOU:PAPER   COMPUTER:STONE \n   YOU WIN!");
else if(ran==2)
System.out.println("YOU:PAPER    COMPUTER:SCISSORS \n   COMPUTER WINS!");
else
System.out.println("YOU:PAPER    COMPUTER:PAPER \n   MATCH DRAWN");
}

else if(user==2)
{
if(ran==1)
System.out.println(" YOU:SCISSORS   COMPUTER:PAPER \n   YOU WIN!");
else if(ran==0)
System.out.println("YOU:SCISSORS    COMPUTER:STONE \n   COMPUTER WINS!");
else
System.out.println("YOU:SCISSORS    COMPUTER:SCISSORS \n   MATCH DRAWN");

}
}
}
}
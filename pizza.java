

import java.util.*;
class pizza
{
    public static void main(String [] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,no2,no3,no4,pizza2=0,pizza3=0,pizza4=0;
        System.out.println("Enter pizzas available and number of 2 3 and 4 membered teams");
        n=sc.nextInt();
        no2=sc.nextInt();
        no3=sc.nextInt();
        no4=sc.nextInt();

        while(n>1)
        {
            if(n>=4&&no4>0)
            {
                ++pizza4;n=n-4;--no4;
            }
            if(n>=3&&no3>0)
            {
                ++pizza3;n-=3;--no3;
            }
            if(n>=2&&no2>0)
            {
                ++pizza2;n-=2;--no2;
            }
        }
        if(pizza2>0||pizza3>0||pizza4>0)
        {
            System.out.println(pizza4*4+pizza3*3+pizza2*2);
            System.out.print(pizza2*2+"\n"+pizza3*3+"\n"+pizza4*4 );
        }
        
        
    }
}
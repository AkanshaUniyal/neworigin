/*Finding nth magic number here, wehre a magic number is 5*(bit).pow(0)+5*(bit.pow(1))....*/
import java.util.Scanner;
class magic_no{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);{
            int n;
            System.out.println("Enter the nth number");
            n=sc.nextInt();
            int sum=0,c=0;
            while(n!=0){
                ++c;
                sum+=(n&1)*(int)Math.pow(5,c);
                n=n>>1;
            }
            System.out.println("Nth magic number is "+sum);
        }
    }
}
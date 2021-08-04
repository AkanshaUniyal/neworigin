import java.util.Scanner;
class bargraph{
    public static void main(String arhs[]){
        Scanner sc=new Scanner(System.in);
        int t,max=0,k=-1;
        t=sc.nextInt();
        int a[]=new int[t];
        for(int u=0;u<t;u++){
            a[u]=sc.nextInt();
            if(max<a[u])
            max=a[u];
        }
        for(int i=1;i<=max;i++){
            k++;
            for(int j=1;j<=t;j++){
                if(max-k<=a[j-1])
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
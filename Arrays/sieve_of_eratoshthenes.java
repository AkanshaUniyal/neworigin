import java.util.Scanner;
class sieve_of_eratosthenes{
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        boolean[] arr=new boolean[n+1];
        /*Here false mean the number is prime and true means the number is a multiple*/ 
        for(int i=2;i*i<=n;i++){
            if(!arr[i]){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=true;
                }
            }
        }
        for(int k=2;k<=n;k++){
            if(!arr[k]){
                System.out.print(k+" ");
            }
        }
    }
}
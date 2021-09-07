
/*A ceiing number is the smallest number which is greater than or equal to the target element in a given array.*/

import java.io.*;
import java.util.*;
import javax.lang.model.util.ElementScanner14;

public class ceiling_number{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e){e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble()
        {return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String args[]){
        FastReader fr=new FastReader();
        System.out.println("Ener the length of array");
        int n=fr.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=fr.nextInt();
        }
        System.out.println("Enter the target number");
        int target=fr.nextInt();
        int l=0,u=n-1,mid=0,k=0;

        while(l<u){
            mid=(l+u)/2;

            if(arr[mid]>target){
                u=mid-1;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else if(arr[mid]==target){
                k=1;
                System.out.println("Ceiling of the target is "+arr[mid]+" at index "+(mid+1));
                break;
            }
        }
        if(k!=1){
            System.out.println("Ceiling of the target is "+arr[u+1]+" at index "+(u+1));
        }
    }

}

}


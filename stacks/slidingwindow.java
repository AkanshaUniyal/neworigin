import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;
public class slidingwindow{
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
    int[] nextgreater(int x,int y, int[] arr){
        Stack<Integer> st=new Stack<>();
        st.push(item)=
        int ap[]=new int[arr.length];
        for( int i=0;i<arr.length;i++){
        while(st.size()>0 && y>0 && st.peek()>arr[i]){
            st.pop();
        }
        if()
    }
    return ap;
    }
    public static void main(String args[]){
        FastReader scan = new FastReader();
        int n =scan.nextInt();
        int k=scan.nextInt();
        int [] a=new int[n];

    }
}
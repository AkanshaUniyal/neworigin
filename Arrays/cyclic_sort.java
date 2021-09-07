import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;
public class cyclic_sort{
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
    public static void main(String [] sd){
        FastReader fr=new FastReader();
        int n=fr.nextInt();int m=0,k=0;
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=fr.nextInt();
        }
        for(int y=0;y<n-1;){
            k++;
            if(a[y]!=y+1){
                m=a[y];
                a[y]=y+1;
                a[m-1]=m;
            }
            else{
                y++;
            }
        }
        System.out.println(Arrays.toString(a)+" "+k);
    }
}
/*{[(a-b)+c]-(d+c)}
here the brackets are balanced, this will print True.
{<r-o>+(y+U}
here the brackets are not balanced, this will print false.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;
public class balancedbrackets{
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
    public static void main(String asdf[]){
        FastReader fr=new FastReader();
        String s=fr.nextLine();
        Stack<Character> st=new Stack<>();
        try{
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='<')
            st.push(s.charAt(i));
            else if(s.charAt(i)==']'||s.charAt(i)=='}'||s.charAt(i)==')'||s.charAt(i)=='>')
            st.pop();
        } 
        if(st.peek()!=null)
        System.out.println("False");
        else
        System.out.println("True");
    }
    catch(Exception e){
        System.out.println("True");
    }
    }
}



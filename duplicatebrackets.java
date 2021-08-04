/*IN THIS QUESTION, WE ARE GIVEN A BALANCED BRACKET STRING AND HAVE TO RETURN TRUE IF WE FIND DUPLICATE BRACKETS
AND FALSE OTHERWISE
EXAMPLE: ((A+B)+(C+D))  -->   FALSE
         ((A+B))+(C+D)  -->   TRUE(as there are two brackets enclosing a+b)
*/

import java.util.*;
public class duplicatebrackets {
    public static void main(String argsss[]){
        Scanner sc=new Scanner(System.in);
        Stack<Character> st=new Stack<>();

        String s=sc.nextLine();
        int k=0,c=0;
      //  try{
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)!=')'){
                st.push(s.charAt(i));
            }
            else{
                while(st.peek()!='('){
                    st.pop();
                    ++k;
                }
                st.pop();
            
            if(k==0){
                c=1;
                System.out.println("TRUE");
                break;
            }
        }
            k=0;
        }
        if(c!=1)
        System.out.println("FALSE");
  //  }
   // catch(Exception e){
   //     System.out.println("TRUE");
  //  }

    }
}

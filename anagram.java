import java.util.Scanner;
 class Soln {

    static boolean isAnagram(String a, String b)
     {
         a=a.toLowerCase();b=b.toLowerCase();
        // Complete the function
        int ac,bc,d=0;
        char ch,ah,bh;
        if(a.length()==b.length())
        {
            for(int i=0;i<a.length();i++)
            {
                ac=0;bc=0;
                ch=a.charAt(i);
                for(int j=0;j<a.length();j++)
                {
                    ah=a.charAt(j);bh=b.charAt(j);
                    
                    if(ah!=' '&&ah==ch)
                    {
                        ac++; 
                    if(j==0)
                    a=' '+a.substring(1);
                    else if(j==a.length()-1)
                    a=a.substring(0,a.length()-1)+' ';
                    else
                    a=a.substring(0,j)+' '+a.substring(j+1);
                    }
                    if(bh!=' '&&bh==ch)
                    {
                        bc++;
                    if(j==0)
                    b=' '+b.substring(1);
                    else if(j==a.length()-1)
                    b=b.substring(0,b.length()-1)+' ';
                    else
                    b=b.substring(0,j)+' '+b.substring(j+1);
                    }
                }
                if(ac!=bc)
                {return false;}
                else
                {d++;}
            }
            if(d>0)
        return true;
        }
        return false;
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
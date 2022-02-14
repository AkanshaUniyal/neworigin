class num {
    int display(int n){
        if(n==1){
            return 1;
        }
        System.out.println(n);
        return n;
        return display(n-1);
        
    }
public static void main(String [] sd){
    num obj=new num();
    System.out.println(obj.display(5));
}    
}

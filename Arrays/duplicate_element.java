/*We are interested in knowing the number which has no duplicates in the given array.
This works when there is a single such number*/

import java.util.Scanner;
class duplicate_element{
    public static void main(String args[]){
        int[] arr={4,7,3,7,4,9,3};
        int un=0;
        for(int n: arr){
            un=un^n;
        }
        System.out.println(un);
    }
}
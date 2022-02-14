import java.util.*;
class mergesort{

    static int[] merge_sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        
            int pivot=(arr.length)/2;
            int[] left=merge_sort(Arrays.copyOfRange(arr, 0, pivot));
            int[] right=merge_sort(Arrays.copyOfRange(arr, pivot, arr.length));
        
        return merge(left,right);
    }
    static int[] merge(int[] x,int[] y){
        int i=0,j=0,k=0;
        int[] sorted=new int[(x.length)+(y.length)];
        while((i<x.length)&&(j<y.length)){
            if(x[i]<y[j]){
                sorted[k]=x[i];
                i++;
            }
            else{
                sorted[k]=y[j];
                j++;
            }
            k++;
        }
        while(i<x.length){
            sorted[k]=x[i];
            k++;
            i++;
        }
        while(j<y.length){
            sorted[k]=y[j];
            k++;
            j++;
        }
        return sorted;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter array elements ");
        for(int u=0;u<5;u++){
            a[u]=sc.nextInt();
        }
        System.out.println("Sorted array is "+Arrays.toString(merge_sort(a)));
    }
}
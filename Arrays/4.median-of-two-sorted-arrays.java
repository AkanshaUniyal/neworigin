/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] arr=new int[num1.length+nums2.legnth];
        int a=0,b=0,k=0;
        while(k<arr.length){
            while(a<nums1.length&&b<nums2.length){
                if(nums1[a]<nums2[b]){
                    arr[k]=nums1[a];
                    a++;
                    k++;
                }
                else{
                    arr[k]=nums2[b];
                    b++;
                    k++;
                }
            }
            if(a==nums1.length){
                for(int i=a;i<arr.length;i++){
                    arr[k]=nums1[i];
                    k++;
                }
            }
            else if(b==nums2.length){
                for(int j=b;j<arr.length;j++){
                    arr[k]=nums2[j];
                    k++;
                }
            }
        }
        double median=0.0;
        if((arr.length)%2==1){
            median=arr[(arr.length/2)-1]+arr[(arr.length/2)];
            median/=2;
        }
        else{
            median=arr[(arr.length/2)];
        }
        return median;
    }
}
// @lc code=end


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int s=n+m;
        int ans[]=new int[s];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j])   {
                 ans[k]=nums1[i];
                  i++; 
                   }
            else{
                ans[k]=nums2[j];
                  j++; 
            }
            k++;
        }
        while(j<n){
            ans[k]=nums2[j];
            k++;
            j++;
        }
        while(i<m){
            ans[k]=nums1[i];
            k++;
            i++;
        }
        double median=0;
        int middle=s/2;
        if(s%2==0){
        median=(double)(ans[middle]+ans[middle-1])/2;
        }
        else{
            median=(double)(ans[middle]);
        }
        return median;
    }
}
class Solution {
    public void rotatearr(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int end=nums.length-1;
        rotatearr(nums,0,end);
        rotatearr(nums,0,k-1);
        rotatearr(nums,k,end);
    }
}
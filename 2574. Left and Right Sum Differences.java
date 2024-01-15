class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0,sum1;
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        int count=1;
        int count2=1;
        arr1[0]=0;
        for(int i=0;i<nums.length-1;i++){
            arr1[count]=sum+nums[i];
            sum=sum+nums[i];
            count++;
        }
        //arr2[arr2.length-1]=0;
        sum1=0;
        int count1=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            arr2[i]=sum1+nums[count1];
            sum1=sum1+nums[count1];
            count1--;
        }
        int arr3[]=new int[arr1.length];
        for(int i=0;i<arr3.length;i++){
            arr3[i]=Math.abs(arr1[i]-arr2[i]);

        }
        return arr3;
    }
}
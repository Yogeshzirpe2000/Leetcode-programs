class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j+=2){
                for(int k=i;k<=j;k++){
                    count=count+arr[k];
                }
            }
        }
        return count;
    }
}
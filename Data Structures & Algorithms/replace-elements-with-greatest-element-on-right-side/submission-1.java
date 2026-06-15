class Solution {
    public int[] replaceElements(int[] arr) {
        int maxvalue=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            int temp=arr[i];
            arr[i]=maxvalue;
            maxvalue=Math.max(maxvalue,temp);
        }
       return arr;
    }
}
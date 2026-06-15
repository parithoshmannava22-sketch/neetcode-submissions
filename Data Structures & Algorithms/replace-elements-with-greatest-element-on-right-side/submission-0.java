class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            int maxvalue=-1;
            for(int j=i+1;j<arr.length;j++)
            {
                maxvalue=Math.max(maxvalue,arr[j]);
            }
            arr[i]=maxvalue;
        }
        return arr;
    }
}
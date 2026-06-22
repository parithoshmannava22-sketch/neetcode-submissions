class Solution {
    public void moveZeroes(int[] nums) {
            int insert_position=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=0)
                {
                    nums[insert_position]=nums[i];
                    insert_position++;
                }
            }
            while(insert_position<nums.length)
            {
                nums[insert_position]=0;
                insert_position++;
            }
        }
}
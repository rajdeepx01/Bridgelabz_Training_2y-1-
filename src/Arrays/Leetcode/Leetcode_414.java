package Arrays.Leetcode;
import java.util.Arrays;

class Leetcode_414 {

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = nums.length - 1; i > 0; i--) {

            if (nums[i] != nums[i - 1]) {
                count++;
            }

            if (count == 3) {
                return nums[i - 1];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1};

        int result = thirdMax(nums);

        System.out.println(result);
    }
}
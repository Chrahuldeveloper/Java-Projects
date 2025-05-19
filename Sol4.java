import java.util.ArrayList;
import java.util.Arrays;

class Sol4 {
    public static void main(String[] args) {

        int[] nums = { 9, 4, 9 };
        Arrays.sort(nums);

        if (nums[0] + nums[1] <= nums[2]) {
            System.out.println("none");
        }

        boolean isAllSame = (nums[0] == nums[1] && nums[1] == nums[2]);
        if (isAllSame) {
            System.out.println("equilateral");
        }

        if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}
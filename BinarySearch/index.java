public class index {
    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 4, 5 };
        int target = 5;

        int res = binarySearch(nums, target, 0, nums.length - 1);

        System.out.println(res);

    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        int mid = (start + end) / 2;
        while (start <= end) {
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                return binarySearch(nums, target, mid + 1, end);

            } else {
                return binarySearch(nums, target, start, mid - 1);

            }
        }

        return -1;

    }

}

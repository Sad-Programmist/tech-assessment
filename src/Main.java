import java.util.Arrays;

public class Main {

    public static int findMissingNumber(int[] nums) {
        if (nums == null) {
            System.out.println("Invalid input: array is null");
            return -1;
        }

        if (nums.length <= 1) {
            System.out.println("Invalid input: array is too small");
            return -1;
        }

        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        if (max - nums.length > min) {
            System.out.println("Invalid range: too many missing numbers");
            return -1;
        }

        if (max - nums.length < min) {
            System.out.println("Invalid range: no missing number");
            return -1;
        }

        int expectedSum = (min + max) * (max - min + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{5, 0, 1, 3, 2};
        System.out.println(findMissingNumber(nums1));

        int[] nums2 = new int[]{7, 9, 10, 11, 12};
        System.out.println(findMissingNumber(nums2));
    }
}
package FirstPhaseLearning.Arrays;

public class buildArrayFromPermutation1920 {
    public int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

    public int[] plusOne(int[] digits) {
        int carry = 1; // to add 1
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        int[] ans = new int[digits.length + 1];
        if (carry != 0) {
            ans[0] = carry;
            for (int i = 1; i < digits.length; i++) {
                ans[i] = digits[i];
            }
            return ans;
        }
        return digits;
    }

}

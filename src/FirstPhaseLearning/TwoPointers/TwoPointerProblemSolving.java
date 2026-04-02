package FirstPhaseLearning.TwoPointers;

import javax.sound.sampled.Line;
import java.util.*;

public class TwoPointerProblemSolving {

    public static int[] nextGreaterElementstried(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        int maxSoFar = Integer.MIN_VALUE;
        Map<Integer, Integer> greatestMap = new HashMap<>();

        for (int num : nums) {
            while (!stack.isEmpty() && num > stack.peek()) {
                greatestMap.put(stack.pop(), num);
            }
            maxSoFar = Math.max(num, maxSoFar);
            stack.push(num);
        }

        for (int i = 0; i < nums.length; i++) {
            int currMax = greatestMap.getOrDefault(nums[i], -1);
            if (currMax == -1 && nums[i] != maxSoFar) { // right side max nhi hai
                result[i] = maxSoFar;
            } else {
                result[i] = currMax;
            }
        }

        return result;
    }

    public static boolean checkRedundancy(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                boolean isOperator = false;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char ch = stack.pop();
                    if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                        isOperator = true;
                    }
                }

                if (!stack.isEmpty()) stack.pop();

                if (!isOperator) return true; // found redundant bracket return immediatly
            } else {
                stack.push(c);
            }
        }

        return false;
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (!stack.isEmpty() && ch == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (!stack.isEmpty() && ch == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (!stack.isEmpty() && ch == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int idx = 0; idx < temperatures.length; idx++) {
            while (!stack.isEmpty() && temperatures[idx] > temperatures[stack.peek()]) {
                int top = stack.pop();
                result[top] = idx - top;
            }
            stack.push(temperatures[idx]);
        }

        return result;
    }

    public int[] dailyTemperaturesBrutt(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    result[i] = j - i;
                    break;
                }
            }
        }

        return result;
    }

    public static int evalRPN(String[] tokens) {//2 1 + 3 *
        Stack<Integer> stack = new Stack<>();

        int idx = 0;
        while (idx < tokens.length) {
            String token = tokens[idx];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(applyOpertion(a, b, token));
            } else {
                stack.push(Integer.valueOf(token));
            }

            idx++;
        }

        return stack.pop();
    }

    public static int applyOpertion(int num1, int num2, String op) {
        if (op.equals("+")) {
            return num1 + num2;
        } else if (op.equals("-")) {
            return num1 - num2;
        } else if (op.equals("*")) {
            return num1 * num2;
        } else if (op.equals("/")) {
            return num1 / num2;
        }
        return 0;
    }

    public static String minWindow2(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        //Fill FreqMap
        for (char c : t.toCharArray()) {
            mapT.put(c, mapS.getOrDefault(c, 0) + 1);
        }

        String result = "";
        int i = -1, j = -1;
        int potentialAns = t.length();
        int currAns = 0;

        while (true) {
            // Acquire


            // Collect Answer & Release
        }
    }


    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> mapT = new HashMap<>();
        for (char ch : t.toCharArray()) mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);

        HashMap<Character, Integer> mapS = new HashMap<>();
        int i = -1, j = -1; // Use -1 to handle 0-indexing correctly
        int matchCount = 0;
        int desiredCount = t.length(); // Count characters, not unique keys
        String result = "";

        while (true) {
            boolean flag1 = false, flag2 = false;

            // Acquire
            while (j < s.length() - 1 && matchCount < desiredCount) {
                j++;
                char ch = s.charAt(j);
                mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);

                if (mapS.get(ch) <= mapT.getOrDefault(ch, 0)) matchCount++;
                flag1 = true;
            }

            // Release and Collect
            while (i < j && matchCount == desiredCount) {
                String potentialRes = s.substring(i + 1, j + 1);
                if (result.equals("") || potentialRes.length() < result.length()) {
                    result = potentialRes;
                }

                i++;
                char ch = s.charAt(i);
                if (mapS.get(ch) == 1) mapS.remove(ch);
                else mapS.put(ch, mapS.get(ch) - 1);

                if (mapS.getOrDefault(ch, 0) < mapT.getOrDefault(ch, 0)) matchCount--;
                flag2 = true;
            }

            if (!flag1 && !flag2) break;
        }
        return result;
    }

    public static boolean checkSubStringPresent(String substring, String s2, int left, int right) {

        char[] array = s2.toCharArray();
        for (char c : array) {
            if (!substring.contains(String.valueOf(c))) {
                return false;
            }
        }

        return true;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        int max = 0;
        int left = 0;

        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max = Math.max(right - left + 1, max);
        }

        return max;
    }

    public boolean isValidSudoku2(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    String rowStr = c + "_ROW" + i;
                    String colStr = c + "_COL" + j;
                    String boxStr = c + "_BOX" + (i / 3) + "_" + (j / 3);

                    if (!set.add(rowStr) || !set.add(colStr) || !set.add(boxStr)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        // 9 , 9 rows & colms

        // Rows Validate
        for (int row = 0; row < 9; row++) {
            Set<Integer> set = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                int val = board[row][col];
                if (val != '.') {
                    if (set.contains(val)) {
                        return false;
                    } else {
                        set.add(val);
                    }
                }
            }
        }

        //Col Validate
        for (int col = 0; col < 9; col++) {
            Set<Integer> set = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                int val = board[row][col];
                if (val != '.') {
                    if (set.contains(val)) {
                        return false;
                    } else {
                        set.add(val);
                    }
                }
            }
        }

        // Validate 3 * 3 Boxes
        for (int row = 0; row < 9; row += 3) {
            int endRow = row + 2;
            for (int col = 0; col < 9; col += 3) {
                int endCol = col + 2;
                if (!isValid(board, row, endRow, col, endCol)) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean isValid(char[][] board, int rowStart, int rowEnd, int colStart, int colEnd) {
        for (int row = rowStart; row <= rowEnd; row++) {
            Set<Integer> set = new HashSet<>();
            for (int col = colStart; col <= colEnd; col++) {
                int val = board[row][col];
                if (val != '.') {
                    if (set.contains(val)) {
                        return false;
                    } else {
                        set.add(val);
                    }
                }
            }
        }

        return true;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freqMap = new HashMap<>();

        //Filling Map
        for (char c : s.toCharArray()) {
            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            } else {
                freqMap.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (freqMap.containsKey(c) && freqMap.get(c) >= 1) {
                freqMap.put(c, freqMap.get(c) - 1);
            } else return false;
        }

        return true;
    }

    public static int maxSubArray(int[] nums) {
        int currMax = nums[0], overallMax = nums[0];
        for (int idx = 1; idx < nums.length; idx++) {
            currMax = Math.max(nums[idx], nums[idx] + currMax);
            overallMax = Math.max(currMax, overallMax);
        }

        return overallMax;
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int best = 0;
        for (int num : nums) set.add(num);

        for (int x : set) {
            if (!set.contains(x - 1)) {
                int start = x;
                int len = 1;
                while (set.contains(start + 1)) {
                    start++;
                    len++;
                }

                best = Math.max(best, len);
            }
        }

        return best;
    }

    static int maxLen(int[] input) {
        Map<Integer, Integer> firstIndexMap = new HashMap<>();
        int sum = 0;
        int best = 0;
        for (int idx = 0; idx < input.length; idx++) {
            sum += input[idx];

            if (sum == 0) {
                best = Math.max(best, idx + 1);
            }

            if (firstIndexMap.containsKey(sum)) {
                int idx2 = firstIndexMap.get(sum);
                best = Math.max(best, (idx - idx2));
            } else {
                firstIndexMap.put(sum, idx);
            }
        }

        return best;
    }

    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int val : nums) freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);

        int count = 0;
        if (k == 0) {
            for (int val : freqMap.keySet()) {
                if (freqMap.get(val) >= 2) count++;
            }
        } else {
            for (int val : freqMap.keySet()) {
                if (freqMap.containsKey(val + k)) count++;
            }
        }
        return count;
    }

    public static int[] twoSumOptimized(int[] numbers, int target) {
        int currSum = target - numbers[0], low = 0, high = numbers.length - 1;

        int mid = high - (low + high) / 2;
        if (currSum > numbers[mid]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }

        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum > target) {
                high--;
            } else {
                low++;
            }
        }

        return new int[]{-1, -1};
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{-1, -1};
    }

    public static int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        freq.put(0, 1);

        for (int num : nums) {
            sum += num;

            count += freq.getOrDefault(sum - k, 0);

            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public class codefile {

        public static int nthUglyNumber(int input) {
            List<Integer> ugly = new ArrayList<>();
            ugly.add(1); // smallest ugly

            int i = 0, j = 0, k = 0; // for 2, 3, 5
            while (ugly.size() < input) {
                int next2 = ugly.get(i) * 2;
                int next3 = ugly.get(j) * 3;
                int next5 = ugly.get(k) * 5;

                int nextUgly = Math.min(next2, Math.min(next3, next5));

                ugly.add(nextUgly);

                if (nextUgly == next2) i++;
                if (nextUgly == next3) j++;
                if (nextUgly == next5) k++;
            }

            return ugly.get(input - 1);
        }

        static int solve(String[] input) {
            int n = Integer.parseInt(input[0]);
            List<Integer> results = new ArrayList<>();
            results.add(1);

            int i = 0, j = 0, k = 0;

            while (results.size() < n) {
                int next = Math.min(results.get(i) * 2, Math.min(results.get(j) * 3, results.get(k) * 5));
                results.add(next);

                if (next == results.get(i) * 2) i++;
                if (next == results.get(j) * 3) j++;
                if (next == results.get(k) * 5) k++;
            }

            return results.get(results.size() - 1);
        }
    }

    public static int nthUglyNumberBrutt(int n) {
        int count = 6, num = 7;

        if (n <= count) {
            return n;
        }

        while (count != n) {
            if (!isUgly(num)) {
                num++;
            } else {
                num++;
                count++;
            }
        }

        return num - 1;
    }

    public static boolean isUgly(int num) {
        int[] primes = new int[]{2, 3, 5};
        for (int prime : primes) {
            while (num % prime == 0) {
                num /= prime;
            }
        }

        return num == 1;
    }

    public static List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();

        // Even Numbers
        while (n % 2 == 0) {
            n /= 2;
            factors.add(2);
        }

        // Odd Numbers
        for (int idx = 3; idx * idx <= n; idx += 2) {
            while (n % idx == 0) {
                n /= idx;
                factors.add(idx);
            }
        }

        //If Still Left
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }
}

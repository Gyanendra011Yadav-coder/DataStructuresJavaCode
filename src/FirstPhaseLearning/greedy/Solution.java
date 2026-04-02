package FirstPhaseLearning.greedy;

import java.util.*;

class Solution {

    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int len = arr.length;
        int currentPlatform = 1;
        int maxPlatform = 1;

        int idx1 = 1;
        int idx2 = 0;

        while (idx1 < len && idx2 < len) {
            if (arr[idx1] <= dep[idx2]) { // dusare train pehle hi aa ja rhe hai
                currentPlatform++;
                maxPlatform = Math.max(currentPlatform, maxPlatform);
                idx1++;
            } else{
                currentPlatform--;
                idx2++;
            }
        }

        return maxPlatform;
    }

    public int assignHole(int[] mices, int[] holes) {
        Arrays.sort(mices);
        Arrays.sort(holes);

        int maxLength = 0;
        for (int idx = 0; idx < mices.length; idx++) {
            int diff = Math.abs(holes[idx] - mices[idx]);
            maxLength = Math.max(diff, maxLength);
        }

        return maxLength;
    }

    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : candyType){
            set.add(val);
        }

        int minCandies = candyType.length / 2;
        if (set.size() > minCandies){
            return minCandies;
        }

        return set.size();
    }

    static int[] solve(int[]  input1,int[] input2){
        int length = input1.length;
        int [][] cal = new int[length][3];
        for (int idx = 0; idx < length; idx++) {
            cal[idx][0] = idx; //idx
            cal[idx][1] = input1[idx];
            cal[idx][2] = input2[idx];
        }

        Arrays.sort(cal , Comparator.comparingInt(arr -> arr[2]));
        ArrayList<Integer> result = new ArrayList<>();

        int max = cal[0][2];
        result.add(cal[0][0]);

        for (int idx = 0; idx < input1.length; idx++) {
            if (cal[idx][1] > max){
                result.add(cal[idx][0]);
                max = cal[idx][2];
            }
        }

        Collections.sort(result);

        return result.stream().mapToInt(idx -> idx).toArray();
    }

    public int minCost(String colors, int[] neededTime) {
        int maxTime = neededTime[0];
        int totalTime = 0;
        for (int idx = 0; idx < colors.length(); idx++) {
            if (colors.charAt(idx)==colors.charAt(idx-1)){
                totalTime+=neededTime[idx];
                maxTime = Math.max(maxTime, neededTime[idx-1]);
            } else {
                totalTime = neededTime[idx];
            }
        }

        return totalTime;
    }

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0, right = people.length - 1;
        int boatsTOSave = 0;
        while (left <= right){
            if (people[left] + people[right] <= limit){
                left++;
                right--;
            } else {
                right--;
            }

            boatsTOSave++;
        }

        return boatsTOSave;
    }

    /*
    948
     */
    public int bagOfTokensScore(int[] tokens, int power) {//[100,200,300,400]
        Arrays.sort(tokens);
        int left = 0, right = tokens.length - 1, score = 0, maxScrore = 0;

        while (left < right){
            // Face up - score increase krna hai
            if (power >= tokens[left]) {
                power -= tokens[left];
                score++;
                left++;
            } else if (power < tokens[left] && score > 0) {
                power += tokens[right];
                score--;
                right--;
            } else {
                break;
            }

            maxScrore = Math.max(maxScrore, score);
        }

        return maxScrore;
    }
}
package FirstPhaseLearning.TestOLTQuestions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {
    public static int LongestPalindrome(List<String> lst_string) {
        // Write your code here
        String all = "";
        int size = lst_string.size();
        for (int i = 0; i <size; i++) {
            all += lst_string.get(i);
            i++;
        }
        //System.out.println(all);
        return longestPalSubstr(all);
    }

    static int longestPalSubstr(String str)
    {
        // get length of input String
        int n = str.length();

        // All subStrings of length 1
        // are palindromes
        int maxLength = 1, start = 0;

        // Nested loop to mark start and end index
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;

                // Check palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;

                // Palindrome
                if (flag!=0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }
        return maxLength;
    }

        public static void main(String[] args) throws IOException {
           /*
            List<String> list = new FirstPhaseLearning.ArrayList<>();
            list.add("cat");
            list.add("two");
            list.add("tac");
            LongestPalindrome(list);

            */

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int ln = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String aItem = bufferedReader.readLine();
                a.add(aItem);
            }

            int result = Result.LongestPalindrome(a);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();


        }
    }


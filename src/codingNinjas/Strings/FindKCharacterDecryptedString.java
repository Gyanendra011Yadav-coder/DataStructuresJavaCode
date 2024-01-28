package codingNinjas.Strings;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-31,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class FindKCharacterDecryptedString {
    public static char kThCharaterOfDecryptedString(String s, long k) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            long len = 0;
            StringBuilder temp = new StringBuilder();
            while (i < n && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                temp.append(s.charAt(i));
                len++;
                i++;
            }
            StringBuilder num = new StringBuilder();
            while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num.append(s.charAt(i));
                i++;
            }
            long t = len * Long.parseLong(num.toString());
            if (t < k) {
                k -= t;
            } else {
                k %= len;
                int ind = (int) ((k - 1 + len) % len);
                return temp.charAt(ind);
            }
            i--;
        }
        return 'a';
    }

    public static void main(String[] args) {
        String s = "a2b3cd3";
        long k = 8;
        char result = kThCharaterOfDecryptedString(s, k);
        System.out.println("K'th character of the decrypted string: " + result); // Output: K'th character of the decrypted string: c
    }

}
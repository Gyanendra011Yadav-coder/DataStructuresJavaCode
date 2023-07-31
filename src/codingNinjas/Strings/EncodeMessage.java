package codingNinjas.Strings;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-26,Jul,2023
 * in Project: DataStructuresJavaCode
 *
 * https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118626/offering/1377976?leftPanelTab=0
 */
public class EncodeMessage {

    public static void main(String[] args) {
        System.out.println(encode("aabbbbccc"));
    }

    public static String encode(String message) {
        // Write your code here.
        StringBuilder finalStr = new StringBuilder();
        int count = 1;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == message.charAt(i - 1)) {
                count++;
            }

        }
        return finalStr.toString();
    }
}

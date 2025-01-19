package FirstPhaseLearning.codingNinjas.Strings;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-26,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class LeftRightRotationString {
    public static void main(String[] args) {
        System.out.println(leftRotate("codingninjas",2));
        System.out.println(rightRotate("codingninjas",2));
    }

    //TODO: in left adding first d characters of the string at the end of the string
    public static String leftRotate(String str, int d) {
        if (str.length() == 0 || str.length() == d || d == 0) {
            return str;
        }

        if(d>str.length()) {
            d=d%str.length();
        }
        StringBuilder sb = new StringBuilder();
        return (sb.append(str.substring(d)) + str.substring(0, d)).toString();

    }

    //TODO: in right, adding last d characters of the string in the beginning of the string
    public static String rightRotate(String str, int d) {
        if (str.length() == 0 || str.length() == d || d == 0) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        return (str.substring(str.length() - d) + sb.append(str.substring(0, str.length() - d))).toString();

    }
}

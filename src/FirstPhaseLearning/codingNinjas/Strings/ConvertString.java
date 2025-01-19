package FirstPhaseLearning.codingNinjas.Strings;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-26,Jul,2023
 * in Project: DataStructuresJavaCode
 *
 * https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118626/offering/1377975
 */
public class ConvertString {

    public static void main(String[] args) {
        String str="i love programming";
        System.out.println(convertString(str));
    }

    public static String convertString(String str) {
        String [] words= str.split(" "); //Splitting the array into words

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase()+words[i].substring(1);
        }
        str=String.join(" ", words); //again joining back
        return str;
    }

}

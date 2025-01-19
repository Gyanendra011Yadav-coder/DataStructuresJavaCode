package FirstPhaseLearning.codingNinjas.BasicAlgorithms;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-09,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class RemoveConsecutiveDuplicatesString {
    public static void main(String[] args) {
        System.out.println(removeConsecutive(new StringBuilder("aabccba")));
    }
    public static String removeConsecutive(StringBuilder str)
    {
        if (str.length()==0) return str.toString();
        String string=str.toString();
        char[] chars = string.toCharArray();

        for (int i = 0; i < str.length()-1; i++) {
            if(chars[i]==chars[i+1]){
                chars[i]='%';
            }
        }
        String strFinal="";
        for(char ch : chars) {
            if(ch!='%'){
                strFinal+=ch;
            }
        }

        return strFinal;
    }

}

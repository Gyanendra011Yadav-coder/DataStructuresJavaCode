package FirstPhaseLearning.codingNinjas.Strings;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-31,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class CompareVersionNumbers {

    public static void main(String[] args) {
        String str1="123.45";
        String str2="123";
        System.out.println(compareVersions(str1,str2));
    }

    public static int compareVersions(String a, String b)
    {
        String[] ver1 = a.split("\\.");
        String[] ver2 = b.split("\\.");

        int index = 0;
        int str1ArrLen = ver1.length, str2ArrLen = ver2.length;

        while(index < str1ArrLen || index < str2ArrLen){
            if(index < str1ArrLen && index < str2ArrLen){
                if(Double.parseDouble(ver1[index]) < Double.parseDouble(ver2[index])){
                    return -1;
                }else if(Double.parseDouble(ver1[index]) > Double.parseDouble(ver2[index]))
                    return 1;
            }
            else if(index < str1ArrLen){
                if(Double.parseDouble(ver1[index]) != 0){
                    return 1;
                }
            }
            else if(index < str2ArrLen){
                if(Double.parseDouble(ver2[index]) != 0){
                    return -1;
                }
            }
            index++;
        }
        return 0;
    }
}

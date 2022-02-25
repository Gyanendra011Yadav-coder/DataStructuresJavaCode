package Strings;

public class versionCheckLeetcodeProblemNumberOneSixFive {

    public int compareVersion(String version1, String version2) {
        String []arr1= version1.split("\\.");
        String []arr2= version2.split("\\.");
        int max=Math.max(arr1.length, arr2.length);
        for(int i=0;i<max;i++){
            int num1= i >= arr1.length  ? 0 : Integer.parseInt(arr1[i]);
            int num2= i >= arr2.length  ? 0 : Integer.parseInt(arr2[i]);
            if(num1>num2){
                return 1;
            }
            if(num1<num2){
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}

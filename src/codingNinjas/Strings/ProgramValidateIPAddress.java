package codingNinjas.Strings;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-28,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class ProgramValidateIPAddress {

    public static void main(String[] args) {
//        System.out.println(isValidIPv4("196.200.212.87 "));

        System.out.println(isNumber("1223b")); // 1223b-> false, and 1223 -> True
    }


    public static boolean isValidIPv4(String ipAddress) {
        boolean isValid = false;

        if (!(countDots(ipAddress) > 2)) return false;

        if(ipAddress.startsWith(".")) return false;

        String[] charArr = ipAddress.split("\\.");

        for (int i = 0; i < charArr.length; i++) {
            if (!isNumber(charArr[i]) && Integer.valueOf(charArr[i]) > 0 && Integer.valueOf(charArr[i]) < 255) {
                isValid = true;
            } else {
                break;
            }
        }

        return isValid;
    }

    public static int countDots(String ipAddress) {
        int dots = 0;
        for (int i = 0; i < ipAddress.length(); i++) {
            if (ipAddress.charAt(i) == '.') {
                dots++;
            }
        }
        return dots;
    }

    private static boolean isNumber(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }


    static boolean inRange(String s){
        // if string empty
        if(s.length()==0){
            return false;
        }
        int x = Integer.valueOf(s);
        // if string out of range
        if(x>255 || x<0){
            return false;
        }
        return true;
    }

    public static boolean isValidIPv42(String ipAddress) {
        // write your code here
        int count = 0;
        int sq = 0;
        // if initial character is .
        if(ipAddress.charAt(0)=='.'){
            return false;
        }
        for(int i=0;i<ipAddress.length();i++){
            // if ipString contains character
            if(ipAddress.charAt(i)-'0'>10){
                return false;
            }
            // if in range
            if(ipAddress.charAt(i)=='.'){

                count++;
                if(!inRange(ipAddress.substring(sq,i))){
                    return false;
                }
                sq=i+1;
            }
        }
        // if IPv4 having 4 octets.
        if(count!=3){
            return false;
        }
        return true;
    }
}

package elementsprogramminginterviews.strings;

import java.util.ArrayList;
import java.util.List;

public class ValidIPCheck {

    public List<String> generateValidIp(String ip) {
        // If the input string is null or its length is invalid for an IP address, return an empty list
        if (ip == null || ip.length() < 4 || ip.length() > 12) {
            return new ArrayList<>();
        }

        List<String> validIPs = new ArrayList<>();

        // Iterate through all possible first parts
        for (int i = 1; i <= 3 && i < ip.length(); i++) {
            String part1 = ip.substring(0, i);
            if (!validIPAddressPart(part1)) {
                continue;
            }

            // Iterate through all possible second parts
            for (int j = i + 1; j <= i + 3 && j < ip.length(); j++) {
                String part2 = ip.substring(i, j);
                if (!validIPAddressPart(part2)) {
                    continue;
                }

                // Iterate through all possible third parts
                for (int k = j + 1; k <= j + 3 && k < ip.length(); k++) {
                    String part3 = ip.substring(j, k);
                    String part4 = ip.substring(k);

                    // Check if the third and fourth parts are valid
                    if (validIPAddressPart(part3) && validIPAddressPart(part4)) {
                        validIPs.add(part1 + "." + part2 + "." + part3 + "." + part4);
                    }
                }
            }
        }

        return validIPs;
    }



    public List<String> generateValidIpRecursion(String ip, int startIndex, int ipAddressParts) {
        // If the input string is null or its length is invalid for an IP address, return an empty list
        if (ip == null || ip.length() < 4 || ip.length() > 12) {
            return new ArrayList<>();
        }

        // Result list to store all valid IP addresses
        List<String> validIPs = new ArrayList<>();
        backtrack(ip, startIndex, ipAddressParts, new ArrayList<>(), validIPs);
        return validIPs;
    }

    private void backtrack(String ip, int startIndex, int remainingParts, List<String> currentParts, List<String> validIPs) {
        // Base case: If we've used all parts and traversed the entire string, add the valid IP
        if (remainingParts == 0) {
            if (startIndex == ip.length()) {
                validIPs.add(String.join(".", currentParts));
            }
            return;
        }

        // Iterate through the string to pick valid parts for the current segment
        for (int length = 1; length <= 3; length++) {
            if (startIndex + length > ip.length()) {
                break;
            }

            // Extract the substring for the current part
            String part = ip.substring(startIndex, startIndex + length);

            // Check if it's a valid IP address part
            if (validIPAddressPart(part)) {
                // Add the part to the current path
                currentParts.add(part);

                // Recur with one less part and a new start index
                backtrack(ip, startIndex + length, remainingParts - 1, currentParts, validIPs);

                // Backtrack by removing the last part
                currentParts.remove(currentParts.size() - 1);
            }
        }
    }

    public boolean validIPAddressPart(String ip) {
        // If the length is greater than 3, it's invalid
        if (ip.length() > 3) {
            return false;
        }

        // If it starts with 0 but has more than one character, it's invalid
        if (ip.startsWith("0") && ip.length() > 1) {
            return false;
        }

        // Convert the part to an integer and check its range
        int value = Integer.parseInt(ip);
        return value >= 0 && value <= 255;
    }

    public static void main(String[] args) {
        ValidIPCheck ipCheck = new ValidIPCheck();

        String input = "25525511135";
//        List<String> validIPs = ipCheck.generateValidIpRecursion(input, 0, 4);
        List<String> validIPs = ipCheck.generateValidIp(input);

        System.out.println("Valid IP Addresses:");
        for (String ip : validIPs) {
            System.out.println(ip);
        }
    }
}


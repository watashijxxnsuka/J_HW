package _0503_.middle;

import java.util.Scanner;

public class Middle3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");

        String userInput = sc.nextLine();
        String outputStr = replaceChars(userInput);
        System.out.println("변환된 문자열: " + outputStr);
    }

    private static String replaceChars(String inputStr) {

        String result = "";

        for(int i =0; i < inputStr.length(); i++) {
            if((i + 1) % 3 == 0 && (i + 1) % 5 ==0) {
                result += 35;
            } else if ((i+1) % 3 == 0) {
                result += 3;
            } else if ((i+1) % 5 == 0) {
                result += 5;
            } else {
                result += inputStr.charAt(i);
            }
        }
        return result;
    }
}

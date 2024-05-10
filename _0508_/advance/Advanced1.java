package _0508_.advance;

import java.util.Scanner;

public class Advanced1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요.");
        String input = sc.nextLine();

        String result = removeDuplicate(input);
        System.out.println(result);

        sc.close();
    }

    private static String removeDuplicate(String input) {

        if (input == null || input.length() <= 1) {
            return input;
        }

        StringBuilder sb = new StringBuilder();

        char plusChar = input.charAt(0);
        sb.append(plusChar);

        for (int i = 1; i < input.length(); i++) {
            char answerChar = input.charAt(i);

            if (answerChar != plusChar) {
                sb.append(answerChar);
                plusChar = answerChar;
            }
        }

        return sb.toString();

    }
}

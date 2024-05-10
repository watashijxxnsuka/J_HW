package _0503_.middle;

import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요.");

        String input = sc.nextLine();
        sc.close();

        String result = removeDuplicates(input);
        System.out.println("중복 제거 완료: " + result);

    }

    private static String removeDuplicates(String str) {
        String result = "";

        for(int i =0; i < str.length(); i++) {
            char arChar = str.charAt(i);
            if (result.indexOf(arChar) == -1) {
                result += arChar;
            }
        }
        return result;
    }
}

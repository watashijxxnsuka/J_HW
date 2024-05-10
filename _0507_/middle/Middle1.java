package _0507_.middle;

import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요.");
        String inputStr = sc.nextLine();

        String result = getStr(inputStr);
        System.out.println("가운데 문자: " + result);

    }
    public static String getStr(String Str) {
        int len = Str.length();
        int index = len / 2;

        if(len % 2 == 0) {
            return Str.substring(index - 1, index + 1);
        } else {
            return Str.substring(index, index + 1);
        }
    }

}

package _0508_.basic;

import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");

        String[] inputStr = new String[3];

        for(int i = 0; i < inputStr.length; i++) {
            inputStr[i] = sc.nextLine();
        }

        StringBuffer sb = new StringBuffer();
        for(String str : inputStr) {
            sb.append(str);
        }

        System.out.println(sb.toString());

        sc.close();

    }
}

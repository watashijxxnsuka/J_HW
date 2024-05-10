package _0507_.basic;

import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요.");
        String inputStr = sc.nextLine();

        int cntGa = 0;
        int cntBa = 0;

        for(int i = 0; i < inputStr.length(); i++) {
            char c = inputStr.charAt(i);
            if (c == '가') {
                cntGa++;
            } else if (c == '나') {
                cntBa++;
            }
        }

        if (cntGa == 0 && cntBa == 0) {
            System.out.println("가와 바가 존재하지 않습니다.");
        } else {
            System.out.println("가의 개수: " + cntGa);
            System.out.println("바의 개수: " + cntBa);
        }
        sc.close();
    }
}

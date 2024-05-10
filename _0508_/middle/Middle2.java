package _0508_.middle;

import java.util.Scanner;

public class Middle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
        sb.reverse();

        System.out.println("정수를 입력하세요.");

        int userInput = sc.nextInt();

        if(userInput >= 0 && userInput < sb.length()) {
            System.out.println(sb.charAt(userInput));
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

    }
}

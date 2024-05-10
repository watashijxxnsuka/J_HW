package _0509_.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 5개를 입력하세요:");

        for (int i = 0; i < 5; i++) {
            System.out.print("정수 " + (i + 1) + ": ");
            int num = sc.nextInt();
            list.add(num);
        }

        System.out.println("입력된 정수는: ");
        for (int lists : list) {
            System.out.println(lists);
        }

    }
}

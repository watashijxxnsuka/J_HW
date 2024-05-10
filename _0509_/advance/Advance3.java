package _0509_.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Advance3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.println("5개의 정수를 입력하세요");
        for(int i = 0; i < 5; i++) {
            int  num = sc.nextInt();
            nums.add(num);
        }


        //sort 사용해보자..


        int maxSum = Integer.MIN_VALUE;
        int startI = 0;
        int endI = 0;


        // 연속된 두 수의 합이 가장 큰 구간을 찾아보자 ............
        for (int i = 0; i < nums.size() - 1; i++) {
            int currentSum = nums.get(i) + nums.get(i + 1);
            if (currentSum > maxSum) {
                maxSum = currentSum;
                startI = i;
                endI = i + 1;
            }
        }

        System.out.println("연속된 두 수의 합이 가장 큰 구간의 두 수:");
        System.out.println(nums.get(startI) + ", " + nums.get(endI));

        sc.close();


    }
}

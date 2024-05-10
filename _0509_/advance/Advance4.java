package _0509_.advance;

import java.util.*;

public class Advance4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();


        System.out.println("6개의 정수를 입력하세요:");
        for (int i = 0; i < 6; i++) {
            int num = sc.nextInt();
            nums.add(num);
        }

        // 두 수의 합을 저장하는 Set 생성한다 .... hashset ....
        Set<Integer> sumSet = new HashSet<>();


        // 모든 가능한 두 수의 합을 계산하여 Set에 저장한다 ......
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                sumSet.add(nums.get(i) + nums.get(j));
            }
        }

        System.out.println("두 수의 합이 유일한 값이 되는 개수: " + sumSet.size());
        System.out.println("두 수의 합이 유일한 값들: " + sumSet);

        sc.close();

    }
}

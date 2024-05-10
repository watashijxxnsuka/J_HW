package _0507_.basic;

import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요.");
        String inputStr = sc.nextLine();
        String result = remove(inputStr);
        System.out.println(result);
    }

    public static String remove(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch!= 'a' && ch!= 'e' && ch!= 'i' && ch!= 'o' && ch!= 'u') {
                result += ch;
            }
        }return result;
    }
    public static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}

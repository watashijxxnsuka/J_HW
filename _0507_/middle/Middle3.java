package _0507_.middle;

public class Middle3 {
    public static void main(String[] args) {

        double money = 10000;
        double rate = 0.10;
        int years = 10;

        for (int i = 0; i < years; i++) {
            money += money * rate;
        }

        System.out.println("10년 후 투자 금액: " + money + "원");
    }
}

package _0508_.basic;

public class Basic2 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(30);
        sb.append("Hello");

        int emptySpace = sb.capacity() - sb.length();
        for (int i = 0; i <emptySpace; i++) {
            sb.append("a");
        }
        System.out.println(sb.toString());
    }
}

package _0508_.middle;

public class Middle1    {
    public static void main(String[] args) {
        StringBuffer bf = new StringBuffer(30);
        bf.append("Hello");

        while(bf.length() < 30) {
            bf.append("bit");
        }
        System.out.println(bf);
    }
}

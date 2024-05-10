package _0507_.middle;

public class Middle2 {
    public static void main(String[] args) {

        char[] chars = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};


        char[] bit = new char[3];
        char[] com = new char[3];
        char[] sql = new char[3];
        char[] _int = new char[3];

        int[] indices = {0, 4, 8, 1, 5, 9, 2, 6, 10, 3, 7, 11};


        for (int i = 0; i < indices.length; i++) {
            if (i < 3) {
                bit[i] = chars[indices[i]];
            } else if (i < 6) {
                com[i - 3] = chars[indices[i]];
            } else if (i < 9) {
                sql[i - 6] = chars[indices[i]];
            } else {
                _int[i - 9] = chars[indices[i]];
            }
        }

        System.out.print("bit => ");
        for (char c : bit) {
            System.out.print(c);
        }
        System.out.println();

        System.out.print("com => ");
        for (char c : com) {
            System.out.print(c);
        }
        System.out.println();

        System.out.print("sql => ");
        for (char c : sql) {
            System.out.print(c);
        }
        System.out.println();

        System.out.print("int => ");
        for (char c : _int) {
            System.out.print(c);
        }
        System.out.println();
    }
}





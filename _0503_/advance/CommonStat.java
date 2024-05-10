package _0503_.advance;

public class CommonStat {
    int sno; // 학번
    String name;
    String[] subject;
    int[] finalExamScore;

    public CommonStat(int sno, String name) {
        this.sno = sno;
        this.name = name;
        this.subject = new String[3];
        this.finalExamScore = new int[3];
    }
}

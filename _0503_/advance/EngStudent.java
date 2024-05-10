package _0503_.advance;

public class EngStudent extends ComStudent implements Student{

    public EngStudent(int sno, String name) {
        super(sno, name);
    }
    
    @Override
    public void saveInfo(int index, String subject, int score) {
        this.subject[index] = subject;
        this.finalExamScore[index] = score;
    }

    @Override
    public void printInfo() {
        System.out.println("영어학생 정보: ");
        System.out.println("학번: " + sno);
        System.out.println("이름: " + name);
        for(int i = 0; i < subject.length; i++) {
            System.out.println("과목: " + subject + "점수: " + finalExamScore);

        }
    }

    @Override
    public double getAvg() {
        int sum = 0;
        for(int score : finalExamScore) {
            sum += score;
        }
        return (double) sum / finalExamScore.length;
    }
}

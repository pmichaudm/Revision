package McGill;

public class Main {
    static int flag = 0;
    static int numQuestions = 0;

    public static void grade() {
        double finalGrade = ((flag * 100) / (double)numQuestions);
        System.out.println("Your grade is " + finalGrade + "%");
    }

    public static void main(String[] args){

        new Module1();
        grade();
    }

}

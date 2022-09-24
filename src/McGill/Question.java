package McGill;
import java.util.Scanner;

public class Question extends Module{


    String question;
    String solution;
    String answer;
    String explanation;
    String link;
    Scanner scanner = new Scanner(System.in);

    public Question(String question, String solution, String explanation, String link) {
        this.question = question;
        this.solution = solution;
        this.explanation = explanation;
        this.link = link;
        module_questions++;
        numQuestions++;
        System.out.println(question);
        this.answer = scanner.nextLine();
        checkAnswer();
        getExplanation();
        Timer(2000);
    }

    public void getExplanation() {
        System.out.println(explanation);
        System.out.println(link);
    }

    public void checkAnswer() {
        Timer(1000);
        if (answer.equalsIgnoreCase(solution)) {
            System.out.println("Valid answer.");
            flag++;
            module_points++;
        } else {
            System.out.println("Try again you dumb fuck");
        }
    }
}

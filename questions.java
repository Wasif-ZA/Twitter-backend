/**
 * questions
 */
import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class questions {
    String question;
    answer[] answers;
    
    public questions(String question, answer[] answers) {
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public answer[] getAnswers() {
        return answers;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswers(answer[] answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "questions{" +
                "question='" + question + '\'' +
                ", answers=" + Arrays.toString(answers) +
                '}';
    }



    static public void QuestionCreator(String question, answer[] answers) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a question: ");
    question = sc.nextLine();
    System.out.println("Enter the number of answers: ");
    int num = sc.nextInt();
    answers = new answer[num];
    sc.nextLine(); // Consume the newline character
    for (int i = 0; i < num; i++) {
        System.out.println("Enter an answer: ");
        String ans = sc.nextLine();
        System.out.println("Is this answer correct? (true/false)");
        boolean correct = sc.nextBoolean();
        answers[i] = new answer(ans, correct);
        sc.nextLine(); // Consume the newline character
        questions q = new questions(question, answers);
        System.out.println(q);
        

    }
    sc.close();


    }
    public static void main(String[] args) {

        String question = "are you gay?";
        answer[] questionANswers = new answer[3];
        questionANswers[0] = new answer("yes", true);
        questionANswers[1] = new answer("no", false);
        questionANswers[2] = new answer("maybe", false);

       
            
        QuestionCreator(question, questionANswers);
       
        answer[] answers = new answer[2];
        answers[0] = new answer("yes", true);
        answers[1] = new answer("no", false);
        questions q = new questions("is this a question?", answers);
        System.out.println(q);
    }






}
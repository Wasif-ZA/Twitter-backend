/**
 * questions
 */
import java.util.Arrays;

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

    public static void main(String[] args) {
        answer[] answers = new answer[2];
        answers[0] = new answer("yes", true);
        answers[1] = new answer("no", false);
        questions q = new questions("is this a question?", answers);
        System.out.println(q);
    }
}
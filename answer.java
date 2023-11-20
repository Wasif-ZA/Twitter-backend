public class answer {
    String answer;
    boolean iscorrect;

    public answer(String answer, boolean iscorrect) {
        this.answer = answer;
        this.iscorrect = iscorrect;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isIscorrect() {
        return iscorrect;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setIscorrect(boolean iscorrect) {
        this.iscorrect = iscorrect;
    }

    @Override
    public String toString() {
        return "answer{" +
                "answer='" + answer + '\'' +
                ", iscorrect=" + iscorrect +
                '}';
    }

    public static void main(String[] args) {
        answer a = new answer("yes", true);
        System.out.println(a);
    }
}

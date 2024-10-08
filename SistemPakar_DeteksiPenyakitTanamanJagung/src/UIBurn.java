import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UIBurn {
    private ArrayList<String> questions;
    private int answers[];

    public UIBurn() {
        this.answers = new int[4];
        this.questions = new ArrayList<>();
        this.setQuestions();
    }

    private void setQuestions() {
        questions.add("Apakah ada jamur berwarna putih hingga hitam pada biji jagung?");
        questions.add("Apakah ada biji jagung yang terlihat membengkak?");
        questions.add("Apakah kelenjar terbentuk di dalam biji jagung?");
        questions.add("Apakah kelobot jagung terbuka dan muncul banyak jamur berwarna putih hingga hitam?");
    }

    public void showQuestion() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for (String q : this.questions) {
            System.out.println(q);
            System.out.println("0. Tidak    1. Ya");
            int a = sc.nextInt();
            while (a != 0 && a != 1) {
                System.out.println("Jawaban tidak sesuai!");
                a = sc.nextInt();
            }
            answers[i] = a;
            i++;
        }
    }

    public Set<String> getFacts() {
        Set<String> facts = new HashSet<>();
        if (answers[0] == 1) facts.add("G15");
        if (answers[1] == 1) facts.add("G16");
        if (answers[2] == 1) facts.add("G17");
        if (answers[3] == 1) facts.add("G18");
        if (answers[4] == 1) facts.add("G19");
        return facts;
    }

    public void showConclussion(boolean blight, Set<String> facts, Set<String> inferredFacts) {
        System.out.println("All facts: " + facts);
        System.out.println("Inferred facts: " + inferredFacts);
        if (blight) {
            System.out.println("Burn detected.");
        } else {
            System.out.println("No Burn detected.");
        }
    }
}

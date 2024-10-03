
import java.util.*;

/**
 * UI sistem pakar untuk memeriksa apakah g bernilai true dari fakta a, b, c, f
 * Sistem ini memiliki 4 pertanyaan yang akan diberikan pada user 4 pertanyaan
 * merepresentasikan 4 fakta fact: a, b, c, f conclussion: g
 *
 * @author AERO
 */
public class UI {

    private ArrayList<String> questions;
    private int answers[];
    private int jawaban;

    public UI() {
        System.out.println("Apakah tanaman anda mengalami G1?");
        System.out.println("0. Tidak 1. Ya");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            this.answers = new int[4];
            this.questions = new ArrayList<String>();
            this.setQuestionsBulai();
        } else if (a == 0) {
            System.out.println("Apakah tanaman anda mengalami G6");
            System.out.println("0. Tidak 1. Ya");
            a = sc.nextInt();
            if (a == 1) {
                this.answers = new int[5];
                this.questions = new ArrayList<String>();
                this.setQuestionsBlight();
            } else if (a == 0) {
                System.out.println("Apakah tanaman anda mengalami G11");
                System.out.println("0. Tidak 1. Ya");
                a = sc.nextInt();
                if (a == 1) {
                    this.answers = new int[4];
                    this.questions = new ArrayList<String>();
                    this.setQuestionsBulai();
                } else if (a == 0) {
                    System.out.println("Apakah tanaman anda mengalami G15");
                    System.out.println("0. Tidak 1. Ya");
                    a = sc.nextInt();
                    if (a == 1) {
                        this.answers = new int[4];
                        this.questions = new ArrayList<String>();
                        this.setQuestionsBulai();
                    } else if (a == 0) {
                        System.out.println("Apakah tanaman anda mengalami G20");
                        System.out.println("0. Tidak 1. Ya");
                        a = sc.nextInt();
                        if (a == 1) {
                            this.answers = new int[7];
                            this.questions = new ArrayList<String>();
                            this.setQuestionsBulai();
                        } else if (a == 0) {
                            System.out.println("Apakah tanaman anda mengalami G28");
                            System.out.println("0. Tidak 1. Ya");
                            a = sc.nextInt();
                            if (a == 1) {
                                this.answers = new int[3];
                                this.questions = new ArrayList<String>();
                                this.setQuestionsBulai();
                            } else if (a == 0) {
                                System.out.println("Kami belum bisa mengidentifikasi penyakit tanaman anda");
                                System. exit(0);
                            } else {
                                System.out.println("Jawaban tidak sesuai!");
                                a = sc.nextInt();
                            }
                        } else {
                            System.out.println("Jawaban tidak sesuai!");
                            a = sc.nextInt();
                        }
                    } else {
                        System.out.println("Jawaban tidak sesuai!");
                        a = sc.nextInt();
                    }
                } else {
                    System.out.println("Jawaban tidak sesuai!");
                    a = sc.nextInt();
                }
            } else {
                System.out.println("Jawaban tidak sesuai!");
                a = sc.nextInt();
            }
        } else {
            System.out.println("Jawaban tidak sesuai!");
            a = sc.nextInt();
        }
        //this.answers = new int[4];
        //this.questions = new ArrayList<String>();
        //this.setQuestions();
    }

    private void setQuestionsBulai() {
        //Q1
        questions.add("Apakah Anda mengalami G2?");
        //Q2
        questions.add("Apakah Anda mengalami G3");
        //Q3
        questions.add("Apakah Anda mengalami G4");
        //Q4
        questions.add("Apakah Anda mengalami G5");
    }

    private void setQuestionsBlight() {
        //Q1
        questions.add("Apakah Anda mengalami G5");
        //Q2
        questions.add("Apakah Anda mengalami G7");
        //Q3
        questions.add("Apakah Anda mengalami G8");
        //Q4
        questions.add("Apakah Anda mengalami G9");
        //Q5
        questions.add("Apakah Anda mengalami G10");
    }

    private void setQuestionsLeafRust() {
        //Q1
        questions.add("Apakah Anda mengalami G10?");
        //Q2
        questions.add("Apakah Anda mengalami G12");
        //Q3
        questions.add("Apakah Anda mengalami G13");
        //Q4
        questions.add("Apakah Anda mengalami G14");
    }

    private void setQuestionsBurn() {
        //Q1
        questions.add("Apakah Anda mengalami G16?");
        //Q2
        questions.add("Apakah Anda mengalami G17");
        //Q3
        questions.add("Apakah Anda mengalami G18");
        //Q4
        questions.add("Apakah Anda mengalami G19");
    }

    private void setQuestionsStemBorer() {
        //Q1
        questions.add("Apakah Anda mengalami G21?");
        //Q2
        questions.add("Apakah Anda mengalami G22");
        //Q3
        questions.add("Apakah Anda mengalami G23");
        //Q4
        questions.add("Apakah Anda mengalami G24");
        //Q5
        questions.add("Apakah Anda mengalami G25");
        //Q6
        questions.add("Apakah Anda mengalami G26");
        //Q7
        questions.add("Apakah Anda mengalami G27");
    }

    private void setQuestionsCobBorer() {
        //Q1
        questions.add("Apakah Anda mengalami G29?");
        //Q2
        questions.add("Apakah Anda mengalami G30");
        //Q3
        questions.add("Apakah Anda mengalami G31");
    }

    public void showQuestion() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for (String q : this.questions) {
            System.out.println(q);
            System.out.println("0. Tidak    1.Ya");
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
        if (answers[0] == 1) {
            facts.add("a");
        }
        if (answers[1] == 1) {
            facts.add("b");
        }
        if (answers[2] == 1) {
            facts.add("c");
        }
        if (answers[3] == 1) {
            facts.add("f");
        }
        return facts;
    }

    public void showConclussion(boolean gIsTrue, Set<String> facts, Set<String> inferedFacts) {
        System.out.println("All facts: " + facts);
        System.out.println("Inferred facts: " + inferedFacts);
        if (gIsTrue == true) {
            System.out.println("G terbukti benar");
        } else {
            System.out.println("G tidak terbukti");
        }
    }

}

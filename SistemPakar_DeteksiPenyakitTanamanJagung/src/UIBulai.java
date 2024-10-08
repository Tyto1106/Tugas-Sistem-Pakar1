
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Class untuk cek bulai
 */

/**
 *
 * @author Bayu
 */
public class UIBulai {
    private ArrayList<String> questions;
    private int answers[];
    
    public UIBulai()
    {
        this.answers = new int[4];
        this.questions = new ArrayList<String>();
        this.setQuestions();
    }
    
    private void setQuestions()
    {
        //Q1
        questions.add("Apakah tanaman mengalami keterlambatan pertumbuhan?");
        //Q2
        questions.add(" Apakah ada warna putih seperti tepung di permukaan atas dan bawah daun yang klorotik?");
        //Q3
        questions.add("Apakah daun terlihat melintir dan terpelintir?");
        //Q4
        questions.add("Apakah ada pembentukan tongkol yang terganggu?");
    }
    
    public void showQuestion()
    {
        Scanner sc = new Scanner(System.in);
        int i =0;
        for(String q: this.questions)
        {
            System.out.println(q);
            System.out.println("0. Tidak    1.Ya");
            int a = sc.nextInt();
            while(a != 0 && a!=1)
            {
                System.out.println("Jawaban tidak sesuai!");
                a = sc.nextInt();
            }
            answers[i] = a;
            i++;
        }
    }
    
    public Set<String> getFacts()
    {
        Set<String> facts = new HashSet<>();
        facts.add("G1");
        if(answers[0] == 1)
            facts.add("G2");
        if(answers[1] == 1)
            facts.add("G3");
        if(answers[2] == 1)
            facts.add("G4");
        if(answers[3] == 1)
            facts.add("G5");
        return facts;
    }
    
    public void showConclussion(boolean bulai, Set<String> facts, Set<String> inferedFacts)
    {
        System.out.println("All facts: " + facts);
        System.out.println("Inferred facts: " + inferedFacts);
        if(bulai == true)
        {
            System.out.println("Bulai detected");
        }
        else
        {
            System.out.println("No bulai detected");
        }
    }    
}

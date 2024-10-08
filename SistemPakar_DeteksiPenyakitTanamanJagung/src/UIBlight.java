
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bayu
 */
public class UIBlight {
    private ArrayList<String> questions;
    private int answers[];
    
    public UIBlight()
    {
        this.answers = new int[5];
        this.questions = new ArrayList<String>();
        this.setQuestions();
    }
    
    private void setQuestions()
    {
        //Q1
        questions.add("Apakah ada pembentukan tongkol yang terganggu?");
        //Q2
        questions.add("Apakah ada beberapa bercak kecil yang menyatu membentuk bercak yang lebih besar?");
        //Q3
        questions.add("Apakah ada bercak coklat muda yang memanjang berbentuk spiral atau perahu?");
        //Q4
        questions.add("Apakah ada bercak coklat berbentuk elips?");
        //Q5
        questions.add("Apakah daun terlihat kering?");
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
        facts.add("G6");
        if(answers[0] == 1)
            facts.add("G5");
        if(answers[1] == 1)
            facts.add("G7");
        if(answers[2] == 1)
            facts.add("G8");
        if(answers[3] == 1)
            facts.add("G9");
        if(answers[4] == 1)
            facts.add("G10");
        return facts;
    }
    
    public void showConclussion(boolean blight, Set<String> facts, Set<String> inferedFacts)
    {
        System.out.println("All facts: " + facts);
        System.out.println("Inferred facts: " + inferedFacts);
        if(blight == true)
        {
            System.out.println("Blight detected");
        }
        else
        {
            System.out.println("No blight detected");
        }
    }
}

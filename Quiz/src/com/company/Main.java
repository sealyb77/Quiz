package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Random rn = new Random();

    public static void main(String[] args) {
	Questions questions = new Questions();
    String answer = "";
        int lives = 3;
        int correct = 0;
        int k = rn.nextInt(4);

        System.out.println("You have " + lives + " lives lets start the quiz");
        while (questions.num < questions.mx) {
            questions.Select();
            //System.out.print(questions.q);
            System.out.print("->");
            answer = input.nextLine();
            input.nextLine();

            if (answer.equals(questions.a)) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Wrong");
                System.out.println(questions.a);
                lives--;
                System.out.println(lives + " remaining");
                if (lives == 0) {
                    System.out.print("quiz over");
                    break;
                } else {
                    System.out.println(" Next Question");
                }
            }
        }
        System.out.print("Quiz Complete");
    }
}

package hr.fer.croapps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion("What is the Android programming language?", "Java");
        quiz.addQuestion("What is the iPhone programming language?",
                "Objective-C");

        Scanner scanner = new Scanner(System.in);
        int noOfCorrectAnswers = 0;
        for (int i = 0; i < quiz.getNoOfQuestions(); i++) {
            System.out.println(quiz.getQuestion(i));
            String answer = scanner.nextLine();
            if(quiz.isCorrectAnswer(i, answer)) {
                noOfCorrectAnswers++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
        }

        System.out.println("You had " + noOfCorrectAnswers + " correct answers of total " + quiz.getNoOfQuestions() + ".");
    }
}

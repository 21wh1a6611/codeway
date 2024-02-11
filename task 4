import java.util.Scanner;

class QuizQuestion {
    String question;
    String[] options;
    int correctOption;

    QuizQuestion(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }
}
class QuizGame {
    private static int score = 0;
    private static int currentQuestionIndex = 0;

    public static void main(String[] args) {
        QuizQuestion[] questions = initializeQuestions();

        Scanner scanner = new Scanner(System.in);

        while (currentQuestionIndex < questions.length) {
            QuizQuestion currentQuestion = questions[currentQuestionIndex];
            displayQuestion(currentQuestion);
            int timerSeconds = 10;
            System.out.println("You have " + timerSeconds + " seconds to answer.");

            System.out.print("Your choice: ");
            String userChoice = scanner.nextLine();
            if (isValidChoice(userChoice) && Integer.parseInt(userChoice) == currentQuestion.correctOption) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + currentQuestion.correctOption);
            }
            currentQuestionIndex++;
        }
        System.out.println("Quiz completed! Your final score is: " + score + "/" + questions.length);

        scanner.close();
    }

    private static QuizQuestion[] initializeQuestions() {
        QuizQuestion[] questions = {
                new QuizQuestion("What is the capital of France?", new String[]{"1. Berlin", "2. Paris", "3. Madrid"}, 2),
                new QuizQuestion("Which programming language is this quiz written in?", new String[]{"1. Java", "2. Python", "3. C++"}, 1),
           
        };
        return questions;
    }

    private static void displayQuestion(QuizQuestion question) {
        System.out.println(question.question);
        for (String option : question.options) {
            System.out.println(option);
        }
    }

    private static boolean isValidChoice(String choice) {
        try {
            int parsedChoice = Integer.parseInt(choice);
            return parsedChoice >= 1 && parsedChoice <= 3;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

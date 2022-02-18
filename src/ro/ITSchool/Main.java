package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int computerChoice = computer();
        String computer = computerString(computerChoice);
        System.out.println("Rock Paper Scissors ");
        System.out.print("Enter your option Rock(1),Paper(2),Scissors(3) : ");
        int yourChoice = choice();
        String you = whatYouChose(yourChoice);
        whatComputerChose(computer);
        if (you.equals(computer)) {
            System.out.println("Equal!");
        } else {
            boolean y = winnerY(yourChoice, computerChoice);
            if (y) {
                System.out.println("You win!!!");
            } else {
                System.out.println("You lose!");
                winnerC(computerChoice);
            }


        }
    }

    public static int computer() {
        int min = 1, max = 3, coef = max - min + 1;
        return (int) (Math.random() * coef + min);
    }

    public static String computerString(int comp) {
        if (comp == 1) {
            return "Rock";
        } else if (comp == 2) {
            return "Paper";
        } else
            return "Scissors";

    }

    public static int choice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String whatYouChose(int yourChoice) {
        if (yourChoice == 1) {
            System.out.print("You chose Rock.");
            return "Rock";
        } else if (yourChoice == 2) {
            System.out.print("You chose Paper.");
            return "Paper";
        } else {

            System.out.print("You chose Scissors.");
            return "Scissors";
        }
    }

    public static void whatComputerChose(String comp) {
        System.out.println("Computer chose " + comp + ".");

    }

    public static boolean winnerY(int you, int comp) {
        if (you == 3 && comp == 2) {
            System.out.print("Scissors cuts Paper.");
            return true;
        } else if (you == 2 && comp == 1) {
            System.out.print("Paper wraps Rock.");
            return true;

        } else if (you == 1 && comp == 3) {
            System.out.print("Rock blunts Scissors.");
            return true;
        } else {
            return false;
        }
    }

    public static void winnerC(int comp) {
        if (comp == 3) {
            System.out.print("Scissors cuts Paper.");
        } else if (comp == 2) {
            System.out.print("Paper wraps Rock.");

        } else {
            System.out.print("Rock blunts Scissors.");
        }

    }
}


import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        String uMove;
        int aiNum;
        String aiMove;
        String[] rps = {"r", "p", "s"};

        System.out.println("Hello, fellow user! Let's play Rock-Paper-Scissors!");
        System.out.println("Please enter your move. (r for rock, p for paper, s for scissors)");
        uMove = uInput.nextLine();
        aiNum = (int) (Math.random() * 3);
        aiMove = rps[aiNum];

        System.out.println("You chose " + uMove + " and the AI chose " + aiMove + ".");
        if (uMove.equals(aiMove)) {
            System.out.println("It's a tie!");
            uInput.close();
        } else if (uMove.equals("r")) {
            if (aiMove.equals("p")) {
                System.out.println("You lose!");
                uInput.close();
            } else {
                System.out.println("You win!");
                uInput.close();
            }
        } else if (uMove.equals("p")) {
            if (aiMove.equals("s")) {
                System.out.println("You lose!");
                uInput.close();
            } else {
                System.out.println("You win!");
                uInput.close();
            }
        } else if (uMove.equals("s")) {
            if (aiMove.equals("r")) {
                System.out.println("You lose!");
                uInput.close();
            } else {
                System.out.println("You win!");
                uInput.close();
            }
        } else {
            System.out.println("Invalid input. Please try again.");
            uInput.close();
        }

    } 
}

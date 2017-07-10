import java.util.Scanner;

/**
 * @author hilmi
 */
public class maingame {

    Scanner playerinput;
    String playerhand, comphand, validchoice;


    //constructor
    public maingame() {
        playerinput = new Scanner(System.in);
        playerhand = "";
        comphand = "";
        validchoice = "rps";
    }

    public void startgame() {
        System.out.println("\nr = rock, p = paper, s = scissors");
        System.out.print("Enter your choice : ");
        playerhand = playerinput.nextLine();

        boolean valid = validchoice.contains(playerhand);

        if (!valid) {
            System.out.println("\nInvalid moves! YOU LOSE BY DEFAULT!");
            return;
        }

        comphand = compRandMove();

        System.out.println("Computer picks " + comphand + "\n");

        if (playerhand.equalsIgnoreCase("R")) {
            switch (comphand) {
                case "R":
                    System.out.println("Both chooses rock, it's a tie game..");
                    break;
                case "P":
                    System.out.println("Paper covers rock. You lose!");
                    break;
                case "S":
                    System.out.println("Rock destroys scissors. YOU WIN!");
                    break;
            }
        }
        else if (playerhand.equalsIgnoreCase("P")) {
            switch (comphand) {
                case "R":
                    System.out.println("Paper covers rock. YOU WIN!");
                    break;
                case "P":
                    System.out.println("Both chooses paper, it's a tie game..");
                    break;
                case "S":
                    System.out.println("Scissors destroys paper. You lose!");
                    break;
            }
        }
        else if (playerhand.equalsIgnoreCase("S")) {
            switch (comphand) {
                case "R":
                    System.out.println("Rock destroys scissors. You lose!");
                    break;
                case "P":
                    System.out.println("Scissors destroys paper. YOU WIN!");
                    break;
                case "S":
                    System.out.println("Both chooses scissors, it's a tie game..");
                    break;
            }
        }

    }

    private String compRandMove() {
        int random = (int)(Math.random() * 3);

        if (random == 0)
            return "R";
        else if (random == 1)
            return "P";
        else
            return "S";
    }

    public static void main(String[] args) {

        maingame play = new maingame();
        Scanner readinput = new Scanner(System.in);
        int input;

        System.out.println("Hi! Let's play O-som..");

        do {
            play.startgame();
            System.out.println("\nPress 1 to retry or 0 to end the game..");
            input = readinput.nextInt();
        }
        while (input != 0);

        System.out.println("\nThanks for playing. Bye~~");
    }
}

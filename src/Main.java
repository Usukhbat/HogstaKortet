import java.util.Scanner;

// ┌ ┘ ┗ ┓ ─
public class Main {
    public static void mainGame(int a, int b, int[] normalCards) {
        for (int i = 0; i < 9; i++) {
            if (a == i) {
                System.out.println("          ┌────┓");
                System.out.println("Player 1: |  " + a + " |");
                System.out.println("          ┗────┘");
            }
            if (b == i) {
                System.out.println("          ┌────┓");
                System.out.println("Player 2: |  " + b + " |");
                System.out.println("          ┗────┘");
            }
        }
    }

    public static void specialGame(int a, int b, String[] specialCards) {
        for (int i = 0; i < 4; i++) {
            if (a - 1 == i) {
                System.out.println("          ┌────┓");
                System.out.println("Player 1: |  " + specialCards[a] + " |");
                System.out.println("          ┗────┘");
            }
            if (b - 1 == i) {
                System.out.println("          ┌────┓");
                System.out.println("Player 1: |  " + specialCards[b] + " |");
                System.out.println("          ┗────┘");
            }
        }
    }

    public static int playAgain(String answer) {
        if (!answer.equals("yes")) {
            System.out.println("Goodbye!");
            return 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Card Game");
        System.out.print("Press enter to play...");
        scan.nextLine();
        int game = 1;
        int[] normalCards = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] specialCards = {"J", "Q", "K", "A"};
        while (game == 1) {
            int a = (int) (Math.random() * 13) + 1;
            int b = (int) (Math.random() * 13) + 1;
            if (a < b) {
                mainGame(a, b, normalCards);
                specialGame(a, b, specialCards);
                System.out.println("Player 2 won!");
                System.out.println("Play again? (Type yes to continue.)");
                String answer = scan.next();
                game = playAgain(answer);
            }
            if (a > b) {
                mainGame(a, b, normalCards);
                specialGame(a, b, specialCards);
                System.out.println("Player 1 won!");
                System.out.println("Play again? (Type yes to continue.)");
                String answer = scan.next();
                game = playAgain(answer);
            }
            if (a == b) {
                System.out.println("Draw, play again.");
                scan.nextLine();
            }
        }
    }
}
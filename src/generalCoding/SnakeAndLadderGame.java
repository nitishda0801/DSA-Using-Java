package src.generalCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadderGame {
    private static final int BOARD_SIZE = 100;
    private static final Map<Integer, Integer> snakeMap = new HashMap<>();
    private static final Map<Integer, Integer> ladderMap = new HashMap<>();

    static {
        // Define snakes and ladders
        snakeMap.put(16, 6);
        snakeMap.put(47, 26);
        snakeMap.put(49, 11);
        snakeMap.put(56, 53);
        snakeMap.put(62, 19);
        snakeMap.put(64, 60);
        snakeMap.put(87, 24);
        snakeMap.put(93, 73);
        snakeMap.put(95, 75);
        snakeMap.put(98, 78);

        ladderMap.put(1, 38);
        ladderMap.put(4, 14);
        ladderMap.put(9, 31);
        ladderMap.put(21, 42);
        ladderMap.put(28, 84);
        ladderMap.put(36, 44);
        ladderMap.put(51, 67);
        ladderMap.put(71, 91);
        ladderMap.put(80, 100);
    }

    private static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    private static void playGame(String player) {
        Scanner scanner = new Scanner(System.in);
        int currentPosition = 0;

        while (currentPosition < BOARD_SIZE) {
            System.out.println(player + ", press enter to roll the dice.");
            scanner.nextLine();

            int diceValue = rollDice();
            System.out.println("You rolled a " + diceValue);

            currentPosition += diceValue;

            if (currentPosition > BOARD_SIZE) {
                currentPosition -= diceValue;
                System.out.println("You need " + (BOARD_SIZE - currentPosition) + " to win. Try again.");
            } else if (currentPosition == BOARD_SIZE) {
                System.out.println(player + " wins!");
                break;
            } else {
                System.out.println("You are now at position " + currentPosition);

                // Check if the player encounters a snake or ladder
                if (snakeMap.containsKey(currentPosition)) {
                    int newPosition = snakeMap.get(currentPosition);
                    System.out.println("Oh no! You encountered a snake. Move back to position " + newPosition);
                    currentPosition = newPosition;
                } else if (ladderMap.containsKey(currentPosition)) {
                    int newPosition = ladderMap.get(currentPosition);
                    System.out.println("Hooray! You found a ladder. Climb up to position " + newPosition);
                    currentPosition = newPosition;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Snake and Ladder game!");

        System.out.println("Enter player 1's name:");
        String player1 = scanner.nextLine();

        System.out.println("Enter player 2's name:");
        String player2 = scanner.nextLine();

        while (true) {
            playGame(player1);
            System.out.println("Do you want to play again? (yes/no)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }

            playGame(player2);
            System.out.println("Do you want to play again? (yes/no)");
            choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

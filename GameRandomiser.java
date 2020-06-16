import java.util.Scanner;
import java.util.Random;

/*This program pretty much solves the issue of not being able to choose
a game to play :) */
public class GameRandomiser {
    public static void main(String[] args) {
        int max_count = 100;
        int game_count = 0;
        int min = 0;
        String[] games = new String[max_count];
        Scanner input = new Scanner(System.in);

        System.out.println("enter the games you wanna play (end list with ex)");
        String game = input.nextLine();

        while (!game.equals("ex")) {
            games[game_count] = game;
            game_count++;
            game = input.nextLine();
        }
        input.close();
        Random random = new Random();
        int randomNumber = random.nextInt(game_count - min + 1) + min;

        System.out.println("seems like you're playing " + games[randomNumber]);

    }
}
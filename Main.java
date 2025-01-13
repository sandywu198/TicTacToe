//import java.util.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Use this class to run a TicTacToe game
        Scanner scan = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        System.out.println(" _   _      _             _      ");
        System.out.println("| | (_)    | |           | |            ");
        System.out.println("| |_ _  ___| |_ __ _  ___| |_ ___   ___ ");
        System.out.println("| __| |/ __| __/ _` |/ __| __/ _ \\ / _ \\");
        System.out.println("| |_| | (__| || (_| | (__| || (_) |  __/");
        System.out.println(" \\__|_|\\___|\\__\\__,_|\\___|\\__\\___/ \\___|");
        System.out.println("Welcome to the Tic Tac Toe Game.");
        int flag = 1;
        int c = 1;
        String a = "";
        String b = "";
        int d = 0;
        while(c == 1 && d == 0) {
            System.out.println("Do you want to play against a Friend or a Bot? 1 for friend or 2 for bot");
            d = scan.nextInt();
            scan.nextLine();
            while(d == 1) {
                TicTacToe game2 = new TicTacToe();
                System.out.println("Each player must pick their own symbol. Reminder: The columns and rows start from 0 to 2. ");
                System.out.println("First player must pick a symbol.");
                a = scan.nextLine();
                System.out.println("Second player must pick a symbol.");
                b = scan.nextLine();
                game2.playerMove(a,b);
                game2.results(a,b);
                System.out.println("Do you want to play again? 1 for Yes or 2 for No");
                c = scan.nextInt();
                scan.nextLine();
                d = 0;
            }
            while(d == 2) {
                TicTacToe game1 = new TicTacToe();
                System.out.println("Player must pick their own symbol. The Bot's symbol is x. Reminder: The columns and rows start from 0 to 2. ");
                System.out.println("You must pick a different symbol.");
                a = scan.nextLine();
                b = "x";
                game1.playerBot(a,b);
                game1.results(a,b);
                System.out.println("Do you want to play again? 1 for Yes or 2 for No");
                c = scan.nextInt();
                scan.nextLine();
                d = 0;
            }
        }
        if(c == 2) {
            game.results(a,b);
        } 
        
    }
}

import java.util.Scanner;
import java.lang.Math;
public class TicTacToe {

    //the gameboard
    private String[][] gameBoard = new String[5][3];
    private boolean win = false;
    private int count = 0;
    public static int countwin1 = 0;
    public static int countwin2 = 0;
    public static int countdraw = 0;
    private String sym1 = "";
    private String sym2 = "";
    
    public TicTacToe() {
        for (int r = 0; r < gameBoard.length; r++) {
            for (int c = 0; c < gameBoard[r].length; c++) {
                gameBoard[r][c] = " ";
            }
        }
    }

    //part a: print the board
    public void printBoard() {
        for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard[i].length; j++) {
                if(i%2 == 0 && j != 2){
                    System.out.print(" " + gameBoard[i][j] + " |");
                }
                else if(i%2 == 0) {
                    System.out.print(" " + gameBoard[i][j]);
                }
            }
            if(i%2 != 0) {
                gameBoard[i][0] = "-----------";
                System.out.print(gameBoard[i][0]);
            }
            System.out.println(""); 
        }
    }

    //part b: playerMove
    public void playerMove(String abc, String efg) {
        sym1 = abc;
        sym2 = efg;
        Scanner scan = new Scanner(System.in);
        boolean turn = false;
        boolean again = false;
        int row = 0;
        while(!turn && count < 9) {
            System.out.println("To place your symbol, please enter a row number and column number, respectively.");
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(x>=0 && x<=2 && y>=0 && y <= 2){
                    if(x == 0){
                    row = 0;
                }
                else if(x == 1){
                    row = 2;
                }
                else if (x == 2){
                    row = 4;
                }
                while(gameBoard[row][y].equals(sym1) || gameBoard[row][y].equals(sym2)) {
                    System.out.print("This position is already taken. Try another move. \n");
                    again = true;
                    break;
                }
                if(x == 0 && !again){
                    gameBoard[0][y] = sym1; 
                }
                else if(x == 1 && !again){
                    gameBoard[2][y] = sym1;
                }
                else if(x == 2 && !again){
                    gameBoard[4][y] = sym1;
                }
                printBoard();
                checkWin(sym1,sym2);
                if(win == true){
                    count = 9;
                    break;
                    
                }
                if(again == true){
                    turn = false;
                    again = false;
                }
                else{
                    turn = true;
                    count++;
                }
                if(count >= 9){
                    countdraw++;
                    System.out.println("This is a draw! Nobody wins! HAHA!\n");
                }
                while(turn && count < 9) {
                    System.out.println("To place your symbol, please enter a row number and column number, respectively.");
                    x = scan.nextInt();
                    y = scan.nextInt();
                    if(x >= 0 && x<=2 && y>=0 && y<=2){
                            if(x == 0){
                            row = 0;
                        }
                        else if(x == 1){
                            row = 2;
                        }
                        else if (x == 2){
                            row = 4;
                        }
                        while(gameBoard[row][y].equals(sym1) || gameBoard[row][y].equals(sym2)) {
                            System.out.print("This position is already taken. Try another move. \n");
                            again = true;
                            break;
                        }
                        if(x == 0 && !again){
                            gameBoard[0][y] = sym2;
                        }
                        else if(x == 1 && !again){
                            gameBoard[2][y] = sym2;
                        }
                        else if (x == 2 && !again){
                            gameBoard[4][y] = sym2;
                        }
                        printBoard();
                        checkWin(sym1,sym2);
                        if(win == true){
                            count = 9;
                            break;
                        }
                        if(again == true){
                            turn = true;
                            again = false;
                        }
                        else{
                            turn = false;
                            count++;
                        }
                        if(count >= 9){
                            countdraw++;
                        System.out.println("This is a draw! Nobody wins! HAHA!\n");
                        }
                    }
                    else{
                        System.out.println("This position is out of bound.\nTry another move.");
                        turn = true;
                    }      
                }
            }
            else{
                System.out.println("This position is out of bound.\nTry another move.");
                turn = false;
            }
        }
    }
    
    public void playerBot(String xyz, String cba) {
        sym1 = xyz;
        sym2 = cba;
        Scanner scan = new Scanner(System.in);
        boolean turn = false;
        boolean again = false;
        int a = 0;
        int b = 0;
        int row1 = 0;
        int row = 0;
        int column = 0;
        while(!turn && count < 9) {
            System.out.println("To place your symbol, please enter a row number and column number, respectively.");
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(x>=0 && x<=2 && y>= 0 && y<=2) {
                if(x == 0){
                    row = 0;
                }
                else if(x == 1){
                    row = 2;
                }
                else if (x == 2){
                    row = 4;
                }
                while(gameBoard[row][y].equals(sym1) || gameBoard[row][y].equals(sym2)) {
                    System.out.print("This position is already taken. Try another move. \n");
                    again = true;
                    break;
                }
                if(x == 0 && !again){
                    gameBoard[0][y] = sym1; 
                }
                else if(x == 1 && !again){
                    gameBoard[2][y] = sym1;
                }
                else if(x == 2 && !again){
                    gameBoard[4][y] = sym1;
                }
                printBoard();
                checkWin(sym1,sym2);
                if(win == true){
                    count = 9;
                    break;
                }
                if(again == true){
                    turn = false;
                    again = false;
                }
                else{
                    turn = true;
                    count++;
                }
                if(count >= 9){
                    countdraw++;
                    System.out.println("This is a draw! Nobody wins! HAHA!\n");
                }
                while(turn && count < 9) {
                    a = (int)(Math.random()* 120);
                    b = (int)(Math.random()* 120);
                    if(a>=0 && a<=39){
                        row = 0; 
                        row1 = 0;
                    }
                    else if(a>=40 && a<=79){
                        row = 2;
                        row1 = 1;
                    }
                    else if (a>=80 && a<=119){
                        row = 4;
                        row1 = 2;
                    }
                    if(b>=89 && b<=119){
                        column = 0;
                    }
                    else if(b>=0 && b<=39){
                        column = 1;
                    }
                    else if(b>=40 && b<=79) {
                        column = 2;
                    }
                    System.out.println("The Bot's move will be...\nRow: " + row1 + "\nColumn: " + column);
                    while(gameBoard[row][column].equals(sym1) || gameBoard[row][column].equals(sym2)) {
                        System.out.print("This position is already taken. Try another move. \n");
                        again = true;
                        break;
                    }
                    if(row1 == 0 && !again){
                        gameBoard[0][column] = sym2;
                    }
                    else if(row1 == 1 && !again){
                        gameBoard[2][column] = sym2;
                    }
                    else if (row1 == 2 && !again){
                        gameBoard[4][column] = sym2;
                    }
                    printBoard();
                    checkWin(sym1,sym2);
                    if(win == true){
                        count = 9;
                        break;
                    }
                    if(again == true){
                        turn = true;
                        again = false;
                    }
                    else{
                        turn = false;
                        count++;
                    }
                    if(count >= 9){
                        countdraw++;
                        System.out.println("This is a draw! Nobody wins! HAHA!\n");
                    }      
                }
            }
            else{
                System.out.println("This position is out of bound.\nTry another move.");
                turn = false;
            }  
        }
    }

    //part c: checkWin
    public void checkWin(String hij, String klm) {
        sym1 = hij;
        sym2 = klm;
        String win1 = "";
        for(int j = 0; j < gameBoard[0].length; j++) {
            for(int k = 0; k < gameBoard[0].length-2; k++) {
                if(gameBoard[j][k].equals(sym1) || gameBoard[j][k].equals(sym2)) {
                    if(gameBoard[j][k].equals(gameBoard[j][k+1]) && gameBoard[j][k+1].equals(gameBoard[j][k+2])){
                        win = true;
                        win1 = "Player " + gameBoard[j][k] + " wins!\n";
                        if(gameBoard[j][k].equals(sym1)) {
                            countwin1++;
                        }
                        else{
                            countwin2++;
                        }
                        break;
                    }
                }
            }
        }
        for(int a = 0; a < gameBoard[0].length; a++) {         
            for(int b = 0; b < gameBoard.length-4; b+=2){             
                if((gameBoard[b][a].equals(sym1) || gameBoard[b][a].equals(sym2))) {
                    if(gameBoard[b][a].equals(gameBoard[b+2][a]) && gameBoard[b+2][a].equals(gameBoard[b+4][a])){
                        win = true;
                        win1 = "Player " + gameBoard[b][a] + " wins!\n";
                        if(gameBoard[b][a].equals(sym1)) {
                            countwin1++;
                        }
                        else{
                            countwin2++;
                        }
                        break;
                    }
                }
            }
        }
        for(int c = 0; c < gameBoard[0].length-2; c++){
            if((gameBoard[c][c].equals(sym1) || gameBoard[c][c].equals(sym2))) {
                if(gameBoard[c][c].equals(gameBoard[c+2][c+1]) && gameBoard[c+2][c+1].equals(gameBoard[c+4][c+2])){
                    win = true;
                    win1 = "Player " + gameBoard[c][c] + " wins!\n";
                    if(gameBoard[c][c].equals(sym1)) {
                        countwin1++;
                    }
                    else{
                        countwin2++;
                    }
                    break;
                }
            }
        }
        for(int c = 0; c < gameBoard[0].length-2; c++){
            if((gameBoard[c][c+2].equals(sym1) || gameBoard[c][c+2].equals(sym2))) {
                if(gameBoard[c][c+2].equals(gameBoard[c+2][c+1]) && gameBoard[c+2][c+1].equals(gameBoard[c+4][c])){
                    win = true;
                    win1 = "Player " + gameBoard[c][c+2] + " wins!";
                    if(gameBoard[c][c+2].equals(sym1)) {
                        countwin1++;
                    }
                    else{
                        countwin2++;
                    }
                    break;
                }
            }
        }
        if(win == true){
            System.out.println(win1);
        } 
    }
    public void results(String s1, String s2) {
        System.out.println("Player " + s1 + " wins " + countwin1 + " time/s.");
        System.out.println("Player " + s2 + " wins " + countwin2 + " time/s.");
        System.out.println("There are " + countdraw + " draws.\n");
    }

}

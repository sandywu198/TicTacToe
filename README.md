# TicTacToe
For this assignment, you will be creating a TicTacToe game by implementing the TicTacToe class.

A TicTacToe object has a 2-D array of Strings that represents the game board.  A typical TicTacToe game board is 3x3, but some variations may change these dimensions.  This gameboard is initialized with empty spaces.

Part a: Implement the printBoard method which prints out the TicTacToe board in a 3 x 3 grid pattern with lines separating the boxes.  Here is an example.  Keep in mind that the spaces should be the elements of the grid.

part b: Implement the playerMove method.  This method should prompt the player to input a “move” (a row and column) and then should place their “symbol” in the appropriate spot on the grid.  To determine whose “turn” it is, you may prompt the user for their symbol, or implement a way to change the symbol automatically between turns!

You must also make sure that a player cannot place a symbol in a space that doesn't exist (out of bounds) or a space that is already taken! Have the user pick again if this is the case.

part c: Implement the checkWin method.  This method should check to see if a player has won, meaning there are matching symbols in all three spaces in a row or column, or diagonally across the board (top-left to bottom-right or top-right to bottom-left).  If the board is filled and nobody has won, the game ends in a draw.

IMPORTANT NOTE: You may change the method headers of any of these methods if necessary for your implementation.  They do NOT need to stay as void methods with no parameters.

part x: Extensions - Implementing all of the above parts will earn a score of 85% for you and your partner.

Each of the following extensions will increase your score by the specified amount, up to a maximum score of 105%.

Extension 1: Add Ascii Art and an intro to your game. (5 points)
Extension 2: Allow users to play multiple games ("Do you want to play again?") and track the number of times each player has won and the number of draws. (5 points)
Extension 3: Create different sized boards!  Each different sized board should still only check to see if there are three of the same symbol in a row. (10 points)
Extension 4: Create an AI opponent that automatically places symbols at random or following a set pattern. (10 points)
Extension 5: Create multiply difficulties for your AI opponent, including an “impossible” difficulty that can't be beat: https://youtu.be/5n2aQ3UQu9Y
Extension 6: Ultimate Tic-Tac-Toe - Ultimate Tic-Tac-Toe is a strategic implementation of Tic-Tac-Toe where users play nine games of TTT at once.  Each game exists in a space in a 3x3 grid, and each time you win one of the mini-games, your symbol takes over that space on the larger grid.  Whenever you place a symbol in a mini-game, where you place it determines which game (in the larger grid) your opponent must place their next symbol.  (Example, if you place your symbol in the bottom space in the top-left game, your opponent will have to place their symbol in the bottom game, but they can place it in any available space.  If they choose the bottom space of the bottom game, you must also place your symbol in the bottom game.  If you choose the left space, your opponent must then place their symbol in the left game, and so on…)  Once a player has won three games in a TTT pattern, they are determined the winner.  This extension is worth 20 points + an additional extra credit homework assignment.   You can play a few rounds here: https://ultimate-t3.herokuapp.com/local-game

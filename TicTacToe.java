import java.util.*;
public class TicTacToe{
  private char [][] board;
  // When turn is 0, the X player is playing
  // When turn is 1, the 0 player is playing
  private int turn;
  


// Description: initializes the board variable to have empty spaces using the space charachter in a 3*3 grid

  private void SetUpBoard(){
    // declare the arrays
    this.board = new char[][]{
      {' ', ' ', ' '},
      {' ', ' ', ' '},
      {' ', ' ', ' '},
    };
  }
  /*Description: Place an X or 0 if the grid is still empty at that location
  * Precondition: 2D array has been intialiszed, player submits a row number from 0 to 2 and a column number from 0 to 2
  * Postcondition: true is reutrned if the space was avaliable, and the board is updated
  * False is reutnred if the space was not avalialbe, and the board is unchanged. 
  * If a peice is placed, swap turns
  */

  private boolean PlacePeice(int row, int col){
    boolean avaliable = true;
    if(board[row][col] != ' '){
      avaliable = false;
    }
    if(avaliable = true){
      if(turn == 0){
        board[row][col] = 'x';
        turn = -1;
      }
      else{
        board[row][col] = 'o';
        turn = 0; 
      }
    }
    
    return avaliable;
  }
  // check to see if someone wins
  // Ex: If someone chooses the center of the board, loop up, left, right for 3 in a row
  // Also checks diagonally in both Directions to see if there is 3 in a row
  // 4 Options -> 4 "Helper Methods"
  private char CheckWinner(int row, int col){
    
    
  }
  
} 
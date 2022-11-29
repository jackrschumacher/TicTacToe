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
  
    return avaliable;
  }
    
    
  
  // check to see if someone wins
  // Ex: If someone chooses the center of the board, loop up, left, right for 3 in a row
  // Also checks diagonally in both Directions to see if there is 3 in a row
  // 4 Options -> 4 "Helper Methods"
  private char CheckWinner(int row, int col){
    
    
  }
  // In the COUMN placed, check all 3 spaces to see if they match for whoever's turn it is
  // Return the charachter of the winner (x or o) if there is one
  // , otherwise return a space ' '
  private char CheckVertical(int row, int col){
    char charToMatch = board[row][col];

    for(int i =0; i < board.length; i++){
      if(board[i][col] != charToMatch){
        return ' ';
      }
    return charToMatch;
  }
  
  
  private char CheckHorizontal(int row, int col){
    char charToMatch = board[row][col];

    for(int i =0; i < board[0].length; i++){
      if(board[row][i] != charToMatch){
        return ' ';
      }
    }
    return charToMatch;
  } 
  // Using the ROW and COUMN of a placed peice, check down-left and 
  // Up-Right until we either reach the end of the board, or we run into a peice
  // That doesent match the place one
  // Then, if count is 3 or greater return that charachter
  // If count is less than 3, return ' '
  // If statement at tend to see if count is high enough to win
  private char CheckUpRightDiagonal(int row, int col){
    int count = 1;
    char charToMatch = board[row][col];

    int currentRow = row;
    int currentCol = col;

    while(
    (currentRow + 1 < board.length && currentCol - 1 >= 0)
    && board[currentRow + 1][currentCol - 1] == charToMatch
    ){
        currentRow++;
        currentCol--;
        count++;  
        }
          }
    
    }
    
  }
  
}
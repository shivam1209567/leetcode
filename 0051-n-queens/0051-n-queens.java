class Solution {
    public List<List<String>> solveNQueens(int n) {
     List<List<String>> allBoards = new ArrayList<>();
     char[][] board = new char[n][n];
     helper(board,allBoards,0); 
     return allBoards;
       
    }
    public void helper(char[][] board,List<List<String>> allBoards, int col){
      if(board.length == col){
        saveBoard(board,allBoards);
        return;

      }
      for(int row = 0; row < board.length; row++){  
      if(isSafe(row, col, board)){
      board[row][col] = 'Q';
      helper(board,allBoards,col+1);
        board[row][col] = '.';
      }
      }
    }
    public boolean isSafe(int row,int col, char [][] board){
        //check horizontal
        for(int j = 0; j < board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
            
        }
        //check vertically
        for(int i = 0; i < board[0].length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //check upper left
        int r = row;
        for(int c = col; c >= 0 && r >= 0; c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //check upper right
        r = row;
        for(int c = col; c < board.length && r >= 0; c++,r--){
           if(board[r][c] == 'Q'){
            return false;
           }
        }
        //check lower left
        r = row;
        for(int c = col; c >= 0 && r < board[0].length; c--,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //check lower right
        r = row;
        for(int c = col; c < board.length && r < board[0].length; r++,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
        public void saveBoard(char[][] board, List<List<String>> allBoards){
            String row = "";
            List<String> newBoard = new ArrayList<>();
            for(int i = 0; i < board.length; i++){
                row = "";
                for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == 'Q'){
                        row += 'Q';
                    }else{
                        row+= '.';
                    }
                }
                    newBoard.add(row);
            }
                allBoards.add(newBoard);
            
        }

    }

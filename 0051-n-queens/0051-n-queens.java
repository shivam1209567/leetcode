class Solution {
    boolean isSafe(char[][] board,int row,int col){
        // horizontal 
        for(int j = 0; j < board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }

        }
        // vertical
        for(int i = 0; i < board[0].length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // left upward
        int r = row;
        for(int c = col; c >= 0 && r >= 0; c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // right upward
         r = row;
        for(int c = col; c < board.length && r >= 0; r--,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // left downward
        r = row;
        for(int c = col; r < board.length && c >= 0; r++,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        // right downward
        r = row;
        for(int c = col; r < board.length && c < board.length; r++,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
     }
    void saveboard(char[][] board,List<List<String>> allboards){
        
        List<String> newBoard =  new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String row = "";
           for(int j = 0; j < board.length; j++){
            if(board[i][j] == 'Q'){
                row += 'Q';
            }else{
                row += '.';
            }
           
           }
             newBoard.add(row);
           
           
        }
        allboards.add(newBoard);
        
    }
    void backtrack(char[] [] board,int col,List<List<String>> allboards){
        if(col ==  board.length){
            saveboard(board,allboards);
            return;
        }
        for(int row = 0; row < board.length; row++){
           if(isSafe(board,row,col)){
            board[row][col] = 'Q';
            backtrack(board,col+1,allboards);
            board[row][col] = '.';
           } 
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allboards = new ArrayList<>();

        char[][] board = new char[n][n];
        backtrack(board, 0,allboards);
        return allboards;
    }
}
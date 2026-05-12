class Solution {
    public static boolean isSafe(char[][] board,int row,int col,char num){
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num){
                return false;
            }
            if(board[i][col] == num){
                return false;
            }
        
    
        }
    
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr; i < sr+3; i++){
            for(int j = sc; j < sc+3; j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checker(char[][] board){
        for(int i = 0; i < board[0].length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] != '.'){
                    char num = board[i][j];
                    board[i][j] = '.';
                    if(!isSafe(board,i,j,num)){
                        return false;
                    }
                    board[i][j] = num;
                }
            }
        }
        return true;
    }
    

    public boolean isValidSudoku(char[][] board) {
        return checker(board);
    }
}

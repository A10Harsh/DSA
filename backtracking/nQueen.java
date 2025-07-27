public class nQueen {
    public static void nQueenp(char board [][], int row){// queen placing
        //base case
        if (row == board.length){
            printBoard(board);
            return;
        }
        // coulumn loop
        for (int j =0; j<board.length; j++){
            if (issafe(board, row,j)){
                board [row][j]= 'Q';
                nQueenp(board, row+1); //recursive  call
                board[row][j] ='x'; //backtracking
            }
        }


    }
    public static boolean issafe(char board [][], int row, int col){ //checking the all valid condition
        //vertical up
        for (int i = row-1; i>=0; i--){
            if (board [i][col]== 'Q'){
                return false;
            }
        }
        for (int i = row -1, j = col-1; i>= 0 && j >=0; i--,j--){
             if (board [i][j]== 'Q'){
                return false;
            }
        }
         for (int i = row -1, j = col+1; i>= 0 && j <=board.length; i--,j++){
             if (board [i][j]== 'Q'){
                return false;
            }
        }
        return true; 
    } 

    public static void printBoard(char board[][]){ //printing the board
        System.out.println("------------board----------------");
          for (int i = 0; i<board.length; i++){
            for (int j =0; j<board.length; j++){
               System.out.print(board[i][j]);
            }
            System.out.println();

        }
    }
    public static void main(String  []args){
        int n  =4;
        char board[][] = new char [n][n];
        for (int i = 0; i<n; i++){
            for (int j =0; j<n; j++){
                board[i][j]= 'x';
            }

        }
        nQueenp(board,0);
    }
}

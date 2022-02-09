package recursion;

import java.util.Arrays;

public class NQueenProblem {
    public static void main(String[] args) {
        int n=8;
        boolean[][] board = new boolean[n][n];
        System.out.println(getSolution(board,0));
    }
    public static int getSolution(boolean[][] board,int row){
        if(row== board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        //first place the queen
        for (int i=0;i<board[0].length;i++){

            if(isSafe(board,row,i)){
                board[row][i]=true;
                count += getSolution(board,row+1);
                board[row][i]=false;
            }

        }
        return count;
    }
    public static void display(boolean[][] board){
        for (boolean[] row:board){
            for (boolean col: row){
                if(col){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    public static boolean isSafe(boolean[][] board,int row,int col){
        //vertical
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        //left diagonal
        int minStep = Math.min(row,col);
        for(int i=1;i<minStep;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //right diagonal
        minStep = Math.min(row,board[0].length-1-col);
        for(int i=0;i<minStep;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}

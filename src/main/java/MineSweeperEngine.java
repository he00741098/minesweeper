//import jakarta.validation.constraints.Min;

public class MineSweeperEngine {
//working minesweeper validation thing

//takes board and generates number system

    protected MineSweeperEngine() {
        //constructor

    }

    public static int[][] properBoard(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {

                if (board[i][k] != -1) {
                    board[i][k] = 0;
                    if (i != 0) {
                        if (board[i - 1][k] == -1) {
                            board[i][k]++;
                        }
                    }
                    //end of if

                    if (i != board.length - 1) {
                        if (board[i + 1][k] == -1) {
                            board[i][k]++;
                        }
                    }
                    //end of if
                    if (k != 0) {
                        if (board[i][k - 1] == -1) {
                            board[i][k]++;
                        }
                    }
                    //end of if k != 0
                    if (k != board[i].length - 1) {
                        if (board[i][k + 1] == -1) {
                            board[i][k]++;
                        }
                    }
                    //end of if statement
                    if (i != 0 && k != 0) {
                        if (board[i - 1][k - 1] == -1) {
                            board[i][k]++;
                        }
                    }
                    //end of if statements
                    if (i != 0 && k != board[i].length - 1) {
                        if (board[i - 1][k + 1] == -1) {
                            board[i][k]++;
                        }
                    }
                    //end of if
                    if (i != board.length - 1 && k != 0) {
                        if (board[i + 1][k - 1] == -1) {
                            board[i][k]++;
                        }
                    }
                    //end of if
                    if(i != board.length - 1 && k != board[i].length - 1) {
                        if (board[i + 1][k + 1] == -1) {
                            board[i][k]++;
                        }
                    }

                }
                //end of if statement check is mine
            }
            //end of for 2

        }
        //end of for 1
        return board;
    }



}

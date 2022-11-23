public class main {
    //ascii color codes
    private static final String black = "\u001b[30m";
    private static final String red = "\u001b[31m";
    private static final String green = "\u001b[32m";
    private static final String yellow = "\u001b[33m";
    private static final String blue = "\u001b[34m";
    private static final String magenta = "\u001b[35m";
    private static final String cyan = "\u001b[36m";
    private static final String white = "\u001b[37m";
    private static final String reset = "\u001b[0m";
    private static final String bold = "\u001b[1m";
    private static final String underline = "\u001b[4m";
    private static final String blink = "\u001b[5m";
    private static final String reverse = "\u001b[7m";
    private static final String hidden = "\u001b[8m";
    private static final String blackBackground = "\u001b[40m";
    private static final String redBackground = "\u001b[41m";
    private static final String greenBackground = "\u001b[42m";
    private static final String yellowBackground = "\u001b[43m";
    private static final String blueBackground = "\u001b[44m";
    private static final String magentaBackground = "\u001b[45m";
    private static final String cyanBackground = "\u001b[46m";
    private static final String whiteBackground = "\u001b[47m";
    private static final String resetBackground = "\u001b[49m";

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        BoardGenerator boardGenerator = new BoardGenerator(20, 20, 100);
        int[][] board = MineSweeperEngine.properBoard(boardGenerator.generateBoard());
        //print every element in the board

        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[i].length; k++) {
                if(board[i][k] == -1) {
                    System.out.print(red+blink+bold+"X "+reset);
                } else {
                if(board[i][k] == 0){
                    System.out.print(blue+"0 "+reset);
                    }else if(board[i][k]==1){
                    System.out.print(green+"1 "+reset);

                } else if(board[i][k]==2){
                    System.out.print(yellow+"2 "+reset);

                }else if(board[i][k]==3){
                    System.out.print(magenta+"3 "+reset);
                }else if(board[i][k]==4){
                    System.out.print(cyan+"4 "+reset);

                }else if(board[i][k]==5){
                    System.out.print(whiteBackground+red+"5"+reset+" ");

                }
                else if(board[i][k]==6){
                    System.out.print(white+bold+blueBackground+"6"+reset+" ");

                }
                else if(board[i][k]==7){
                    System.out.print(white+bold+greenBackground+"7"+reset+" ");

                }
                else if(board[i][k]==8){
                    System.out.print(white+bold+yellowBackground+"8"+reset+" ");

                }
                 else{
                        System.out.print(board[i][k] + " ");
                    }
                }
                //System.out.print(board[i][k] + " ");
            }
            System.out.println();
        }


//GUI gui = new GUI(board);
//gui.displayBoard();

    }
}

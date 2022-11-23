import java.util.concurrent.ThreadLocalRandom;

public class BoardGenerator {
    //properly generates a board
    private int[][] board;
    private int height;
    private int width;
    private int mines;

    public BoardGenerator(int height, int width, int mines) {
        //constructor
        this.height = height;
        this.width = width;
        this.mines = mines;
        this.board = new int[height][width];
    }

    public int[][] generateBoard() {
        //generates a board
        int[][] board = new int[height][width];
        int minesPlaced = 0;
        while (minesPlaced < mines) {
            int x = ThreadLocalRandom.current().nextInt(width);
            int y = ThreadLocalRandom.current().nextInt(height);
            if (board[y][x] != -1) {
                board[y][x] = -1;
                minesPlaced++;
            }
        }
        this.board = board;
        return board;
    }

    public int[][] getBoard() {
        //returns the board
        return this.board;
    }

}
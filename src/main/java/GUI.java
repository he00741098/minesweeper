import javax.swing.*;
public class GUI {
    //minesweeper gui displays board
    private JFrame frame;
    private JPanel panel;
    private JButton[][] buttons;
    private int[][] board;
    public GUI(int[][] board){

        this.board = board;

    }
    public void displayBoard(){
        frame = new JFrame("Minesweeper");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panel = new JPanel();
        frame.add(panel);
        buttons = new JButton[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int k = 0; k < board[i].length; k++){
                buttons[i][k] = new JButton();
                buttons[i][k].setText(Integer.toString(board[i][k]));
                panel.add(buttons[i][k]);
            }
        }
    }

}

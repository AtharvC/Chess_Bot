package ChessBoard;

import javax.swing.*;
import java.awt.*;

public class InitializeBoard {

    JFrame frame;
    JPanel squares[][] = new JPanel[8][8];

    public InitializeBoard() {
        frame = new JFrame("Simplified Chess");
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout(8, 8));

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JPanel();

                if ((i + j) % 2 == 0) {
                    squares[i][j].setBackground(Color.white);
                } else {
                    squares[i][j].setBackground(Color.black);
                }
                frame.add(squares[i][j]);
            }
        }
        squares[7][0].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/White/wrook.png")));
        squares[7][1].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/White/wknight.png")));
        squares[7][2].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/White/wbishop.png")));
        squares[7][3].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/White/wqueen.png")));
        squares[7][4].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/White/wking.png")));
        squares[7][5].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/White/wbishop.png")));
        squares[7][6].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/White/wknight.png")));
        squares[7][7].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/White/wrook.png")));

        squares[0][0].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/Black/brook.png")));
        squares[0][1].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/Black/bknight.png")));
        squares[0][2].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/Black/bbishop.png")));
        squares[0][3].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/Black/bqueen.png")));
        squares[0][4].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/Black/bking.png")));
        squares[0][5].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/Black/bbishop.png")));
        squares[0][6].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/Black/bknight.png")));
        squares[0][7].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/BLack/brook.png")));

        for (int i = 0; i < 8; i++) {
            squares[6][i].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/White/wpawn.png")));
            squares[1][i].add(new JLabel(new ImageIcon("C:/Users/athar/Downloads/Chess_Pieces/Black/bpawn.png")));
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new InitializeBoard();
    }
}
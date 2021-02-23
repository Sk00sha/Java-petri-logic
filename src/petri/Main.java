package petri;


import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    public static void main(String[] args) {
        JFrame f=new JFrame("Petri");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Drawing draw=new Drawing();
        f.add(draw);
        f.setSize(500,500);
        f.setVisible(true);

    }
}

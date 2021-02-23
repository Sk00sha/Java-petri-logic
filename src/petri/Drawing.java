package petri;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Drawing extends JPanel {

   public void paintComponent(Graphics g){
       super.paintComponent(g);
       this.setBackground(Color.WHITE);
       g.setColor(Color.BLUE);
       g.fillRect(50,25,100,100);
       g.fillRect(180,25,100,100);
   }
}

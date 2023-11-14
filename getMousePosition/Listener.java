import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Listener extends JFrame implements MouseMotionListener{

    JFrame frame = new JFrame();
    Container pane = frame.getContentPane();
  
    Listener(){
        pane.addMouseMotionListener(this);
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,450);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
   
    public void mouseDragged(MouseEvent e) {
        System.out.println("x: "+e.getX()+" y: "+e.getY());
    }
 
 
    public void mouseMoved(MouseEvent e) {
        System.out.println("x: "+e.getX()+" y: "+e.getY());
    }
}
 
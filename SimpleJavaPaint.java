/**
 * Created by Home on 12.01.2021.
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

public class SimpleJavaPaint extends JFrame {
    int x=-5;
    int y=-5;
    JButton colorChooser;
    JColorChooser jt;
    Color c;
    SimpleJavaPaint(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,900);
        setLocationRelativeTo(null);
        colorChooser=new JButton("Choose a color");
        colorChooser.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){c = JColorChooser.showDialog(null,"Select a color,",Color.BLACK);}
        });
        addMouseMotionListener(new MouseInputAdapter(){
            public void mouseDragged(MouseEvent e){
                x=e.getX();
                y=e.getY();
                repaint();

            }
        });
        add(colorChooser,BorderLayout.NORTH);
        setVisible(true);
    }

    public void paint(Graphics g){
        g.setColor(c);
        g.fillOval(x,y,4,4);


    }

    public static void main(String[] args) {
        new SimpleJavaPaint(){};
    }
}

package swingdemos;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseMotionDemo extends MouseAdapter
{

    int x, y;
    JLabel position;

    public MouseMotionDemo() 
    {
    	JFrame jf=new JFrame();
       
        position = new JLabel();

        jf.setLayout(new FlowLayout());

       jf. add(position);
        jf.addMouseMotionListener(this);
       jf. setSize(320, 300);
        jf.setVisible(true);

        /* Some code to be added */
    }

    public void mouseMoved(MouseEvent me) 
    {
        x = me.getX();
        y = me.getY();
        position.setText("Mouse cursor is at " + x + " " + y);
    }

   

    public static void main(String[] args) 
    {
        MouseMotionDemo obj = new MouseMotionDemo();
    }
}


package practicaFinal;

import practica3.figures.Cercle;
import practica3.figures.Figura;
import practica3.figures.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;


public class PanelDemo extends JPanel{

    public Figura figura  = new Rectangle();
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public void paint(Graphics g){
        super.paint(g);
        figura.visualitzar(g);
    }


    public static void main(String[] args) {

        final PanelDemo panelDemo = new PanelDemo();

        Runnable guiThread = (new Runnable() {
            public void run() {
                JFrame frame;

                //Create and set up the window.
                frame = new JFrame("FrameDemo");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setBounds(100, 100, 800, 600);
                frame.getContentPane().add(panelDemo);

                //Display the window.
                frame.setVisible(true);
            }
        });


        try {
            SwingUtilities.invokeAndWait(guiThread);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


       // panelDemo.setVisible(false);
       // panelDemo.repaint();

        panelDemo.figura = new Cercle();
        panelDemo.setVisible(true);
        panelDemo.repaint();

        System.out.print("Repaint");
    }
}
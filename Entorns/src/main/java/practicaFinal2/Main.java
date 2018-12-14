package practicaFinal2;

import practica3.figures.Cercle;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Xavi Torrens
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        final FiguraJPanel lienzo = new FiguraJPanel();

        Runnable guiThread = (new Runnable() {
            public void run() {
                JFrame frame;

                //Create and set up the window.
                frame = new JFrame("FrameDemo");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setBounds(100, 100, 800, 600);
                frame.getContentPane().add(lienzo);

                //Display the window.
                frame.setVisible(true);
            }
        });

        // Executam el fil que gestionara la GUI
        try {
            SwingUtilities.invokeAndWait(guiThread);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        Thread.sleep(5000);
        //LOGICA MENU

        lienzo.setFigura(new Cercle());
        lienzo.repaint();

    }
}

package practicaFinal2;

import practica3.figures.*;
import practica3.figures.Rectangle;

import javax.swing.*;
import java.awt.*;

/**
 * @author Xavi Torrens
 */
public class FiguraJPanel extends JPanel {

    private Figura figura = new Rectangle();

    public void paint(Graphics g){
        super.paint(g);
        figura.visualitzar(g);
    }

    public Figura getFigura(){
        return figura;
    }

    public void setFigura(Figura figura){
        this.figura = figura;
    }

}

package practica3.proves;

import java.awt.Color;

import practica3.figures.*;
import practica3.figures.Rectangle;

public class ProvaFigures {

  public static void main (String[] args) {
    Cercle c = new Cercle (1, "Cercle 1", Color.green, 42.42);
    Cercle c1 = new Cercle (1, "Cercle 1", Color.green, 42.42);
    Rectangle r = new Rectangle (2, "Rectangle 1", Color.green, 3,4);
    Triangle t = new Triangle (3, "Triangle 1", Color.yellow, 3,4);

    c.equals(c1);

    c.visualitzar();
    r.visualitzar();
    t.visualitzar();
  }
}

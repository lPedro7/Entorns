package practicaFinal2;

import java.awt.Color;

/**
 * @author Xavi Torrens
 */
public enum ColorType {

    White (Color.white),
    Black (Color.black);


    private Color color;

    ColorType(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}


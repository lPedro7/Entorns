package practicaFinal2;

import java.awt.*;

/**
 * @author Xavi Torrens
 */
public class ColorSelector {

    ColorType colorType;

    public Color selectColor(int index){
        return ColorType.values()[index - 1].getColor();
    }

    public void pintarMenuColors(){

        for (ColorType colorType : ColorType.values()){
            System.out.print(colorType.name());
        }
    }

}

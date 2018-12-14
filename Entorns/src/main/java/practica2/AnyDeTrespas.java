package practica2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xavi Torrens
 */
public class AnyDeTrespas extends Data {

    private List<String> list = new ArrayList<String>();

    public AnyDeTrespas(){
        List list;


    }

    public boolean isAnyDeTrespas(){
        return getAny()%2 == 0;
    }

    public int getAny(){
        return 0;
    }

}

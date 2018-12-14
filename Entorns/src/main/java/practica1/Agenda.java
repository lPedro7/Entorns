package practica1;

import java.util.List;

/**
 * @author Xavi Torrens
 */
public class Agenda {

    private int any;
    private List<Pagina> pagines;


    public List<Pagina> getPagines() {
        return pagines;
    }

    public void setPagines(List<Pagina> pagines) {
        this.pagines = pagines;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
}

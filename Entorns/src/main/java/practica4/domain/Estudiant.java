package practica4.domain;

/**
 * @author Xavi Torrens
 */
public class Estudiant extends Alumne {

      public void setDni(String dni){
        super.setDni(dni);

        if (dni == null) try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

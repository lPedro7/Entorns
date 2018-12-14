package practica2;

/**
 * @author Xavi Torrens
 */
public class C extends AnyDeTrespas {


    public String concatena (String a, String b, String c){
        StringBuilder str = new StringBuilder();
        str.append(a).append(b).append(c);
        return str.toString();
    }

    public String concatena (String a, String b){
        return concatena(a,b,"");
    }

    public String concatena (String a){
        return concatena (a,"");
    }
}

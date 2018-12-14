package practica2;

/**
 * @author Xavi Torrens
 */
public class Data {

    //#1
    public static final String SEPARADOR = "-";

    private int any;
    private int mes;
    private int dia;

    public Data(){

    }

    public Data(String data){

    }


    public String getData() {
        return dia + SEPARADOR + mes + SEPARADOR + any;
    }

    public void setData(String data) throws Exception {
        //#2
        if (!data.contains(SEPARADOR)) throw new Exception();

        int[] dates = descomposaData(data);

        this.any = dates[2];
        this.mes = dates[1];
        this.dia = dates[0];
    }

    public int getAny(){
        return this.any;
    }

    public int[] descomposaData(String data){

        String[] dataDescomposada = data.split(SEPARADOR);
        int[] dataDescomposadaInt = new int[dataDescomposada.length];
        dataDescomposadaInt[0] = Integer.parseInt(dataDescomposada[0]);
        dataDescomposadaInt[1] = Integer.parseInt(dataDescomposada[1]);
        dataDescomposadaInt[2] = Integer.parseInt(dataDescomposada[2]);

        return dataDescomposadaInt;

    }
}

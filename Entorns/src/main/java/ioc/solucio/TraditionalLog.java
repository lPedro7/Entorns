package ioc.solucio;

import java.util.List;

/**
 * @author Xavi Torrens
 */
public class TraditionalLog {

    public static void main(String[] args) {

        //Delegam les responsabilitats del log
        // en una entitat externa --> Log
        Log log = new LogConsole();
        log.setLogError(true);
        log.setLogInfo(true);
        log.setLogWarn(true);

        List<String> list = null;

        if (list == null) log.logWarn("LLista nula");

        try {
            log.logInfo("Anem a afegir un element.");
            list.add("Element");
        } catch (NullPointerException npe){
            log.logError(" excepcio:" + npe.getMessage());
        }

    }
}

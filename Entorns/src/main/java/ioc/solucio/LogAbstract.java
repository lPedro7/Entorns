package ioc.solucio;

/**
 * @author Xavi Torrens
 */
public abstract class LogAbstract implements Log {

    private boolean logError;
    private boolean logWarn;
    private boolean logInfo;

    protected final String INFO_PREFIX = "INFO ";
    protected final String WARN_PREFIX = "WARN ";
    protected final String ERROR_PREFIX = "WARN ";


    public boolean isLogError() {
        return logError;
    }

    public void setLogError(boolean logError) {
        this.logError = logError;
    }

    public boolean isLogWarn() {
        return logWarn;
    }

    public void setLogWarn(boolean logWarn) {
        this.logWarn = logWarn;
    }

    public boolean isLogInfo() {
        return logInfo;
    }

    public void setLogInfo(boolean logInfo) {
        this.logInfo = logInfo;
    }

}

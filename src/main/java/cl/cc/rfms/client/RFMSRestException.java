package cl.cc.rfms.client;

/**
 *
 * @author CyberCastle
 */
public class RFMSRestException extends Exception {

    private static final long serialVersionUID = 6824756672833189895L;

    private final String exceptionCode;
    private Throwable origalException;

    public RFMSRestException(String message, String exceptionCode) {
        super(message);
        this.exceptionCode = exceptionCode;
    }

    public RFMSRestException(String message, String exceptionCode, Throwable e) {
        super(message, e);
        this.exceptionCode = exceptionCode;
        this.origalException = e;
    }

    public String getExceptionCode() {
        return this.exceptionCode;
    }

    public Throwable getOrigalException() {
        return origalException;
    }

}

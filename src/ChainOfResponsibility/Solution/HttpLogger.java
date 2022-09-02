package ChainOfResponsibility.Solution;

public class HttpLogger extends Handler{
    public HttpLogger(Handler next) {
        super(next);
    }

    @Override
    boolean doHandle() {
        System.out.println("Logger logged the Http-Request.");
        return true;
    }
}

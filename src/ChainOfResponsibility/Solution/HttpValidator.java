package ChainOfResponsibility.Solution;

public class HttpValidator extends Handler {
    public HttpValidator(Handler next) {
        super(next);
    }

    @Override
    boolean doHandle() {
        System.out.println("HttpValidator validated the Http-Request.");
        return true;
    }
}

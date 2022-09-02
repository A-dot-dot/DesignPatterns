package ChainOfResponsibility.Solution;

public class HttpEncryptor extends Handler{
    public HttpEncryptor(Handler next) {
        super(next);
    }

    @Override
    boolean doHandle() {
        System.out.println("HttpEncryptor encrypted the Http-Request.");
        return true;
    }
}

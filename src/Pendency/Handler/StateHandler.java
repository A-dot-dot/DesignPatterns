package Pendency;

public class StateHandler extends Handler{
    public StateHandler(Handler next) {
        super(next);
    }

    @Override
    boolean doHandle() {
        return true;
    }
}

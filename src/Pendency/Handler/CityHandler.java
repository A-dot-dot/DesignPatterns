package Pendency;

public class CityHandler extends Handler{
    public CityHandler(Handler next) {
        super(next);
    }

    @Override
    boolean doHandle() {
        return true;
    }
}

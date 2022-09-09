package Pendency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InstrumentHandler extends Handler {
    Map<Integer, Instrument> map;

    public InstrumentHandler(Handler next) {
        super(next);
        map = new HashMap();
        counter = 1;
    }

    public void startTracking(Integer id, ArrayList<String> )

    @Override
    boolean doHandle() {
        return true;
    }
}
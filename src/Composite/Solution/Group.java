package Composite.Problem;

import java.util.ArrayList;
import java.util.List;

public class Group {
    List<Object> objects;

    Group() {
        objects = new ArrayList<>();
    }

    void add(Object object) {
        objects.add(object);
    }

    void render() {
        System.out.println("Rendering a group.");
        for(var o : objects) {
            if(o instanceof Shape) {
                ((Shape) o).render();
            } else {
                ((Group) o).render();
            }
        }
    }
}

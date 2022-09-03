package Iterator;

public class ContainerIterator extends Container{
    int i = 0;

    boolean hasNext() {
        return i < size;
    }

    int next() {
        int ele = getElement(i);
        i++;
        return ele;
    }

    void reset() {
        i = 0;
    }
}

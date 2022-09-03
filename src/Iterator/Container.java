package Iterator;

public class Container {
    private int[] data;
    protected int size;

    Container() {
        size = 10;
        data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = i * 100;
        }
    }

    int getSize() {
        return size;
    }

    int getElement(int index) {
        return data[index];
    }

    /*Iterator getIterator() {
        return new Iterator();
    }

    class Iterator {
        int i = 0;
        boolean hasNext() {
            return i != size;
        }

        int next() {
            return data[i++];
        }

        void reset() {
            i = 0;
        }
    }*/
}

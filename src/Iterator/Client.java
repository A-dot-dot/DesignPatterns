package Iterator;

public class Client {
    public static void main(String[] args) {
        //Container container = new Container();
        //Container.Iterator iterator = container.getIterator();
        ContainerIterator iterator = new ContainerIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator.reset();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

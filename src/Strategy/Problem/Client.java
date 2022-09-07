package Strategy;

public class Client {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage(Filter.BLACKANDWHITE, Compressor.PNG);
        imageStorage.storeImage();
    }
}

package Strategy;

public class ImageStorage {
    private Filter filter;
    private Compressor compressor;

    public ImageStorage(Filter filter, Compressor compressor) {
        this.filter = filter;
        this.compressor = compressor;
    }

    private void processImage() {
        // filter
        if(filter == Filter.BLACKANDWHITE) {
            new BlackAndWhiteFilter().filter();
        } else if(filter == Filter.HIGHCONTRAST) {
            new HighContrastFilter().filter();
        }

        // and compress before storing.
        if(compressor == Compressor.JPEG) {
            new JPEGCompressor().compress();
        } else if(compressor == Compressor.PNG) {
            new PNGCompressor().compress();
        }
    }

    private void saveToDB() {
        System.out.println("Image saved to DB.");
    }

    void storeImage() {
        processImage();

        // store
        saveToDB();
    }
}

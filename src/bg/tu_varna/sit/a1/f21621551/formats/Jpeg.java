package bg.tu_varna.sit.a1.f21621551.formats;

import bg.tu_varna.sit.a1.f21621551.FileNames;

public class Jpeg extends ImageFormat{

    private String filename;

    public Jpeg() {
        this.filename = FileNames.JPEG.getFileName();
    }

    @Override
    public String getFilename() {
        return this.filename;
    }

}
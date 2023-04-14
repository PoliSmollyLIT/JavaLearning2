package bg.tu_varna.sit.a1.f21621551.formats;

import bg.tu_varna.sit.a1.f21621551.FileNames;

public class Bmp extends ImageFormat{
    private String filename;

    public Bmp() {
        this.filename = FileNames.BMP.getFileName();
    }

    @Override
    public String getFilename() {
        return this.filename;
    }    
}
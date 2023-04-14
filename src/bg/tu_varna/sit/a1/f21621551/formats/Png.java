package bg.tu_varna.sit.a1.f21621551.formats;

import bg.tu_varna.sit.a1.f21621551.FileNames;

public class Png extends ImageFormat{
    private String filename;


    
    public Png() {
        this.filename = FileNames.PNG.getFileName();
    }

    @Override
    public String getFilename() {
        return this.filename;
    }
}
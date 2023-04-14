package bg.tu_varna.sit.a1.f21621551;

public enum FileNames {
    JPEG ("src\\bg\\tu_varna\\sit\\a1\\f21621551\\txtFiles\\image.jpeg.txt"),
    PNG ("src\\bg\\tu_varna\\sit\\a1\\f21621551\\txtFiles\\image.png.txt"),
    BMP ("src\\bg\\tu_varna\\sit\\a1\\f21621551\\txtFiles\\image.bmp.txt");
    
    private String filename;
    private FileNames(String filename){
        this.filename = filename;
    }

    public String getFileName(){
        return this.filename;
    }
}
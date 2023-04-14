package bg.tu_varna.sit.a1.f21621551.adapters;

import bg.tu_varna.sit.a1.f21621551.formats.ImageFormat;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FormatObjectAdapter implements FormatsAdapter{

    private ImageFormat image;
    private String processedImage;

    public FormatObjectAdapter(ImageFormat image) {
        this.image = image;
    }

    @Override
    public void manipulate(String filename) {
        processedImage = " processed";
        writeImage(filename);
    }

    @Override
    public void readImage(String filename) {
      StringBuilder fileContent = new StringBuilder();
        try {
            int c;
            FileReader fileReader = new FileReader(filename);
            while ((c = fileReader.read()) != -1) {
                char ch = (char) c;
                fileContent.append(ch);
            }
            fileReader.close();
            System.out.println(fileContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void writeImage(String filename) {
        try {
            FileWriter fileWriter = new FileWriter(filename, true);
            fileWriter.append(processedImage);
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ImageFormat getImage() {
        return image;
    }
    
}
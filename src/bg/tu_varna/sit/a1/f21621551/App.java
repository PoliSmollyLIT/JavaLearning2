package bg.tu_varna.sit.a1.f21621551;

import bg.tu_varna.sit.a1.f21621551.adapters.FormatObjectAdapter;
//import bg.tu_varna.sit.a1.f21621551.adapters.BmpFormatClassAdapter;
//import bg.tu_varna.sit.a1.f21621551.adapters.JpegFormatClassAdapter;
//import bg.tu_varna.sit.a1.f21621551.adapters.PngFormatClassAdapter;
import bg.tu_varna.sit.a1.f21621551.formats.Bmp;
import bg.tu_varna.sit.a1.f21621551.formats.Jpeg;
import bg.tu_varna.sit.a1.f21621551.formats.Png;

public class App {
    public static void main(String[] args) throws Exception {
        /*Използвайте Adapter pattern, за да разработете система за използване на различни видове софтуер 
        за обработка на изображения.

        Системата трябва да поддържа различни формати на изображения, като JPEG, PNG и BMP. 
        Всяка библиотека за обработка на изображения има свои специфични методи за работа с изображенията.
        - JPEG - readJpeg(String filename), manipulateJpeg(), writeJpeg(String filename)
        - PNG - readPng(String filename), manipulatePng(), writePng(String filename)
        - BMP - readBmp(String filename), manipulateBmp(), writeBmp(String filename)

        Симулирайте, работата с изображението, като ползвате текстови файлове с имена и съдържание:
        - JPEG - име на файла - image.jpeg.txt - съдържание - jpeg image
        - PNG- име на файла - image.png.txt - съдържание - png image
        - BMP - име на файла - image.bmp.txt - съдържание - bmp image

        Метода manipulate добавя към съдържанието на файла текста processed.

        Напишете така, че системата да използва методите на всеки клас за обработка на изображенията, 
        без да е нужно да се променят методите на системата при добавяне на нови типове файлове. */

        /*JpegFormatClassAdapter jpegAdapter = new JpegFormatClassAdapter();
        jpegAdapter.readImage(new Jpeg().getFilename());
        jpegAdapter.manipulate(new Jpeg().getFilename());
        jpegAdapter.readImage(new Jpeg().getFilename());

        PngFormatClassAdapter pngAdapter = new PngFormatClassAdapter();
        pngAdapter.readImage(new Png().getFilename());
        pngAdapter.manipulate(new Png().getFilename());
        pngAdapter.readImage(new Png().getFilename());

        BmpFormatClassAdapter bmpAdapter = new BmpFormatClassAdapter();
        bmpAdapter.readImage(new Bmp().getFilename());
        bmpAdapter.manipulate(new Bmp().getFilename());
        bmpAdapter.readImage(new Bmp().getFilename());*/

        FormatObjectAdapter objectAdapterPng = new FormatObjectAdapter(new Png());
        objectAdapterPng.readImage(objectAdapterPng.getImage().getFilename());
        objectAdapterPng.manipulate(objectAdapterPng.getImage().getFilename());
        objectAdapterPng.readImage(objectAdapterPng.getImage().getFilename());

        FormatObjectAdapter objectAdapterBmp = new FormatObjectAdapter(new Bmp());
        objectAdapterBmp.readImage(objectAdapterBmp.getImage().getFilename());
        objectAdapterBmp.manipulate(objectAdapterBmp.getImage().getFilename());
        objectAdapterBmp.readImage(objectAdapterBmp.getImage().getFilename());

        FormatObjectAdapter objectAdapterJpeg = new FormatObjectAdapter(new Jpeg());
        objectAdapterJpeg.readImage(objectAdapterJpeg.getImage().getFilename());
        objectAdapterJpeg.manipulate(objectAdapterJpeg.getImage().getFilename());
        objectAdapterJpeg.readImage(objectAdapterJpeg.getImage().getFilename());

    }
}

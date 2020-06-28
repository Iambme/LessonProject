package homework.io.ex3;

public class MyReaderWriterService {

    public static void startRead(MyReader reader, String filepath){
        reader.read(filepath);
    }

    public static void startWrite(MyWriter writer, String filepath){
        writer.write(filepath);
    }
}

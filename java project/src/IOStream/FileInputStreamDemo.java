package IOStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException{
        File file = new File("IOStream/test.txt");
        System.out.println(file);
    }
}



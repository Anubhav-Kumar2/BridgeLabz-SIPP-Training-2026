import java.io.FileReader;

public class FileExample{
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("abc.txt");
        } catch ( java.io.FileNotFoundException e) {
            System.out.println(e.get message());
        }
    }
}   
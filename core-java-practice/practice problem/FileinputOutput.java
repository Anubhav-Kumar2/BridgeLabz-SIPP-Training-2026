import java.io.FileWriter;

public class FileinputOutput {
    public static void main(String[] args) {
        try (FileWriter file = new FileWriter("C:\\collage_work\\BridgeLabz-SIPP-Training-2026-Push\\core-java-practice\\practice problem\\Demo.txt")) {
            file.write("hii my name is aditya");
            System.out.println("File edited successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
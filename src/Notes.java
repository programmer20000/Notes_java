import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notes {
    private Scanner scanner1 = new Scanner(System.in);
    private Scanner scanner2 = new Scanner(System.in);

    private String NameFile = scanner1.nextLine();
    private String MessageForNotes = scanner2.nextLine();

    public void CreteNotes() {
        File Directory = new File("Notes");
        if (!Directory.exists()) {
            Directory.mkdir();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Notes/" + NameFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

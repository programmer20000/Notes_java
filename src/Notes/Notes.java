package Notes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notes {
    private Scanner ScannerNameFile, ScannerTextNotes;
    private String NameFile, TextNotes;
    private BufferedWriter writer;
    private File Directory;

    public Notes() {
        this.ScannerNameFile = new Scanner(System.in);
        this.ScannerTextNotes = new Scanner(System.in);
        System.out.println("Please Enter Name File:");
        this.NameFile = this.ScannerNameFile.nextLine();
        System.out.println("Please Enter Text Note:");
        this.TextNotes = this.ScannerTextNotes.nextLine();
        this.CreateNotes();
    }



    private void CreateDirectory(String DirectoryName) {
        this.Directory = new File(DirectoryName);
        if (!this.Directory.exists()) {
            this.Directory.mkdir();
        }
    }

    public void CreateNotes() {
        this.CreateDirectory("Notes");
        try {
            this.writer = new BufferedWriter(new FileWriter("Notes/"+ this.NameFile));
            this.writer.write(this.TextNotes);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.exists;

public class Main {

    public static void main(String[] args) throws IOException {

        String vocabDirectory = "vocab";
        String vocabFilename = "household.txt";

        Path dataDirectory = Paths.get(vocabDirectory);
        Path dataFile = Paths.get(vocabDirectory,vocabFilename);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }
        if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        List<String> household = Arrays.asList("la secadora","la lavadora","el sillon");
        Path filepath = Paths.get("vocab","household.txt");
        Files.write(filepath,household);
        System.out.println(household);




//        PresentTense obj = new PresentTense("hablar");
////
//        System.out.println("enter a regular present tense verb");
//        Scanner sc = new Scanner(System.in);
//        String newVerb = sc.nextLine();
//
//
//        PresentTense hablar = new PresentTense();
//        System.out.println(hablar.presentRegularAr("hablar"));
//        System.out.println(hablar.getRootVerb());
//        String yoNewVerb = newVerb.presentRegularAr()
//        System.out.println(newVerb);




    }
}

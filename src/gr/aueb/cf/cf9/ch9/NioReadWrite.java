package gr.aueb.cf.cf9.ch9;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Demo of java.nio.file package
 */
public class NioReadWrite {

    public static void main(String[] args) {
        Path source = Path.of("C:/Users/sifis/ideaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file.txt");
        Path target = Path.of("C:/Users/sifis/ideaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/target.txt");
        try {
            binaryReadWrite(source, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void textWriter(Path path) throws IOException {
        Files.createDirectories(path.getParent());
        Files.writeString(
                path,
                "Hello Coding",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }

    public static void textReader(Path path) throws IOException {
        Files.readString(       // Functional Programming
                path,
                StandardCharsets.UTF_8
        );
    }

    public static void binaryReadWrite(Path source, Path target) throws IOException {

        try (var sourceStream = Files.newInputStream(source);
        var targetString = Files.newOutputStream(target);){
            sourceStream.transferTo(targetString);     //efficient, streaming se chuncks
        } catch (IOException e) {
                e.printStackTrace();
        throw e;
        }
    }
}

package installation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyLogger {

    public static void note(List<StringBuilder> msg) {
        try (FileWriter writer = new FileWriter("Games//temp//temp.txt", false)) {
            for (StringBuilder s : msg) writer.append(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

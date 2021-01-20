package pl.coderslab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LoadingData {

    public static String[][] loadingData(String tasksFile) {

        Path path = Paths.get(tasksFile);
        String[][] tab = null;

        try {
            List<String> lines = Files.readAllLines(path);
            tab = new String[lines.size()][lines.get(0).split(",").length];

            for (int i = 0; i < lines.size(); i++) {
                String[] splitted = lines.get(i).split(",");
                for (int j = 0; j < splitted.length; j++) {
                    tab[i][j] = splitted[j];
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return tab;
    }
}

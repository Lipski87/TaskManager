package pl.coderslab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static pl.coderslab.TaskManager.tasks;

public class SavingToFile {
    public static void savingToFile(String tasksFile, String[][] tab) {

        Path path = Paths.get(tasksFile);

        String[] taskLine = new String[tasks.length];
        for (int i = 0; i < tab.length; i++) {
            taskLine[i] = String.join(",", tab[i]);

            try {
                Files.write(path, Arrays.asList(taskLine));
            } catch (IOException ex) {
                System.out.println("Nie można zapisać pliku");
            }
        }
    }
}

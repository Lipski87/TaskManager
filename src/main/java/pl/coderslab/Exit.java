package pl.coderslab;

import static pl.coderslab.SavingToFile.savingToFile;
import static pl.coderslab.TaskManager.tasks;
import static pl.coderslab.TaskManager.tasksFile;


public class Exit {
    public static void exit () {
        savingToFile(tasksFile, tasks);
        System.out.println(ConsoleColors.RED + "Bye, bye");
        System.exit(0);
    }
}

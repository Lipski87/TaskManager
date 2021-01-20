package pl.coderslab;

import static pl.coderslab.LoadingData.loadingData;

import static pl.coderslab.SetOptions.setOptions;

public class TaskManager {

    static final String tasksFile = "tasks.csv";
    static final String[] options = {"add", "remove", "list", "exit"};
    static String[][] tasks = loadingData(tasksFile);

    public static void main(String[] args) {
        System.out.println(ConsoleColors.WHITE_BRIGHT + "----------------");
        System.out.println(ConsoleColors.RED + "Task Manager 2.0" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.WHITE_BRIGHT + "----------------");
        System.out.println();
        setOptions();
    }
}
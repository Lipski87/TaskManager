package pl.coderslab;

import java.util.Scanner;

import static pl.coderslab.AddTask.addTask;
import static pl.coderslab.Continue.continueApp;
import static pl.coderslab.Exit.exit;
import static pl.coderslab.PrintOptions.printOptions;
import static pl.coderslab.PrintTab.printTab;
import static pl.coderslab.Remove.remove;
import static pl.coderslab.TaskManager.options;
import static pl.coderslab.TaskManager.tasks;

public class SetOptions {

    public static void setOptions() {

        Scanner scan = new Scanner(System.in);
        printOptions(options);

        while (scan.hasNextLine()) {
            String input = scan.nextLine();

            System.out.println();

            switch (input) {
                case "add" -> {
                    addTask();
                    printTab(tasks);
                    System.out.println();
                    continueApp();
                }
                case "list" -> {
                    printTab(tasks);
                    System.out.println();
                    continueApp();
                }
                case "remove" -> {
                    remove();
                    System.out.println();
                    continueApp();
                }
                case "exit" -> {
                    exit();
                }
                default -> {
                    System.out.println("Please select correct option (one from the below)");
                    setOptions();
                }
            }
        }
    }
}

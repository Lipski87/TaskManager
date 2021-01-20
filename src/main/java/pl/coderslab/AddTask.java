package pl.coderslab;

import java.util.Arrays;
import java.util.Scanner;

import static pl.coderslab.TaskManager.tasks;

public class AddTask {

    public static void addTask() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please add a task description:");
        String description = scan.nextLine();

        System.out.println("Please add a task due date (yyyy-mm-dd):");
        String dueDate = scan.nextLine();

        System.out.println("Is your task is important? Please put: true or false");
        String importance = scan.nextLine();

        tasks = Arrays.copyOf(tasks, tasks.length + 1);
        tasks[tasks.length - 1] = new String[3];
        tasks[tasks.length - 1][0] = description;
        tasks[tasks.length - 1][1] = dueDate;
        tasks[tasks.length - 1][2] = importance;

    }
}

package pl.coderslab;

import org.apache.commons.lang3.ArrayUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

import static pl.coderslab.Continue.continueApp;
import static pl.coderslab.PrintTab.printTab;
import static pl.coderslab.TaskManager.tasks;

public class Remove {
    public static void remove() {

        printTab(tasks);
        System.out.println();
        System.out.println("Please select a row to remove");

        try {

            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNextLine()) {
                int input = scanner.nextInt();
                tasks = ArrayUtils.remove(tasks, input - 1);
                System.out.println("Row was successfully removed");
                printTab(tasks);
                continueApp();
            }

        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("It's not a number. Please put a number");
            System.out.println();
            remove();
        } catch (IndexOutOfBoundsException exception) {
            System.out.println();
            System.out.println("There is no row as this one");
            System.out.println();
            remove();
        }
    }
}

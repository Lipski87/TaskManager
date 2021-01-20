package pl.coderslab;

public class PrintOptions {

    public static void printOptions(String[] args) {

        System.out.println(ConsoleColors.CYAN + "Choose task option:" + ConsoleColors.RESET);
        System.out.println();

        for (String option : TaskManager.options) {
            System.out.println(option);
        }

        System.out.println(ConsoleColors.BLUE + "Please write down one of the options:" + ConsoleColors.RESET);
    }
}

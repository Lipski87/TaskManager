package pl.coderslab;

import java.util.Scanner;

import static pl.coderslab.Exit.exit;
import static pl.coderslab.SetOptions.setOptions;

public class Continue {

    public static void continueApp() {

        System.out.println("Do you want to continue? Press 'enter' if yes, type 'exit' to finish work.");

        Scanner scanner = new Scanner(System.in);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("")) {
                    setOptions();
                } else if (line.equals("exit")) {
                    exit();
                } else {
                    continueApp();
                }
            }
        }
    }

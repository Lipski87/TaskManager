package pl.coderslab;

public class PrintTab {

    public static String[][] printTab(String[][] tab) {

        for (int i = 0; i < tab.length; i++) {
            System.out.print(i + 1 + " -> ");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " / ");
            }
            System.out.println();
        }
        return tab;
    }
}

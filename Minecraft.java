package lesson11;

import java.util.Scanner;

public class Minecraft{
    static void main(String[] args) {
        String[][] workbench = new String[3][3];
        Scanner input = new Scanner(System.in);

        String elementTry;

        int wheat = 20;
        int wood = 20;
        int tree = 20;
        int gold  =9;

        for(int i =0; i<workbench.length; i++ ) {
            for (int y = 0; y < workbench[i].length; y++) {
                while (true) {
                    System.out.println("You have only: 20 wood, 20 tree, 20 wheat, 9 gold");
                    System.out.println("Also you can skip!");
                    System.out.print("workbench[" + i + "][" + y + "]=");
                    elementTry = input.next();
                    if (elementTry.equalsIgnoreCase("wood") ||
                            elementTry.equalsIgnoreCase("tree") ||
                            elementTry.equalsIgnoreCase("wheat") ||
                            elementTry.equalsIgnoreCase("gold")) {
                        workbench[i][y] = elementTry;
                        break;
                    } else if (elementTry.equalsIgnoreCase("skip") || elementTry.equalsIgnoreCase(" ")) {
                        workbench[i][y] = "";
                        break;
                    } else {
                        System.out.println("There is no " + elementTry);
                    }
                }

            }
        }

    }
}
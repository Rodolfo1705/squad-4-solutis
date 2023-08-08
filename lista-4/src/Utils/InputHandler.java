package Utils;

import java.util.Scanner;

public class InputHandler {
    public static int getIntInput(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        int input = scanner.nextInt();

        return input;
    }

    public static double getDoubleInput(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        double input = scanner.nextDouble();

        return input;
    }

    public static String getStringInput(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        String input = scanner.nextLine();

        return input;
    }
}

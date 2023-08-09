package Utils;

import java.math.BigDecimal;
import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);
  
    public static int getIntInput(String text){
        System.out.print(text);
        int input = scanner.nextInt();

        return input;
    }

    public static String getStringInput(String text){
        System.out.print(text);
        String input = scanner.nextLine();

        return input;
    }

    public static boolean getBooleanInput(String text){
        System.out.print(text);
        boolean input = scanner.nextBoolean();
      
        return input;
    }

    public static double getDoubleInput(String text){
        System.out.print(text);
        double input = scanner.nextDouble();

        return input;
    }
}

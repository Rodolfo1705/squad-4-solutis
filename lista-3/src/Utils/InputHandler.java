package Utils;

import java.util.Scanner;

public class InputHandler {
    public static int getIntInput(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        int input = scanner.nextInt();

        return input;
    }
}

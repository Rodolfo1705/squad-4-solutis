import java.util.Scanner;

public class QueenMonkGame {
    public static void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja realizar o método com ou sem array? 1 (Com); 2 (Sem): ");
        int selectedOption = scanner.nextInt();

        if(selectedOption == 1){
            printQuantityOfGrainsArray();
            return;
        }

        printQuantityOfGrainsWithoutArray();
    }

    private static void printQuantityOfGrainsArray(){
        long[][] matriz = new long[8][8];
        long totalGraos = 1;
        long somaGraos = 0;
        int overflowInt = 0;
        long overflowLong = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++) {

                if (totalGraos > Integer.MAX_VALUE && overflowInt == 0) {
                    overflowInt = i * 8 + j + 1;
                }
                if (totalGraos < 0) {
                    overflowLong = i * 8 + j + 1;
                    break;
                }

                somaGraos += totalGraos;
                totalGraos *= 2;
            }
        }

        System.out.println("Casa final onde os grãos são calculados: " + (overflowLong - 1));
        System.out.println("Total de grãos calculados: " + somaGraos);
        System.out.println("Overflow int: " + overflowInt);
        System.out.println("Overflow long: " + overflowLong);
    }

    private static void printQuantityOfGrainsWithoutArray(){
        long grainsCounter = 0;
        long homesValueCounter = 1;

        for(int i = 1; i <= 63; i++){
            grainsCounter += homesValueCounter;
            homesValueCounter *= 2;
        }

        System.out.println(grainsCounter);
    }
}

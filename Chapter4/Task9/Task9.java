import java.util.InputMismatchException;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        int fibonachiCount = 0;
        System.out.print("Please enter fibonachi count: ");
        Scanner input = new Scanner(System.in);
        try {
            fibonachiCount = input.nextInt();
        } catch (InputMismatchException inputMismatchEx) {
            System.out.println("Incorrect number");
            return;
        }
        fibonachiPrint(fibonachiCount);
    }

    private static void fibonachiPrint(int fibonachiCount) {
        long fibonachiNext = 1;
        long fibonachiPrev = 0;
        if (fibonachiCount > 2 && fibonachiCount < 93) {
            System.out.print(fibonachiNext);
            for (int i = 1; i < fibonachiCount; i++) {
                long fibonachiSum = fibonachiPrev + fibonachiNext;
                System.out.print(", " + fibonachiSum);
                fibonachiPrev = fibonachiNext;
                fibonachiNext = fibonachiSum;
            }
            System.out.println();
        } else {
            System.out.println("Fibonachi count should be more than 2 and less than 93.");
        }
    }
}
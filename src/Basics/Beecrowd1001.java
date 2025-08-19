package Basics;
import java.util.Scanner;

public class Beecrowd1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        int B;
        int X;
        A = scanner.nextInt();
        B = scanner.nextInt();
        X = A + B;
        System.out.println("X = "+X);
        scanner.close();
    }
}
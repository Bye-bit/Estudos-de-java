package ControlStructures.Condicionals;
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if(num1 > num2) {
            if(num1 > num3) {
                System.out.println(num1);
            } else {
                if(num3 > num2) {
                    System.out.println(num3);
                }
            }
        } else {
            if(num2 > num3) {
                System.out.println(num2);
            } else {
                System.out.println(num3);
            }
        }
        scanner.close();
    }   
}

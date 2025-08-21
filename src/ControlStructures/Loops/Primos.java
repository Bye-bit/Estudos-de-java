package ControlStructures.Loops;
import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean primo = true;
        for(int i = 2; i < num ; ++i) {
            if(num % i == 0) {
                primo = false;
                break;
            }
        }
        if(primo == true) {
            System.out.println("eh primo descolado");
        } else {
            System.out.println("não é primo descolado");
        }
        scanner.close();
    }
}
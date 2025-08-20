package ControlStructures.Loops;
import java.util.Scanner;


public class Fatorial {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int fatorial = 1;
        for(int i = numero; i > 1 ; i--) {
            fatorial *= i;
             
        }
        scanner.close();
        System.out.println(fatorial);
    }
}

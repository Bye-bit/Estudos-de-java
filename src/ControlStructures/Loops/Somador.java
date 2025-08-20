package ControlStructures.Loops;
import java.util.Scanner;


public class Somador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int soma = 0;
        do {
            soma += numero;
            numero = scanner.nextInt();
        } while(numero != 0);
        System.out.println(soma);
        scanner.close();
    }
    
}

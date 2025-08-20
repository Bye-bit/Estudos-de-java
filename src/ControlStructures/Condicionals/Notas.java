package ControlStructures.Condicionals;
import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        float nota1;
        float nota2;
        Scanner scanner = new Scanner(System.in);
        nota1 = scanner.nextFloat();
        nota2 = scanner.nextFloat();
        float media = (nota1+nota2) / 2;
        if(media < 7) {
            System.out.println("Reprovou!");
        } else if(media == 7) {
            System.out.println("Passou por com 7!");
        } else {
            System.out.println("Passou!");
        }
        scanner.close();
    }
}
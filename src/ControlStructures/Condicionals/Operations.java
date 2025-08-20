package ControlStructures.Condicionals;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite O primeiro numero para realizar operações:");
        int num1 = scanner.nextInt();
        System.out.println("Digite O segundo numero para realizar operações");
        int num2 = scanner.nextInt();
        System.out.println("Digite qual operação você quer fazer |1-soma|2-subtração|3-multiplicação|4-divisão|");
        option = scanner.nextInt();
        switch(option) {
            case 1:
            System.out.println(num1+num2);
            break;

            case 2:
            System.out.println(num1-num2);
            break;

            case 3:
            System.out.println(num1*num2);
            break;
            
            case 4:
            System.out.println(num1/num2);
            break;

            default: System.out.println("escolha uma opção válida");

            scanner.close();
        }
    }
}

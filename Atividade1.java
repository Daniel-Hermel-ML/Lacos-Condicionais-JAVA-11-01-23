package laco.repeticao;
import java.util.*;

public class Atividade1 {
    /*
    Faça um algoritmo em Java que leia 3 valores
    int A, B e C e imprima na tela se a soma de
    A + B é maior, menor ou igual a C.
    */
    public static void main(String[] args) {
        int num1, num2, num3, soma;

        Scanner ler = new Scanner(System.in);

        System.out.print("--Digite o primeiro número: ");
        num1 = ler.nextInt();
        System.out.print("--Digite o segundo número: ");
        num2 = ler.nextInt();
        System.out.print("--Digite o terceiro número: ");
        num3 = ler.nextInt();

        soma = num1 + num2;

        if (soma > num3){
            System.out.println("A soma de "+num1+" + "+num2+" é " +
                    "Maior do que "+num3+".");
        } else
        if (soma < num3){
            System.out.println("A soma de "+num1+" + "+num2+" é " +
                    "Menor do que "+num3+".");
        }else if(soma == num3){
            System.out.println("A soma de "+num1+" + "+num2+" é " +
                    "Igual a "+num3);
        }
    }
}

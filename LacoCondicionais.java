package laco.repeticao;

import java.util.Scanner;

public class LacoCondicionais {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int idade;
        boolean cnh;

        System.out.print("Qual é dua idade? ");
        idade = ler.nextInt();

        System.out.print("Você tem CNH? ");
        cnh = ler.nextBoolean();

        if (idade >= 18 && cnh == true){
            System.out.println("Você pode dirigir.");
        }else if(idade >= 18 && cnh == false){
            System.out.println("Você não tem habilitação para " +
                    "dirigir.");
        }
        else {
            System.out.println("Você não tem idade para dirigir..");
        }
    }
}

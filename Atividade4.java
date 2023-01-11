package laco.repeticao;
import java.util.*;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.print("--Informe a sua idade: ");
        idade = ler.nextInt();

        if (idade >= 16 && idade > 18){
            System.out.println("Apta a votar e o voto é facultativo.");
        } else if (idade >= 19 && idade < 65 ){
            System.out.println("A pessoa está apta a votar e o voto é " +
                    "obrigatório.");
        } else if (idade >= 66){
            System.out.println("A pessoa está apta a votar e o voto é " +
                    "facultativo.");
        } else if (idade <= 15){
            System.out.println("A pessoa está apta a votar e o voto é " +
                    "facultativo.");
        }


    }
}

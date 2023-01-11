package laco.repeticao;
import java.util.*;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, resul;

        System.out.print("--Digite um número: ");
        num1 = ler.nextInt();


        if (num1 > 0){
            if (num1 % 2 == 0 && num1 > 0){
                System.out.println("O número "+num1+" é par e positivo!");
            } else {
                System.out.println("O número "+num1+" é impar e positivo!");
            }
        }else{
            if (num1 % 2 == 0 && num1 > 0){
                System.out.println("O número "+num1+" é par e negativo!");
            } else {
                System.out.println("O número "+num1+" é impar e negativo!");
            }
        }
    }
}

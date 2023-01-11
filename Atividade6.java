package laco.repeticao;
import java.util.*;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int coluna, tipo, alim, resul;

        System.out.println("--Informe");
        System.out.println(
                "--Para animais Vertebrados 1: \n" +
                "--Para animais Invertebrados 2");
        System.out.print("--Digite: ");
        coluna = ler.nextInt();

        System.out.println("--Informe");
                System.out.println(
                        "--Para Aves 1: \n" +
                        "--Para Mamíferos 2");
        System.out.print("--Digite: ");
        tipo = ler.nextInt();

        System.out.println("--Informe");
        System.out.println(
                "--Para Carnívoro 1: \n" +
                "--Para Herbívoro 2");
        System.out.print("--Digite: ");
        alim = ler.nextInt();

        if (coluna == 1 && tipo == 1 && alim == 1){
            System.out.println("É Águia");
        } else if (coluna == 1 && tipo == 1 && alim == 2){
            System.out.println("É Pomba");
        } else if (coluna == 1 && tipo == 1 && alim == 1){
            System.out.println("É Águia");
        } else if (coluna == 1 && tipo == 2 && alim == 1){
            System.out.println("É Homem");
        } else if (coluna == 1 && tipo == 2 && alim == 2){
            System.out.println("É Vaca");
        } else if (coluna == 2 && tipo == 1 && alim == 1){
            System.out.println("É Pulga");
        } else if (coluna == 2 && tipo == 1 && alim == 2){
            System.out.println("É Lagarta");
        } else if (coluna == 2 && tipo == 1 && alim == 1){
            System.out.println("É Sanguessuga");
        } else if (coluna == 2 && tipo == 2 && alim == 2){
            System.out.println("É Minhoca");
        }
    }
}

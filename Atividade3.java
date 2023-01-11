package laco.repeticao;
import java.util.*;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, total;
        int quant;

        System.out.println("#############################");
        System.out.println("--- Escolha o seu lanche ---");
        System.out.print("" +
                "--Digite 1 para Cachorro Quente - valor R$ 10,00: \n"+
                "--Digite 2 para X-Salada - valor R$ 15,00: \n"+
                "--Digite 3 para X-Bacon - valor R$ 18,00: \n"+
                "--Digite 4 para Bauru - valor R$ 12,00: \n"+
                "--Digite 5 para Refrigerante - valor R$ 8,00: \n"+
                "--Digite 6 para Suco de laranja - valor R$ 13,00: \n");
        System.out.print("--Digite: ");
        num = ler.nextInt();
        System.out.print("--Informe a quantidade: ");
        quant = ler.nextInt();


        switch (num){
            case 1:
                total = 10 * quant;
                System.out.println("Código do Produto escolhido 1");
                System.out.println("Quantidade solicitada "+quant);
                System.out.println("Produto: Cachorro Quente");
                System.out.println("Valor total: R$ "+total+".00");
                break;
            case 2:
                total = 15 * quant;
                System.out.println("Código do Produto escolhido 2");
                System.out.println("Quantidade solicitada "+quant);
                System.out.println("Produto: X-Salada");
                System.out.println("Valor total: R$ "+total+".00");
                break;
            case 3:
                total = 10 * quant;
                System.out.println("Código do Produto escolhido 3");
                System.out.println("Quantidade solicitada "+quant);
                System.out.println("Produto: X-Bacon");
                System.out.println("Valor total: R$ "+total+".00");
                break;
            case 4:
                total = 12 * quant;
                System.out.println("Código do Produto escolhido 4");
                System.out.println("Quantidade solicitada "+quant);
                System.out.println("Produto: Bauru");
                System.out.println("Valor total: R$ "+total+".00");
                break;
            case 5:
                total = 8 * quant;
                System.out.println("Código do Produto escolhido 5");
                System.out.println("Quantidade solicitada "+quant);
                System.out.println("Produto: Refrigerante");
                System.out.println("Valor total: R$ "+total+".00");
                break;
            case 6:
                total = 13 * quant;
                System.out.println("Código do Produto escolhido 6");
                System.out.println("Quantidade solicitada "+quant);
                System.out.println("Produto: Suco de laranja");
                System.out.println("Valor total: R$ "+total+".00");
                break;
            default:
                System.out.println("--Opção selecionada inválida");
        }
    }
}

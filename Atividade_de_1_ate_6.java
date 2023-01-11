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
//////////////////////////////////////////////////////////////////////
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
/////////////////////////////////////////////////////////////////////////////
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
//////////////////////////////////////////////////////////////////////////
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
////////////////////////////////////////////////////////////////////////////
package laco.repeticao;
        import java.util.*;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double sal, imp, salnovo;

        System.out.print("--Informe o valor do salário: ");
        sal = ler.nextDouble();

        if (sal <= 2000){
            imp = 0.0;
        } else if (sal <= 3000.0){
            imp = 8.8;
        } else if (sal <= 4500.0){
            imp = 18.0;
        } else {
            imp = 28.0;
        }
        imp = (imp / 100) * sal;
        System.out.printf("Imposto de Renda: R$ %.2f",imp);
    }
}
////////////////////////////////////////////////////////////////////
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
////////////////////////////////////////////////////////////////////////
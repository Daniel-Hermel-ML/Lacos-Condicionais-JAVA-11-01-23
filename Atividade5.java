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

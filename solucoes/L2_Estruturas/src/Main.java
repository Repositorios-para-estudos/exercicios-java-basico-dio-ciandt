import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solução dos execício da lista 2");

        tabuada(scanner);
        imc(scanner);
        num_inicial(scanner);
    }

    public static void tabuada(Scanner scn){
        System.out.println("Entre com um número para a tabuada:");
        int num_tab = scn.nextInt();

        for(var i = 1; i <= 10; i++) System.out.printf("%d * %d = %d\n", num_tab, i, (num_tab * i));
    }

    public static void imc(Scanner scn){
        System.out.println("Entre com a sua altura:");
        float altura = scn.nextFloat();
        System.out.println("Entre com a seu peso:");
        float peso = scn.nextFloat();

        float imc_calc = peso / (altura * altura);

        if (imc_calc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if(imc_calc <= 24.9){
            System.out.println("Peso ideal");
        } else if(imc_calc <= 29.9){
            System.out.println("Levemente acima do peso");
        } else if(imc_calc <= 34.9){
            System.out.println("Obesidade Grau I");
        } else if(imc_calc <= 39.9){
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }
    }

    public static void num_inicial(Scanner scn){
        System.out.println("Entre com um número:");
        float ini_num = scn.nextFloat();
        float num;
        do {
            num = scn.nextFloat();
            if(num < ini_num) continue;

        } while (num % ini_num != 0);

        System.out.printf("o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão é %.1f",num);
    }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Solução dos execício da lista 1");
        quadrado();
        retangulo();
        diferenca();
    }

    public static void quadrado(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        float lado = scanner.nextFloat();

        var area = lado * lado;
        System.out.printf("A área do quadrado é %.2f \n", area);
    }

    public static void retangulo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho base do retângulo: ");
        float base = scanner.nextFloat();
        System.out.println("Digite o tamanho da altura do retângulo: ");
        float altura = scanner.nextFloat();

        var area = base * altura;
        System.out.printf("A área do retângulo é %.2f \n", area);
    }

    public static void diferenca(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String nome_p1 = scanner.next();
        System.out.println("Digite a idade da primeira pessoa: ");
        int id_p1 = scanner.nextInt();

        System.out.println("Digite o nome da segunda pessoa: ");
        String nome_p2 = scanner.next();
        System.out.println("Digite a idade da segunda pessoa: ");
        int id_p2 = scanner.nextInt();

        int diferenca;
        if (id_p1 >= id_p2){
            diferenca = id_p1 - id_p2;
        } else {
            diferenca = id_p2 - id_p1;
        }

        System.out.printf("A diferença de idade entre %s e %s é de %d", nome_p1, nome_p2, diferenca);
    }
}
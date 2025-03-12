package application;

import entities.circulo;
import entities.quadrado;
import entities.retangulo;
import entities.triangulo;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        circulo x = new circulo(); //
        quadrado y = new quadrado(); //
        retangulo y2 = new retangulo(); //
        triangulo z = new triangulo(); //
        double pi = 3.14;
        int b = 0;
        int c = 0;
        int d = 0;
        while (b ==0){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite qual area deseja encontrar:");
            System.out.println("1 - Circulo");
            System.out.println("2 - Quadrado");
            System.out.println("3 - Retangulo");
            System.out.println("4 - Triagulo");
            System.out.println("5 - Encerrar Programa");
            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println("Voce escolheu a area do circulo.");
                while (c == 0){
                    System.out.println("O valor que voce vai ma passar corresponde ao raio, diametro ou do comprimento do circulo? ");
                    System.out.println("1 - Raio");
                    System.out.println("2 - Diametro");
                    System.out.println("3 - Comprimento do circulo");
                    a = scanner.nextInt();
                    if (a ==1) {
                        System.out.println("Voce escolheu o valor do raio.");
                        System.out.println("Digite o Valor do Raio:");
                        x.raio = scanner.nextDouble();
                        double areadoCirculo = pi * (x.raio * x.raio);
                        System.out.printf("O valor da area e %.2f\n", areadoCirculo);
                    } else if (a == 2){
                        System.out.println("Voce escolheu o valor do diametro");
                        System.out.println("Digite o Valor do Diametro:");
                        x.diametro = scanner.nextDouble();
                        x.raio= x.diametro/2;
                        double areadoCirculo = pi * (x.raio * x.raio);
                        System.out.printf("O valor da area e %.2f\n", areadoCirculo);
                    } else if (a == 3) {
                        System.out.println("Voce escolheu o comprimento do circulo.");
                        System.out.println("Digite o Valor do comprimento do circulo?:");
                        x.comprimetoDoCirculo = scanner.nextDouble();
                        x.raio = (x.comprimetoDoCirculo*pi)/(2*pi);
                        double areadoCirculo = pi * (x.raio * x.raio);
                        System.out.printf("O valor da area e %.2f\n", areadoCirculo);
                    } else {
                        System.out.println("Digite um valor valido!");
                    }
                    System.out.println("Deseja realizar outro calculo calculo da area do circulo?");
                    System.out.println("1 - Sim.");
                    System.out.println("2 - Nao.");
                    a = scanner.nextInt();
                    if (a == 2) {
                        c = 1;
                    }
                }
            } else if (a == 2) {
                c = 0;
                System.out.println("Voce escolheu a area do quadrado.");

                while (c == 0) {
                    System.out.println("Qual valor voce tem em maos? O lado do quadrado, o valor do perimetro ou a diagonal?");
                    System.out.println("1 - Lado.");
                    System.out.println("2 - Perimetro.");
                    System.out.println("3 - Diagonal.");
                    a = scanner.nextInt();
                    if (a == 1) {
                        System.out.println("Voce escolheu o lado do quadrado.");
                        System.out.println("Digite o valor do lado do quadrado:");
                        y.lado = scanner.nextDouble();
                        double areaDoQuadrado = y.lado * y.lado;
                        System.out.printf("O valor da area e %.2f\n", areaDoQuadrado);
                    } else if (a == 2) {
                        System.out.println("Voce escolheu o valor do perimetro.");
                        System.out.println("Digite o valor do perimetro");
                        y.perimetro = scanner.nextDouble();
                        y.lado = y.perimetro / 4;
                        double areaDoQuadrado = y.lado * y.lado;
                        System.out.printf("O valor da area e %.2f\n", areaDoQuadrado);
                    } else if (a == 3) {
                        System.out.println("Voce escolheu o valor da diagonal.");
                        System.out.println("Digite o valor da diagonal:");
                        y.diagonal = scanner.nextDouble();
                        y.lado = y.diagonal * (Math.sqrt(2) / Math.sqrt(2));
                        double areaDoQuadrado = y.lado * y.lado;
                        System.out.printf("O valor da area e %.2f\n", areaDoQuadrado);
                    } else {
                        System.out.println("Escolha um dos valores citados");
                    }
                    System.out.println("Deseja realizar outro calculo calculo da area do quadrado?");
                    System.out.println("1 - Sim.");
                    System.out.println("2 - Nao.");
                    a = scanner.nextInt();
                    if (a == 2) {
                        c = 1;
                    }
                }
            } else if (a == 3) {
                System.out.println("Voce escolheu a area do retangulo.");
                System.out.println("Digite o valor do base do retangulo:");
                y2.base = scanner.nextDouble();
                System.out.println("Digite o valor da altura do retangulo:");
                y2.altura = scanner.nextDouble();
                double areaRetangulo = y2.base * y2.altura;
                System.out.printf("O valor da area e %.2f\n", areaRetangulo);
            } else if (a == 4) {
                while (c == 0) {
                    System.out.println("Voce escolheu a area do triangulo.");
                    System.out.println("Qual e o seu triangulo?");
                    System.out.println("1 - Triângulo Retângulo");
                    System.out.println("2 - Triângulo Equilátero");
                    System.out.println("3 - Triângulo Isósceles");
                    System.out.println("4 - Triângulo Escaleno");
                    a = scanner.nextInt();
                    double areaTriangulo;
                    if (a == 1) { //Triangulo Retangulo
                        System.out.println("Digite o valor do base do triangulo:");
                        z.base = scanner.nextDouble();
                        System.out.println("Digite o valor da altura do triangulo:");
                        z.altura = scanner.nextDouble();
                        areaTriangulo = (z.base * z.altura) / 2;
                        System.out.printf("A Area do triangulo retetangulo e %.2f\n", areaTriangulo);
                    } else if (a == 2) { //Triangulo Equilaro
                        z.base = scanner.nextDouble();
                        areaTriangulo = ((z.base * z.base) * Math.sqrt(3)) / 4;
                        System.out.printf("A Area do triangulo equilatero e %.2f\n", areaTriangulo);
                    } else if (a == 3) { //Triangulo Isoseles
                        System.out.println("Digite o valor do base do triangulo:");
                        z.base = scanner.nextDouble();
                        System.out.println("Digite o valor da altura do triangulo:");
                        z.altura = scanner.nextDouble();
                        areaTriangulo = (z.base * z.altura) / 2;
                        System.out.printf("A Area do triangulo isoseles e %.2f\n", areaTriangulo);
                    } else if (a == 4) { //Triangulo Escaleno
                        System.out.println("Digite o valor do base do triangulo:");
                        z.base = scanner.nextDouble();
                        System.out.println("Digite o valor da altura do triangulo:");
                        z.altura = scanner.nextDouble();
                        areaTriangulo = (z.base * z.altura) / 2;
                        System.out.printf("A Area do triangulo escaleno e %.2f\n", areaTriangulo);
                    } else {
                        System.out.println("Escolha uma opcao valida!");
                    }
                    System.out.println("Deseja encontrar a area de outro triangulo?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Nao");
                    a = scanner.nextInt();
                    if (a == 2){
                        d = d+1;
                    }
                }
            } else if (a == 5) {
                b = b+1;
                System.out.println("Encerrando programa...");
            } else {
                System.out.println("Escolha uma opcao valida!");
            }
            System.out.println("Deseja encontrar a area de outra forma geometrica?");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            a = scanner.nextInt();
            if (a == 2){
                b = b+1;
                System.out.println("Encerrando programa...");
            }
        }
    }
}
/* Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Para o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        boolean resultado = false;
        String zero = "0";

        while (resultado == false) {
            System.out.println("Nome: ");
            nome = scan.next();

            System.out.println("Idade: ");
            idade = scan.nextInt();

            if (nome.equals("0")) {
                resultado = true;
            }
        }
        System.out.println("continue aqui...");
    }
}

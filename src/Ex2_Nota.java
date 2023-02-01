/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        float nota;
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, insira a nota: ");
        nota = scan.nextFloat();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota invalida! Tente novamente: ");
            nota = scan.nextFloat();
        }
        System.out.println("Nota registrada!");

    }
}

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
       int qtdnumeros, controle = 0, numero;
       int numerosPares = 0, numerosImpares = 0;
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Quer adicinar quantos números? ");
            qtdnumeros = scan.nextInt();

            do {
                System.out.println("Informe um número: ");
                numero = scan.nextInt();

                if (numero % 2 == 0) numerosPares++;
                    else numerosImpares++;

                controle++;

            } while (controle < qtdnumeros);

            System.out.println("Os numeros pares são: " + numerosPares);
            System.out.println("Os numeros impares são: " + numerosImpares);

        }
    }
}

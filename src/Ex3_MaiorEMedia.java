/* Faça um programa que leia 5 numeros
e informe o maior número
e a média desses numeros
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int []numeros = new int[5];
        int controle = 0;
        int controle2 = 1;
        int maiorNum = 0;
        int somaNum = 0;
        int mediaNum;

        do{
            System.out.println("Informe o número " + controle2 + ": ");
            numeros[controle] = scan.nextInt();
                if (numeros[controle] > maiorNum) maiorNum = numeros[controle];
            somaNum = somaNum + numeros[controle];
            controle++;
            controle2++;
          }while (controle < 5);

        mediaNum = somaNum/5;

        System.out.println("O maior numero é: " + maiorNum);
        System.out.println("A média dos numeros é: " + mediaNum);
                                  
    }
}

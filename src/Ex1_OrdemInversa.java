/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int []vetor = {1,2,3,4,5,6};
        int contador = 0;

        System.out.print("Vetor: ");
        while (contador < (vetor.length)) {
            System.out.print(vetor[contador]);
            contador++;
        }

        System.out.print("\nVator Inverso: ");
        for (int i = (vetor.length -1); i>=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}

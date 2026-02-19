package exercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Vetor {
    private int n;
    private int[] vetor;

    public Vetor(int n) {
        this.n = n;
        this.vetor = new int[n];

        Random gerador = new Random();

        for (int i = 0; i < n; i++) this.vetor[i] = gerador.nextInt(100);
    }

    public void imprime() {
        System.out.println(Arrays.toString(this.vetor));
    }

    public void selectionSort() { // O(n^2)
        for (int i = 0; i < this.n; i++)
            for (int j = i + 1; j < this.n; j++) {
                if (this.vetor[j] < this.vetor[i]) {
                    int temp = this.vetor[i];
                    this.vetor[i] = this.vetor[j];
                    this.vetor[j] = temp;
                }
            }

    }
}

public class Main {
    static public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Vetor vetor = new Vetor(n);

        vetor.imprime();
        vetor.selectionSort();
        vetor.imprime();
    }
}

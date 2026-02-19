package exercicios;

import java.util.Random;
import java.util.Scanner;

class Matriz {
    private int n;
    private int m;
    private int[][] matriz;

    public Matriz(int n, int m) {
        this.n = n;
        this.m = m;
        this.matriz = new int[n][m];

        Random gerador = new Random();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                this.matriz[i][j] = gerador.nextInt(20);
    }

    public void imprime() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < m; j++) System.out.print(this.matriz[i][j] + " ");
            System.out.println();
        }
    }

    public void transposta() {
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < n; j++) System.out.print(this.matriz[j][i] + " ");
            System.out.println();
        }
    }
}

public class Main {
    static public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        Matriz matriz = new Matriz(n, m);

        matriz.imprime();
        matriz.transposta();
    }
}

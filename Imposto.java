package exercicios;

import java.util.Scanner;

class Imposto {
    private double salario;

    public Imposto(double salario) {
        this.salario = salario;
    }

    public double calcular() {
        double total = this.salario;
        double imposto = 0;

        total -= 2000; // ATE 2000.00 - ISENTO

        if (total > 0) { // 2000.01 ATE 3000.00 - 8%
            imposto += (total > 1000 ? 1000 : total) * 0.08;
            total -= 1000;
        }

        if (total > 0) { // 3000.01 ATE 4500.00 - 18%
            imposto += (total > 1500 ? 1500 : total) * 0.18;
            total -= 1500;
        }

        if (total > 0) { // ACIMA DE 4500.00 - 28%
            imposto += total * 0.28;
        }

        return imposto;
    }
}

public class Main {
    static public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double salario = in.nextDouble();

        Imposto imposto = new Imposto(salario);
        double valorImposto = imposto.calcular();

        System.out.println(valorImposto == 0 ? "ISENTO" : "R$ " + valorImposto);
    }
}

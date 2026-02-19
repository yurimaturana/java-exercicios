package exercicios;

import java.util.Scanner;

class Triangulo {
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void identificar() {
        double squareA = Math.pow(this.a, 2);
        double squareB = Math.pow(this.b, 2);
        double squareC = Math.pow(this.c, 2);

        if (this.a >= this.b + this.c) System.out.println("NAO FORMA TRIANGULO");
        else {
            if (squareA == squareB + squareC || squareB == squareA + squareC || squareC == squareA + squareB)
                System.out.println("TRIANGULO RETANGULO");
            else if (squareA > squareB + squareC || squareB > squareA + squareC || squareC > squareA + squareB)
                System.out.println("TRIANGULO OBTUSANGULO");
            else System.out.println("TRIANGULO ACUTANGULO");

            if (this.a == this.b && this.b == this.c) System.out.println("TRIANGULO EQUILATERO");
            else if (this.a == this.b || this.a == this.c || this.b == this.c)
                System.out.println("TRIANGULO ISOSCELES");
            else System.out.println("TRIANGULO ESCALENO");
        }
    }
}

public class Main {
    static public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        Triangulo triangulo = new Triangulo(a, b, c);

        triangulo.identificar();
    }
}
package exercicios;

import java.util.Scanner;

class Triangulo {
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void identificar() {
        double squareA = Math.pow(this.a, 2);
        double squareB = Math.pow(this.b, 2);
        double squareC = Math.pow(this.c, 2);

        if (this.a >= this.b + this.c) System.out.println("NAO FORMA TRIANGULO");
        else {
            if (squareA == squareB + squareC || squareB == squareA + squareC || squareC == squareA + squareB)
                System.out.println("TRIANGULO RETANGULO");
            else if (squareA > squareB + squareC || squareB > squareA + squareC || squareC > squareA + squareB)
                System.out.println("TRIANGULO OBTUSANGULO");
            else System.out.println("TRIANGULO ACUTANGULO");

            if (this.a == this.b && this.b == this.c) System.out.println("TRIANGULO EQUILATERO");
            else if (this.a == this.b || this.a == this.c || this.b == this.c)
                System.out.println("TRIANGULO ISOSCELES");
            else System.out.println("TRIANGULO ESCALENO");
        }
    }
}

public class Main {
    static public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        Triangulo triangulo = new Triangulo(a, b, c);

        triangulo.identificar();
    }
}

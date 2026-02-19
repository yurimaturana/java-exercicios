package exercicios;

import java.util.Scanner;

class Triangulo {
    private float a, b, c;

    public Triangulo(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void identificar() {
        float sqrtA = this.a * this.a;
        float sqrtB = this.b * this.b;
        float sqrtC = this.c * this.c;

        if (this.a >= this.b + this.c) System.out.println("NAO FORMA TRIANGULO");
        else {
            if (sqrtA == sqrtB + sqrtC) System.out.println("TRIANGULO RETANGULO");
            else if (sqrtA > sqrtB + sqrtC) System.out.println("TRIANGULO OBTUSANGULO");
            else if (sqrtA < sqrtB + sqrtC) System.out.println("TRIANGULO ACUTANGULO");

            if (this.a == this.b && this.b == this.c) System.out.println("TRIANGULO EQUILATERO");
            else if (this.a == this.b || this.a == this.c || this.b == this.c)
                System.out.println("TRIANGULO ISOSCELES");
        }
    }
}

public class Main {
    static public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();

        Triangulo triangulo = new Triangulo(a, b, c);

        triangulo.identificar();
    }
}

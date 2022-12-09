package main;
import Test.java.QuadraticException;

import java.util.Scanner;

public class Quadarat {
    private double discriminant;
    private double x1;
    private double x2;
    Scanner scanner = new Scanner(System.in);

    public double variableA = scanner.nextDouble();
    public double variableB = scanner.nextDouble();
    public double variableC = scanner.nextDouble();

    private void countDiscriminant() {
        discriminant = Math.pow(variableB, 2) - 4 * variableA * variableC;

    }

    public void equationRoots() {
        countDiscriminant();
        if (discriminant > 0) {
            x1 = variableB + Math.sqrt(discriminant) / 2 * variableA;
            x2 = variableA - Math.sqrt(discriminant) / 2 * variableA;
            System.out.println(x1);
            System.out.println(x2);
        } else if (discriminant == 0) {
            x1 = -variableB / 2 * variableA;
            System.out.println(x1);
        } else {
            throw new QuadraticException("Действительных корней нет");
        }

    }
}

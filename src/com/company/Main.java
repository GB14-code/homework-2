package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
        System.out.println("Input greutatea in kilograme: ");
        double weight = s1.nextDouble();
        System.out.println("\nInput inaltimea in metri: ");
        double height = s1.nextDouble();
        double BMI = weight /  (height * height);
        System.out.println("\nIndicele de masa corporala (BMI) este " + BMI + "kg/m2");

    }
}

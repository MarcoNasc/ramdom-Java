package com.company;
import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int num1 = keybord.nextInt();
        System.out.println("Insira o segundo número: ");
        int num2 = keybord.nextInt();

        if (num1 == num2) {
            System.out.println("Iguais.");
        } else if (num1 > num2) {
            System.out.println("Primeiro número é maior");
        } else {
            System.out.println("Segundo número é maior");
        }
    }
}

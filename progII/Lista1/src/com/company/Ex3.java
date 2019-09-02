package com.company;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        System.out.println("Insira o número a ser analisado: ");
        int num = keybord.nextInt();
        if (num < 0) {
            System.out.println("Número negativo.");
        } else if (num == 0) {
            System.out.println("Nulo.");
        } else {
            System.out.println("Número positivo.");
            if (num % 2 == 0) {
                System.out.print("E par.");
            } else {
                System.out.println("E ímpar.");
            }
        }
    }
}
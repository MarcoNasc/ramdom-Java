package com.company;
import java.util.Scanner;

public class Ex4 {
    public static void main(String []args) {
        Scanner keybord = new Scanner(System.in);
        System.out.println("Insira o número: ");
        int num = keybord.nextInt();
        int fat = 1;
        for (int i = num; i >= 1; i--) {
            fat = fat*i;
        }
        String str = String.format("O fatorial de %d é igual a %d", num, fat);
        System.out.print(str);
    }
}

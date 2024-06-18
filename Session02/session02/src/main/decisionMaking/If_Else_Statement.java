package main.decisionMaking;

import java.util.Scanner;

public class If_Else_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int number = Integer.parseInt(sc.nextLine());
        if (number % 2 == 0) {
            System.out.printf("%d là số chẵn\n", number);
        } else {
            System.out.printf("%d là số lẻ\n", number);
        }
    }
}

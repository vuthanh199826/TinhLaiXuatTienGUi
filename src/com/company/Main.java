package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tien gui");
        double money = sc.nextDouble();
        System.out.println("nhap so thang");
        int month = sc.nextInt();
        System.out.println("nhap lai xuat");
        double interest = sc.nextDouble();
        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (interest / 100) / 12 * month;
        }
        System.out.println("total = " + total);
    }
}

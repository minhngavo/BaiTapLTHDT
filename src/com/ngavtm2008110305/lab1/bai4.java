package com.ngavtm2008110305.lab1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao cac he so cua phuong trinh bac 2: ");
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4*a*c;
        double canDelta = Math.sqrt(delta);
        System.out.printf("Can bac hai cua delta la: %.2f", canDelta);




    }
}

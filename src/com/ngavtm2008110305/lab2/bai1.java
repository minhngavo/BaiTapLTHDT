package com.ngavtm2008110305.lab2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap vao so b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap phương trinh bac nhat: ax + b = 0");
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh co vo so nghem");
            }
            else{
                System.out.println("Phuong trinh co vo nghiem");
            }
        }
            else{
                double x = -b/a;
                System.out.printf("Phuong trinh co nghiem x = %.2f", x);
            }
            
    }
}

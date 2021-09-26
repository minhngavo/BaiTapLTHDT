package com.ngavtm2008110305.lab2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Nhap a (a # 0): ");
     double a = scanner.nextDouble();
     System.out.print("Nhap b: ");
     double b =scanner.nextDouble();
     System.out.print("Nhap c: ");
     double c = scanner.nextDouble();
     System.out.println("Nhap phuong trinh bac hai co dang: " + a + "x^2 + " + b + "x + " + c + " = 0");
     if (a == 0){
         if (b == 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else {
            System.out.println("Phuong trinh co 1 nghiem la: " + "x = " + (-c/b));

         }
     }
     else{ 

        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (delta == 0){
            System.out.println("Phuong trinh co nghiem kep la: " + "x = " + (-c/b));

        }
        else{
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("phuong trinh co 2 nghiem x1 = " + x1 + " va x2 = " + x2);

        }
    }
}
}
    


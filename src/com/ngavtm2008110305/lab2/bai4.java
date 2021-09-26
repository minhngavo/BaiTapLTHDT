package com.ngavtm2008110305.lab2;

import java.util.Scanner;

public class bai4 {
    private static int giaTriNhap;
    public static void main(String[] args) {
        int giaTriNhap;
        do{
            System.out.println("\n++++++++MENU+++++++");
            System.out.println("1. Giai phuong trinh bac 1");
            System.out.println("2. Giai phuong trinh bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc");
            System.out.println("++++++++++END+++++++++");

            System.out.print("Hay chon 1 chuc nang: ");
            Scanner bienNhap = new Scanner(System.in);
            giaTriNhap = bienNhap.nextInt();
           switch (giaTriNhap)
           {
            case 1:
                System.out.println("+++Giai phuong trinh bac 1+++");
                System.out.print("Nhap so a: ");
                double a = bienNhap.nextDouble();
                System.out.print("Nhap so b: ");
                double b = bienNhap.nextDouble();
                giaiPTBacMot(a, b); break;
            case 2:
                System.out.println("+++Giai phuong trinh bac 2+++");
                System.out.print("Nhap so a: ");
                double k = bienNhap.nextDouble();
                System.out.print("Nhap so b: ");
                double m = bienNhap.nextDouble();
                System.out.print("Nhap so c: ");
                double c = bienNhap.nextDouble();
                giaiPTBacHai(k, m, c); break;
            case 3:
                System.out.println("+++Tinh tien dien+++");
                System.out.print("Nhap so dien: ");
                double soDien = bienNhap.nextDouble();
                tinhTienDien(soDien); break;
            case 4:
                System.out.println("ket thuc");
                default: System.out.println("khong hop le chon lai tu dau");
            }
        }

         while (giaTriNhap !=4);
    }
    static void giaiPTBacMot(double a, double b){
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
    static void giaiPTBacHai(double a, double b, double c){
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
        static void tinhTienDien(double soDien){
            if(soDien <=50){
                double tienDien = soDien * 1000;
                System.out.print("So tien can tra: " + tienDien);
                System.out.println(" đồng");
            }
                else if(soDien >50){
                    double soTienQuaMuc = 50*1000 + (soDien - 50)*1200;
                System.out.print("So tien can tra: " + soTienQuaMuc);
                System.out.println(" đồng");   
    
            }
        } 
          
}


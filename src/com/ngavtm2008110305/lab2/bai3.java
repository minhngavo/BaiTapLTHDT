package com.ngavtm2008110305.lab2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so dien: ");
        double soDien = scanner.nextDouble();
        

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

package com.ngavtm2008110305.lab1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double chieuRong = scanner.nextDouble();
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double chieuDai = scanner.nextDouble();
        double chuViHinhChuNhat = (chieuRong + chieuDai)*2;
        System.out.printf("\n2Chu vi hinh chu nhat la: %.2f", chuViHinhChuNhat);
        double dienTichHinhChuNhat = chieuRong*chieuDai;
        System.out.printf("\nDien tich hinh chu nhatla: %.2f", dienTichHinhChuNhat);
        double canhNho = Math.min(chieuRong, chieuDai);
        System.out.println("\nCanh nho hinh chu nhat la: " + canhNho);
    }
}




    
    


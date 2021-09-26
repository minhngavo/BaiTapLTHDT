package com.ngavtm2008110305.lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        String hoten = scanner.nextLine();
        System.out.println("Nhap diem Trung Binh");
        double diemTrungBinh = scanner.nextDouble();
        System.out.printf("%s %.2f diem", hoten, diemTrungBinh);
    }
}


    

    


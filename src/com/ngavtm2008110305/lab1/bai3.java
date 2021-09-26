package com.ngavtm2008110305.lab1;

import java.util.Scanner;

public class bai3 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap cac canh khoi hinh lap phuong: ");
    double canh = scanner.nextDouble();
    double ketQua;
    ketQua = Math.pow(canh, 3);
    System.out.printf("The tich khoi hinh lap phuong la: %.2f", ketQua);
}
}

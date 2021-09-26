package com.ngavtm2008110305.lab3;

import java.util.Scanner;

public class bai1 {
    


    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Nhap vao 1 so nguyen to bat ky: ");
    
    int n = scanner.nextInt();
    bai1 snt = new bai1();
    if (snt.kiemtranguyento(n)) {
        System.out.printf("So: "+n + " la so nguyen to");
    } else {
        System.out.printf("So: "+n + " khong phai la so nguyen to");
    }
}
// hàm bool trả về true/false
public boolean kiemtranguyento(int n) {
    
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
}

/*
* created date: Oct 11, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.lab3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {

        int n,min,tong=0;

        int[] a;

        Scanner scanner = new Scanner(System.in);

        a = new int[1000];

        System.out.print("Nhap so luong phan tu: ");

        n = scanner.nextInt();

        for (int i=0; i<n; i++) {

            System.out.printf("a[%d] = ",i);

            a[i] = scanner.nextInt();

        }

        System.out.println("Nhap mang hoan tat");

        System.out.println("====================");

        for (int i=0;i<n-1;i++) {

            for (int j=i + 1; j<n; j++)

            if (a[i]> a[j]) {

                int temp = a[i];

                a[i] = a[j];

                a[j] = temp;

            }

        }

        min = a[0];

        for (int i=0;i<n;i++) {

            for (int j=i+1;j<n;j++)

                if (a[i]<min)

                min=a[i];

        }

            for (int i = 0;i<n;i++) {

                if (a[i]%3==0)

                tong+=a[i];

            }

            for (int i = 0;i<n;i++) {

            System.out.println("a[" + i + "] = " + a[i]);

            System.out.println("Xuat mang hoan tat");

            System.out.println("======================");

            System.out.println("Gia tri nho nhat trong mang: \nMin = " + min);

            System.out.println("Tong cac so chia het cho 3: \nTong = " + tong);

            }

        }
}

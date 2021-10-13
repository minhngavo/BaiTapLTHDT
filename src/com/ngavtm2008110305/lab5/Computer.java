/*
* created date: Oct 13, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.lab5;

public class Computer {

     //attribute - thuộc tính

     String nhaSX;
     double namSX;
     String heDH; 
     int ram;
     String cpu;
     double gia;
     double namBH;
 
     //methood - function
     //hàm tạo mặc định
 
     Computer(){
 
         nhaSX = "Lenovo"; 
         namSX = 2020; 
         heDH = "Windows 10";
         ram = 8; 
         cpu = "Intel Core i5"; 
         gia = 15;
         namBH = 2021;
 
     }
 
     //hàm tọa 1 tham số
 
     Computer(double n){
 
         nhaSX = "Asus";
         namSX = n;
         heDH = "Windows 10";
         ram = 8;
         cpu = "Intel Core i5"; 
         gia = 15;
         namBH = 2020;
 
     }
 
     //hàm tạo 2 tham số
 
     Computer(int a, double b){
 
         nhaSX = "Dell";
         namSX = 2019;
         heDH = "Windows 10";
         ram = a;
         cpu = "Intel Core i7";
         gia = b;
         namBH = namSX;
 
     }
 
     void inThongTin(){
 
         System.out.println("Nhà sản xuất: "+nhaSX);
         System.out.println("Năm sản xuất: "+namSX);
         System.out.println("Hệ điều hành: "+heDH);
         System.out.print("Ram: "+ram);
         System.out.println("GB");
         System.out.println("CPU: "+cpu);
         System.out.print("Giá bán: "+gia);
         System.out.println(" triệu đồng");
         System.out.println("Năm bảo hành: "+namBH);
 
     }
 
     double tinhTien(int soLuong){
 
         double tien;
         tien = soLuong*gia;
         return tien;
 
     }
}

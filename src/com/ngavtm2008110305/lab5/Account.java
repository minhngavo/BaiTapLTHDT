/*
* created date: Oct 13, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.lab5;

public class Account {

     //attribute - thuộc tính

     String tenTK;
     int soTK;
     int soDu;
 
     //methood - function 
     //hàm tạo mặc định
 
     Account(){
 
         tenTK = "Bắp Thị Luộc";
         soTK = 9999;
         soDu = 2244 ;
 
     }
 
     //hàm tạo 1 tham số
 
     Account(int a){
 
         tenTK = "Xôi Thị Hấp";
         soTK = a; 
         soDu = 1500;
 
     }
 
     //hàm tạo 2 tham số
 
     Account(int a, int b){
 
         tenTK = "Hành Thị Hẹ"; 
         soTK = a;
         soDu = b;
 
     }
 
     void inThongTin(){
 
         System.out.println("Tên chủ tài khoản: "+tenTK);
         System.out.println("Số tài khoản: "+soTK); 
         System.out.println("Số dư trong tài khoản: "+soDu);
 
     }
 
     int guiTien(int gui){
 
         soDu = soDu + gui;
         return soDu;
 
     }
 
     int rutTien(int rut){
 
         soDu = soDu - rut;
         return soDu;
 
     }
}

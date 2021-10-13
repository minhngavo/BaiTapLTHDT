/*
* created date: Oct 13, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.lab5;

public class Car {

    //attribute - thuộc tính

    String tenChuXe;
    String dongXe;
    String hangSX;
    double giayPhep;
    double dtXang;

    //methood - function
    //hàm tạo mặc định

    Car(){

        tenChuXe = "Ngô Thị Bắp";
        dongXe = "Wave";
        hangSX = "Honda";
        giayPhep = 2015;
        dtXang = 2.25;

    }

    // hàm tạo 1 tham số

    Car(double a){

        tenChuXe = "Ngô Thị Ổi";
        dongXe = "Xe tay ga";
        hangSX = "Honda";
        giayPhep = 2020;
        dtXang = a;

    }

    //hàm tạo 2 tham số

    Car(double x , double y){

        tenChuXe = "Ngô Thanh Long";
        dongXe = "Xe year";
        hangSX = "Suzuki";
        giayPhep = x;
        dtXang = y;

    }

    void xuatThongTin(){

        System.out.println("Tên chủ xe: "+tenChuXe);
        System.out.println("Dòng xe: "+dongXe);
        System.out.println("Hãng xe: "+hangSX);
        System.out.print("Giấy phép sản xuất: Năm "+giayPhep);
        System.out.print("Dung tích bình xăng: "+dtXang);
        System.out.println(" lít");

    }
}

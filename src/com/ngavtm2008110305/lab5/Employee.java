/*
* created date: Oct 13, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.lab5;

public class Employee {

    //attribute - thuộc tính

    String tenNV;
    String ngaySinh;
    String diaChi;
    String boPhan;
    double luong;

    //methood - function
    //hàm tạo mặc định

    Employee(){

        tenNV = "Rau Thị Cải";
        ngaySinh = "07/09/2000";
        diaChi = "Tp.Hồ Chí Minh";
        boPhan = "Phó Phòng";
        luong = 15.000;

    }

    //hàm tạo 1 tham số

    Employee(double a){

        tenNV = "Hoa Thị Cúc";
        ngaySinh = "10/04/1999";
        diaChi = "BR-VT";
        boPhan = "Nhân viên văn phòng";
        luong = a;

    }

    //hàm tạo 2 tham số

    Employee(double m, double n){

        tenNV = "Ổi Thị Ruby";
        ngaySinh = "23/07/2000";
        diaChi = "Đà Nẵng";
        boPhan = "Giám đốc kĩ thuật";
        luong = n;

    }

    void inThongTin(){

        System.out.println("Tên nhân viên: "+tenNV);
        System.out.println("Ngày sinh: "+ngaySinh);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Bộ phận làm việc: "+boPhan);
        System.out.println("Lương: "+luong);

    } 

    double tinhLuong(int thang){

        double tien;
        tien = thang*luong;
        return tien;

    }  
    
}

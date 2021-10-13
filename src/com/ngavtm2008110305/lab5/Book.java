/*
* created date: Oct 13, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.lab5;

public class Book {

    //attribute - thuộc tính

    String nhaXuatBan;
    double namXuatBan;
    double giaBan;
    String loai;

    //methood - function
    //hàm tạo mặc định

    Book(){

        loai = " Sách làm bánh xèo";
        nhaXuatBan = "Lâm Thị Kem Tươi";
        namXuatBan = 1999;
        giaBan = 400.000;

    }

    //hàm tạo 1 tham số

    Book(double a){

        loai = "Sách làm hũ tiếu gõ";
        nhaXuatBan = "Hoàng Tạp Hóa";
        namXuatBan = 1999;
        giaBan = a;

    }

    //hàm tạo 2 tham số

    Book(double m, double n){

        loai = "Sách làm bánh nở";
        nhaXuatBan = "Nông Thị Bánh Bèo";
        namXuatBan = m;
        giaBan = n;

    }

    void gioiThieuSach(){

        System.out.println("Loại Sách: "+loai);
        System.out.println("Nhà xuất bản: "+nhaXuatBan);
        System.out.println("Năm xuất bản: "+namXuatBan);
        System.out.println("Giá bán: "+giaBan);

    }

    double thanhTien(int soLuong){

        double tien;
        tien = soLuong*giaBan;
        return tien;

    }
}

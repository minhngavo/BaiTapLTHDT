/*
* created date: Nov 04, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.kiemtragiuaki;

import java.util.Scanner;

public class NhanVien extends People {

    private float heSoLuong;

    NhanVien(){}

    protected NhanVien(String name,String addres,float heSoLuong){

        super(name,addres);

        this.heSoLuong=heSoLuong;



    }



    protected float tinhLuong(){

        return (heSoLuong*1500000);



    }

    

    public String toString(){

        if(heSoLuong<0){

            System.out.println("Không hợp lệ");

        }

        String s;

        s= getHoTen()+ ","+getDiaChi();

        s += ", " + "Hệ Số Lương: "+heSoLuong;

        s += ","+"Tiền Lương: "+tinhLuong();

        return s;
    }
}
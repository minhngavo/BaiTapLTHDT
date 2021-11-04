/*
* created date: Nov 04, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.kiemtragiuaki;

public class People {

    private String hoTen;

    private String diaChi;

    People(){}

    protected People(String name,String addres ){

        hoTen=name;

        diaChi=addres;

    }

    public String getHoTen() {

        return hoTen;

    }public void setDiaChi(String diaChi) {

        this.diaChi = diaChi;

    }public String getDiaChi() {

        return diaChi;

    }public void setHoTen(String hoTen) {

        this.hoTen = hoTen;

    }
}
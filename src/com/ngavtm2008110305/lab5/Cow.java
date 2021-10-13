/*
* created date: Oct 13, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.lab5;

public class Cow {

    //attribute - thuộc tính

    double weight;
    double age;

    //methood - function
    //hàm tạo mặc định

    Cow(){

        weight = 19;
        age = 2;

    }

    //hàm tạo 1 tham số

    Cow(double x){

        weight = x;
        age = 2;

    }

    //hàm tạo 2 tham số

    Cow(double y, double z){

        weight = y;
        age = z;

    }

    void xuatThongTin(){

        System.out.print("Cân nặng: "+weight);
        System.out.println(" kg");
        System.out.print("Tuổi: "+age);
        System.out.println(" tuổi");

    }
    
}

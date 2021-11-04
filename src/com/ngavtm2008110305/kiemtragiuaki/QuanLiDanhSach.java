/*
* created date: Nov 04, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.kiemtragiuaki;

import java.util.ArrayList;

public class QuanLiDanhSach {
    
    private ArrayList <Object> list = new ArrayList<>();

    public void themNguoi(Object object) {

        list.add(object);

    }
        public void inDanhSach() {

            Object[] danhSach;
            for (Object object : list) {
    
                System.out.println(object.toString());
    
            }
}
}
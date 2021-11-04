/*
* created date: Nov 04, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.kiemtragiuaki;

public class HocVien extends People {


    private float diemmonhoc1;
    private float diemmonhoc2;
    private int soLuongHV;



    protected HocVien(String name,String addres ,float diemmonhoc1,float diemmonhoc2,int soLuongHV){

        super(name, addres);
        this.diemmonhoc1 = diemmonhoc1;
        this.diemmonhoc2 = diemmonhoc2;
        this.soLuongHV = soLuongHV;

    }

    protected float tinhDiem(){

       return (diemmonhoc1 + diemmonhoc2) / 2;

    }

    @Override

    public String toString() {

        if(diemmonhoc1<0){

            System.out.println("Không hợp lệ");

        }else if(diemmonhoc2<0){

            System.out.println("Không hợp lệ");

        }

        

        String a;

        a = getHoTen()+getDiaChi();

        a+= ", "+diemmonhoc1+", "+diemmonhoc2+", "+"Điểm Trung Bình là : "+tinhDiem()+" Số Luọng HV: "+soLuongHV;

        return a;
}
package com.ngavtm2008110305.lab3;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Bảng cửu chương");
        for(int i=2; i<=9; i++){
            System.out.printf("\n**Bảng cửu chương nhân %d**\n", i);
            for(int j=1; j<=9; j++){
            System.out.printf("\t%d x %d = %d\n", i, j, i*j);
                }
            
            }
        }
    }
    

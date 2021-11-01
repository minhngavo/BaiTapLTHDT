/*
* created date: Nov 01, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.lab6;

public class Triangle {

    String sound = "giọt nước";
    
        boolean click = false ;
        
        void xoay() {
    
            System.out.println("Hinh tam giác, xoay 360 độ");
    
            click = true;
      
        }
    
        void playSound() {
    
            if (click=true) {
    
                System.out.println("Âm thanh hình tam giác sẽ phát: " + sound);
    
            }
    
            else {
    
                System.out.println("Hệ thống bị báo lỗi !!!");
    
            }
    
        }
}
    

/*
* created date: Sep 30, 2021
* author: Võ Thị Minh Nga
*/
package vn.edu.giadinh.tuan04;

public class chuongTrinhLTMinhHoaKhongCT {
    private static String account_number;

    public static void main(String[] args) {
        int accoount_number = 20;
        int account_balance = 100;

        account_balance = account_balance + 100;
        System.out.println("Account Numer = " + account_number);
        System.out.println("Account Number = "+ account_balance);

        account_balance = account_balance - 50;
        System.out.println("Account Numer = " + account_number);
        System.out.println("Account Number = "+ account_balance);

        account_balance = account_balance - 10;
        System.out.println("Account Numer = " + account_number);
        System.out.println("Account Number = "+ account_balance);

    }
}

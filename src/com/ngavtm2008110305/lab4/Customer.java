/*
* created date: Oct 07, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.lab4;

import java.util.Scanner;

public class Customer {
    String name;
	String address;

	Scanner scanner = new Scanner(System.in);

	String getName(){	

		System.out.print("Nhap ho va ten khach hang: ");
		name = scanner.nextLine();
		return name;

	}

	String getAddress(){

		System.out.print("Nhap dia chi cua khach hang: ");
		address = scanner.nextLine();
		return address;

	}

	void show(){

		System.out.println("Ho va ten: " +name);
		System.out.println("Dia chi: " +address);

	}
}
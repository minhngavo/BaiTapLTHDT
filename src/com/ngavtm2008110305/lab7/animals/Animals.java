/*
* created date: Nov 01, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.lab7.animals;

public class Animals {
    
    protected String picture;

	protected String food;

	protected int hunger;

	protected String boundaries;

	protected int location;



	protected void makeNoise(){

		System.out.println("Tiếng kêu động vật");

	}

	protected void eat(){

		System.out.println("Động vật khi ăn");

	}

	protected void sleep(){

		System.out.println("Động vật khi ngủ");

	}

	protected void roam(){

		System.out.println("Động vật khi di chuyển");

	}
}

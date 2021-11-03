/*
* created date: Nov 03, 2021
* author: Võ Thị Minh Nga
*/
package com.ngavtm2008110305.lab7.animals;

public class AnimalsTest {
    
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.makeNoise();

        cat.eat();

        cat.chaseDog();

        cat.roam();



        Dog dog = new Dog();

        dog.makeNoise();

        dog.eat();

        dog.chaseBut();

        dog.roam();



        Hippo hippo = new Hippo();

        hippo.makeNoise();

        hippo.eat();

        hippo.chaseBut();

        hippo.roam();



        Lion lion = new Lion();

        lion.makeNoise();

        lion.eat();

        lion.sleep();

        lion.roam();



        Tiger tiger = new Tiger();

        tiger.makeNoise();

        tiger.eat();

        tiger.chaseBut();

        tiger.roam();



        Wolf wolf = new Wolf();

        wolf.makeNoise();

        wolf.eat();

        wolf.chaseBut();
        
        wolf.roam(); 

    }
}

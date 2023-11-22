package Repeticion;

import java.util.Random;

public class EjemploRandom {

	public static void main(String[] args) {
		Random nr = new Random();
		System.out.println(Math.random()+5);
        System.out.println(nr.nextDouble()+1);
        System.out.println(nr.nextInt(25));
	}

}

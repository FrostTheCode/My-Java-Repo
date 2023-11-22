package Mascota;

public class TdaMascot {

	public static void main(String[] args) {
		Mascota m=new Mascota("galleta","canino",6,"negro");
		m.mostrarMascota();
		System.out.println("su nombre es: "+m.getName());
		System.out.println("su especie es: "+m.getEsp());
		System.out.println("su edad es: "+m.getAge());
		System.out.println("su color es: "+m.getColor());
		//cermelo ,felino 3 blanco
		m.setName("cermelo");
		m.setEsp("felino");
		m.setAge(3);
		m.setColor("blanco");
		m.mostrarMascota();
		System.out.println("su nombre es: "+m.getName());
		System.out.println("su especie es: "+m.getEsp());
		System.out.println("su edad es: "+m.getAge());
		System.out.println("su color es: "+m.getColor());

	}

}

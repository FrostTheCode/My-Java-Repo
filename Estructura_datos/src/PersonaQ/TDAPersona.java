package PersonaQ;

public class TDAPersona {

	public static void main(String[] args) {
		Persona p=new Persona("Manolo",20,2000);
		//manolo 20 2000
		p.mostrarPersona();
		System.out.println("su nombre es: "+p.getName());
		System.out.println("su edad es: "+p.getAge());
		System.out.println("su año de nacimiento es: "+p.getNaci());
		//quintino 10 2010
		p.setName("Quintino");
		p.setAge(10);
		p.setNaci(2010);
		p.mostrarPersona();
		System.out.println("su nombre es: "+p.getName());
		System.out.println("su edad es: "+p.getAge());
		System.out.println("su año de nacimiento es: "+p.getNaci());

	}

}

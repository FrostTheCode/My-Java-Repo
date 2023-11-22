package mascota;

import javax.swing.JOptionPane;

public class Prueba {

	public static void main(String[] args) {
		Imprime i1=new Imprime();
		Mascota m2=new Mascota("parkesito","felino","porter",6,20,"manuel lopez","masculino","gris","c.chocoflan","pequeno");
		Mascota m3=new Mascota("cofi","canino","boxer",3,22,"prince","femenino","negro","c.jalisco","grande");
		Mascota m4=new Mascota("choqui","canino","chihuahua",2,14,"javier","masculino","cafe","c.marquis","pequeno");
		JOptionPane.showMessageDialog(null, i1,"Datos de la mascota",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, i1.toString2(),"datos de la mascota 2",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, i1.toString3(m2),"datos de la mascota 3",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, i1.toString3(m3),"datos de la mascota 4",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, i1.toString3(m4),"datos de la mascota 5",JOptionPane.INFORMATION_MESSAGE);
		

	}

}

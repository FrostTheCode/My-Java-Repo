package composicion_pokemon;

import javax.swing.JOptionPane;

public class Menu {
	public void men(){
	Imprime im=new Imprime();
	Ingresa in=new Ingresa();
	int opc;
	 do {
	opc=Integer.parseInt(JOptionPane.showInputDialog(null
			,"1.-Imprime Datos\n2.-Ingresa Datos\n3.-salir"
			,"menu de datos de Pokemons"
			,JOptionPane.INFORMATION_MESSAGE));
	switch(opc)
	{
	case 1:
		JOptionPane.showMessageDialog(null,im.print(),"Datos del Pokemon ",JOptionPane.INFORMATION_MESSAGE);
		break;
	case 2:
		JOptionPane.showMessageDialog(null, in.toing(),"Datos del Pokemon ",JOptionPane.INFORMATION_MESSAGE);
		break;
	case 3:
		System.exit(0);
		break;
		default:
			JOptionPane.showMessageDialog(null,"opcion incorrecta","no Funciona",JOptionPane.INFORMATION_MESSAGE);
	}
	 }while(opc!=3);
}}





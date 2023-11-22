package listaDesordenada;
import static javax.swing.JOptionPane.*;
public class usaLista {

	public static void main(String[] args) {
		String menu="1-Insertar\n2-Eliminar\n3-Modificar\n5-mostrar lista\n6-salir\n";
		int opcion=0;
		listaD<mascota>lstmas=new listaD<mascota>(50);
		mascota mas,nvomas;String namemas;
		do {
			opcion=Integer.parseInt(showInputDialog(menu));
			switch(opcion)
			{
			case 1:mas=new mascota();
				   mas.ped();
				   lstmas.ins(mas);
				   break;
			case 2:namemas=showInputDialog("Mascota a eliminar");
			       mas=new mascota(namemas);
			       lstmas.ins(mas);
			       break;
			case 3:namemas=showInputDialog("Mascota a modificar");
			       mas=new mascota(namemas);
			       nvomas=new mascota();nvomas.ped();
			       lstmas.mod(mas, nvomas);
			       break;
			case 4:namemas=showInputDialog("Mascota a consultar: ");
			       mas=new mascota(namemas);
			       if (mas!=null) System.out.println(mas);
			       else System.out.println("Mascota no existente");
			       break;
			case 5:
				lstmas.molis();break;
			case 6: break;
			default: showMessageDialog(null,"Opcion incorrecta");break;
			}
		}while(opcion!=6);

	}

}


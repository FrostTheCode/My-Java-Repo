package ListaOrdenada;
import static javax.swing.JOptionPane.*;
public class uselis {

	public static void main(String[] args) {
		ListaOrd<Articulo> art=new ListaOrd<Articulo>(100);
		String me="1.-Insertar\n2.-Eliminar\n3.-Consultar\n4.-Listar\n5.-fin\n";
		int opc=0;
		do {
			try {
				opc=Integer.parseInt(showInputDialog(me));
				int codi;Articulo artx;
				switch (opc)
				{
				case 1:
					artx=new Articulo();
					artx.pDat();
					art.in(artx);
					break;
				case 2:codi=Integer.parseInt(showInputDialog("codigo del articulo a eliminar"));
				artx=new Articulo(codi);
				art.eli(artx);
				break;
				case 3:codi=Integer.parseInt(showInputDialog(null,"codigo del articulo a eliminar"));
				artx=new Articulo(codi);
				art.eli(artx);
				break;
				case 4:showMessageDialog(null,art.lr());break;
				case 5:break;
				default: showMessageDialog(null,"opcion no valida");break;
				}
			}catch (Exception ex) {
				showMessageDialog(null,"error"+ex.getMessage());
			}
		}while (opc !=5);

	}

}

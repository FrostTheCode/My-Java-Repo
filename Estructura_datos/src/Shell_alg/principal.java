package Shell_alg;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		alg g=new alg();
		int v1[]= {5,6,3,44,22,1};
		int v2[]= {55,4,43,44,2,10,4567,45638};
		int v3[]= {5,2,1,8,3,9,7};
		
		System.out.println("Arreglo Original");
		g.mosAr(v3);
		/*g.shell(v3);
		g.radi(v3);
		g.quic(v3, 0, v3.length-1);*/
		/*int ta;
		ta=Integer.parseInt(JOptionPane.showInputDialog(""));
		int vec[]=new int [ta];
		for (int i=0;i<ta;i++)
		{
			vec[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del indice"+i));
			g.ins(vec, i+1);
		}
		*/
		
		/*System.out.println("arreglo vector 1 Og");
		g.mosAr(v1);
		System.out.println("arreglo vector 3 Og");
		g.mosAr(v3);
		g.burbu(v1);
		g.burbu(v3);
		g.intercalacion(v1, v3);
	            */
		/*System.out.println("arreglo vector2 original");
		g.mosAr(v2);
		System.out.println("Arreglo vector2 ordenado por mezcla directa");
		v2=g.mezclad(v2);
		g.mosAr(v2); */
		
		/*System.out.println("arreglo vector2 original");
		g.mosAr(v2);
		System.out.println("Arreglo vector2 ordenado por mezcla natural");
		g.mezclan(v2);
		g.mosAr(v2);*/
		
		/*g.mosAr(v2);
		int ind=g.bussec(v2, 55);
		if(ind != -1)
		System.out.println("elemento 5 encontrado en el indice "+ind);
		else
			System.out.println("elemento -9 no encontrado");*/
	
		g.mosAr(v2);
		g.mezclan(v2);
		g.mosAr(v2);
		int ind=g.BusBin(v2, 10);
		if(ind != -1)
			System.out.println("elemento 10 encontrado en el indice "+ind);
			else
				System.out.println("elemento 10 no encontrado");
	}

}

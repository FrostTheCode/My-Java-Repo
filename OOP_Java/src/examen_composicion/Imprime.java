package examen_composicion;

import javax.swing.JTextArea;

public class Imprime {
	//se mandan a llamar los datos de las clases
		Ciclista ci=new Ciclista("marco","frinze",26,"free france",260,"frimar@gmail.com","malboro",34000);
		Entrenador en=new Entrenador("Grim","Dimer",56,"masculino",344323,"gri554@gmail.com","c.salim 43","free france",65000);
		Terapeuta te=new Terapeuta("dusher",35,"dush455@gmail.com","c.muller 65",65000);
		Pais pa=new Pais(ci,en,te,"Francia","free france",89000,"pier sule","www.pierfrance.com");
		JTextArea t1=new JTextArea();
		String dts="\t\t\t\tCiclista\nNombre\tApellido\tEdad\tEquipo\tNumero\tEmail\tPatrocinador\tSalario\n";
		//crear un objeto para ingresar los datos e imprimirlos
		public Object toprint()
		{
			dts+="_______________________________________________________________________________________________________________________________________________\n";
			dts+=ci.gname()+"\t"+ci.glast()+"\t"+ci.gedad()+"\t"+ci.gteam()+"\t"+ci.gno()+"\t"+ci.gemail()+"\t"+ci.gpatro()+"\t"+ci.gpay()+"\n";
			
			dts+="\t\t\t\tEntrenador\nNombre\tapellido\tedad\tsexo\ttelefono\temail\tdir\tequipo\tsalario\n";
			dts+="___________________________________________________________________________________________________________________________________________________________\n";
			dts+=en.gname()+"\t"+en.glast()+"\t"+en.gedad()+"\t"+en.gsexo()+"\t"+en.gphone()+"\t"+en.gemail()+"\t"+en.gdir()+"\t"+en.gteam()+"\t"+en.gpay()+"\n";
			
			dts+="\t\t\t\tTerapeuta\nnombre\tedad\temail\tdir\tpay\n";
			dts+="___________________________________________________________________________________________\n";
			dts+=te.gname()+"\t"+te.gedad()+"\t"+te.gemail()+"\t"+te.gdir()+"\t"+te.gpay()+"\n";
			
			dts+="\t\t\t\tPais\nNombre\tequipo\tespectadores\truta\tweb\n";
			dts+="________________________________________________________________________________________________________________\n";
			dts+=pa.gname()+"\t"+pa.gteam()+"\t"+pa.gesp()+"\t"+pa.gruta()+"\t"+pa.gweb()+"\n";
			
			t1.setText(dts);
			return t1;
		}
}

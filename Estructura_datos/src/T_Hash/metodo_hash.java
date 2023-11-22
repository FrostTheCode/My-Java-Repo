package T_Hash;

import java.io.FileWriter;
import java.io.PrintWriter;

public class metodo_hash {
	int key;
	public lista[]hash=new lista[7];
	
	public metodo_hash()
	{
		for(int i=0;i<hash.length;i++) 
			hash[i]=new lista();
	}
	public void agre(int va)
	{
		nodo nue=new nodo();
		nue.SetVal(va);
		key=va%7;
		switch(key)
		{
		case 0:
			hash[0].ag(va);
			break;
		case 1:
			hash[1].ag(va);
			break;
		case 2:
			hash[2].ag(va);
			break;
		case 3:
			hash[3].ag(va);
			break;
		case 4:
			hash[4].ag(va);
			break;
		case 5:
			hash[5].ag(va);
			break;
		case 6:
			hash[6].ag(va);
			break;
		case 7:
			hash[7].ag(va);
			break;
		default:
			break;
		}
	}
	public void impri(){
		System.out.println("llave");
		for (int i=0;i<hash.length;i++) {
			System.out.println(i+"\t");
			hash[i].imp();
		}
	}
	public void delete(int va){
		key=va%7;
		
		switch(key)
		{
		case 0:
			hash[0].bor(va);
			break;
		case 1:
			hash[1].bor(va);
			break;
		case 2:
			hash[2].bor(va);
			break;
		case 3:
			hash[3].bor(va);
			break;
		case 4:
			hash[4].bor(va);
			break;
		case 5:
			hash[5].bor(va);
			break;
		case 6:
			hash[6].bor(va);
			break;
		case 7:
			hash[7].bor(va);
			break;
		default:
			break;
		}
	}
	private String obtLisGra()
	{
		String txt="diagraph g\n"
				+"{\n"
				+"node[shape = star]\n"
				+"node[style = filled]\\n"
				+"node[fillcolour  =\"#00ff00\"]\n"
				+"node[colour = \"#000000\"]\n"
				+"edgy[colour = \"#000000\"]\n";
		for(int i=hash.length-1;i>=0;i--) {
			txt+=hash[i].txtgrap(); 
		}
		txt+="rankdir = LR;\n"
				+"}";
		return txt;
	}
	
	public void escArc(String ruta,String con){
		FileWriter fi=null;
		PrintWriter pw = null;
		try {
			fi=new FileWriter(ruta);
			pw=new PrintWriter(fi);
			pw.write(con);
			pw.close();
			fi.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(pw!=null)
				pw.close();
		}	
	}
	public void dibGra()
	{
	try {
		escArc("archiv.h",obtLisGra());
		ProcessBuilder pro;
		pro=new ProcessBuilder("dot","-tpng","Lista.png","archivo.h");
		pro.redirectErrorStream(true);
		pro.start();
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	
	}

}

package BiCola;
import java.util.Scanner;;
public class Pac {
	private int nss; //clave o llave
	private String name;
	private String sin;
	  
	public int getNss() {
		return nss;
	}
	public void setNss(int nss) {
		this.nss = nss;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSin() {
		return sin;
	}
	public void setSin(String sin) {
		this.sin = sin;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nss;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pac other = (Pac) obj;
		if (nss != other.nss)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pac [nss=" + nss + ", name=" + name + ", sin=" + sin + "]";
	}
	public void pDat() {
		Scanner in=new Scanner(System.in);
		System.out.println("numero de seguro social: ");
		this.nss=in.nextInt();in.nextLine();
		System.out.println("nombre completo: ");
		this.name=in.nextLine();
		System.out.println("Sintomas: ");
		this.sin=in.nextLine();
		in.close();
	}
}

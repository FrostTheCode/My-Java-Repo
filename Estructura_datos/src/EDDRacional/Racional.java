package EDDRacional;

public class Racional {
	int num,den,num2,den2;
	public Racional()
	{
		num=0;
		den=1;
		num2=0;
		den2=0;
	}
	
	
	public Racional(int num, int den, int num2, int den2) {
		this.num = num;
		this.den = den;
		this.num2 = num2;
		this.den2 = den2;
	}
	


	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDen() {
		return den;
	}
	public void setDen(int den) {
		this.den = den;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getDen2() {
		return den2;
	}
	public void setDen2(int den2) {
		this.den2 = den2;
	}


	public String toString()
	 {
		 return num+"/"+den;
	 }
	public String tocool()
	{
		return (num+"/"+den)+"="+(num2+"/"+den2);
	}
	 //suma de fracciones
	 public Racional suma(Racional r,Racional r2)
	 {
		 int a=r.getNum();
		 int b=r.getDen();
		 int c=r2.getNum();
		 int d=r2.getDen();
		 
		 this.setNum((a*d)+(b*c));
		 this.setDen(b*d);
		 return this;
	 }
	 public Racional resta(Racional r,Racional r2)
	 {
		 int a=r.getNum();
		 int b=r.getDen();
		 int c=r2.getNum();
		 int d=r2.getDen();
		 
		 this.setNum((a*d)-(b*c));
		 this.setDen(b*d);
		 return this;
	 }
	 public Racional multi(Racional r,Racional r2)
	 {
		 int a=r.getNum();
		 int b=r.getDen();
		 int c=r2.getNum();
		 int d=r2.getDen();
		 
		 this.setNum((a*c));
		 this.setDen(b*d);
		 return this;
	 }
	 public Racional divi(Racional r,Racional r2)
	 {
		 int a=r.getNum();
		 int b=r.getDen();
		 int c=r2.getNum();
		 int d=r2.getDen();
		 
		 this.setNum(a*d);
		 this.setDen(b*c);
		 return this;
	 }
	 
}

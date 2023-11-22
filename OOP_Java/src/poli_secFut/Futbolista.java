package poli_secFut;
public class Futbolista extends SecFut{
	private String pos;
	private int num;
	private float pay;
	
	public Futbolista(int id, String name, String last, double peso, int age, String pos, int num, float pay) {
		super(id, name, last, peso, age);
		this.pos = pos;
		this.num = num;
		this.pay = pay;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public float getPay() {
		return pay;
	}
	public void setPay(float pay) {
		this.pay = pay;
	}
	
	

}

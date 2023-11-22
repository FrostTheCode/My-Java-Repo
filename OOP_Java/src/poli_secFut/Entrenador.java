package poli_secFut;

public class Entrenador extends SecFut{
	private String idfed;
	private String cam;
	private int team;
	public Entrenador(int id, String name, String last, double peso, int age, String idfed, String cam, int team) {
		super(id, name, last, peso, age);
		this.idfed = idfed;
		this.cam = cam;
		this.team = team;
	}
	public String getIdfed() {
		return idfed;
	}
	public void setIdfed(String idfed) {
		this.idfed = idfed;
	}
	public String getCam() {
		return cam;
	}
	public void setCam(String cam) {
		this.cam = cam;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	

}

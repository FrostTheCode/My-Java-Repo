package herencia_Seleccion_futbol;

public class Entrenador extends Seleccionfutbol{
	private String idfed;
    
	public Entrenador(int id, String name, String last, double peso, int edad, String idfed) {
		super(id, name, last, peso, edad);
		this.idfed = idfed;
	}

	public String getIdfed() {
		return idfed;
	}

	public void setIdfed(String idfed) {
		this.idfed = idfed;
	}
}

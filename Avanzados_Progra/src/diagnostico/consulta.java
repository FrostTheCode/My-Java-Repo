package diagnostico;

public class consulta {
	private String fec;//fecha de consulta
	private String desen;
	private String res;
	
	public consulta(String fec, String desen, String res) {
		super();
		this.fec = fec;
		this.desen = desen;
		this.res = res;
	}

	public String getFec() {
		return fec;
	}

	public void setFec(String fec) {
		this.fec = fec;
	}

	public String getDesen() {
		return desen;
	}

	public void setDesen(String desen) {
		this.desen = desen;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}
	
	public void llenarnombres() {
		 
	}

}

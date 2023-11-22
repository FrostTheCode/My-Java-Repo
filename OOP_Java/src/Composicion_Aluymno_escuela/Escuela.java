package Composicion_Aluymno_escuela;

public class Escuela {
	private String name;
	private String web;
	private int phone;
	
	public Escuela(String name, String web, int phone)
	{
		this.name=name;
		this.web=web;
		this.phone=phone;	
	}

	public String getName()
		{
			return this.name;
		}
		
		public String getWeb()
		{
			return this.web;
		}
		public int getPhone()
		{
			return this.phone;
		}
		
		public void setName(String name)
		{
			this.name=name;
		}
		public void setWeb(String web)
		{
			this.web=web;
		}
		public void setPhone(int phone)
		{
			this.phone=phone;
		}
}

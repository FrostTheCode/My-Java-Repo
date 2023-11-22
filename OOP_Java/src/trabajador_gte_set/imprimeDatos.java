package trabajador_gte_set;

public class imprimeDatos {
	Trabajador t1=new Trabajador("jose","carmena",50,"manager",6500,"Matutino","a5264dfr661","oxxo sa.de cv.","Masculino",493651002);
	public String toString()
	{
		return "Nombre: "+t1.getname()+"\nApellido: "+t1.getapellido()+"\nEdad: "+t1.getedad()+"\nPuesto: "+t1.getpuesto()+"\nSueldo: "+t1.getsueldo()+"\nTurno: "+t1.getturno()+"\nNSS: "+t1.getnss()+"\nEmpresa: "+t1.getempresa()+"\nSexo: "+t1.getsexo()+"\nTelefono: "+t1.getphone();	
	}
	

}

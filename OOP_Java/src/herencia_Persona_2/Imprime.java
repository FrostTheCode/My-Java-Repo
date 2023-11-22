package herencia_Persona_2;
import javax.swing.JTextArea;
public class Imprime {
		JTextArea t1=new JTextArea();
		String dtsE="\t\t\tDatos del Estudiante\nNombre\tApellido\tEdad\tSexo\tEscuela\tPromedio\n";
		public Object printE(Estudiante e)
		{
			dtsE+="__________________________________________________________________________________________________________\n";
			dtsE+=e.getName()+"\t"+e.getLast()+"\t"+e.getEdad()+"\t"+e.getSex()+"\t"+e.getSchool()+"\t"+e.getProm()+"\n";
			t1.setText(dtsE);
			return t1;
	}
		String dtsM="\t\t\tDatos del Estudiante\nNombre\tApellido\tEdad\tSexo\tGrado\tSalario\n";
		public Object printM(Maestro m)
		{
			dtsM+="_______________________________________________________________________________________________________\n";
			dtsM+=m.getName()+"\t"+m.getLast()+"\t"+m.getEdad()+"\t"+m.getSex()+"\t"+m.getGrado()+"\t"+m.getPay()+"\n";
			t1.setText(dtsM);
			return t1;
	}
		String dtsD="\t\t\tDatos del Estudiante\nNombre\tApellido\tEdad\tSexo\tEscuela\tPromedio\n";
		public Object printD(Directivo d)
		{
			dtsD+="______________________________________________________________________________________________________\n";
			dtsD+=d.getName()+"\t"+d.getLast()+"\t"+d.getEdad()+"\t"+d.getSex()+"\t"+d.getPuesto()+"\t"+d.getDep()+"\n";
			t1.setText(dtsD);
			return t1;
	}
}

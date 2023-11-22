package estudiante_set_get;

import javax.swing.JOptionPane;

public class Prueba {

	public static void main(String[] args) {
		//Estudiante e1=new Estudiante("Jose","Martines","I.S.C",18,19450666,"Masculino",6,"C. Josefa #33","josejosefa@Gmail.com",492104009,"120A2Bs");
		//JOptionPane.showMessageDialog(null, "Nombre: "+e1.getNombre()+"\nApellido: "+e1.getApellido()+"\nCarrera: "+e1.getCarrera()+"\nEdad: "+e1.getEdad()+"\nNControl: "+e1.getNcontrol()+
				//"\nSexo: "+e1.getSexo()+"\nSemestre: "+e1.getSemestre()+"\nDireccion: "+e1.getDireccion()+"\nCorreo: "+e1.getCorreo()+"\nTelefono: "+e1.getTelefono()+"\nNSS: "+e1.getNSS(),"Datos del estudiante",JOptionPane.INFORMATION_MESSAGE);
		
		Estudiante e1=new Estudiante("Jose","Martines","I.S.C",18,19450666,"Masculino",6,"C. Josefa #33","josejosefa@Gmail.com",492104009,"120A2Bs");
		JOptionPane.showMessageDialog(null,e1.toString() ,"Datos del estudiante",JOptionPane.INFORMATION_MESSAGE);
		e1.setApellido("Gomez");
		e1.setCorreo("eldomingodecenisasjajajaja@gmail.com");
		e1.setDireccion("av.lopez mateos 666");
		//info con cambios
		JOptionPane.showMessageDialog(null,e1.toString() ,"Datos del estudiante",JOptionPane.INFORMATION_MESSAGE);

	}

}

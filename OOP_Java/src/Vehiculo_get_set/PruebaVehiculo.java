
package Vehiculo_get_set;

import javax.swing.JOptionPane;

public class PruebaVehiculo {

	public static void main(String[] args) {
		Vehiculo v1=new Vehiculo("ZDF-1234","VW","2020","NEGRO",500,true);
		
		JOptionPane.showMessageDialog(null, "Matricula "+v1.getMatricula(),"vehiculo No.1",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Marca "+v1.getMarca(),"vehiculo No.1",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Modelo "+v1.getModelo(),"vehiculo No.1",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "color "+v1.getColor(),"vehiculo No.1",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Tarifa "+v1.getTarifa(),"vehiculo No.1",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Disponibilidad "+v1.getDisponible(),"vehiculo No.1",JOptionPane.INFORMATION_MESSAGE);
		v1.setMatricula("ZDF-4321");
		JOptionPane.showMessageDialog(null, "Matricula "+v1.getMatricula(),"vehiculo No.1",JOptionPane.INFORMATION_MESSAGE);
		v1.setModelo("chevy");
		

	}

}

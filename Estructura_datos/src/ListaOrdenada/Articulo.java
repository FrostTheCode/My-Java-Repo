package ListaOrdenada;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Articulo implements Comparable <Articulo>{
	public int cod;
	public String des;
	public double pre;
	
	public Articulo(){}//constructor por defecto
	public Articulo(int cod)
	{
		this.cod=cod;
	}
	public void pDat() throws Exception{
		try {
			JDialog dat=new JDialog(); //cuadro de dialogo
			dat.setTitle("Datos del articulo");
			dat.setModal(true);//ventana queda activa hasta que se cierre
			dat.setLayout(new FlowLayout());
			JLabel lblCod=new JLabel("codigo: ");
			JTextField txtCod=new JTextField(5);
			JLabel lblDes=new JLabel("Descripcion");
			JTextField txtDes=new JTextField(50);
			JLabel lblPre=new JLabel("precio: ");
			JTextField txtPre=new JTextField(10);
			JButton btnAceptar=new JButton("aceptar");
			//agregar componentes a ventana
			dat.add(lblCod);dat.add(txtCod);
			dat.add(lblDes);dat.add(txtDes);
			dat.add(lblPre);dat.add(txtPre);
			//definir la funcion del boton
			btnAceptar.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					cod=Integer.parseInt(txtCod.getText());
					des=txtDes.getText();
					pre=Double.parseDouble(txtPre.getText());
					dat.dispose();
				}
			});
			dat.add(btnAceptar);
			dat.pack();//tamano de los componentes
			dat.setVisible(true);
		}catch (Exception ex) {
			throw new Exception ("Datos incorrectos");
		}
			
	}
	//redefinir los metodos de la clase objeto
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cod;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		if (cod != other.cod)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Articulo [cod=" + cod + ", des=" + des + ", pre=" + pre + "]";
	}

	@Override
	public int compareTo(Articulo x) {
	    //el metodo regresa cero si 2 instancias son iguales, 
		//regresa 1 si la primera es mayor que la segunda
		//regresa -1 si la primera distancia es menor que la segunda
		if (x.cod==this.cod)return 0;
		else if(this.cod>x.cod)return 1;
		else return -1;
	}

}

package Jframe;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class tablaJava2 {

	public static void main(String[] args) {
		JFrame mim=new marcoCustom();
		mim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mim.setVisible(true);

	}

}
class marcoCustom extends JFrame{
	public marcoCustom() {
		setTitle("Tabla Personalizada");
		setBounds(300,300,400,200);
		TableModel mimo=new ModTab();
		JTable mit=new JTable(mimo);
		add(new JScrollPane(mit));
	}
}
class ModTab extends AbstractTableModel{

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Object getValueAt(int rowIn, int colIn) {
		int z=rowIn+1;
		int y=colIn+1;
		return " "+z+" "+y;
	}
	public String getColumnName(int c) {
		return "columna "+(c+1);
	}
}
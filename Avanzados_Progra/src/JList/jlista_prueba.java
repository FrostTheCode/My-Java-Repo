package JList;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class jlista_prueba {

	public static void main(String[] args) {
		marco m=new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class marco extends JFrame{
	public marco() {
		setBounds(500,500,500,300);
		setTitle("La Lista");
		String [] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
	
		lisMes=new JList<String>(mes);
		lisMes.setVisibleRowCount(4);
		JScrollPane lamDes=new JScrollPane(lisMes);
		lamLis=new JPanel();
		lamLis.add(lamDes);
		
		lisMes.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				List<String>val=lisMes.getSelectedValuesList();
				StringBuilder txt=new StringBuilder("Mes Seleccionado: ");
				for(String ele:val) {
					String pal=ele;
					txt.append(pal);
					txt.append(" ");
				}
				rot.setText(txt.toString());
			}
		});
			
		
		
		
		lamTxt=new JPanel();
		rot=new JLabel("mes seleccionado: ");
		lamTxt.add(rot);
		add(lamLis,BorderLayout.NORTH);
		add(lamTxt,BorderLayout.SOUTH);
		
		
	}
	private JList<String> lisMes;
	private JPanel lamTxt, lamLis;
	private JLabel rot;
}

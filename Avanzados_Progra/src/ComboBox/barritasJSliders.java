package ComboBox;

import java.awt.Font;

import javax.swing.*;

public class barritasJSliders {

	public static void main(String[] args) {
		frame f=new frame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class frame extends JFrame{
	public frame() {
		setBounds(550,400,550,350);
		lamina la=new lamina();
		add(la);
		setVisible(true);
		
	}
}
class lamina extends JPanel{
	public lamina() {
		JSlider con=new JSlider(SwingConstants.VERTICAL,0,100,50);
		//con.setOrientation(SwingConstants.VERTICAL);
		con.setMajorTickSpacing(25);
		con.setMinorTickSpacing(5);
		con.setPaintTicks(true);
		con.setFont(new Font("Serif", Font.ITALIC,12));
		con.setPaintLabels(true);
		//con.setSnapToTicks(true);
		add(con);
		
		
		
	}
}

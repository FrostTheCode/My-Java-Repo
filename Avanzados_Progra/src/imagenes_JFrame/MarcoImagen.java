package imagenes_JFrame;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class MarcoImagen {

	public static void main(String[] args) {
		marcoi mi=new marcoi();
		mi.setVisible(true);
		mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class marcoi extends JFrame {
	public marcoi () {
		setTitle("Marco con imagen");
		setBounds(100,0,1080,720);
		framei fi=new framei();
		add(fi);
	}
	
}

class framei extends JPanel{	
		private Image im;
		public void paintComponent(Graphics g) {
		super.paintComponents(g);
		File image=new File("src/imagenes_JFrame/prussia.png");
		try {
		im=ImageIO.read((image));
		}
		catch(IOException e) {
			System.out.println("imagen no encontrada");
		}
		int anc=im.getWidth(this);
		int alt=im.getHeight(this);
		g.drawImage(im, 0, 0, null);
		for (int i=0;i<300;i++) {
			for (int j=0;j<200;j++) {
				g.copyArea(0, 0, anc, alt, anc*i, alt*j);
			}
		}
	}

}

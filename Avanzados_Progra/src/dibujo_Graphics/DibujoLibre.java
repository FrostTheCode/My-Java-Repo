package dibujo_Graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujoLibre {
	public static void main(String args[]) {
		// crea marco para ArcosJPanel
		JFrame marco = new JFrame("Dibujo Libre");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dibujo dibujo = new Dibujo();
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("a");
		LocalTime localTime = LocalTime.now();
		if (dtf2.format(localTime).equals("PM")) {
			dibujo.setBackground(Color.BLACK);
		} else {
			dibujo.setBackground(Color.BLUE);
		}
		marco.add(dibujo); // agrega arcosJPanel al marco
		marco.setSize(960, 650); // establece el tamaño del marco
		marco.setVisible(true); // muestra el marco
		marco.setLocationRelativeTo(null);
	} // fin de main
}

class Dibujo extends JPanel {
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("a");
	LocalTime localTime = LocalTime.now();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (dtf2.format(localTime).equals("PM")) {
			g.setColor(Color.yellow);
		} else {
			g.setColor(Color.white);
		}
		// los montes
		int X1[] = { -100, 250, 600 };
		int Y1[] = { 350, 0, 350 };
		g.fillPolygon(X1, Y1, 3);
		int X2[] = { 300, 650, 1000 };
		int Y2[] = { 350, 0, 350 };
		g.fillPolygon(X2, Y2, 3);
		g.setColor(Color.LIGHT_GRAY);
		int X3[] = { -100, 150, 400 };
		int Y3[] = { 350, 100, 350 };
		g.fillPolygon(X3, Y3, 3);
		int X4[] = { 100, 350, 600 };
		int Y4[] = { 350, 100, 350 };
		g.fillPolygon(X4, Y4, 3);
		g.setColor(Color.LIGHT_GRAY);
		int X5[] = { 300, 550, 800 };
		int Y5[] = { 350, 100, 350 };
		g.fillPolygon(X5, Y5, 3);
		int X6[] = { 500, 750, 1000 };
		int Y6[] = { 350, 100, 350 };
		g.fillPolygon(X6, Y6, 3);
		int X7[] = { -500, 0, 250 };
		int Y7[] = { 350, 100, 350 };
		g.fillPolygon(X7, Y7, 3);
		int X8[] = { 800, 1000, 1250 };
		int Y8[] = { 350, 100, 350 };
		g.fillPolygon(X8, Y8, 3);
	// suelo o pasto
		g.setColor(Color.GREEN);
		g.fillRect(0, 350, 960, 300);
	//arbol
		g.setColor(Color.getHSBColor(117, 75, 13));
		g.fillRect(250, 300, 40, 100);
		g.setColor(Color.GREEN);
		g.fillOval(200, 2800, 40, 40);
		g.fillOval(225, 300, 40, 40);
		g.fillOval(260, 300, 40, 40);
		g.fillOval(290, 280, 40, 40);
		g.fillOval(295, 250, 40, 40);
		g.fillOval(285, 220, 40, 40);
		g.fillOval(270, 190, 40, 40);
		g.fillOval(240, 180, 50, 50);
		g.fillOval(242, 160, 45, 45);
		g.fillOval(190, 250, 40, 40);
		g.fillOval(200,280,40,40);
		g.fillOval(200, 220, 40, 40);
		g.fillOval(220, 190, 40, 40);
		g.fillOval(220, 220, 100, 100);
		// seg arbol
		g.setColor(Color.getHSBColor(117, 75, 13));
		g.fillRect(800, 320, 40, 100);
		g.setColor(Color.ORANGE);
		g.fillOval(770, 300, 40, 40);
		g.fillOval(770, 190, 100, 140);
		g.fillOval(750, 270, 40, 40);
		g.fillOval(745, 235, 40, 40);
		g.fillOval(750, 200, 40, 40);
		g.fillOval(770, 170, 40, 40);
		g.fillOval(805, 165, 40, 40);
		g.fillOval(835, 185, 40, 40);
		g.fillOval(845, 220, 40, 40);
		g.fillOval(845, 255, 40, 40);
		g.fillOval(835, 285, 40, 40);
		g.fillOval(820, 300, 40, 40);
		//terc arbol
		g.setColor(Color.getHSBColor(117, 75, 13));
		g.fillRect(500, 320, 40, 100);
		g.setColor(Color.magenta);
		g.fillOval(470, 300, 40, 40);
		g.fillOval(470, 190, 100, 140);
		g.fillOval(450, 270, 40, 40);
		g.fillOval(445, 235, 40, 40);
		g.fillOval(450, 200, 40, 40);
		g.fillOval(470, 170, 40, 40);
		g.fillOval(505, 165, 40, 40);
		g.fillOval(535, 185, 40, 40);
		g.fillOval(545, 220, 40, 40);
		g.fillOval(545, 255, 40, 40);
		g.fillOval(535, 285, 40, 40);
		g.fillOval(520, 300, 40, 40);
		//rio
		g.setColor(Color.cyan);
		int vX[] = { 0, 0, 1250, 1250 };
		int vY[] = { 600, 1200, 500, 500 };
		g.fillPolygon(vX, vY, 4);
		//casaa
		g.setColor(Color.DARK_GRAY);
		g.fillRect(300, 330, 350, 200);
		g.setColor(Color.red);
		//techo
		int X[] = { 300, 650, 700, 250 };
		int Y[] = { 310, 310, 400, 400 };
		g.fillPolygon(X, Y, 4);
		//ventana
		if (dtf2.format(localTime).equals("7:14 PM")) {
			g.setColor(Color.YELLOW);
		} else {
			g.setColor(Color.CYAN);
		}
		g.fillRect(320, 420, 80, 80);
		g.setColor(Color.black);
		g.drawRect(320, 420, 40, 40);
		g.drawRect(360, 460, 40, 40);
		g.drawRect(360, 420, 40, 40);
		g.drawRect(320, 460, 40, 40);
		//door
		g.setColor(Color.getHSBColor(117, 75, 13));
		g.fillRect(430, 420, 80, 100);
		g.setColor(Color.BLACK);
		g.drawRect(430, 420, 80, 100);
		g.fillOval(440, 470, 10, 10);
		//seg ventana
		if (dtf2.format(localTime).equals("7:14 PM")) {
			g.setColor(Color.YELLOW);
		} else {
			g.setColor(Color.CYAN);
		}
		g.fillRect(550, 420, 80, 80);
		g.setColor(Color.black);
		g.drawRect(550, 420, 40, 40);
		g.drawRect(590, 460, 40, 40);
		g.drawRect(590, 420, 40, 40);
		g.drawRect(550, 460, 40, 40);
		//sol
		if (dtf2.format(localTime).equals("7:14 PM")) {
			g.setColor(Color.WHITE);
		} else {
			g.setColor(Color.yellow);
		}
		g.fillOval(15, 20,100, 100);
		
		
	}
}

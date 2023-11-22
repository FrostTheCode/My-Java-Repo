package dibujo_frame;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
public class grafos {

	public static void main(String[] args) {
		MarcoD md=new MarcoD();
		md.setVisible(true);
		md.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoD extends JFrame{
	public MarcoD() {
		setTitle("prueba de color y dibujo");
		setSize(400,400);
		ff n=new ff();
		add(n);
		n.setBackground(SystemColor.window);
	
	}
}
	
class ff extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		Font mf=new Font("Comic Sans MS",Font.BOLD,26);
		g2.setFont(mf);
		g2.setColor(Color.green);
		g2.drawString("Man i miss him", 100, 100);
	}
}

/*class framed extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 200, 200);
		g.drawLine(100, 100, 300, 200);
		g.drawArc(50, 100, 100, 200, 120, 150);
		
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D r=new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.DARK_GRAY);
		g2.draw(r);
		g2.setPaint(Color.blue);
		g2.fill(r);
		g2.draw(r);
		
		Ellipse2D e=new Ellipse2D.Double();
		e.setFrame(r);
		g2.setPaint(new Color(150,140,255).brighter().brighter().brighter().brighter());
		Color co=new Color (110,189,200);
		g2.setPaint(co);
		g2.fill(e);
		g2.draw(e);
		
		g2.draw(new Line2D.Double(100,100,300,250));
		double cx=r.getCenterX();
		double cy=r.getCenterY();
		double ra=150;
		
		Ellipse2D c=new Ellipse2D.Double();
		c.setFrameFromCenter(cx, cy, cx+ra,cy+ra);
		g2.draw(c);
		
		
	}
}
*/
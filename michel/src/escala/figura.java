package escala;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class figura {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	int contador =1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					figura window = new figura();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public figura() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 1064, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 827, 636);
		frame.getContentPane().add(panel);
		
		JButton derecha = new JButton("");
		derecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Graphics lapiiz=panel.getGraphics();
				Graphics lapiz=panel.getGraphics();
				lapiiz.setColor(Color.RED);
				lapiz.setColor(Color.white);
				switch(contador) {
			
				case 1:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(430, 240, 100, 20);
					//lapiiz.fillRect(470, 260, 20, 80);
					//lapiiz.fillRect(430, 320, 40, 20);
					break;
					
                case 2:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(460, 240, 100, 20);
					//lapiiz.fillRect(500, 260, 20, 80);
					//lapiiz.fillRect(460, 320, 40, 20);	
					break;
				
                case 3:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(490, 240, 100, 20);
					//lapiiz.fillRect(530, 260, 20, 80);
					//lapiiz.fillRect(490, 320, 40, 20);	
					break;
				
                case 4:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(520, 240, 100, 20);
					//lapiiz.fillRect(560, 260, 20, 80);
					//lapiiz.fillRect(520, 320, 40, 20);	
					break;	
				
                case 5:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(550, 240, 100, 20);
					//lapiiz.fillRect(590, 260, 20, 80);
					//lapiiz.fillRect(550, 320, 40, 20);	
					break;		
					
                case 6:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(580, 240, 100, 20);
					//lapiiz.fillRect(620, 260, 20, 80);
					//lapiiz.fillRect(580, 320, 40, 20);	
					break;		
				
                case 7:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(610, 240, 100, 20);
					//lapiiz.fillRect(650, 260, 20, 80);
					//lapiiz.fillRect(610, 320, 40, 20);	
					break;
					
                case 8:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(640, 240, 100, 20);
					//lapiiz.fillRect(680, 260, 20, 80);
					//lapiiz.fillRect(640, 320, 40, 20);	
					break;
					
                case 9:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(670, 240, 100, 20);
					//lapiiz.fillRect(710, 260, 20, 80);
					//lapiiz.fillRect(670, 320, 40, 20);	
					break;		
				
                case 10:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(700, 240, 100, 20);
					//lapiiz.fillRect(740, 260, 20, 80);
					//lapiiz.fillRect(700, 320, 40, 20);	
					
					
				}	
				contador++;
			}
		});
		derecha.setBackground(new Color(0, 0, 0));
		derecha.setIcon(new ImageIcon(figura.class.getResource("/iconos/derecha.png")));
		derecha.setBounds(970, 134, 34, 60);
		frame.getContentPane().add(derecha);
		
		JButton izquierda = new JButton("");
		izquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics lapiiz=panel.getGraphics();
				Graphics lapiz=panel.getGraphics();
				lapiiz.setColor(Color.RED);
				lapiz.setColor(Color.white);
				switch(contador) {
			
				case 1:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(370, 240, 100, 20);
					//lapiiz.fillRect(410, 260, 20, 80);
					//lapiiz.fillRect(370, 320, 40, 20);
					break;
					
                case 2:
					
        			lapiz.fillRect(0, 0, 827, 639);
        			lapiiz.fillRect(340, 240, 100, 20);
        			//lapiiz.fillRect(380, 260, 20, 80);
        			//lapiiz.fillRect(340, 320, 40, 20);
					break;	
				
                case 3:
					
        			lapiz.fillRect(0, 0, 827, 639);
        			lapiiz.fillRect(310, 240, 100, 20);
        			//lapiiz.fillRect(350, 260, 20, 80);
        			//lapiiz.fillRect(310, 320, 40, 20);
        			break;
				
                case 4:
					
        			lapiz.fillRect(0, 0, 827, 639);
        			lapiiz.fillRect(280, 240, 100, 20);
        			//lapiiz.fillRect(320, 260, 20, 80);
        			//lapiiz.fillRect(280, 320, 40, 20);
        			break; 
        			
        		case 5:
    					
            		lapiz.fillRect(0, 0, 827, 639);
            		lapiiz.fillRect(250, 240, 100, 20);
            		//lapiiz.fillRect(290, 260, 20, 80);
            		//lapiiz.fillRect(250, 320, 40, 20);
            		break;
            			
                case 6:
					
        			lapiz.fillRect(0, 0, 827, 639);
        			lapiiz.fillRect(220, 240, 100, 20);
        			//lapiiz.fillRect(260, 260, 20, 80);
        			//lapiiz.fillRect(220, 320, 40, 20);
        			break;
        			
                case 7:
					
        			lapiz.fillRect(0, 0, 827, 639);
        			lapiiz.fillRect(190, 240, 100, 20);
        			//lapiiz.fillRect(230, 260, 20, 80);
        			//lapiiz.fillRect(190, 320, 40, 20);
        			break;	
        		
                case 8:
					
        			lapiz.fillRect(0, 0, 827, 639);
        			lapiiz.fillRect(160, 240, 100, 20);
        			//lapiiz.fillRect(200, 260, 20, 80);
        			//lapiiz.fillRect(160, 320, 40, 20);
        			break;
                case 9:
					
        			lapiz.fillRect(0, 0, 827, 639);
        			lapiiz.fillRect(130, 240, 100, 20);
        			//lapiiz.fillRect(170, 260, 20, 80);
        			//lapiiz.fillRect(130, 320, 40, 20);
        			break;
        			
                case 10:
					
        			lapiz.fillRect(0, 0, 827, 639);
        			lapiiz.fillRect(100, 240, 100, 20);
        			//lapiiz.fillRect(140, 260, 20, 80);
        			//lapiiz.fillRect(100, 320, 40, 20);
        			break;	
        		
                case 11:
					
        			lapiz.fillRect(0, 0, 827, 639);
        			lapiiz.fillRect(70, 240, 100, 20);
        			//lapiiz.fillRect(110, 260, 20, 80);
        			//lapiiz.fillRect(70, 320, 40, 20);
        			break;
        		
                case 12:
					
        			lapiz.fillRect(0, 0, 827, 639);
        			lapiiz.fillRect(40, 240, 100, 20);
        			//lapiiz.fillRect(80, 260, 20, 80);
        			//lapiiz.fillRect(40, 320, 40, 20);
        			break;
        			
                case 13:
					
        			lapiz.fillRect(0, 0, 827, 639);
        			lapiiz.fillRect(10, 240, 100, 20);
        			//lapiiz.fillRect(50, 260, 20, 80);
        			//lapiiz.fillRect(10, 320, 40, 20);	

        			
        			
				}
				contador++;
				
			}
		});
		izquierda.setBackground(new Color(0, 0, 0));
		izquierda.setIcon(new ImageIcon(figura.class.getResource("/iconos/izquierda.png")));
		izquierda.setBounds(872, 134, 34, 60);
		frame.getContentPane().add(izquierda);
		
		JButton arriba = new JButton("");
		arriba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics lapiiz=panel.getGraphics();
				Graphics lapiz=panel.getGraphics();
				lapiiz.setColor(Color.RED);
				lapiz.setColor(Color.white);
				switch(contador) {
			
				case 1:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 210, 100, 20);
					//lapiiz.fillRect(440, 230, 20, 80);
					//lapiiz.fillRect(400, 290, 40, 20);
					break;
					
				case 2:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 180, 100, 20);
					//lapiiz.fillRect(440, 200, 20, 80);
					//lapiiz.fillRect(400, 260, 40, 20);
					break;
				
				case 3:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 150, 100, 20);
					//lapiiz.fillRect(440, 170, 20, 80);
					//lapiiz.fillRect(400, 230, 40, 20);
					break;	
				
                case 4:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 120, 100, 20);
					//lapiiz.fillRect(440, 140, 20, 80);
					//lapiiz.fillRect(400, 200, 40, 20);
					break;	
				
                case 5:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 90, 100, 20);
					//lapiiz.fillRect(440, 110, 20, 80);
					//lapiiz.fillRect(400, 170, 40, 20);
					break;	
				
                case 6:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 60, 100, 20);
					//lapiiz.fillRect(440, 80, 20, 80);
					//lapiiz.fillRect(400, 140, 40, 20);
					break;		
				
                case 7:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 30, 100, 20);
					//lapiiz.fillRect(440, 50, 20, 80);
					//lapiiz.fillRect(400, 110, 40, 20);
					break;	
				
                case 8:
					
 					lapiz.fillRect(0, 0, 827, 639);
 					lapiiz.fillRect(400, 0, 100, 20);
 					//lapiiz.fillRect(440, 20, 20, 80);
 					//lapiiz.fillRect(400, 80, 40, 20);


				}
				contador++;
				
			}
		});
		arriba.setBackground(new Color(0, 0, 0));
		arriba.setIcon(new ImageIcon(figura.class.getResource("/iconos/arriba.png")));
		arriba.setBounds(908, 110, 60, 31);
		frame.getContentPane().add(arriba);
		
		JButton abajo = new JButton("");
		abajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics lapiiz=panel.getGraphics();
				Graphics lapiz=panel.getGraphics();
				lapiiz.setColor(Color.RED);
				lapiz.setColor(Color.white);
				switch(contador) {
			
				case 1:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 270, 100, 20);
					//lapiiz.fillRect(440, 290, 20, 80);
					//lapiiz.fillRect(400, 350, 40, 20);
					break;	
					
				case 2:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 300, 100, 20);
					//lapiiz.fillRect(440, 320, 20, 80);
					//lapiiz.fillRect(400, 380, 40, 20);
					break;	
				
				case 3:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 330, 100, 20);
					//lapiiz.fillRect(440, 350, 20, 80);
					//lapiiz.fillRect(400, 410, 40, 20);
					break;	
				
				case 4:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 360, 100, 20);
					//lapiiz.fillRect(440, 380, 20, 80);
					//lapiiz.fillRect(400, 440, 40, 20);
					break;		
				
                case 5:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 390, 100, 20);
					//lapiiz.fillRect(440, 410, 20, 80);
					//lapiiz.fillRect(400, 470, 40, 20);
					break;
					
                case 6:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 420, 100, 20);
					//lapiiz.fillRect(440, 440, 20, 80);
					//lapiiz.fillRect(400, 500, 40, 20);
					break;
				
                case 7:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 450, 100, 20);
					//lapiiz.fillRect(440, 470, 20, 80);
					//lapiiz.fillRect(400, 530, 40, 20);
					break;	
				
                case 8:
					
					lapiz.fillRect(0, 0, 827, 639);
					lapiiz.fillRect(400, 480, 100, 20);
					//lapiiz.fillRect(440, 500, 20, 80);
					//lapiiz.fillRect(400, 560, 40, 20);
					break;		
				
                case 9:
					
 					lapiz.fillRect(0, 0, 827, 639);
 					lapiiz.fillRect(400, 510, 100, 20);
 					//lapiiz.fillRect(440, 530, 20, 80);
 					//lapiiz.fillRect(400, 590, 40, 20);	
					
					
				}
				contador++;
				
			}
		});
		abajo.setBackground(new Color(0, 0, 0));
		abajo.setIcon(new ImageIcon(figura.class.getResource("/iconos/abajo.png")));
		abajo.setBounds(908, 186, 60, 31);
		frame.getContentPane().add(abajo);
		
		JButton dibujar = new JButton("");
		dibujar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Graphics lapiiz=panel.getGraphics();
			Graphics lapiz=panel.getGraphics();
			lapiiz.setColor(Color.RED);
			lapiz.setColor(Color.white);
			
			lapiz.fillRect(0, 0, 827, 639);
			lapiiz.fillRect(400, 240, 100, 20);
			//lapiiz.fillRect(440, 260, 20, 80);
			//lapiiz.fillRect(400, 320, 40, 20);
			contador=1;
			
			}
		});
		dibujar.setBackground(new Color(0, 0, 0));
		dibujar.setIcon(new ImageIcon(figura.class.getResource("/iconos/dibuja.png")));
		dibujar.setBounds(908, 275, 60, 40);
		frame.getContentPane().add(dibujar);
		
		JButton aumenta = new JButton("");
		aumenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics lapiiz=panel.getGraphics();
				Graphics lapiz=panel.getGraphics();
				lapiiz.setColor(Color.RED);
				lapiz.setColor(Color.white);
				
			switch (contador) {
			
			case 1:
				
			    lapiz.fillRect(0, 0, 827, 639);
			    lapiiz.fillRect(400, 240, 140, 60);
			    //lapiiz.fillRect(440, 260, 60, 120);
			    //lapiiz.fillRect(400, 320, 80, 60);
			    break;
			
			case 2:
				
				lapiz.fillRect(0, 0, 827, 639);
				lapiiz.fillRect(400, 240, 180, 100);
				break;
			
			case 3:
				
				lapiz.fillRect(0, 0, 827, 639);
				lapiiz.fillRect(400, 240, 220, 140);
				break;	
			
			case 4:
				
				lapiz.fillRect(0, 0, 827, 639);
				lapiiz.fillRect(400, 240, 260, 180);
				break;	
			
			case 5:
				
				lapiz.fillRect(0, 0, 827, 639);
				lapiiz.fillRect(400, 240, 300, 220);
				break;	
			
			case 6:
				
				lapiz.fillRect(0, 0, 827, 639);
				lapiiz.fillRect(400, 240, 340, 260);
				break;
				
				
			   }				
			contador++;	
			
			}
		});
		aumenta.setBackground(new Color(0, 0, 0));
		aumenta.setIcon(new ImageIcon(figura.class.getResource("/iconos/expandir.png")));
		aumenta.setBounds(918, 358, 41, 40);
		frame.getContentPane().add(aumenta);
		
		JButton rotarIzq = new JButton("");
		rotarIzq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Graphics lapiiz=panel.getGraphics();
				Graphics lapiz=panel.getGraphics();
				lapiiz.setColor(Color.RED);
				lapiz.setColor(Color.white);
			
				switch (contador) {
				
                case 1:
					
				    lapiz.fillRect(0, 0, 827, 639);
				    lapiiz.fillRect(400, 160, 20, 100);
				    break;
                case 2:
					
                	lapiz.fillRect(0, 0, 827, 639);
				    lapiiz.fillRect(320, 240, 100, 20);
				    break;
				    
                case 3:
					
                	 lapiz.fillRect(0, 0, 827, 639);
 				    lapiiz.fillRect(400, 240, 20, 100);
 				    break;
				    
                case 4:
					
                	 lapiz.fillRect(0, 0, 827, 639);
 				    lapiiz.fillRect(400, 240, 100, 20);
				    
				}   
			contador++;	
			}			
		});
		rotarIzq.setBackground(new Color(0, 0, 0));
		rotarIzq.setIcon(new ImageIcon(figura.class.getResource("/iconos/rotarI.png")));
		rotarIzq.setBounds(865, 388, 41, 40);
		frame.getContentPane().add(rotarIzq);
		
		JButton rotarDer = new JButton("");
		rotarDer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics lapiiz=panel.getGraphics();
				Graphics lapiz=panel.getGraphics();
				lapiiz.setColor(Color.RED);
				lapiz.setColor(Color.white);
			
				switch (contador) {
				
				case 1:
					
				    lapiz.fillRect(0, 0, 827, 639);
				    lapiiz.fillRect(400, 240, 20, 100);
				    break;
				
		        case 2:
					
				    lapiz.fillRect(0, 0, 827, 639);
				    lapiiz.fillRect(320, 240, 100, 20);
				    break;
				    
                case 3:
					
				    lapiz.fillRect(0, 0, 827, 639);
				    lapiiz.fillRect(400, 160, 20, 100);
				    break; 
				    
                case 4:
					
				    lapiz.fillRect(0, 0, 827, 639);
				    lapiiz.fillRect(400, 240, 100, 20);
				    break;  
				    
				    
				}   
			contador++;	
							
			}
		});
		rotarDer.setBackground(new Color(0, 0, 0));
		rotarDer.setIcon(new ImageIcon(figura.class.getResource("/iconos/rotarD.png")));
		rotarDer.setBounds(970, 388, 41, 40);
		frame.getContentPane().add(rotarDer);
		
		JButton disminuye = new JButton("");
		disminuye.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Graphics lapiiz=panel.getGraphics();
				Graphics lapiz=panel.getGraphics();
				lapiiz.setColor(Color.RED);
				lapiz.setColor(Color.white);
				
			switch (contador) {
			
			case 1:
				
			    lapiz.fillRect(0, 0, 827, 639);
			    lapiiz.fillRect(400, 240, 90, 15);
			    //lapiiz.fillRect(440, 260, 60, 120);
			    //lapiiz.fillRect(400, 320, 80, 60);
			    break;
			    
			case 2:
				
			    lapiz.fillRect(0, 0, 827, 639);
			    lapiiz.fillRect(400, 240, 80, 10);
			    break;	
			    
	         case 3:
				
			    lapiz.fillRect(0, 0, 827, 639);
			    lapiiz.fillRect(400, 240, 70, 5);
			    break;	
			   
	         case 4:
				
			    lapiz.fillRect(0, 0, 827, 639);
			    lapiiz.fillRect(400, 240, 60, 5);
			    break;	   
			 
	         case 5:
					
			    lapiz.fillRect(0, 0, 827, 639);
			    lapiiz.fillRect(400, 240, 50, 1);	    
			    
			    }
			contador++;
			}
		});
		disminuye.setBackground(new Color(0, 0, 0));
		disminuye.setIcon(new ImageIcon(figura.class.getResource("/iconos/peque\u00F1o.png")));
		disminuye.setBounds(918, 420, 41, 40);
		frame.getContentPane().add(disminuye);
		
		JPanel fondoC = new JPanel();
		fondoC.setBackground(new Color(0, 0, 0));
		fondoC.setBounds(825, 0, 223, 636);
		frame.getContentPane().add(fondoC);
		
		JLabel controles = new JLabel("CONTROLES");
		fondoC.add(controles);
		controles.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		controles.setForeground(new Color(255, 255, 255));
	}
}

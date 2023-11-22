package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class eTeclado {

	public static void main(String[] args) {
		eframe ef=new eframe ();
		ef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
class eframe extends JFrame{
	public eframe () {
		setVisible(true);
		setBounds (700,300,600,450);
		evete et=new evete();
		addKeyListener(et);
		
	}
}
class evete implements KeyListener{

	@Override
	public void keyPressed(KeyEvent k) {
		//int co=k.getKeyCode();
		//System.out.println(co);
	}

	@Override
	public void keyReleased(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent k) {
		char let=k.getKeyChar();
		System.out.println(let);
		
	}
	
}
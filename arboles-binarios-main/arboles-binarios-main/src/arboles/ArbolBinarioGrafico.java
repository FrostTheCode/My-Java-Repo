package arboles;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class ArbolBinarioGrafico extends JFrame {

    private JPanel ventana;

    ArbolBinario arbol = new ArbolBinario();

    public ArbolBinarioGrafico() {
        super("Arbol binario grafico");
        arbol.insertarNodoCadena("10,4,11,13,3,2,8,15");
    }

    public int drawTree(Graphics g, Nodo x, int x0, int x1, int y){

        int m = (x0 + x1) / 2;
        g.setColor(Color.BLACK);
        g.fillOval(m, y, 50, 40);
        g.setColor(Color.lightGray);
        g.setFont(new Font("Arial",Font.BOLD,20));
        String t = String.valueOf(x.num);
        g.drawString(t, m+20, y+30);
        if (x.hijoIzquierdo != null) {
            int x2 = drawTree(g, x.hijoIzquierdo,x0,m,y+50);
            g.drawLine(m+25, y+40, x2+25, y+50);
        }
        if (x.hijoDerecho != null) {
            int x2 = drawTree(g, x.hijoDerecho,m,x1,y+50);
            g.drawLine(m+25, y+40, x2+25, y + 50);
        }
        return m;
    }

    /*public static String busquedaAnchura(){
        int array[]={10,4,11,13,3,2,8,15};
        Scanner sc=new Scanner(System.in);
        System.out.println(null);
        String ala="mecos";
        return ala;
    }*/


    @Override
    public void paint(Graphics g) {
        
        super.paint(g);
        drawTree(g, arbol.getRaiz(), 0, this.getWidth()-60, 100);
        //System.out.println("ordenamiento de arbol en primero por anchura:");
       // System.out.println(busquedaAnchura());

    }
}

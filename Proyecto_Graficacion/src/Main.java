import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.YES_OPTION;

public class Main {

    private static JFrame frame = new JFrame();
    private static JLabel label = new JLabel();
    private static BufferedImage image = new BufferedImage(600, 600, BufferedImage.TYPE_INT_RGB);
    private static ImageIcon icon = new ImageIcon();
    private static JMenuBar mainMenu;
    private static JMenu menu, menu2,menu3;
    private static JMenuItem cir, cuad, img, bT, scl, rot ,blu,grin,blac;
    private static JTextField ta;
    private static int rgb1 = Color.GREEN.getRGB();
    private static int rgb5 = Color.WHITE.getRGB();
    private static int[][] datalines = new int[100][4];
    private static int num = 0;
    private static String filename;

    private static void bresenhams(int x0, int y0, int x1, int y1) {
        int dy = y1 - y0;
        int dx = x1 - x0;
        int y = y0;
        int x = x0;

        if (dx == 0) { //Vertical Line
            if (dy > 0) { //Positive Vertical Line
                for (int i = 0; i <= (dy - 1); i++) {
                    setPixel(x, y, rgb5);
                    y++;
                } //for
            } //if
            else { //Negative Vertical Line
                for (int i = 0; i <= ((-dy) - 1); i++) {
                    setPixel(x, y, rgb5);
                    y--;
                } //for
            } //else
        } //if
        else if (dy == 0) { //Horizontal Line
            if (dx > 0) { //Positive Horizontal Line
                for (int i = 0; i <= (dx - 1); i++) {
                    setPixel(x, y, rgb5);
                    x++;
                } //for
            } //if
            else { //Negative Horizontal Line
                for (int i = 0; i <= ((-dx) - 1); i++) {
                    setPixel(x, y, rgb5);
                    x--;
                } //for
            } //else
        } //else-if
        else if (dx == dy) { //Diagonal Line
            if (dx > 0) { //Positive Diagonal Line
                for (int i = 0; i <= (dx - 1); i++) {
                    setPixel(x, y, rgb1);
                    x++;
                    y++;
                } //for
            } //if
            else { //Negative Diagonal Line
                for (int i = 0; i <= ((-dx) - 1); i++) {
                    setPixel(x, y, rgb1);
                    x--;
                    y--;
                } //for
            } //else
        } //else-if
        else if (Math.abs(dx) > Math.abs(dy)) { //Dx > Dy Line
            if ((dx > 0) & (dy > 0)) { //Positive Line
                int E = 2 * dy - dx;
                int inc1 = 2 * dy;
                int inc2 = 2 * (dy - dx);

                while (x < x1) {
                    setPixel(x, y, rgb1);
                    if (E < 0) {
                        E = E + inc1;
                    } //if
                    else {
                        E = E + inc2;
                        y = y + 1;
                    } //else
                    x = x + 1;
                } //while

            } //if
            else if ((dx > 0) & (dy < 0)) { //Negative dy Line
                int E = 2 * (-dy) - dx;
                int inc1 = 2 * (-dy);
                int inc2 = 2 * ((-dy) - dx);

                while (x < x1) {
                    setPixel(x, y, rgb1);
                    if (E < 0) {
                        E = E + inc1;
                    } //if
                    else {
                        E = E + inc2;
                        y = y - 1;
                    } //else
                    x = x + 1;
                } //while

            } //else-if
            else if ((dx < 0) & (dy > 0)) { //Negative dx Line
                int E = 2 * dy + dx;
                int inc1 = 2 * dy;
                int inc2 = 2 * (dy + dx);

                while (x > x1) {
                    setPixel(x, y, rgb1);
                    if (E < 0) {
                        E = E + inc1;
                    } //if
                    else {
                        E = E + inc2;
                        y = y + 1;
                    } //else
                    x = x - 1;
                } //while

            } //else-if
            else { //Negative dx and dy Line
                int E = -(2 * dy - dx);
                int inc1 = 2 * (-dy);
                int inc2 = 2 * (-(dy - dx));

                while (x > x1) {
                    setPixel(x, y, rgb1);
                    if (E < 0) {
                        E = E + inc1;
                    } //if
                    else {
                        E = E + inc2;
                        y = y - 1;
                    } //else
                    x = x - 1;
                } //while

            } //else
        } //else-if
        else { //Dy > Dx Line
            if ((dx > 0) & (dy > 0)) { //Positive Line
                int E = 2 * dx - dy;
                int inc1 = 2 * dx;
                int inc2 = 2 * (dx - dy);

                while (y < y1) {
                    setPixel(x, y, rgb1);
                    if (E < 0) {
                        E = E + inc1;
                    } //if
                    else {
                        E = E + inc2;
                        x = x + 1;
                    } //else
                    y = y + 1;
                } //while

            } //if
            else if ((dx > 0) & (dy < 0)) { //Negative dy Line
                int E = 2 * dx + dy;
                int inc1 = 2 * dx;
                int inc2 = 2 * (dx + dy);

                while (y > y1) {
                    setPixel(x, y, rgb1);
                    if (E < 0) {
                        E = E + inc1;
                    } //if
                    else {
                        E = E + inc2;
                        x = x + 1;
                    } //else
                    y = y - 1;
                } //while

            } //else-if
            else if ((dx < 0) & (dy > 0)) { //Negative dx Line
                int E = 2 * (-dx) - dy;
                int inc1 = 2 * (-dx);
                int inc2 = 2 * ((-dx) - dy);

                while (y < y1) {
                    setPixel(x, y, rgb1);
                    if (E < 0) {
                        E = E + inc1;
                    } //if
                    else {
                        E = E + inc2;
                        x = x - 1;
                    } //else
                    y = y + 1;
                } //while

            } //else-if
            else { //Negative dx and dy Line
                int E = -(2 * dx - dy);
                int inc1 = 2 * (-dx);
                int inc2 = 2 * (-(dx - dy));

                while (y > y1) {
                    setPixel(x, y, rgb1);
                    if (E < 0) {
                        E = E + inc1;
                    } //if
                    else {
                        E = E + inc2;
                        x = x - 1;
                    } //else
                    y = y - 1;
                } //while

            } //else
        } //else
    } //bse
    

    private static void setPixel(int x, int y, int rgb) {
        image.setRGB(x, y, rgb);
        icon.setImage(image);
        label.setIcon(icon);
        frame.add(label);
    } //setPixel
    
    

    private static double[][] basicTranslate(int tx, int ty) {
        double[][] m = {{1, 0, 0}, {0, 1, 0}, {tx, ty, 1}};
        return m;
    } //basicTranslate

    private static double[][] basicScale(int sx, int sy) {
        double[][] m = {{sx, 0, 0}, {0, sy, 0}, {0, 0, 1}};
        return m;
    } //basicScale

    private static double[][] basicRotate(int angle) {
        double cosine = Math.cos(Math.toRadians(angle));
        double sine = Math.sin(Math.toRadians(angle));
        double[][] m = {{cosine, (-sine), 0}, {sine, cosine, 0}, {0, 0, 1}};
        return m;
    } //basicRotate

    private static double[][] scale(int sx, int sy, int cx, int cy) {
        double[][] m = concat(basicTranslate(Math.negateExact(cx), Math.negateExact(cy)), basicScale(sx, sy));
        return concat(m, basicTranslate(cx, cy));
    } //scale

    private static double[][] rotate(int angle, int cx, int cy) {
        double[][] m = concat(basicTranslate(Math.negateExact(cx), Math.negateExact(cy)), basicRotate(angle));
        return concat(m, basicTranslate(cx, cy));
    } //rotate

    private static void applyTransformation(double[][] matrix, int[][] datalines) {
        int[] x = new int[3];
        int[] x2 = new int[3];
        for (int i = 0; i < num; i++) {
            x[0] = datalines[i][0];
            x[1] = datalines[i][1];
            x[2] = 1;
            x2[0] = datalines[i][2];
            x2[1] = datalines[i][3];
            x2[2] = 1;
            x = dotProduct(x, matrix);
            x2 = dotProduct(x2, matrix);
            datalines[i][0] = x[0];
            datalines[i][1] = x[1];
            datalines[i][2] = x2[0];
            datalines[i][3] = x2[1];
        } //for
    } //applyTransformation

    private static void displayPixels(int[][] datalines, int num) {
        String s = "Coordinates: ";
        for (int i = 0; i < num; i++) {
            int x0 = datalines[i][0]+300;
            int y0 = datalines[i][1]+300;
            int x1 = datalines[i][2]+300;
            int y1 = datalines[i][3]+300;
            bresenhams(x0, y0, x1, y1);
            s += ("(" + (x0-300) + ", " + (y0-300) + ") " + "(" + (x1-300) + ", " + (y1-300) + ") ");
            if (i != num-1) {
                s += "-> ";
            } //if
        } //for
        ta.setText(s);
        frame.setVisible(true);
    } //displayPixels

    private static int[] dotProduct(int[] x, double[][] matrix) {
        int[] y = new int[x.length];
        for (int i = 0; i < matrix.length; i++) {
            int r = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                r += (x[j] * matrix[j][i]);
            } //for
            y[i] = r;
        } //for
        return y;
    } //dotProduct

    private static double[][] concat(double[][] m1, double[][] m2) {
        double[][] result = new double[3][3];
        double num = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num = 0;
                num += m1[i][0] * m2[0][j];
                num += m1[i][1] * m2[1][j];
                num += m1[i][2] * m2[2][j];
                result[i][j] = num;
            } //for
        } //for
        return result;
    } //concat

    private static int inputLines(int[][] datalines, int num) {
        try {
            FileReader in = new FileReader(filename);
            BufferedReader br = new BufferedReader(in);
            String s = br.readLine();
            while (s != null) {
                String[] line = s.split(" ");
                datalines[num][0] = Integer.parseInt(line[0]);
                datalines[num][1] = Integer.parseInt(line[1]);
                datalines[num][2] = Integer.parseInt(line[2]);
                datalines[num][3] = Integer.parseInt(line[3]);
                num++;
                s = br.readLine();
            } //while
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error: Cannot open " + filename, "Error", ERROR_MESSAGE);
        } //catch
        displayPixels(datalines, num);
        return num;
    } //inputLines

    private static void outputLines(int[][] datalines, int num) {
        try {
            FileWriter out = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(out);
            for (int i = 0; i < num; i++) {
                String s = (datalines[i][0]) + " " + (datalines[i][1]) + " " + (datalines[i][2]) + " " + (datalines[i][3]) + "\n";
                bw.write(s);
            } //for
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error: Cannot output to " + filename, "Error", ERROR_MESSAGE);
        } //catch
    } //outputLines

    public static void main(String[] args) {
        createGUI();
        bresenhams(300, 0, 300, 600);
        bresenhams(0, 300, 600, 300);
        setPixel(300, 300, rgb5);
        frame.update(frame.getGraphics());
        frame.setVisible(true);
    }

      

    private static void createGUI() {
        frame = new JFrame("Proyecto: TOKIO SNIPER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        ButtonListener ls=new ButtonListener();
        mainMenu = new JMenuBar();
        menu = new JMenu("Form");
        cir = new JMenuItem("circulo");
        cir.addActionListener(ls);
        cuad = new JMenuItem("cuadrado");
        cuad.addActionListener(ls);
        img = new JMenuItem("imagen");
        img.addActionListener(ls);
        menu.add(cir);
        menu.add(cuad);
        menu.add(img);
        mainMenu.add(menu);
        
        menu2 = new JMenu("Transformation");
        bT = new JMenuItem("Translate");
        bT.addActionListener(ls);
        scl = new JMenuItem("Scale");
        scl.addActionListener(ls);
        rot = new JMenuItem("Rotate");
        rot.addActionListener(ls);
        menu2.add(bT);
        menu2.add(scl);
        menu2.add(rot);
        mainMenu.add(menu2);
        
        menu3 = new JMenu("Color");
        blac = new JMenuItem("black");
        blac.addActionListener(ls);
        blu = new JMenuItem("Blue");
        blu.addActionListener(ls);
        grin = new JMenuItem("Green");
        grin.addActionListener(ls);
        menu3.add(blac);
        menu3.add(blu);
        menu3.add(grin);
        mainMenu.add(menu3);
        

        label.setMaximumSize(new Dimension(600, 600));
        label.setMinimumSize(new Dimension(600, 600));
        label.setPreferredSize(new Dimension(600, 600));
        icon.setImage(image);
        label.setIcon(icon);
        
        ta = new JTextField();
        ta.setText("Coordinates of figure");


        frame.getContentPane().add(BorderLayout.NORTH, mainMenu);
        frame.getContentPane().add(BorderLayout.CENTER, label);
        frame.getContentPane().add(BorderLayout.SOUTH, ta);
        frame.setVisible(true);
    } //createGUI

    private static class ButtonListener implements ActionListener {

    
    	
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == cir) {
            	String input = JOptionPane.showInputDialog(frame, " ingresa los numeros nesesarios para dibujar el circulo ", JOptionPane.PLAIN_MESSAGE);
            	
            } //if
            else if (e.getSource() == cuad) {
            	
            	String input = JOptionPane.showInputDialog(frame, " ingresa los numeros nesesarios para dibujar el cuadrado ", JOptionPane.PLAIN_MESSAGE);
                
            } //else-if
            else if (e.getSource() == img) {
            	String input = JOptionPane.showInputDialog(frame, " ingresa los numeros nesesarios para dibujar la imagen ", JOptionPane.PLAIN_MESSAGE);
            } //else-if
            else if (e.getSource() == bT) {
                try {
                    String input = JOptionPane.showInputDialog(frame, "Enter two integers for translation: ", JOptionPane.PLAIN_MESSAGE);
                    String[] s = input.split(" ");
                    int tx = Integer.parseInt(s[0]);
                    int ty = Integer.parseInt(s[1]);
                    applyTransformation(basicTranslate(tx, ty), datalines);
                    displayPixels(datalines, num);
                    frame.update(frame.getGraphics());
                    frame.setVisible(true);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(frame, "Cannot perform transformation. Inputs not within bounds.");
                } //try-catch
            } //else-if
            else if (e.getSource() == scl) {
                try {
                    String input = JOptionPane.showInputDialog(frame, "Enter two integers for scaling and two integers for the center point: ", JOptionPane.PLAIN_MESSAGE);
                    String[] s = input.split(" ");
                    int sx = Integer.parseInt(s[0]);
                    int sy = Integer.parseInt(s[1]);
                    int cx = Integer.parseInt(s[2]);
                    int cy = Integer.parseInt(s[3]);
                    applyTransformation(scale(sx, sy, cx, cy), datalines);
                    displayPixels(datalines, num);
                    frame.update(frame.getGraphics());
                    frame.setVisible(true);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(frame, "Cannot perform transformation. Inputs not within bounds.");
                } //try-catch
            } //else-if
            else if (e.getSource() == rot) {
                try {
                    String input = JOptionPane.showInputDialog(frame, "Enter the degree of rotation and two integers for center point: ", JOptionPane.PLAIN_MESSAGE);
                    String[] s = input.split(" ");
                    int angle = Integer.parseInt(s[0]);
                    int cx = Integer.parseInt(s[1]);
                    int cy = Integer.parseInt(s[2]);
                    applyTransformation(rotate(angle, cx, cy), datalines);
                    displayPixels(datalines, num);
                    frame.update(frame.getGraphics());
                    frame.setVisible(true);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(frame, "Cannot perform transformation. Inputs not within bounds.");
                } //try-catch
            } //else-if
            
            else if (e.getSource() == blac) {
        
            } //else-if
            else if (e.getSource() == blu) {
                
            } //else-if
            else if (e.getSource() == grin) {
                
            } //else-if
            
            else {
                JOptionPane.showMessageDialog(frame, "Error with menu options.");
                System.exit(0);
            } //else
        } //actionPerformed
    } //ButtonListener
    
} //Main

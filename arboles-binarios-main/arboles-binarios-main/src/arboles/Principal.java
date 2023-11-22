package arboles;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new ArbolBinarioGrafico();
                frame.setSize(500, 400);
                frame.setVisible(true);
            }
        });
    }
}

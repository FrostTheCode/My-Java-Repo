/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author jada1
 */
public class IDE extends javax.swing.JFrame {
    NumeroLinea numerolinea;

    /**
     * Creates new form IDE
     */
    public IDE() {
        initComponents();
        inicializar();
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    
    
    private void incilaizar(){
        setTitle("javaapp");
        String[]options =new String[]("guardar y continuar","descargar");
        numerolinea= new NumeroLinea(jtpCode);
        jScrollPanel.setRowHeader();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGUARDAR = new javax.swing.JButton();
        ntnNUEVO = new javax.swing.JButton();
        btnABRIR = new javax.swing.JButton();
        btnRESERVADAS = new javax.swing.JButton();
        btnIDENT = new javax.swing.JButton();
        btnTOKEN = new javax.swing.JButton();
        btnCOPILAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpCODE = new javax.swing.JTextPane();
        jtaCOPILE = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGUARDAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/Icon/icons8_save_48px.png"))); // NOI18N
        btnGUARDAR.setText("GUARDAR");
        btnGUARDAR.setToolTipText("GUARDAR DOCUMENTO\n ");
        btnGUARDAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGUARDAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/pressed/icons8_save_48px_p.png"))); // NOI18N
        btnGUARDAR.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/On Layer/icons8_save_48px_on.png"))); // NOI18N
        btnGUARDAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUARDARActionPerformed(evt);
            }
        });
        getContentPane().add(btnGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 13, 91, 78));

        ntnNUEVO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/Icon/icons8_code_file_48px.png"))); // NOI18N
        ntnNUEVO.setText("NUEVO");
        ntnNUEVO.setToolTipText("NUEVO");
        ntnNUEVO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ntnNUEVO.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/On Layer/icons8_code_file_48px_on.png"))); // NOI18N
        ntnNUEVO.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/pressed/icons8_code_file_48px_p.png"))); // NOI18N
        ntnNUEVO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ntnNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntnNUEVOActionPerformed(evt);
            }
        });
        getContentPane().add(ntnNUEVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 13, -1, -1));

        btnABRIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/Icon/icons8_opened_folder_48px.png"))); // NOI18N
        btnABRIR.setText("ABRIR");
        btnABRIR.setToolTipText("ABRIR");
        btnABRIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnABRIR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/On Layer/icons8_opened_folder_48px_ON.png"))); // NOI18N
        btnABRIR.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/pressed/icons8_opened_folder_48px_P.png"))); // NOI18N
        btnABRIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnABRIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 13, -1, -1));

        btnRESERVADAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/Icon/icons8-text-color-48.png"))); // NOI18N
        btnRESERVADAS.setText("RESERVADAS");
        btnRESERVADAS.setToolTipText("RESERVADAS");
        btnRESERVADAS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRESERVADAS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/On Layer/icons8-text-color-48.png"))); // NOI18N
        btnRESERVADAS.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/pressed/icons8-text-color-48.png"))); // NOI18N
        btnRESERVADAS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnRESERVADAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 13, 117, -1));

        btnIDENT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/Icon/icons8-text-cursor-48.png"))); // NOI18N
        btnIDENT.setText("IDENT");
        btnIDENT.setToolTipText("IDENTIFICA");
        btnIDENT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIDENT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/On Layer/icons8-text-cursor-48.png"))); // NOI18N
        btnIDENT.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/pressed/icons8-text-cursor-48.png"))); // NOI18N
        btnIDENT.setVerifyInputWhenFocusTarget(false);
        btnIDENT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIDENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDENTActionPerformed(evt);
            }
        });
        getContentPane().add(btnIDENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 13, -1, -1));

        btnTOKEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/Icon/icons8-index-48.png"))); // NOI18N
        btnTOKEN.setText("TOKEN");
        btnTOKEN.setToolTipText("TOKENS");
        btnTOKEN.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/On Layer/icons8-index-48.png"))); // NOI18N
        btnTOKEN.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/pressed/icons8-index-48.png"))); // NOI18N
        btnTOKEN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnTOKEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 26, -1, -1));

        btnCOPILAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/Icon/icons8_code_48px.png"))); // NOI18N
        btnCOPILAR.setText("COPILAR");
        btnCOPILAR.setToolTipText("COPILADOR");
        btnCOPILAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCOPILAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/On Layer/icons8_code_48px_on.png"))); // NOI18N
        btnCOPILAR.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapp/pressed/icons8_code_48px_p.png"))); // NOI18N
        btnCOPILAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnCOPILAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 13, -1, -1));

        jScrollPane1.setViewportView(jtpCODE);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 117, 728, 260));
        getContentPane().add(jtaCOPILE, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 377, 728, 65));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUARDARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGUARDARActionPerformed

    private void ntnNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntnNUEVOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ntnNUEVOActionPerformed

    private void btnIDENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIDENTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnABRIR;
    private javax.swing.JButton btnCOPILAR;
    private javax.swing.JButton btnGUARDAR;
    private javax.swing.JButton btnIDENT;
    private javax.swing.JButton btnRESERVADAS;
    private javax.swing.JButton btnTOKEN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtaCOPILE;
    private javax.swing.JTextPane jtpCODE;
    private javax.swing.JButton ntnNUEVO;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
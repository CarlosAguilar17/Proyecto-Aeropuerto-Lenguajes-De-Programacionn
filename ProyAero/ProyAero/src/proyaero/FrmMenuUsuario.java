/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyaero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author carlo
 */
public class FrmMenuUsuario extends javax.swing.JFrame {
    
    public FrmMenuUsuario() {
        initComponents();
        //AutoCompleteDecorator.decorate(CbDestino);
        //AutoCompleteDecorator.decorate(CbOrigen);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButVuelo1 = new javax.swing.JButton();
        lblMenuUsuario = new javax.swing.JLabel();
        BtnComprar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        LblOrigen = new javax.swing.JLabel();
        LblVuelos = new javax.swing.JLabel();
        LblDestino = new javax.swing.JLabel();
        LblSalida = new javax.swing.JLabel();
        LblRegreso = new javax.swing.JLabel();
        LblPasajeros = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        CbOrigen = new javax.swing.JComboBox<>();
        CbDestino = new javax.swing.JComboBox<>();
        DtSalida = new com.toedter.calendar.JDateChooser();
        DtRegreso = new com.toedter.calendar.JDateChooser();
        TxtPasajeros = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LtDatos = new javax.swing.JList<>();

        ButVuelo1.setText("Elegir Vuelo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMenuUsuario.setText("Menu de Usuario");
        getContentPane().add(lblMenuUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        BtnComprar.setText("Comprar");
        BtnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 134, -1));

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 134, -1));

        BtnSalir.setText("Cerrar Sesion");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 134, -1));

        LblOrigen.setText("Origen");
        getContentPane().add(LblOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, -1, 20));

        LblVuelos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblVuelos.setText("Busca tu Vuelo");
        getContentPane().add(LblVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        LblDestino.setText("Destino");
        getContentPane().add(LblDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        LblSalida.setText("Salida");
        getContentPane().add(LblSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        LblRegreso.setText("Regreso");
        getContentPane().add(LblRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        LblPasajeros.setText("Pasajeros");
        getContentPane().add(LblPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        BtnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyaero/2311526.png"))); // NOI18N
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 40, 40));

        CbOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciones.." }));
        CbOrigen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbOrigenMouseClicked(evt);
            }
        });
        CbOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(CbOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, -1));

        CbDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciones.." }));
        CbDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbDestinoMouseClicked(evt);
            }
        });
        CbDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(CbDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 210, -1));
        getContentPane().add(DtSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 130, -1));
        getContentPane().add(DtRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 130, -1));
        getContentPane().add(TxtPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 60, -1));

        jScrollPane1.setViewportView(LtDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 490, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        FrmLogin objLogin = new FrmLogin();
        this.setVisible(false);
        objLogin.setVisible(true);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarActionPerformed
        FrmComprar objcompra = new FrmComprar();
        this.setVisible(false);
        objcompra.setVisible(true);
    }//GEN-LAST:event_BtnComprarActionPerformed

    private void CbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbDestinoActionPerformed
        
    }//GEN-LAST:event_CbDestinoActionPerformed

    private void CbDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbDestinoMouseClicked
        CbDestino.removeAllItems();
        FileReader fileReader = null;
        try {
            String cadenaLeida="";
            fileReader = new FileReader("C:\\Users\\HP\\Documents\\Sexto semestre\\Lenguajes de Programacion III\\Proyecto Aeropuerto\\Proyecto-Aeropuerto\\Destinos.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            cadenaLeida = bufferedReader.readLine();
            while (cadenaLeida != null) {
                StringTokenizer st = new StringTokenizer(cadenaLeida,",");
                String origen = st.nextToken();
                CbDestino.addItem(origen);
                cadenaLeida = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                Logger.getLogger(FrmMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CbDestinoMouseClicked

    private void CbOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbOrigenActionPerformed
        
    }//GEN-LAST:event_CbOrigenActionPerformed

    private void CbOrigenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbOrigenMouseClicked
       CbOrigen.removeAllItems();
        FileReader fileReader = null;
        try {
            String cadenaLeida="";
            fileReader = new FileReader("C:\\Users\\HP\\Documents\\Sexto semestre\\Lenguajes de Programacion III\\Proyecto Aeropuerto\\Proyecto-Aeropuerto\\Origenes.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            cadenaLeida = bufferedReader.readLine();
            while (cadenaLeida != null) {
                StringTokenizer st = new StringTokenizer(cadenaLeida,",");
                String origen = st.nextToken();
                CbOrigen.addItem(origen);
                cadenaLeida = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                Logger.getLogger(FrmMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CbOrigenMouseClicked

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        
    }//GEN-LAST:event_BtnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnComprar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton ButVuelo1;
    private javax.swing.JComboBox<String> CbDestino;
    private javax.swing.JComboBox<String> CbOrigen;
    private com.toedter.calendar.JDateChooser DtRegreso;
    private com.toedter.calendar.JDateChooser DtSalida;
    private javax.swing.JLabel LblDestino;
    private javax.swing.JLabel LblOrigen;
    private javax.swing.JLabel LblPasajeros;
    private javax.swing.JLabel LblRegreso;
    private javax.swing.JLabel LblSalida;
    private javax.swing.JLabel LblVuelos;
    private javax.swing.JList<String> LtDatos;
    private javax.swing.JTextField TxtPasajeros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMenuUsuario;
    // End of variables declaration//GEN-END:variables

}

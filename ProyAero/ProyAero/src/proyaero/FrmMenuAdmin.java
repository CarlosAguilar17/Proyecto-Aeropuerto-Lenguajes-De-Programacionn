/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyaero;

/**
 *
 * @author carlo
 */
public class FrmMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuAdmin
     */
    public FrmMenuAdmin() {
        initComponents();
        IniciarPantalla();
        
    }
    public void IniciarPantalla(){
        //las tablas invisibles
        tblVuelos.setVisible(false);
        tblBoletos.setVisible(false);
        tblAviones.setVisible(false);
        //los botones iniciales
        btnAgregar.setVisible(false);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(false);
        btnAgregarElemento.setVisible(true);
        btnModificarElemento.setVisible(true);
        btnEliminarElemento.setVisible(true);
        //Titulos
        lblTituloTabla.setVisible(false);
        lblTitulo.setText("Opciones de BD");
        //Opciones de datos 1,2,3
        txtDato1.setVisible(false);
        txtDato2.setVisible(false);
        txtDato3.setVisible(false);
        txtDato4.setVisible(false);
        lblDato1.setVisible(false);
        lblDato2.setVisible(false);
        lblDato3.setVisible(false);
        lblDato4.setVisible(false);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblBoletos = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        tblAviones = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tblVuelos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblTituloTabla = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtDato1 = new javax.swing.JTextField();
        txtDato2 = new javax.swing.JTextField();
        txtDato3 = new javax.swing.JTextField();
        lblDato1 = new javax.swing.JLabel();
        lblDato2 = new javax.swing.JLabel();
        lblDato3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnEliminarElemento = new javax.swing.JButton();
        btnModificarElemento = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregarElemento = new javax.swing.JButton();
        lblDato4 = new javax.swing.JLabel();
        txtDato4 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuOpcionesDB = new javax.swing.JMenu();
        MenuPanAviones = new javax.swing.JMenuItem();
        MenuPanVuelos = new javax.swing.JMenuItem();
        MenuPanBoletos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(50, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "nombre"
            }
        ));
        tblBoletos.setViewportView(jTable3);

        getContentPane().add(tblBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 50, 410, 450));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#id", "#id aeropuerto", "tipo avion", "hora"
            }
        ));
        tblAviones.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(tblAviones, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 50, 410, 450));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "# vuelo", "#aeropuerto", "#asiento"
            }
        ));
        tblVuelos.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(tblVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 50, 410, 450));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 20, 10, 480));

        lblTituloTabla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTituloTabla.setText("Tabla de vuelos");
        getContentPane().add(lblTituloTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 230, 50));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setText("Opciones de BD");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 50));

        txtDato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDato1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtDato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 130, -1));
        getContentPane().add(txtDato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, -1));
        getContentPane().add(txtDato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 130, -1));

        lblDato1.setText("Dato1");
        getContentPane().add(lblDato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        lblDato2.setText("Dato2");
        getContentPane().add(lblDato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        lblDato3.setText("Dato3");
        getContentPane().add(lblDato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        btnSalir.setText("Cerrar Sesion");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 475, 210, -1));

        btnEliminarElemento.setText("Eliminar Vuelo");
        btnEliminarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarElementoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 90, 140, -1));

        btnModificarElemento.setText("Modificar Vuelo");
        btnModificarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarElementoActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 120, 140, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 100, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 100, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 437, 102, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 439, 100, -1));

        btnAgregarElemento.setText("Agregar Vuelo");
        btnAgregarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarElementoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, 140, -1));

        lblDato4.setText("Dato4");
        getContentPane().add(lblDato4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));
        getContentPane().add(txtDato4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 130, -1));

        MenuOpcionesDB.setText("Mostrar Tablas");
        MenuOpcionesDB.setToolTipText("");

        MenuPanAviones.setText("Tabla de Aviones");
        MenuPanAviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPanAvionesActionPerformed(evt);
            }
        });
        MenuOpcionesDB.add(MenuPanAviones);

        MenuPanVuelos.setText("Tabla de Vuelos");
        MenuPanVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPanVuelosActionPerformed(evt);
            }
        });
        MenuOpcionesDB.add(MenuPanVuelos);

        MenuPanBoletos.setText("Tabla de boletos");
        MenuPanBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPanBoletosActionPerformed(evt);
            }
        });
        MenuOpcionesDB.add(MenuPanBoletos);

        jMenuBar1.add(MenuOpcionesDB);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuPanAvionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPanAvionesActionPerformed
        lblTituloTabla.setVisible(true);
        lblTituloTabla.setText("Tabla Aviones");
        tblAviones.setVisible(true);
        tblVuelos.setVisible(false);
        tblBoletos.setVisible(false);
    }//GEN-LAST:event_MenuPanAvionesActionPerformed

    private void MenuPanVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPanVuelosActionPerformed
        lblTituloTabla.setVisible(true);
        lblTituloTabla.setText("Tabla Vuelos");
        tblVuelos.setVisible(true);
        tblBoletos.setVisible(false);
        tblAviones.setVisible(false);
    }//GEN-LAST:event_MenuPanVuelosActionPerformed

    private void MenuPanBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPanBoletosActionPerformed
        lblTituloTabla.setVisible(true);
        lblTituloTabla.setText("Tabla Boletos");
        tblBoletos.setVisible(true);
        tblAviones.setVisible(false);
        tblVuelos.setVisible(false);
    }//GEN-LAST:event_MenuPanBoletosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        new FrmLogin().setVisible(true); 
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        IniciarPantalla();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarElementoActionPerformed
        btnAgregar.setVisible(true);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(true);
        lblTitulo.setText("Menu de Agregado");
        btnAgregarElemento.setVisible(false);
        btnModificarElemento.setVisible(false);
        btnEliminarElemento.setVisible(false);
    }//GEN-LAST:event_btnAgregarElementoActionPerformed

    private void btnEliminarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarElementoActionPerformed
        btnAgregar.setVisible(false);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(true);
        btnCancelar.setVisible(true);
        lblTitulo.setText("Menu de Eliminado");
        btnAgregarElemento.setVisible(false);
        btnModificarElemento.setVisible(false);
        btnEliminarElemento.setVisible(false);
    }//GEN-LAST:event_btnEliminarElementoActionPerformed

    private void btnModificarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarElementoActionPerformed
        btnAgregar.setVisible(false);
        btnModificar.setVisible(true);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(true);
        lblTitulo.setText("Menu de Modificacion");
        btnAgregarElemento.setVisible(false);
        btnModificarElemento.setVisible(false);
        btnEliminarElemento.setVisible(false);
    }//GEN-LAST:event_btnModificarElementoActionPerformed

    private void txtDato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDato1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDato1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuOpcionesDB;
    private javax.swing.JMenuItem MenuPanAviones;
    private javax.swing.JMenuItem MenuPanBoletos;
    private javax.swing.JMenuItem MenuPanVuelos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarElemento;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarElemento;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarElemento;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblDato1;
    private javax.swing.JLabel lblDato2;
    private javax.swing.JLabel lblDato3;
    private javax.swing.JLabel lblDato4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloTabla;
    private javax.swing.JScrollPane tblAviones;
    private javax.swing.JScrollPane tblBoletos;
    private javax.swing.JScrollPane tblVuelos;
    private javax.swing.JTextField txtDato1;
    private javax.swing.JTextField txtDato2;
    private javax.swing.JTextField txtDato3;
    private javax.swing.JTextField txtDato4;
    // End of variables declaration//GEN-END:variables
}

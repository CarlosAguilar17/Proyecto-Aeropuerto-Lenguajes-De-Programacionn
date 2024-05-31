/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyaero;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public FrmLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label1 = new java.awt.Label();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtTitulo = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        jLabel3.setText("jLabel3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        label1.setText("label1");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(440, 370));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario");

        lblContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña");

        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        btnLogin.setText("Ingresar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 36)); // NOI18N
        txtTitulo.setText("Inicio de sesion");

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\Visual Studio 2022\\560216.png")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\Visual Studio 2022\\6772234.png")); // NOI18N

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyaero/Fondo_1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel5)
                .addGap(94, 94, 94)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(lblContraseña)
                .addGap(10, 10, 10)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblUsuario))
            .addComponent(lblFondo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnLogin))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Cogido del boton de Inicio de sesion
        File archivo = new File("LoginDB.txt");
        boolean usuarioEncontrado = false; // bandera para indicar si el usuario se ha encontrado

        try {
            FileReader lector = new FileReader(archivo); // crea un lector
            BufferedReader lectorBR = new BufferedReader(lector); // crea un buffer

            int indice = Integer.parseInt(lectorBR.readLine()); // lee la primera linea que es un indice

            for (int i = 1; i < indice * 3; i = i + 3) {
                String User = lectorBR.readLine(); // lee el usuario
                if (txtUser.getText().equals(User)) { // Encuentra un Usuario con lo que ingresaste
                    usuarioEncontrado = true; // marca la bandera como verdadera
                    String Password = lectorBR.readLine();
                    if (txtPassword.getText().equals(Password)) { // lee contraseña
                        String Priv = lectorBR.readLine(); // Lee Privilegios
                        if (Priv.equals("A")) {
                            // JOptionPane.showMessageDialog(null, "Menu de Administrador");
                            this.setVisible(false);
                            new FrmMenuAdmin().setVisible(true);
                        } else if (Priv.equals("U")) {
                            this.setVisible(false);
                            new FrmMenuUsuario().setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error inesperado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    }
                    break; // si encuentra el usuario, se sale del bucle
                } else {
                    lectorBR.readLine(); // Lee y descarta la contraseña
                    lectorBR.readLine(); // Lee y descarta los privilegios
                }
            }
            if (!usuarioEncontrado) {
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtPassword.grabFocus();
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    // Acción a realizar cuando se presiona la tecla Enter
                    btnLogin.doClick(); // Simula un clic en el botón
                }        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
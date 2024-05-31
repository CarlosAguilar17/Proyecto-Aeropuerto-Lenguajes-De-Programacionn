/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyaero;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

/**
 *
 * @author carlo
 */
public class FrmMenuUsuario extends javax.swing.JFrame {
    private FrmComprar frmComprar;
    //private final String ruta=System.getProperties().getProperty("user dir");
    public FrmMenuUsuario() {
        initComponents();
        frmComprar = new FrmComprar();
        File archivo=null;
        FileReader FileR=null;
        BufferedReader BufferedR=null;
        
        try{
            archivo = new  File("VuelosDB.txt");
            FileR = new FileReader(archivo);
            BufferedR = new BufferedReader(FileR);
            String informacion;
            
            String[] cabeceras = {"#Numero", "Origen", "Destino", "Salida", "Hora Salida", "Hora Llegada"};
            DefaultTableModel tabla = new DefaultTableModel(cabeceras,0);
            
            while ((informacion = BufferedR.readLine()) != null) {
                System.out.println(informacion);
                // Suponiendo que cada línea contiene los 7 campos separados por comas
                String[] datosFila = informacion.split(",");
                // Asegurarse de que la línea tiene exactamente 7 campos
                if (datosFila.length == 6) {
                    tabla.addRow(datosFila);
                } else {
                    System.out.println("La línea no tiene exactamente 6 campos: " + informacion);
                }
            }
            TblDatosVuelos.setModel(tabla);
        }catch (Exception e){}finally{try{if(null!=FileR) {FileR.close();}}catch(IOException e2){}
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButVuelo1 = new javax.swing.JButton();
        PanFondo = new javax.swing.JPanel();
        lblMenuUsuario = new javax.swing.JLabel();
        LblVuelos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        CbOrigen = new javax.swing.JComboBox<>();
        DtSalida = new com.toedter.calendar.JDateChooser();
        LblOrigen = new javax.swing.JLabel();
        LblDestino = new javax.swing.JLabel();
        LblSalida = new javax.swing.JLabel();
        CbDestino = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblDatosVuelos = new javax.swing.JTable();
        BtnCancelar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtMostrar = new javax.swing.JTextField();
        BtnTransferir = new javax.swing.JButton();

        ButVuelo1.setText("Elegir Vuelo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        PanFondo.setBackground(new java.awt.Color(86, 153, 205));

        lblMenuUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblMenuUsuario.setText("Menu de Usuario");

        LblVuelos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblVuelos.setText("Busca tu Vuelo");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyaero/aeromexicooo.jpg"))); // NOI18N

        BtnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyaero/2311526.png"))); // NOI18N
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

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

        LblOrigen.setText("Origen");

        LblDestino.setText("Destino");

        LblSalida.setText("Salida");

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

        TblDatosVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#Numero", "Origen", "Destino", "Salida", "Hora Salida", "Hora Llegada"
            }
        ));
        jScrollPane2.setViewportView(TblDatosVuelos);

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Cerrar Sesion");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnMostrar.setText("Mostrar Vuelo");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Tu vuelo es: ");

        BtnTransferir.setText("Comprar Boleto");
        BtnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTransferirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanFondoLayout = new javax.swing.GroupLayout(PanFondo);
        PanFondo.setLayout(PanFondoLayout);
        PanFondoLayout.setHorizontalGroup(
            PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanFondoLayout.createSequentialGroup()
                        .addGroup(PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMenuUsuario)
                            .addComponent(LblVuelos)
                            .addGroup(PanFondoLayout.createSequentialGroup()
                                .addGroup(PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblOrigen)
                                    .addGroup(PanFondoLayout.createSequentialGroup()
                                        .addGroup(PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblDestino)
                                            .addComponent(CbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblSalida))))
                                .addGap(28, 28, 28)
                                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanFondoLayout.createSequentialGroup()
                        .addGroup(PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanFondoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtMostrar))
                            .addComponent(BtnMostrar)
                            .addGroup(PanFondoLayout.createSequentialGroup()
                                .addComponent(BtnTransferir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanFondoLayout.setVerticalGroup(
            PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanFondoLayout.createSequentialGroup()
                .addGroup(PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMenuUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(LblVuelos)
                        .addGap(18, 18, 18)
                        .addComponent(LblOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanFondoLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(CbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(LblDestino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanFondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanFondoLayout.createSequentialGroup()
                                        .addComponent(LblSalida)
                                        .addGap(5, 5, 5)
                                        .addComponent(DtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnSalir)
                    .addComponent(BtnTransferir))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        FrmLogin objLogin = new FrmLogin();
        this.setVisible(false);
        objLogin.setVisible(true);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // Limpiar los campos de búsqueda
        CbOrigen.setSelectedIndex(0); // Selecciona el primer elemento (o el que desees) en el JComboBox
        CbDestino.setSelectedIndex(0);
        DtSalida.setDate(null); // Limpia el JDateChooser
        TxtMostrar.setText("");// Limpia el JTextField

        // Limpiar la tabla de resultados
        DefaultTableModel model = (DefaultTableModel) TblDatosVuelos.getModel();
        model.setRowCount(0); // Esto elimina todas las filas de la tabla
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void CbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbDestinoActionPerformed

    }//GEN-LAST:event_CbDestinoActionPerformed

    private void CbDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbDestinoMouseClicked
        CbDestino.removeAllItems();
        FileReader fileReader = null;
        try {
            String cadenaLeida="";
            fileReader = new FileReader("Destinos.txt");
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
            fileReader = new FileReader("Origenes.txt");
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

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // Recuperar datos de los componentes
        String a = CbOrigen.getSelectedItem().toString();
        String b = CbDestino.getSelectedItem().toString();
        java.util.Date c = DtSalida.getDate();

        List<String[]> filteredData = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("VuelosDB.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String dataa = data[1]; // Suponiendo que data[1] es el origen
                String datab = data[2]; // Suponiendo que data[2] es el destino
                String datac = data[3]; // Suponiendo que data[3] es la fecha
                
                // Caso 1: Origen, Destino y Fecha
                if (c != null) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String formattedc = dateFormat.format(c);

                    if (dataa.equals(a) && datab.equals(b) && datac.equals(formattedc)) {
                        filteredData.add(data);
                    }
                }
                // Caso 2: Origen y Destino sin Fecha
                else {
                    if (dataa.equals(a) && datab.equals(b)) {
                        filteredData.add(data);
                    }
                }
            }
        } catch (Exception h) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + h.getMessage());
        }

        // Mostrar los resultados en la tabla
        DefaultTableModel model = (DefaultTableModel) TblDatosVuelos.getModel();
        model.setRowCount(0); // Limpiar la tabla

        for (String[] row : filteredData) {
            model.addRow(row);
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        // Obtener la fila seleccionada
        int selectedRow = TblDatosVuelos.getSelectedRow();

        // Verificar que una fila esté seleccionada
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) TblDatosVuelos.getModel();
            // Obtener los datos de la fila seleccionada
            String rowData = "";
            for (int column = 0; column < model.getColumnCount(); column++) {
                rowData += model.getValueAt(selectedRow, column).toString() + ", ";
            }
            // Mostrar los datos en el JTextField
            TxtMostrar.setText(rowData.trim());
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila primero.");
        }
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void BtnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTransferirActionPerformed
        String inputData = TxtMostrar.getText();
        if (frmComprar == null) {
            frmComprar = new FrmComprar(this);
        }
        frmComprar.setTextFieldData(inputData);
        frmComprar.setVisible(true);
        this.setVisible(false);
        /*FrmComprar outputFrame = new FrmComprar();
        outputFrame.setVisible(true);
        outputFrame.setTextFieldData(inputData);*/
    }//GEN-LAST:event_BtnTransferirActionPerformed
    
    
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
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnTransferir;
    private javax.swing.JButton ButVuelo1;
    private javax.swing.JComboBox<String> CbDestino;
    private javax.swing.JComboBox<String> CbOrigen;
    private com.toedter.calendar.JDateChooser DtSalida;
    private javax.swing.JLabel LblDestino;
    private javax.swing.JLabel LblOrigen;
    private javax.swing.JLabel LblSalida;
    private javax.swing.JLabel LblVuelos;
    private javax.swing.JPanel PanFondo;
    private javax.swing.JTable TblDatosVuelos;
    private javax.swing.JTextField TxtMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMenuUsuario;
    // End of variables declaration//GEN-END:variables

}

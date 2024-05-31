/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyaero;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class FrmComprar extends javax.swing.JFrame {
    private FrmPagar frmPagar;
    private JLabel seatImageLabel;
    private JButton[] seatButtons;
    private boolean[] seatStatus;
    private final String seatStatusFile = "Asientos.txt";
    /**
     * Creates new form FrmComprar
     */
    public FrmComprar() {
        frmPagar = new FrmPagar();
        initComponents();
        customizeComponents();
        loadSeatStatus();
    }    

    FrmComprar(FrmMenuUsuario aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    private void customizeComponents() {    
        // Configuración del JFrame
        setTitle("Sistema de Reserva de Boletos");
        setSize(1100, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Cargar la imagen de los asientos
        ImageIcon seatImage = new ImageIcon("SiteMap_v24.png"); // Asegúrate de tener esta imagen en tu proyecto
        seatImageLabel = new JLabel(seatImage);
        add(seatImageLabel, BorderLayout.CENTER);

        // Crear botones para representar los asientos
        JPanel buttonPanel = new JPanel(new GridLayout(6, 20)); // Ejemplo: 6 filas, 20 columnas
        seatButtons = new JButton[120]; // Ejemplo:120 asientos
        seatStatus = new boolean[120]; // Inicialmente, todos los asientos están libres

        for (int i = 0; i < 120; i++) {
            seatButtons[i] = new JButton(" " + (i + 1));
            final int seatIndex = i;
            seatButtons[i].setBackground(Color.GREEN); // Inicialmente todos los asientos son verdes (libres)
            seatButtons[i].addActionListener((ActionEvent e) -> {
                reserveSeat(seatIndex);
            });
            buttonPanel.add(seatButtons[i]);
        }

        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    private void reserveSeat(int seatIndex) {
        if (!seatStatus[seatIndex]) { // Si el asiento está libre
            seatStatus[seatIndex] = true; // Reservar el asiento
            seatButtons[seatIndex].setBackground(Color.RED); // Cambiar el color del botón a rojo para indicar que está ocupado
            seatButtons[seatIndex].repaint(); // Asegurarse de que el botón se actualice visualmente
            JOptionPane.showMessageDialog(this, "Asiento " + (seatIndex + 1) + " reservado con éxito.");
            saveSeatStatus();
        } else {
            JOptionPane.showMessageDialog(this, "Lo siento, el asiento " + (seatIndex + 1) + " ya está ocupado.");
        }
    }
    
    private void saveSeatStatus() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(seatStatusFile))) {
            for (boolean status : seatStatus) {
                writer.write(status ? "1" : "0");
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadSeatStatus() {
        try (BufferedReader reader = new BufferedReader(new FileReader(seatStatusFile))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                seatStatus[index] = line.equals("1");
                seatButtons[index].setBackground(seatStatus[index] ? Color.RED : Color.GREEN);
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void calculateTotal() {
        String priceText = TxtPrecio.getText();
        String passengersText = TxtPasajero.getText();

        if (!priceText.isEmpty() && !passengersText.isEmpty()) {
            try {
                int price = Integer.parseInt(priceText);
                int passengers = Integer.parseInt(passengersText);
                int total = price * passengers;
                TxtTotal.setText(String.valueOf(total));
            } catch (NumberFormatException e) {
                TxtTotal.setText("Error");
            }
        }
    }
    
    public void setTextFieldData(String data) {
        TxtVuelos.setText(data);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCompraVuelo = new javax.swing.JLabel();
        BtnSalida = new javax.swing.JButton();
        BtnCancela = new javax.swing.JButton();
        BtnPagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtVuelos = new javax.swing.JTextField();
        CboPrecio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TxtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtTotal = new javax.swing.JTextField();
        TxtPasajero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCompraVuelo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCompraVuelo.setText("Compra Boleto");

        BtnSalida.setText("Salir");
        BtnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalidaActionPerformed(evt);
            }
        });

        BtnCancela.setText("Cancelar");
        BtnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelaActionPerformed(evt);
            }
        });

        BtnPagar.setText("Pagar");
        BtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPagarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyaero/Piloto_Sin_Avion.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyaero/Asiento.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Reservaciòn de Asiento");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Elija su Asiento para el Vuelo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tu vuelo es:");

        CboPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Economico", "Negocio", "Primera Clase" }));
        CboPrecio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CboPrecioItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tipo Vuelo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Pasajeros:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Total:");

        TxtPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPasajeroActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Precio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCompraVuelo))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(BtnPagar))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(BtnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(670, 670, 670)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(TxtPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(TxtVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(BtnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(CboPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCompraVuelo)
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(TxtVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(BtnSalida))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(TxtPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(CboPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(BtnCancela))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(BtnPagar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalidaActionPerformed
        FrmMenuUsuario objMenuU = new FrmMenuUsuario();
        this.setVisible(false);
        objMenuU.setVisible(true);
    }//GEN-LAST:event_BtnSalidaActionPerformed

    private void BtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPagarActionPerformed
        String inputData = TxtVuelos.getText();
        String selectedOption = (String) CboPrecio.getSelectedItem();
        String inputData1 = TxtPrecio.getText();
        String inputData2 = TxtPasajero.getText();
        String inputData3 = TxtTotal.getText();
        if (frmPagar == null) {
            frmPagar = new FrmPagar(this);
        }
        frmPagar.setTextFieldData(inputData, selectedOption, inputData1, inputData2, inputData3);
        frmPagar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnPagarActionPerformed

    private void CboPrecioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CboPrecioItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String selectedFlight = (String) CboPrecio.getSelectedItem();
            String price = "";
            switch (selectedFlight) {
                case "Economico":
                    price = "1500";
                    break;
                case "Negocio":
                    price = "3000";
                    break;
                case "Primera Clase":
                    price = "5000";
                    break;
            }
            TxtPrecio.setText(price);
            calculateTotal();
        }
    }//GEN-LAST:event_CboPrecioItemStateChanged

    private void TxtPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasajeroActionPerformed
        calculateTotal();
    }//GEN-LAST:event_TxtPasajeroActionPerformed

    private void BtnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelaActionPerformed
        // Limpiar los campos de búsqueda
        CboPrecio.setSelectedIndex(0); // Selecciona el primer elemento (o el que desees) en el JComboBox
        //TxtVuelos.setText("");// Limpia el JTextField
        TxtPrecio.setText(""); 
        TxtPasajero.setText("");
        TxtTotal.setText("");
    }//GEN-LAST:event_BtnCancelaActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmComprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmComprar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancela;
    private javax.swing.JButton BtnPagar;
    private javax.swing.JButton BtnSalida;
    private javax.swing.JComboBox<String> CboPrecio;
    private javax.swing.JTextField TxtPasajero;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JTextField TxtVuelos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCompraVuelo;
    // End of variables declaration//GEN-END:variables

}

package prototipo;

import entidades.Factura;
import entidades.Persona;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.*;
import static utilidades.BaseDatosUtils.consultarPersona;
import static utilidades.BaseDatosUtils.generarFactura;

public class Factura_JFrame extends javax.swing.JFrame {

    Calendar fecha = Calendar.getInstance();

    public Factura_JFrame() {
        initComponents();
        bd_nombre.setText("");
        bd_telefono.setText("");
        bd_Marca.setText("");
        bd_Danio.setText("");
        bd_Valor.setText("");
        bd_Clave.setText("0");
        bd_imei.setText("0");
        bd_dia.setText(Integer.toString(fecha.get(Calendar.DATE)));
        bd_Mes.setText(Integer.toString(fecha.get(Calendar.MONTH) + 1));
        bd_anio.setText(Integer.toString(fecha.get(Calendar.YEAR)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_nombre = new javax.swing.JLabel();
        bd_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bd_cedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bd_telefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bd_Marca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bd_Danio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bd_dia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bd_IdFactura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bd_Clave = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bd_Estado = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bd_Mes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bd_anio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bd_Valor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        bd_imei = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l_nombre.setText("NOMBRE: ");

        bd_nombre.setText("jTextField1");

        jLabel1.setText("CEDULA: ");

        jLabel2.setText("TELEFONO: ");

        bd_telefono.setText("jTextField1");

        jLabel3.setText("MARCA:");

        bd_Marca.setText("jTextField1");

        jLabel4.setText("DAÑO: ");

        bd_Danio.setText("jTextField1");

        jLabel5.setText("FECHA: ");

        bd_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bd_diaActionPerformed(evt);
            }
        });

        jLabel6.setText("ID Factura");

        jLabel7.setText("CLAVE: ");

        jButton1.setText("CARGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("GENERAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bd_Estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EN REVISION", "TERMINADO" }));

        jLabel8.setText("ESTADO");

        jLabel9.setText("DIA");

        jLabel10.setText("MES");

        bd_Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bd_MesActionPerformed(evt);
            }
        });

        jLabel11.setText("AÑO");

        jLabel12.setText("/");

        jLabel13.setText("/");

        jLabel14.setText("VALOR.");

        jLabel15.setText("IMEI: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_nombre)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bd_Danio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bd_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(bd_telefono)
                                    .addComponent(bd_Marca))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                        .addComponent(bd_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bd_imei))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bd_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(bd_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bd_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(2, 2, 2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bd_Estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bd_Valor)
                            .addComponent(bd_Clave)))
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bd_IdFactura)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(bd_IdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(bd_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(bd_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bd_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(20, 20, 20)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(bd_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bd_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bd_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_nombre)
                            .addComponent(bd_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(bd_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bd_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(bd_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(bd_imei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(bd_Danio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (bd_cedula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo cédula está vacío, digite la cedula", "ERROR", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int ced = Integer.parseInt(bd_cedula.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una cedula valida", "ERROR", JOptionPane.WARNING_MESSAGE);
                bd_cedula.setText("");
            }
            Persona personaConsultada = consultarPersona(bd_cedula.getText());
            if (personaConsultada != null) {
                bd_cedula.setText(personaConsultada.getCedula());
                bd_nombre.setText(personaConsultada.getNombre());
                bd_telefono.setText(personaConsultada.getTelefono());
            } else {
                JOptionPane.showMessageDialog(null, "La persona no se encuentra en el sistema. Digite los campos", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bd_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bd_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bd_diaActionPerformed

    private void bd_MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bd_MesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bd_MesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        boolean errores = false;
        int valor = 0;
        long telefono = 3127213556L;
        int cedula = 0;
        int clave = 0;
        long imei = 12345678901234567L;

        if (bd_cedula.getText().equals("") || bd_nombre.getText().equals("") || bd_telefono.getText().equals("")
                || bd_Marca.getText().equals("") || bd_Danio.getText().equals("") || bd_Valor.getText().equals("") || bd_imei.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else {
            try {
                try {
                    valor = Integer.parseInt(bd_Valor.getText());
                    if (valor < 0) {
                        throw new NumberFormatException();
                    }

                } catch (NumberFormatException ex) {
                    bd_Valor.setText("");
                    throw new Exception("El valor del costo de la reparacion debe ser mayor a cero (0)");
                }
                try {
                    cedula = Integer.parseInt(bd_cedula.getText());
                } catch (NumberFormatException ex) {
                    bd_cedula.setText("");
                    throw new Exception("Por favor ingrese una cedula valida");
                }
                try {
                    clave = Integer.parseInt(bd_Clave.getText());
                } catch (NumberFormatException ex) {
                    bd_Clave.setText("0");
                    throw new Exception("La clave de desbloqueo no es valida, ingresela nuevamente");
                }

                try {
                    telefono = Long.parseLong(bd_telefono.getText());
                    if (telefono < 0) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    bd_telefono.setText("");
                    throw new Exception("Por favor ingrese un numero de teléfono valida");                    
                }
                try {
                    
                    imei = Long.parseLong(bd_imei.getText());
                    
                    if (imei < 0) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    bd_imei.setText("");
                    throw new Exception("El numero de IMEI es incorrecto");
                }
            } catch (Exception ex) {
                errores = true;
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            if (!errores) {

                int dia = fecha.get(Calendar.DATE);
                int mes = fecha.get(Calendar.MONTH) + 1;
                int año = fecha.get(Calendar.YEAR);

                Factura factura = new Factura();
                factura.setClave(clave);
                factura.setDescripcion(bd_cedula.getText());
                factura.setFecha(dia + "-" + mes + "-" + año);
                factura.setMarca(bd_Marca.getText());
                factura.setValor(valor);
                factura.setEmei(bd_imei.getText());

                Persona personaFactura = new Persona();
                personaFactura.setCedula(bd_cedula.getText());
                personaFactura.setNombre(bd_nombre.getText());
                personaFactura.setTelefono(bd_telefono.getText());

                String mensajeRespuesta = generarFactura(factura, personaFactura);
                JOptionPane.showMessageDialog(null, mensajeRespuesta, "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Factura_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Factura_JFrame jaja = new Factura_JFrame();
                jaja.setVisible(true);

            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bd_Clave;
    private javax.swing.JTextField bd_Danio;
    private javax.swing.JComboBox bd_Estado;
    private javax.swing.JTextField bd_IdFactura;
    private javax.swing.JTextField bd_Marca;
    private javax.swing.JTextField bd_Mes;
    private javax.swing.JTextField bd_Valor;
    private javax.swing.JTextField bd_anio;
    private javax.swing.JTextField bd_cedula;
    private javax.swing.JTextField bd_dia;
    private javax.swing.JTextField bd_imei;
    private javax.swing.JTextField bd_nombre;
    private javax.swing.JTextField bd_telefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l_nombre;
    // End of variables declaration//GEN-END:variables
}

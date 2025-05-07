
package view.gui;

import ficheros.ClassFichero;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.validations.UserDataValidations;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFrameMain extends javax.swing.JFrame {

    public JFrameMain() throws FileNotFoundException {
        initComponents();
        ClassFichero.createFile("user_data_AFRV.csv");
        initConfig();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgMensajeExitoso = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNIF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBirthdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        btnValidate = new javax.swing.JButton();
        lblNameMessage = new javax.swing.JLabel();
        lblNifMessage = new javax.swing.JLabel();
        lblEmailMessage = new javax.swing.JLabel();
        lblBirthdateMessage = new javax.swing.JLabel();
        lblAgeMessage = new javax.swing.JLabel();
        lblZipMessage = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnCSV = new javax.swing.JButton();

        dlgMensajeExitoso.setResizable(false);
        dlgMensajeExitoso.setSize(new java.awt.Dimension(253, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Usuario creado correctamente.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgMensajeExitosoLayout = new javax.swing.GroupLayout(dlgMensajeExitoso.getContentPane());
        dlgMensajeExitoso.getContentPane().setLayout(dlgMensajeExitosoLayout);
        dlgMensajeExitosoLayout.setHorizontalGroup(
            dlgMensajeExitosoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dlgMensajeExitosoLayout.setVerticalGroup(
            dlgMensajeExitosoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario Validador");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("VALIDADOR DATOS USUARIO");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setMaximumSize(new java.awt.Dimension(64, 26));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("NIF:");

        txtNIF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Birthdate:");

        txtBirthdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Age:");

        txtAge.setEditable(false);
        txtAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("ZIP:");

        txtZip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnValidate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnValidate.setText("Validate");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });

        lblNameMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNameMessage.setForeground(new java.awt.Color(0, 102, 51));

        lblNifMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNifMessage.setForeground(new java.awt.Color(0, 102, 51));

        lblEmailMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmailMessage.setForeground(new java.awt.Color(0, 102, 51));

        lblBirthdateMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBirthdateMessage.setForeground(new java.awt.Color(0, 102, 51));

        lblAgeMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAgeMessage.setForeground(new java.awt.Color(0, 102, 51));

        lblZipMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblZipMessage.setForeground(new java.awt.Color(0, 102, 51));

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCSV.setText("CSV");
        btnCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnValidate)
                        .addGap(228, 228, 228)
                        .addComponent(btnCSV)
                        .addGap(93, 93, 93))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btnClear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNifMessage)
                            .addComponent(lblNameMessage)
                            .addComponent(lblEmailMessage)
                            .addComponent(lblBirthdateMessage)
                            .addComponent(lblAgeMessage)
                            .addComponent(lblZipMessage))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameMessage))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNifMessage))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailMessage))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBirthdateMessage))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgeMessage))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipMessage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValidate)
                    .addComponent(btnClear)
                    .addComponent(btnCSV))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        boolean isValidateName = UserDataValidations.checkName(txtName.getText());
        boolean isValidateNIF = UserDataValidations.checkId(1, txtNIF.getText());
        boolean isValidateEmail = UserDataValidations.checkEmail(txtEmail.getText());
        boolean isValidateDate = UserDataValidations.checkFormatDate(txtBirthdate.getText());
        boolean isValidateZip = UserDataValidations.checkPostalCode(txtZip.getText());
        
        validateName();
        validateNIF();
        validateEmail();
        validateDate();
        calculateAge();
        validateZip();
        
        if (isValidateEmail && isValidateNIF && isValidateName && isValidateDate && isValidateZip) {
            txtEmail.setEditable(false);
            txtName.setEditable(false);
            txtNIF.setEditable(false);
            txtBirthdate.setEditable(false);
            txtZip.setEditable(false);
            
            btnValidate.setEnabled(false);
        
            btnCSV.setEnabled(true);
        }
        
    }//GEN-LAST:event_btnValidateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSVActionPerformed
        
        ClassFichero.writeFile(txtName.getText() + ";" + txtNIF.getText() + ";" + txtEmail.getText() + ";" + txtBirthdate.getText() + ";" + txtAge.getText() + ";" + txtZip.getText() + "\n");
            
        dlgMensajeExitoso.show();
            
        btnCSV.setEnabled(false);
    }//GEN-LAST:event_btnCSVActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameMain().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCSV;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnValidate;
    private javax.swing.JDialog dlgMensajeExitoso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAgeMessage;
    private javax.swing.JLabel lblBirthdateMessage;
    private javax.swing.JLabel lblEmailMessage;
    private javax.swing.JLabel lblNameMessage;
    private javax.swing.JLabel lblNifMessage;
    private javax.swing.JLabel lblZipMessage;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBirthdate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIF;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

    private void validateName() {
        if (UserDataValidations.checkName(txtName.getText()) == false) {
            lblNameMessage.setText("Incorrect name format!");
            lblNameMessage.setForeground(Color.RED);
        } else {
            lblNameMessage.setText("Valid name!");
            lblNameMessage.setForeground(new Color(0, 100, 41));
        }
    }

    private void validateNIF() {
        if (UserDataValidations.checkId(1, txtNIF.getText()) == false) {
            lblNifMessage.setText("Incorrect NIF format!");
            lblNifMessage.setForeground(Color.RED);
        } else {
            lblNifMessage.setText("Valid NIF!");
            lblNifMessage.setForeground(new Color(0, 100, 41));
        }
    }

    private void validateEmail() {
        if (UserDataValidations.checkEmail(txtEmail.getText()) == false) {
            lblEmailMessage.setText("Incorrect email format!");
            lblEmailMessage.setForeground(Color.RED);
        } else {
            lblEmailMessage.setText("Valid email!");
            lblEmailMessage.setForeground(new Color(0, 100, 41));
        }
    }

    private void validateDate() {
        if (UserDataValidations.checkFormatDate(txtBirthdate.getText()) == false) {
            lblBirthdateMessage.setText("Incorrect date format!");
            lblBirthdateMessage.setForeground(Color.RED);
        } else {
            lblBirthdateMessage.setText("Valid date!");
            lblBirthdateMessage.setForeground(new Color(0, 100, 41));
        }
    }

    private void calculateAge() {
        txtAge.setText("");
        Date actualDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        if (UserDataValidations.checkFormatDate(txtBirthdate.getText()) == true) {
            txtAge.setText(String.valueOf(UserDataValidations.calculateAge(txtBirthdate.getText(), sdf.format(actualDate))));
        }
    }

    private void validateZip() {
        if (UserDataValidations.checkPostalCode(txtZip.getText()) == false) {
            lblZipMessage.setText("Incorrect zip format!");
            lblZipMessage.setForeground(Color.RED);
        } else {
            lblZipMessage.setText("Valid zip!");
            lblZipMessage.setForeground(new Color(0, 100, 41));
        }
    }

    private void initConfig() {
        btnValidate.setEnabled(true);
        btnClear.setEnabled(true);
        btnCSV.setEnabled(false);
        clearFields();
        //dlgMensajeExitoso.show();
    }
    
    private void clearFields() {
        txtName.setText("");
        txtNIF.setText("");
        txtEmail.setText("");
        txtBirthdate.setText("");
        txtAge.setText("");
        txtZip.setText("");
        lblNameMessage.setText("");
        lblNifMessage.setText("");
        lblEmailMessage.setText("");
        lblBirthdateMessage.setText("");
        lblAgeMessage.setText("");
        lblZipMessage.setText("");
        txtName.setFocusable(true);
        btnValidate.setEnabled(true);
    }
}
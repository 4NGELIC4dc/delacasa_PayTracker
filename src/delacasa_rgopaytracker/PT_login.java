package delacasa_rgopaytracker;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author Angelica DC
 */
public class PT_login extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public PT_login() {
        initComponents();
        conn = myconnection.dbConnection();
        setTitle("RGO PayTracker");
        setIconImage();
        setSize(550, 290);
        setResizable(false);
    }
    
    @Override
    public void processWindowEvent(WindowEvent e) {
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            exitConfirmation();
        } else {
            super.processWindowEvent(e);
        }
    }

    // DO NOT modify this code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        auth_panel_main = new javax.swing.JPanel();
        auth_txt_password = new javax.swing.JLabel();
        auth_txt_name = new javax.swing.JLabel();
        auth_btn_login = new javax.swing.JButton();
        auth_in_password = new javax.swing.JPasswordField();
        auth_in_name = new javax.swing.JTextField();
        auth_panel_header = new javax.swing.JPanel();
        auth_title = new javax.swing.JLabel();
        auth_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(555, 300));

        auth_panel_main.setBackground(new java.awt.Color(64, 121, 192));
        auth_panel_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 70, 103), 3, true));

        auth_txt_password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        auth_txt_password.setForeground(new java.awt.Color(51, 70, 103));
        auth_txt_password.setText("Enter Password: ");

        auth_txt_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        auth_txt_name.setForeground(new java.awt.Color(51, 70, 103));
        auth_txt_name.setText("Enter Username: ");

        auth_btn_login.setBackground(new java.awt.Color(51, 70, 103));
        auth_btn_login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        auth_btn_login.setForeground(new java.awt.Color(255, 255, 255));
        auth_btn_login.setText("Login");
        auth_btn_login.setBorder(null);
        auth_btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auth_btn_loginActionPerformed(evt);
            }
        });

        auth_in_password.setBackground(new java.awt.Color(255, 255, 255));
        auth_in_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        auth_in_password.setForeground(new java.awt.Color(0, 0, 0));
        auth_in_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auth_in_passwordActionPerformed(evt);
            }
        });

        auth_in_name.setBackground(new java.awt.Color(255, 255, 255));
        auth_in_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        auth_in_name.setForeground(new java.awt.Color(0, 0, 0));

        auth_panel_header.setBackground(new java.awt.Color(51, 70, 103));

        auth_title.setFont(new java.awt.Font("Eras Bold ITC", 0, 20)); // NOI18N
        auth_title.setForeground(new java.awt.Color(255, 255, 255));
        auth_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        auth_title.setText("RGO PayTracker");

        auth_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delacasa_rgopaytracker/RGO_LOGOresized.png"))); // NOI18N
        auth_logo.setText("jLabel1");

        javax.swing.GroupLayout auth_panel_headerLayout = new javax.swing.GroupLayout(auth_panel_header);
        auth_panel_header.setLayout(auth_panel_headerLayout);
        auth_panel_headerLayout.setHorizontalGroup(
            auth_panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(auth_panel_headerLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(auth_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(auth_title, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        auth_panel_headerLayout.setVerticalGroup(
            auth_panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(auth_panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(auth_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addComponent(auth_title, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout auth_panel_mainLayout = new javax.swing.GroupLayout(auth_panel_main);
        auth_panel_main.setLayout(auth_panel_mainLayout);
        auth_panel_mainLayout.setHorizontalGroup(
            auth_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(auth_panel_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(auth_panel_mainLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(auth_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(auth_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(auth_txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(auth_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(auth_btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(auth_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(auth_in_name)
                        .addComponent(auth_in_password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        auth_panel_mainLayout.setVerticalGroup(
            auth_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(auth_panel_mainLayout.createSequentialGroup()
                .addComponent(auth_panel_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(auth_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(auth_txt_name)
                    .addComponent(auth_in_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(auth_panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(auth_txt_password)
                    .addComponent(auth_in_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(auth_btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(auth_panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(auth_panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setIconImage() {
        ImageIcon icon = new ImageIcon(getClass().getResource("RGO_LOGOnew.png"));
        setIconImage(icon.getImage());
    }
    
    private void exitConfirmation(){
        int yesnoExit = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit the program?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
            if (yesnoExit == 0){
                this.dispose();
        }
    }
    
    private void auth_btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auth_btn_loginActionPerformed
        String loginUn = auth_in_name.getText();
        String loginPw = auth_in_password.getText();

        try {
            String sql = "SELECT * FROM employee WHERE employee_name=? AND employee_password=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, loginUn);
            pst.setString(2, loginPw);
            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "Login Success!");
                // Hide the login frame
                this.setVisible(false);
                // Open the main frame
                PT_main mainFrame = new PT_main();
                mainFrame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Login Failed. Please try again.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "An error occurred: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "An error occurred while closing resources: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_auth_btn_loginActionPerformed

    private void auth_in_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auth_in_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_auth_in_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(PT_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PT_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PT_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PT_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PT_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton auth_btn_login;
    private javax.swing.JTextField auth_in_name;
    private javax.swing.JPasswordField auth_in_password;
    private javax.swing.JLabel auth_logo;
    private javax.swing.JPanel auth_panel_header;
    private javax.swing.JPanel auth_panel_main;
    private javax.swing.JLabel auth_title;
    private javax.swing.JLabel auth_txt_name;
    private javax.swing.JLabel auth_txt_password;
    // End of variables declaration//GEN-END:variables
}

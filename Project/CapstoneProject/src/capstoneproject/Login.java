/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneproject;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import capstoneproject.User;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        formWindow5 = new javax.swing.JPanel();
        loginformLabel5 = new javax.swing.JLabel();
        usernameLabel5 = new javax.swing.JLabel();
        usernameTextBox5 = new javax.swing.JTextField();
        passwordLabel5 = new javax.swing.JLabel();
        passwordTextBox5 = new javax.swing.JTextField();
        loginButton5 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        createaccountButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formWindow5.setBackground(new java.awt.Color(153, 153, 255));

        loginformLabel5.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        loginformLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginformLabel5.setText("Login Form");
        loginformLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        usernameLabel5.setBackground(new java.awt.Color(0, 0, 0));
        usernameLabel5.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        usernameLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel5.setText("Username:");

        usernameTextBox5.setBackground(new java.awt.Color(0, 0, 0));
        usernameTextBox5.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
        usernameTextBox5.setForeground(new java.awt.Color(255, 255, 255));

        passwordLabel5.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        passwordLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel5.setText("Password:");

        passwordTextBox5.setBackground(new java.awt.Color(0, 0, 0));
        passwordTextBox5.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
        passwordTextBox5.setForeground(new java.awt.Color(255, 255, 255));

        loginButton5.setBackground(new java.awt.Color(0, 0, 0));
        loginButton5.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
        loginButton5.setForeground(new java.awt.Color(255, 255, 255));
        loginButton5.setText("Login");
        loginButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton5ActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        createaccountButton.setBackground(new java.awt.Color(0, 0, 0));
        createaccountButton.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
        createaccountButton.setForeground(new java.awt.Color(255, 255, 255));
        createaccountButton.setText("Create Account");
        createaccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formWindow5Layout = new javax.swing.GroupLayout(formWindow5);
        formWindow5.setLayout(formWindow5Layout);
        formWindow5Layout.setHorizontalGroup(
            formWindow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginformLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(formWindow5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(formWindow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formWindow5Layout.createSequentialGroup()
                        .addComponent(usernameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usernameTextBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formWindow5Layout.createSequentialGroup()
                        .addComponent(passwordLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passwordTextBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(formWindow5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(loginButton5)
                .addGap(67, 67, 67)
                .addComponent(createaccountButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(57, 57, 57))
        );
        formWindow5Layout.setVerticalGroup(
            formWindow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formWindow5Layout.createSequentialGroup()
                .addComponent(loginformLabel5)
                .addGap(74, 74, 74)
                .addGroup(formWindow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formWindow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(formWindow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton5)
                    .addComponent(exitButton)
                    .addComponent(createaccountButton))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formWindow5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formWindow5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton5ActionPerformed
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement();

            String user = usernameTextBox5.getText();
            String pass = passwordTextBox5.getText();

            ResultSet output = st.executeQuery("SELECT * FROM USERS WHERE Username='"+user+"'");
            if(output.next())
            {
                JOptionPane.showMessageDialog(null,"This user exist");
                String realPassword = output.getString("Password");
                if(false == pass.equals(realPassword))
                {
                    JOptionPane.showMessageDialog(null,"Password doesn't exist");
                }
                else if(pass.equals(realPassword))
                {
                    dispose();
                    JOptionPane.showMessageDialog(null,"Password exist.");
                    User.setUsername(user);
                    User.setPassword(pass);

                    ProfilePage profile = new ProfilePage();
                    profile.show();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Username and Password were not found!");
                usernameTextBox5.setText("");
                passwordTextBox5.setText("");
            }
            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_loginButton5ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        dispose();
        HomePage home = new HomePage();
        home.show();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void createaccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccountButtonActionPerformed
        dispose();
        CreateAccount form = new CreateAccount();
        form.setVisible(true);
    }//GEN-LAST:event_createaccountButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createaccountButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel formWindow5;
    private javax.swing.JButton loginButton5;
    private javax.swing.JLabel loginformLabel5;
    private javax.swing.JLabel passwordLabel5;
    private javax.swing.JTextField passwordTextBox5;
    private javax.swing.JLabel usernameLabel5;
    private javax.swing.JTextField usernameTextBox5;
    // End of variables declaration//GEN-END:variables
}

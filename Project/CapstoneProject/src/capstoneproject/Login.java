package capstoneproject;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import capstoneproject.User;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formWindow = new javax.swing.JPanel();
        loginformLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextBox = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        createaccountButton = new javax.swing.JButton();
        showPassCheck = new javax.swing.JCheckBox();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formWindow.setBackground(new java.awt.Color(153, 153, 255));

        loginformLabel.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        loginformLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginformLabel.setText("Login Form");
        loginformLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        usernameLabel.setBackground(new java.awt.Color(0, 0, 0));
        usernameLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("Username:");

        usernameTextBox.setBackground(new java.awt.Color(0, 0, 0));
        usernameTextBox.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
        usernameTextBox.setForeground(new java.awt.Color(255, 255, 255));

        passwordLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password:");

        loginButton.setBackground(new java.awt.Color(0, 0, 0));
        loginButton.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
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

        showPassCheck.setBackground(new java.awt.Color(153, 153, 255));
        showPassCheck.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
        showPassCheck.setText("Show Password");
        showPassCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassCheckActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(0, 0, 0));
        passwordField.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout formWindowLayout = new javax.swing.GroupLayout(formWindow);
        formWindow.setLayout(formWindowLayout);
        formWindowLayout.setHorizontalGroup(
            formWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginformLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(formWindowLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(formWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formWindowLayout.createSequentialGroup()
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usernameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formWindowLayout.createSequentialGroup()
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(formWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showPassCheck)
                            .addComponent(passwordField))))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(formWindowLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(loginButton)
                .addGap(67, 67, 67)
                .addComponent(createaccountButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(57, 57, 57))
        );
        formWindowLayout.setVerticalGroup(
            formWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formWindowLayout.createSequentialGroup()
                .addComponent(loginformLabel)
                .addGap(74, 74, 74)
                .addGroup(formWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(formWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showPassCheck)
                .addGap(32, 32, 32)
                .addGroup(formWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(exitButton)
                    .addComponent(createaccountButton))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement();

            String user = usernameTextBox.getText();
            String pass = passwordField.getText();
            // Finding each user in the database that equals to that user you entered
            ResultSet output = st.executeQuery("SELECT * FROM USERS WHERE Username='"+user+"'");
            if(output.next())
            {
                // if user exist it will execute
                JOptionPane.showMessageDialog(null,"This user exist");
                // grabbing the password from the database to see if it matches or doesn't match with the user
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
            // if neither are never created it will say both aren't found
            else
            {
                JOptionPane.showMessageDialog(null,"Username and Password were not found!");
                usernameTextBox.setText("");
                passwordField.setText("");
            }
            con.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_loginButtonActionPerformed

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

    private void showPassCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassCheckActionPerformed
        if(showPassCheck.isSelected())
        {
            passwordField.setEchoChar((char)0);
        }
        else
        {
           passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassCheckActionPerformed

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
    private javax.swing.JPanel formWindow;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginformLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JCheckBox showPassCheck;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextBox;
    // End of variables declaration//GEN-END:variables
}

package capstoneproject;
import java.sql.Connection;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CreateAccount extends javax.swing.JFrame {

    public CreateAccount() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        createaccountLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        createaccountButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        showpassCheck = new javax.swing.JCheckBox();
        passwordField = new javax.swing.JPasswordField();
        usernameTextbox = new javax.swing.JTextField();
        emailTextbox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(153, 153, 255));

        createaccountLabel.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        createaccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createaccountLabel.setText("Create Account");
        createaccountLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        usernameLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        usernameLabel.setText("Username:");

        passwordLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        passwordLabel.setText("Password:");

        createaccountButton.setBackground(new java.awt.Color(0, 0, 0));
        createaccountButton.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        createaccountButton.setForeground(new java.awt.Color(255, 255, 255));
        createaccountButton.setText("Create Account");
        createaccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccountButtonActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(0, 0, 0));
        closeButton.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        emailLabel.setText("Email:");

        showpassCheck.setBackground(new java.awt.Color(153, 153, 255));
        showpassCheck.setText("Show Password");
        showpassCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassCheckActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(0, 0, 0));
        passwordField.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));

        usernameTextbox.setBackground(new java.awt.Color(0, 0, 0));
        usernameTextbox.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
        usernameTextbox.setForeground(new java.awt.Color(255, 255, 255));

        emailTextbox.setBackground(new java.awt.Color(0, 0, 0));
        emailTextbox.setFont(new java.awt.Font("Cooper Black", 0, 13)); // NOI18N
        emailTextbox.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createaccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTextbox)
                            .addComponent(passwordField)
                            .addComponent(emailTextbox, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showpassCheck)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(createaccountLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(createaccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(showpassCheck)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createaccountButton)
                    .addComponent(closeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createaccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccountButtonActionPerformed
        try
        {
            String user = usernameTextbox.getText().trim();
            String pass = passwordField.getText().trim();
            String email = emailTextbox.getText().trim();
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement();
            // this statement shows if the user shouldn't be left empty
            if(user == "")
            {
                JOptionPane.showMessageDialog(null,"Username shouldn't be left empty.");
            }
            // this statement shows if the password shouldn't be left empty
            else if(pass == "")
            {
                JOptionPane.showMessageDialog(null,"Password shouldn't be left empty.");
            }
            // this statement shows if the email shouldn't be left empty
            else if(email == "")
            {
                JOptionPane.showMessageDialog(null,"Email shouldn't be left empty.");
            }
            // this statement should let you know that teh password field should be longer than 8 characters
            else if(pass.length() < 8)
            {
                JOptionPane.showMessageDialog(null,"Invaild!\n Password isn't long enough must be longer than 8 characters");
            }
            // this statement should let you know that your password is wrong and let you knwo what you need
            else if(CheckValidPassword(pass) == false || PasswordValidation(pass) == false)
            {
                JOptionPane.showMessageDialog(null,"Invalid Password! Please enter a valid password.\n"
                        + "Password must be long than 8 characters and contain: \nAn Uppercase Letter"
                        + "\n2 Numbers\nA Special Character ! @ # $ % ^ & * " 
                             + "\\ / < > ? | ; : ( ) [ ] { }");
            }
            // if email doesnt consist of a right format it will say wrong email
            else if(EmailValidation(email) == false)
            {
                JOptionPane.showMessageDialog(null,"This email is invalid!");
            }
            // if everything is right it will insert everything into the database
            else
            {
                st.execute("INSERT INTO USERS VALUES('"+user+"','"+pass+"','"+email+"')");
                con.close();
                JOptionPane.showMessageDialog(this,"Account has been created");
                dispose();
                Login page = new Login();
                page.show();
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }

    }//GEN-LAST:event_createaccountButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
        Login log = new Login();
        log.show();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void showpassCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassCheckActionPerformed
        if(showpassCheck.isSelected())
        {
            passwordField.setEchoChar((char)0);
        }
        else
        {
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassCheckActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }
    
    public static boolean PasswordValidation(String input)
    {        
        char[] usableChars = {'a','b','c','d','e','f','g','h','i','j','k','l',
                              'm','n','o','p','q','r','s','t','u','v','w','x',
                              'y','z','A','B','C','D','E','F','G','H','I','J',
                              'K','L','M','N','O','P','Q','R','S','T','U','V',
                              'W','X','Y','Z','!','@','#','$','%','^','&','*',
                              '\\','/','<','>','?','|',',',';',':','[','{',']',
                              '}','0','1','2','3','4','5','6','7','8','9'};
        int uppercase = 0;
        int numbers = 0;
        int specials = 0;
        
        for(int x = 0; x < input.length(); x++)
        {
          char curr = input.charAt(x);
          for(int i = 0; i < usableChars.length; i++)
          {
              if(curr == usableChars[i])
              {
                  if(i > 25 && i < 53)
                  {
                      uppercase++;
                  }
                  if(i > 52 && i < 73)
                  {
                      specials++;
                  }
                  if(i > 73)
                  {
                      numbers++;
                  }
              }
          }
        }
        if(uppercase > 0 && numbers > 1 && specials > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean EmailValidation(String input)
    {
      String emailChars = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
      Pattern emailPattern = Pattern.compile(emailChars);
      Matcher emailMatch = emailPattern.matcher(input);
      if(emailMatch.matches())
      {
          return true;
      }
      else
      {
          return false;
      }
    }
    boolean CheckValidPassword(String input) 
    {  
    char[] unusableChars = {' ','.','(',')','`','~'};
        char[] usableChars = {'a','b','c','d','e','f','g','h','i','j','k','l',
                              'm','n','o','p','q','r','s','t','u','v','w','x',
                              'y','z','A','B','C','D','E','F','G','H','I','J','K',
                               'L','M','N','O','P','Q','R','S','T','U','V','W',
                               'X','Y','Z','!','@','#','$','%','^','&','*','\\','/','<','>',
                               '?','|',',',';',':','[','{',']','}'};
        for(int x = 0; x < input.length(); x++)
        {
            char pass = input.charAt(x);
            for(int i = 0; i < unusableChars.length; i++)
            {
                if(pass == unusableChars[i])
                {
                    JOptionPane.showMessageDialog(null,"Invalid Password! Enter a valid password.");
                    return false;
                }
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton createaccountButton;
    private javax.swing.JLabel createaccountLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextbox;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JCheckBox showpassCheck;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextbox;
    // End of variables declaration//GEN-END:variables
}

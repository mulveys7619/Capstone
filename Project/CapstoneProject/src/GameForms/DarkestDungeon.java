/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameForms;

import capstoneproject.HomePage;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import capstoneproject.User;

public class DarkestDungeon extends javax.swing.JFrame {

    /**
     * Creates new form DarkestDungeon
     */
    public DarkestDungeon() {
        initComponents();
        String user = User.getUsername();
        if(user == null)
        {
            JOptionPane.showMessageDialog(null, "You have to logged in to rate a game");
            likeRatingButton.setEnabled(false);
            dislikeRatingButton.setEnabled(false);
            submitButton.setEnabled(false);
        }
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            int gameID = 11;
            titleLabel.setText(FillForms.getTitle(gameID));
            descTextArea.setText(FillForms.getSynopsis(gameID));
            subgenre1Label.setText(FillForms.getSub1(gameID));
            subgenre2Label.setText(FillForms.getSub2(gameID));
            subgenre3Label.setText(FillForms.getSub3(gameID));
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
        Image img = FillForms.getImage("darkestdungeon");
        Image img2 = img.getScaledInstance(pictureLabel.getWidth(), pictureLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x = new ImageIcon(img2);
        
        pictureLabel.setIcon(x);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ratingsGroup = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        subgenre1Label = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descTextArea = new javax.swing.JTextArea();
        subgenre2Label = new javax.swing.JLabel();
        subgenre3Label = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        mainLabel = new javax.swing.JLabel();
        homeButton = new javax.swing.JLabel();
        ratingsPanel = new javax.swing.JPanel();
        likeRatingButton = new javax.swing.JRadioButton();
        dislikeRatingButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        titleLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Title");
        titleLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        pictureLabel.setMaximumSize(new java.awt.Dimension(250, 250));
        pictureLabel.setPreferredSize(new java.awt.Dimension(250, 250));

        submitButton.setBackground(new java.awt.Color(0, 0, 0));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        descTextArea.setEditable(false);
        descTextArea.setBackground(new java.awt.Color(153, 153, 255));
        descTextArea.setColumns(20);
        descTextArea.setRows(5);
        jScrollPane3.setViewportView(descTextArea);

        titlePanel.setBackground(new java.awt.Color(0, 0, 0));

        mainLabel.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainLabel.setText("Capstone");

        homeButton.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(mainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ratingsPanel.setBackground(new java.awt.Color(153, 153, 255));
        ratingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ratings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 14))); // NOI18N

        likeRatingButton.setBackground(new java.awt.Color(153, 153, 255));
        ratingsGroup.add(likeRatingButton);
        likeRatingButton.setText("Like");

        dislikeRatingButton.setBackground(new java.awt.Color(153, 153, 255));
        ratingsGroup.add(dislikeRatingButton);
        dislikeRatingButton.setText("Dislike");

        javax.swing.GroupLayout ratingsPanelLayout = new javax.swing.GroupLayout(ratingsPanel);
        ratingsPanel.setLayout(ratingsPanelLayout);
        ratingsPanelLayout.setHorizontalGroup(
            ratingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingsPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(likeRatingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(dislikeRatingButton)
                .addGap(84, 84, 84))
        );
        ratingsPanelLayout.setVerticalGroup(
            ratingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingsPanelLayout.createSequentialGroup()
                .addGroup(ratingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(likeRatingButton)
                    .addComponent(dislikeRatingButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(subgenre1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(subgenre3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(344, 344, 344))
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(subgenre2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addGap(397, 397, 397))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(ratingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subgenre1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subgenre3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subgenre2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ratingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(submitButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet output = st.executeQuery("SELECT * FROM Games");

            output.absolute(11);
            int id = output.getInt("Game_ID");
            String query = "REPLACE INTO GameRatings(Game_ID, User_ID, Rating)" + " VALUES(?,?,?)";
            String user = User.getUsername();
            int rating = 0;

            String check = "SELECT * FROM GameRatings WHERE Game_ID = ? AND User_ID = ?";

            PreparedStatement stmt = con.prepareStatement(query);
            PreparedStatement checkst = con.prepareStatement(check);
            checkst.setInt(2,id);
            checkst.setString(3, user);
            ResultSet rs = st.executeQuery(check);
            if(rs.next() == false)
            {
                if(likeRatingButton.isSelected())
                {
                    stmt.setInt(1,id);
                    stmt.setString(2,user);
                    stmt.setInt(3,rating + 1);
                }
                else if(dislikeRatingButton.isSelected())
                {
                    stmt.setInt(1,id);
                    stmt.setString(2,user);
                    stmt.setInt(3,rating - 1);
                }
                stmt.execute();
            }
            else
            {
                String update = "UPDATE GameRatings SET Rating = ? WHERE User_ID = ?, Game_ID = ?:";

                PreparedStatement updateSt = con.prepareStatement(update);
                updateSt.setInt(3, id);
                updateSt.setString(2, user);
            }
            con.close();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void homeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMousePressed
        HomePage home = new HomePage();
        dispose();
        home.show();
    }//GEN-LAST:event_homeButtonMousePressed

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
            java.util.logging.Logger.getLogger(DarkestDungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DarkestDungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DarkestDungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DarkestDungeon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DarkestDungeon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descTextArea;
    private javax.swing.JRadioButton dislikeRatingButton;
    private javax.swing.JLabel homeButton;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton likeRatingButton;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.ButtonGroup ratingsGroup;
    private javax.swing.JPanel ratingsPanel;
    private javax.swing.JLabel subgenre1Label;
    private javax.swing.JLabel subgenre2Label;
    private javax.swing.JLabel subgenre3Label;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}

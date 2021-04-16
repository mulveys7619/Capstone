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
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author jevon
 */
public class ProfilePage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public ProfilePage() {
        initComponents();
        String user = User.getUsername();
        usernameLabel.setText(user);
        
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            String quote = "'";
            String query = "SELECT ga.Game_ID, ga.Title, ga.Thumbnail, ga.Subgenre1, ga.Subgenre2, ga.Subgenre3, gr.Rating, gr.User_ID FROM Games ga, Gameratings gr WHERE gr.User_ID = "
                    + quote + user + quote + " AND gr.game_id = ga.game_id";
            ResultSet combineRs = st.executeQuery(query);
            if(combineRs.next())
            {
                String title = combineRs.getString("Title");
                String pic = combineRs.getString("Thumbnail");
                int rating = combineRs.getInt("Rating");
                int sub1 = combineRs.getInt("Subgenre1");
                int sub2 = combineRs.getInt("Subgenre2");
                int sub3 = combineRs.getInt("Subgenre3");
                
                String rate = String.valueOf(rating);
                String s1 = String.valueOf(sub1);
                String s2 = String.valueOf(sub2);
                String s3 = String.valueOf(sub3);
                
                
                if(sub1 == 1)
                {
                    s1 = "JRPG";
                }
                else if(sub2 == 1)
                {
                    s2 = "JRPG";
                }
                else if(sub3 == 1)
                {
                    s3 = "JRPG";
                }
                if(sub1 == 2)
                {
                    s1 = "Action RPG";
                }
                else if(sub2 == 2)
                {
                    s2 = "Action RPG";
                }
                else if(sub3 == 2)
                {
                    s3 = "Action RPG";
                }
                if(sub1 == 3)
                {
                    s1 = "MMORPG";
                }
                else if(sub2 == 3)
                {
                    s2 = "MMORPG";
                }
                else if(sub3 == 3)
                {
                    s3 = "MMORPG";
                }
                if(sub1 == 4)
                {
                    s1 = "Rogue";
                }
                else if(sub2 == 4)
                {
                    s2 = "Rogue";
                }
                else if(sub3 == 4)
                {
                    s3 = "Rogue";
                }
                if(sub1 == 5)
                {
                    s1 = "Turn Based";
                }
                else if(sub2 == 5)
                {
                    s2 = "Turn Based";
                }
                else if(sub3 == 5)
                {
                    s3 = "Turn Based";
                }
                if(sub1 == 6)
                {
                    s1 = "Tactics";
                }
                else if(sub2 == 6)
                {
                    s2 = "Tactics";
                }
                else if(sub3 == 6)
                {
                    s3 = "Tactics";
                }
                if(sub1 == 7)
                {
                    s1 = "Open World";
                }
                else if(sub2 == 7)
                {
                    s2 = "Open World";
                }
                else if(sub3 == 7)
                {
                    s3 = "Open World";
                }
                if(sub1 == 8)
                {
                    s1 = "";
                }
                else if(sub2 == 8)
                {
                    s2 = "";
                }
                else if(sub3 == 8)
                {
                    s3 = "";
                }
                if(rating == 1)
                {
                    rate = "Like";
                }
                else if(rating == -1)
                {
                    rate = "Dislike";
                }
                
                DefaultTableModel tbModel = (DefaultTableModel)myLibraryTable.getModel();
                String data[] = {title, pic, rate, s1, s2, s3};
                tbModel.addRow(data);
                    /*
                    SELECT ga.Game_ID, ga.Title, ga.Thumbnail, ga.Subgenre1, ga.Subgenre2, ga.Subgenre3, gr.Rating, gr.USER_ID 
                    FROM Games ga, GameRatings gr 
                    WHERE gr.USER_ID = 'Capstone23' AND gr.Rating = 1 AND (ga.Subgenre1 = 7 OR ga.subgenre2 = 7 OR ga.subgenre3 = 7) AND (ga.subgenre1 = 1 OR ga.subgenre2 = 1 OR ga.subgenre3 = 1);
                    */
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String quote = "'";
            String recQuery = "SELECT ga.Game_ID, ga.Title, ga.Thumbnail, ga.Subgenre1, ga.Subgenre2, ga.Subgenre3, gr.Rating, gr.User_ID "
                    + "FROM Games ga, GameRatings gr "
                    + "WHERE gr.User_ID = " + quote + user + quote + " AND gr.Rating = 1 AND (ga.Subgenre1 = 1 OR ga.Subgenre2 = 1 OR ga.Subgenre3 = 1)"
                    + "AND (ga.Subgenre1 = 7 OR ga.Subgenre2 = 7 OR ga.Subgenre3 = 7)";
            ResultSet recommendRs = st.executeQuery(recQuery);
            while(recommendRs.next())
            {   
                String recTitle = recommendRs.getString("Title");
                String recPic = recommendRs.getString("Thumbnail");
                int recSub1 = recommendRs.getInt("Subgenre1");
                int recSub2 = recommendRs.getInt("Subgenre2");
                int recSub3 = recommendRs.getInt("Subgenre3");
                    
                String recS1 = String.valueOf(recSub1);
                String recS2 = String.valueOf(recSub2);
                String recS3 = String.valueOf(recSub3);
                        
//                if(recSub1 == 1)
//                {
//                    recS1 = "JRPG";
//                }
//                else if(recSub2 == 1)
//                {
//                    recS2 = "JRPG";
//                }
//                else if(recSub3 == 1)
//                {
//                    recS3 = "JRPG";
//                }
//                if(recSub1 == 2)
//                {
//                    recS1 = "Action RPG";
//                }
//                else if(recSub2 == 2)
//                {
//                    recS2 = "Action RPG";
//                }
//                else if(recSub3 == 2)
//                {
//                    recS3 = "Action RPG";
//                }
//                if(recSub1 == 3)
//                {
//                    recS1 = "MMORPG";
//                }
//                else if(recSub2 == 3)
//                {
//                    recS2 = "MMORPG";
//                }
//                else if(recSub3 == 3)
//                {
//                    recS3 = "MMORPG";
//                }
//                if(recSub1 == 4)
//                {
//                    recS1 = "Rogue";
//                }
//                else if(recSub2 == 4)
//                {
//                    recS2 = "Rogue";
//                }
//                else if(recSub3 == 4)
//                {
//                    recS3 = "Rogue";
//                }
//                if(recSub1 == 5)
//                {
//                    recS1 = "Turn Based";
//                }
//                else if(recSub2 == 5)
//                {
//                    recS2 = "Turn Based";
//                }
//                else if(recSub3 == 5)
//                {
//                    recS3 = "Turn Based";
//                }
//                if(recSub1 == 6)
//                {
//                    recS1 = "Tactics";
//                }
//                else if(recSub2 == 6)
//                {
//                    recS2 = "Tactics";
//                }
//                else if(recSub3 == 6)
//                {
//                    recS3 = "Tactics";
//                }
//                if(recSub1 == 7)
//                {
//                    recS1 = "Open World";
//                }
//                else if(recSub2 == 7)
//                {
//                    recS2 = "Open World";
//                }
//                else if(recSub3 == 7)
//                {
//                    recS3 = "Open World";
//                }
//                if(recSub1 == 8)
//                {
//                    recS1 = "";
//                }
//                else if(recSub2 == 8)
//                {
//                    recS2 = "";
//                }
//                else if(recSub3 == 8)
//                {
//                    recS3 = "";
//                }
                    
                        DefaultTableModel tbModel2 = (DefaultTableModel)recommendTable.getModel();
                        String data2[] = {recTitle, recPic, recS1, recS2, recS3};
                        tbModel2.addRow(data2);
                    }
        }
        catch(SQLException ex)
        {
            
        }
                  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        seachComboBox = new javax.swing.JComboBox<>();
        goButton = new javax.swing.JButton();
        homeLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        tabbedPanel = new javax.swing.JTabbedPane();
        myLibraryPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myLibraryTable = new javax.swing.JTable();
        recommendationsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recommendTable = new javax.swing.JTable();
        usersPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(153, 153, 255));

        titlePanel.setBackground(new java.awt.Color(0, 0, 0));

        titleLabel.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Capstone");
        titleLabel.setName("Capstone"); // NOI18N

        seachComboBox.setBackground(new java.awt.Color(204, 204, 204));
        seachComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Explore..", "aRPG", "MMORPG", "Roguelike RPG", "Turn-Based RPG", "Tactical", "Open World RPG", "JRPG" }));
        seachComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seachComboBoxActionPerformed(evt);
            }
        });

        goButton.setBackground(new java.awt.Color(204, 204, 204));
        goButton.setText("Go");

        homeLabel.setBackground(new java.awt.Color(0, 0, 0));
        homeLabel.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setText("Home");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(0, 0, 0));
        logoutButton.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                .addComponent(homeLabel)
                .addGap(150, 150, 150)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seachComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(goButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(seachComboBox)
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        myLibraryPanel.setBackground(new java.awt.Color(51, 51, 51));

        myLibraryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Picture", "Your Rating", "Subgenre 1", "Subgenre 2", "Subgenre 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(myLibraryTable);

        javax.swing.GroupLayout myLibraryPanelLayout = new javax.swing.GroupLayout(myLibraryPanel);
        myLibraryPanel.setLayout(myLibraryPanelLayout);
        myLibraryPanelLayout.setHorizontalGroup(
            myLibraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        myLibraryPanelLayout.setVerticalGroup(
            myLibraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        tabbedPanel.addTab("My Library", myLibraryPanel);

        recommendationsPanel.setBackground(new java.awt.Color(51, 51, 51));

        recommendTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titles we Recommended", "Picture", "Subgenre 1", "Subgenre 2", "Subgenre 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(recommendTable);

        javax.swing.GroupLayout recommendationsPanelLayout = new javax.swing.GroupLayout(recommendationsPanel);
        recommendationsPanel.setLayout(recommendationsPanelLayout);
        recommendationsPanelLayout.setHorizontalGroup(
            recommendationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        recommendationsPanelLayout.setVerticalGroup(
            recommendationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        tabbedPanel.addTab("Recommendations", recommendationsPanel);

        usersPanel.setBackground(new java.awt.Color(51, 51, 51));

        usernameLabel.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");
        usernameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        javax.swing.GroupLayout usersPanelLayout = new javax.swing.GroupLayout(usersPanel);
        usersPanel.setLayout(usersPanelLayout);
        usersPanelLayout.setHorizontalGroup(
            usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );
        usersPanelLayout.setVerticalGroup(
            usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersPanelLayout.createSequentialGroup()
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 455, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(usersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1376, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seachComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seachComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seachComboBoxActionPerformed

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        HomePage home = new HomePage();
        dispose();
        home.show();
    }//GEN-LAST:event_homeLabelMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        User.setUsername(null);
        User.setPassword(null);
        dispose();
        JOptionPane.showMessageDialog(null,"You successfully logged out.");
        HomePage hm = new HomePage();
        hm.show();
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel myLibraryPanel;
    private javax.swing.JTable myLibraryTable;
    private javax.swing.JTable recommendTable;
    private javax.swing.JPanel recommendationsPanel;
    private javax.swing.JComboBox<String> seachComboBox;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JPanel usersPanel;
    // End of variables declaration//GEN-END:variables
}

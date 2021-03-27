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
import java.util.ArrayList;
import GameForms.AssassinsCreed;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
            
            /* EXAMPLE QUERY 
            SELECT ga.game_id, ga.Title, ga.Thumbnail, ga.Subgenre1, ga.Subgenre2, ga.Subgenre3, gr.Rating, gr.User_ID
            FROM Games ga, Gameratings gr
            WHERE gr.User_ID = 'Capstone23' AND gr.game_id = ga.game_id;
            */String quote = "'";
            String query = "SELECT ga.game_id, ga.Title, ga.Thumbnail, ga.Subgenre1, ga.Subgenre2, ga.Subgenre3, gr.Rating, gr.User_ID FROM Games ga, Gameratings gr WHERE gr.User_ID = "
                    + quote + user + quote + " AND gr.game_id = ga.game_id";
            ResultSet combineRs = st.executeQuery(query);
            int i = 0;
            while(combineRs.next())
            {
                int gameID = combineRs.getInt("Game_ID");
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
                
                if(rating == 1)
                {
                    rate = "Like";
                }
                if(rating == -1)
                {
                    rate = "Dislike";
                }
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
                
                DefaultTableModel tbModel = (DefaultTableModel)myLibraryTable.getModel();
                String data[] = {title, pic, rate, s1, s2, s3};
                tbModel.addRow(data);
                i++;
            }
//            ResultSet recommendRs = st.executeQuery("SELECT Subgenre1 ")
//            while(recommendRs.next())
//            {
//                int gameID = combineRs.getInt("Game_ID");
//                String title = combineRs.getString("Title");
//                String pic = combineRs.getString("Thumbnail");
//                int sub1 = combineRs.getInt("Subgenre1");
//                int sub2 = combineRs.getInt("Subgenre2");
//                int sub3 = combineRs.getInt("Subgenre3");
//                
//            }
            
            // Displaying the library(later use)
//            ResultSet dispLib = st.executeQuery("SELECT * FROM GAMES WHERE Game_ID ='"+currGame+"'");

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
    }
//            for(int i  = 1; i < dispLib.getRow(); i++)
//            {
//                dispLib.getRowId(i);
//                int id = dispLib.getInt("Game_ID");
//                String thumbnail = dispLib.getString("Thumbnail");
//                String title = dispLib.getString("Title");
//                int sub1 = dispLib.getInt("Subgenre1");
//                int sub2 = dispLib.getInt("Subgenre2");
//                int sub3 = dispLib.getInt("Subgenre3");
//                newImg = new ImageIcon(getClass().getResource(thumbnail));
//                String getRec = "SELECT Game_ID FROM Games WHERE Subgenre1 = "+sub1+" AND Subgenre2 = "+sub2+" AND Subgenre3 = "+sub3+"";
//                for(int x = 1; x < 35; x++)
//                {
//                    JLabel games = new JLabel();
//                    games.setIcon(newImg);
//                    myLibraryPanel.add(games);
//                }
//                
//            }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        seachComboBox = new javax.swing.JComboBox<>();
        goButton = new javax.swing.JButton();
        homeLabel = new javax.swing.JLabel();
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

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                .addComponent(homeLabel)
                .addGap(314, 314, 314)
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
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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
                "Titles we Recommended", "Picture", "Sungenre 1", "Subgenre 2", "Subgenre 3"
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
                .addContainerGap(38, Short.MAX_VALUE))
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneproject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AddGames extends javax.swing.JFrame {
    public ImageIcon imgIconP;

    public AddGames() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cap_nav = new javax.swing.JLabel();
        formDesc = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        sub1Label = new javax.swing.JLabel();
        sub2Label = new javax.swing.JLabel();
        sub3Label = new javax.swing.JLabel();
        gameDescLabel = new javax.swing.JLabel();
        titleText = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        requiredFieldLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gameDescText = new javax.swing.JTextArea();
        sub3Combo = new javax.swing.JComboBox<>();
        sub2Combo = new javax.swing.JComboBox<>();
        sub1Combo = new javax.swing.JComboBox<>();
        ratingsPanel = new javax.swing.JPanel();
        likeRatingButton = new javax.swing.JRadioButton();
        dislikeRatingButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(35, 39, 42));
        mainPanel.setPreferredSize(new java.awt.Dimension(1233, 695));

        jPanel1.setBackground(new java.awt.Color(102, 0, 153));
        jPanel1.setForeground(new java.awt.Color(102, 0, 153));

        cap_nav.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        cap_nav.setForeground(new java.awt.Color(255, 255, 255));
        cap_nav.setText("RPG Recommender");
        cap_nav.setName(""); // NOI18N
        cap_nav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cap_navMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cap_nav, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cap_nav, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        formDesc.setFont(new java.awt.Font("Cooper Black", 2, 36)); // NOI18N
        formDesc.setForeground(new java.awt.Color(255, 255, 255));
        formDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formDesc.setText("ADD A GAME TO RPG RECOMMENDER");

        titleLabel.setFont(new java.awt.Font("Cooper Black", 3, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("ADD TITLE *");

        sub1Label.setFont(new java.awt.Font("Cooper Black", 3, 24)); // NOI18N
        sub1Label.setForeground(new java.awt.Color(255, 255, 255));
        sub1Label.setText("ADD GENRE *");

        sub2Label.setFont(new java.awt.Font("Cooper Black", 3, 24)); // NOI18N
        sub2Label.setForeground(new java.awt.Color(255, 255, 255));
        sub2Label.setText("ADD SUBGENRE");

        sub3Label.setFont(new java.awt.Font("Cooper Black", 3, 24)); // NOI18N
        sub3Label.setForeground(new java.awt.Color(255, 255, 255));
        sub3Label.setText("ADD SUBGENRE");

        gameDescLabel.setFont(new java.awt.Font("Cooper Black", 3, 24)); // NOI18N
        gameDescLabel.setForeground(new java.awt.Color(255, 255, 255));
        gameDescLabel.setText("ADD DESCRIPTION");

        titleText.setBackground(new java.awt.Color(44, 47, 51));
        titleText.setFont(new java.awt.Font("Cooper Black", 3, 18)); // NOI18N
        titleText.setForeground(new java.awt.Color(255, 255, 255));
        titleText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        cancelButton.setBackground(new java.awt.Color(44, 47, 51));
        cancelButton.setFont(new java.awt.Font("Cooper Black", 0, 11)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        requiredFieldLabel.setFont(new java.awt.Font("Cooper Black", 3, 14)); // NOI18N
        requiredFieldLabel.setForeground(new java.awt.Color(255, 255, 255));
        requiredFieldLabel.setText("* denotes a required field");

        submitButton.setBackground(new java.awt.Color(44, 47, 51));
        submitButton.setFont(new java.awt.Font("Cooper Black", 0, 11)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });

        gameDescText.setBackground(new java.awt.Color(44, 47, 51));
        gameDescText.setColumns(20);
        gameDescText.setFont(new java.awt.Font("Cooper Black", 3, 14)); // NOI18N
        gameDescText.setForeground(new java.awt.Color(255, 255, 255));
        gameDescText.setLineWrap(true);
        gameDescText.setRows(5);
        jScrollPane1.setViewportView(gameDescText);

        sub3Combo.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        sub3Combo.setForeground(new java.awt.Color(255, 255, 255));
        sub3Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "JRPG", "ARPG", "MMORPG", "ROGUE", "TURN BASED", "TACTICS", "OPEN WORLD" }));

        sub2Combo.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        sub2Combo.setForeground(new java.awt.Color(255, 255, 255));
        sub2Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "JRPG", "ARPG", "MMORPG", "ROGUE", "TURN BASED", "TACTICS", "OPEN WORLD" }));

        sub1Combo.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        sub1Combo.setForeground(new java.awt.Color(255, 255, 255));
        sub1Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "JRPG", "ARPG", "MMORPG", "ROGUE", "TURN BASED", "TACTICS", "OPEN WORLD" }));

        ratingsPanel.setBackground(new java.awt.Color(51, 51, 51));
        ratingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ratings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        ratingsPanel.setForeground(new java.awt.Color(255, 255, 255));

        likeRatingButton.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(likeRatingButton);
        likeRatingButton.setForeground(new java.awt.Color(255, 255, 255));
        likeRatingButton.setText("Like");

        dislikeRatingButton.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(dislikeRatingButton);
        dislikeRatingButton.setForeground(new java.awt.Color(255, 255, 255));
        dislikeRatingButton.setText("Dislike");

        javax.swing.GroupLayout ratingsPanelLayout = new javax.swing.GroupLayout(ratingsPanel);
        ratingsPanel.setLayout(ratingsPanelLayout);
        ratingsPanelLayout.setHorizontalGroup(
            ratingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingsPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(likeRatingButton)
                .addGap(130, 130, 130)
                .addComponent(dislikeRatingButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        ratingsPanelLayout.setVerticalGroup(
            ratingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(likeRatingButton)
                .addComponent(dislikeRatingButton))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameDescLabel)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sub3Label, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(sub2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sub2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub3Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(formDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 330, Short.MAX_VALUE)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(ratingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(requiredFieldLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sub1Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(743, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(formDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(sub1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub3Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(ratingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requiredFieldLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(214, 214, 214))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(sub1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(512, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1447, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cap_navMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cap_navMouseClicked
        HomePage home = new HomePage();
        dispose();
        home.show();
    }//GEN-LAST:event_cap_navMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        HomePage home = new HomePage();
        dispose();
        home.show();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String path = "",
                    title = "",
                    desc = "";
            int id = 0,
                    sub1 = 0,
                    sub2 = 0,
                    sub3 = 0;
            
            
            // DETERMINE GAME_ID FIELD
            String countQuery = "SELECT COUNT(*) FROM games";
            ResultSet countRS = st.executeQuery(countQuery);
            countRS.next();
            int result = countRS.getInt(1);
            id = result + 1;
            
            // DETERMINE TITLE FIELD
            title = titleText.getText();
            
            //DETERMINE PATH FIELD
            path = "usergame";
            
            // DETERMINE DESCRIPTION FIELD
            desc = gameDescText.getText();
            
            // DETERMINE GENRE FIELDS
            int combo1 = sub1Combo.getSelectedIndex();
            int combo2 = sub2Combo.getSelectedIndex();
            int combo3 = sub3Combo.getSelectedIndex();
            switch(combo1)
            {
                case 0:
                    sub1 = 8;
                    break;
                case 1:
                    sub1 = 1;
                    break;
                case 2:
                    sub1 = 2;
                    break;
                case 3:
                    sub1 = 3;
                    break;
                case 4:
                    sub1 = 4;
                    break;
                case 5:
                    sub1 = 5;
                    break;
                case 6:
                    sub1 = 6;
                    break;
                case 7:
                    sub1 = 7;
                    break;
                default:
                    sub1 = 8;
            }
            switch(combo2)
            {
                case 0:
                    sub2 = 8;
                    break;
                case 1:
                    sub2 = 1;
                    break;
                case 2:
                    sub2 = 2;
                    break;
                case 3:
                    sub2 = 3;
                    break;
                case 4:
                    sub2 = 4;
                    break;
                case 5:
                    sub2 = 5;
                    break;
                case 6:
                    sub2 = 6;
                    break;
                case 7:
                    sub2 = 7;
                    break;
                default:
                    sub2 = 8;
            }
            switch(combo3)
            {
                case 0:
                    sub3 = 8;
                    break;
                case 1:
                    sub3 = 1;
                    break;
                case 2:
                    sub3 = 2;
                    break;
                case 3:
                    sub3 = 3;
                    break;
                case 4:
                    sub3 = 4;
                    break;
                case 5:
                    sub3 = 5;
                    break;
                case 6:
                    sub3 = 6;
                    break;
                case 7:
                    sub3 = 7;
                    break;
                default:
                    sub3 = 8;
            }
            
            
            // ADD RECORD TO GAMES TABLE
            String addRecord = "INSERT INTO games VALUES(?,?,?,?,?,?,?)";
            PreparedStatement addRecordPS = con.prepareStatement(addRecord);
            addRecordPS.setInt(1, id);
            addRecordPS.setString(2, path);
            addRecordPS.setString(3, title);
            addRecordPS.setString(4, desc);
            addRecordPS.setInt(5, sub1);
            addRecordPS.setInt(6, sub2);
            addRecordPS.setInt(7, sub3);
            addRecordPS.executeUpdate();
            
            String user = User.getUsername();
            int rating = 0;
            String quote = "'";
            
            // Queries used for inserting into the database for the rating a game
            String check = "SELECT * FROM GameRatings WHERE Game_ID = "+id+" AND User_ID = " + quote + user + quote;
            String delete = "DELETE FROM GameRatings WHERE Game_ID = "+id+" AND User_ID = " + quote + user + quote;
            String query = "INSERT INTO GameRatings(Game_ID, User_ID, Rating) VALUES(?,?,?)";
            
            PreparedStatement checkSt = con.prepareStatement(check);
            PreparedStatement deleteSt = con.prepareStatement(delete);
            PreparedStatement stmt = con.prepareStatement(query);
            
            ResultSet rsCheck = checkSt.executeQuery();
            // if a rating exist it will change based off the selection of the of buttons
            if(rsCheck.next())
            {
                // if it exist it will delete the record first then go through with what selection you chose
                deleteSt.executeUpdate();
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
                // It updates inside the database to put that record in the table
                int x = stmt.executeUpdate();
                if(x > 0)
                {
                    JOptionPane.showMessageDialog(null, "Your rating has been updated");
                }
            }
            // if it doesn't exist it should just put your selection in the table
            else
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
                // it adds the record in the table
                int x = stmt.executeUpdate();
                if(x > 0)
                {
                    JOptionPane.showMessageDialog(null, "Your rating has been inserted");
                }
            }
            con.close();

            // Lets the user know you added a game to your ratings 
            JOptionPane.showMessageDialog(null, "Game Added");
            HomePage home = new HomePage();
            dispose();
            home.show();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_submitButtonMouseClicked

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
            java.util.logging.Logger.getLogger(AddGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cap_nav;
    private javax.swing.JRadioButton dislikeRatingButton;
    private javax.swing.JLabel formDesc;
    private javax.swing.JLabel gameDescLabel;
    private javax.swing.JTextArea gameDescText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton likeRatingButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel ratingsPanel;
    private javax.swing.JLabel requiredFieldLabel;
    private javax.swing.JComboBox<String> sub1Combo;
    private javax.swing.JLabel sub1Label;
    private javax.swing.JComboBox<String> sub2Combo;
    private javax.swing.JLabel sub2Label;
    private javax.swing.JComboBox<String> sub3Combo;
    private javax.swing.JLabel sub3Label;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleText;
    // End of variables declaration//GEN-END:variables
}

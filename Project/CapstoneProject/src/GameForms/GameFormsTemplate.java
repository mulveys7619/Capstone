package GameForms;

import capstoneproject.CurrGame;
import capstoneproject.HomePage;
import capstoneproject.User;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class GameFormsTemplate extends javax.swing.JFrame {
    public GameFormsTemplate() {
        initComponents();
        String user = User.getUsername();
        if(user == null)
        {
            JOptionPane.showMessageDialog(null, "You have to logged in to rate a game");
            ratingsPanel.setVisible(false);
            likeRatingButton.setVisible(false);
            dislikeRatingButton.setVisible(false);
            noRatingButton.setVisible(false);
            submitButton.setVisible(false);
            likeRatingButton.setEnabled(false);
            dislikeRatingButton.setEnabled(false);
            noRatingButton.setEnabled(false);
            submitButton.setEnabled(false);
        } 
        int gameID = CurrGame.GetGameID();
        String path = "";
        titleLabel.setText(FillForms.getTitle(gameID));
        subgenre1Label.setText(FillForms.getSub1(gameID));
        subgenre2Label.setText(FillForms.getSub2(gameID));
        subgenre3Label.setText(FillForms.getSub3(gameID));
        synopsisScroll.setBorder(null);
        synopsisScroll.getVerticalScrollBar().setBackground(Color.BLACK);
        synopsisScroll.getHorizontalScrollBar().setBackground(Color.BLACK);
        synopsisText.setText(FillForms.getSynopsis(gameID));
        synopsisText.setBorder(null);
        synopsisText.setLineWrap(true);
        synopsisText.setWrapStyleWord(true);
        try
        {
        // This access everything to put into the labels 
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String pathQuery = "SELECT thumbnail FROM GAMES WHERE game_id = ?";
        String likeCountQuery = "SELECT COUNT(Rating) FROM GameRatings WHERE Rating = 1 AND Game_ID = "+gameID+"";
        String dislikeCountQuery = "SELECT COUNT(Rating) FROM GameRatings WHERE Rating = -1 AND Game_ID = "+gameID+"";
        ResultSet likeRS = st.executeQuery(likeCountQuery);
        while(likeRS.next())
        {
            int count = likeRS.getInt(1);
            String countSr = Integer.toString(count);
            likesCountLabel.setText(countSr);
        }
        ResultSet dislikeRS = st.executeQuery(dislikeCountQuery);
        while(dislikeRS.next())
        {
            int count = dislikeRS.getInt(1);
            String countSr = Integer.toString(count);
            dislikeCountLabel.setText(countSr);
        }
        PreparedStatement pathPS = con.prepareStatement(pathQuery);
        pathPS.setInt(1, gameID);
        ResultSet pathRS = pathPS.executeQuery();
        if (pathRS.next())
        {
            path = pathRS.getString("Thumbnail");
        }
        pictureLabel = FillForms.getImage(pictureLabel, path);
        con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ratingsGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        likesLabel = new javax.swing.JLabel();
        disklikesLabel = new javax.swing.JLabel();
        genreHeaderLabel = new javax.swing.JLabel();
        synopsisScroll = new javax.swing.JScrollPane();
        synopsisText = new javax.swing.JTextArea();
        synopsisLabel = new javax.swing.JLabel();
        subgenre1Label = new javax.swing.JLabel();
        subgenre2Label = new javax.swing.JLabel();
        subgenre3Label = new javax.swing.JLabel();
        ratingsPanel = new javax.swing.JPanel();
        likeRatingButton = new javax.swing.JRadioButton();
        dislikeRatingButton = new javax.swing.JRadioButton();
        noRatingButton = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        likesCountLabel = new javax.swing.JLabel();
        dislikeCountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        titlePanel.setBackground(new java.awt.Color(153, 153, 255));
        titlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        homeLabel.setBackground(new java.awt.Color(153, 153, 255));
        homeLabel.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        homeLabel.setText("RPG Recommender");
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
                .addComponent(homeLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pictureLabel.setBackground(new java.awt.Color(51, 51, 51));
        pictureLabel.setText("Picture");

        titleLabel.setBackground(new java.awt.Color(51, 51, 51));
        titleLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title");

        likesLabel.setBackground(new java.awt.Color(51, 51, 51));
        likesLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        likesLabel.setForeground(new java.awt.Color(255, 255, 255));
        likesLabel.setText("Likes:");

        disklikesLabel.setBackground(new java.awt.Color(51, 51, 51));
        disklikesLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        disklikesLabel.setForeground(new java.awt.Color(255, 255, 255));
        disklikesLabel.setText("Dislikes:");

        genreHeaderLabel.setBackground(new java.awt.Color(51, 51, 51));
        genreHeaderLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        genreHeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genreHeaderLabel.setText("Genres:");

        synopsisScroll.setBackground(new java.awt.Color(51, 51, 51));

        synopsisText.setBackground(new java.awt.Color(51, 51, 51));
        synopsisText.setColumns(20);
        synopsisText.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        synopsisText.setForeground(new java.awt.Color(255, 255, 255));
        synopsisText.setRows(5);
        synopsisText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        synopsisText.setMaximumSize(new java.awt.Dimension(878, 120));
        synopsisScroll.setViewportView(synopsisText);

        synopsisLabel.setBackground(new java.awt.Color(51, 51, 51));
        synopsisLabel.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        synopsisLabel.setForeground(new java.awt.Color(255, 255, 255));
        synopsisLabel.setText("Synopsis");

        subgenre1Label.setBackground(new java.awt.Color(51, 51, 51));
        subgenre1Label.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        subgenre1Label.setForeground(new java.awt.Color(255, 255, 255));
        subgenre1Label.setText("subgenre1");

        subgenre2Label.setBackground(new java.awt.Color(51, 51, 51));
        subgenre2Label.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        subgenre2Label.setForeground(new java.awt.Color(255, 255, 255));
        subgenre2Label.setText("subgenre2");

        subgenre3Label.setBackground(new java.awt.Color(51, 51, 51));
        subgenre3Label.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        subgenre3Label.setForeground(new java.awt.Color(255, 255, 255));
        subgenre3Label.setText("subgenre3");

        ratingsPanel.setBackground(new java.awt.Color(51, 51, 51));
        ratingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ratings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        ratingsPanel.setForeground(new java.awt.Color(255, 255, 255));

        likeRatingButton.setBackground(new java.awt.Color(51, 51, 51));
        ratingsGroup.add(likeRatingButton);
        likeRatingButton.setForeground(new java.awt.Color(255, 255, 255));
        likeRatingButton.setText("Like");

        dislikeRatingButton.setBackground(new java.awt.Color(51, 51, 51));
        ratingsGroup.add(dislikeRatingButton);
        dislikeRatingButton.setForeground(new java.awt.Color(255, 255, 255));
        dislikeRatingButton.setText("Dislike");

        noRatingButton.setBackground(new java.awt.Color(51, 51, 51));
        ratingsGroup.add(noRatingButton);
        noRatingButton.setForeground(new java.awt.Color(255, 255, 255));
        noRatingButton.setText("No Rating");

        javax.swing.GroupLayout ratingsPanelLayout = new javax.swing.GroupLayout(ratingsPanel);
        ratingsPanel.setLayout(ratingsPanelLayout);
        ratingsPanelLayout.setHorizontalGroup(
            ratingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingsPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(likeRatingButton)
                .addGap(130, 130, 130)
                .addComponent(dislikeRatingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(noRatingButton)
                .addGap(25, 25, 25))
        );
        ratingsPanelLayout.setVerticalGroup(
            ratingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ratingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(likeRatingButton)
                .addComponent(dislikeRatingButton)
                .addComponent(noRatingButton))
        );

        submitButton.setBackground(new java.awt.Color(0, 0, 0));
        submitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        likesCountLabel.setBackground(new java.awt.Color(51, 51, 51));
        likesCountLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        likesCountLabel.setForeground(new java.awt.Color(255, 255, 255));

        dislikeCountLabel.setBackground(new java.awt.Color(51, 51, 51));
        dislikeCountLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        dislikeCountLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(synopsisScroll, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(synopsisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 165, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(likesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(subgenre1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(disklikesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(likesCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dislikeCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(subgenre2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(subgenre3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(genreHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ratingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(likesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(likesCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(dislikeCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(disklikesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genreHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subgenre1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subgenre2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subgenre3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(synopsisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(synopsisScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addGap(201, 201, 201))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            int id = CurrGame.GetGameID();
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
                else if(noRatingButton.isSelected())
                {
                    JOptionPane.showMessageDialog(null,"Your rating has been deleted");
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
                else if(noRatingButton.isSelected())
                {
                    JOptionPane.showMessageDialog(null,"You chose not to rate the game.");
                }
                // it adds the record in the table
                int x = stmt.executeUpdate();
                if(x > 0)
                {
                    JOptionPane.showMessageDialog(null, "Your rating has been inserted");
                }
            }
            con.close();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        HomePage hm = new HomePage();
        hm.show();
        dispose();
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
            java.util.logging.Logger.getLogger(GameFormsTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFormsTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFormsTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFormsTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFormsTemplate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel disklikesLabel;
    private javax.swing.JLabel dislikeCountLabel;
    private javax.swing.JRadioButton dislikeRatingButton;
    private javax.swing.JLabel genreHeaderLabel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton likeRatingButton;
    private javax.swing.JLabel likesCountLabel;
    private javax.swing.JLabel likesLabel;
    private javax.swing.JRadioButton noRatingButton;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.ButtonGroup ratingsGroup;
    private javax.swing.JPanel ratingsPanel;
    private javax.swing.JLabel subgenre1Label;
    private javax.swing.JLabel subgenre2Label;
    private javax.swing.JLabel subgenre3Label;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel synopsisLabel;
    private javax.swing.JScrollPane synopsisScroll;
    private javax.swing.JTextArea synopsisText;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}

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
    /* EXAMPLE FOR RECOMMENDATION
       SELECT ga.Game_ID, ga.Title, ga.Thumbnail, ga.Subgenre1, ga.Subgenre2, ga.Subgenre3, gr.Rating, gr.USER_ID 
       FROM Games ga, GameRatings gr 
       WHERE gr.USER_ID = 'Capstone23' AND gr.Rating = 1 AND (ga.Subgenre1 = 7 OR ga.subgenre2 = 7 OR ga.subgenre3 = 7) AND (ga.subgenre1 = 1 OR ga.subgenre2 = 1 OR ga.subgenre3 = 1);
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
            String query = "SELECT ga.Game_ID, ga.Title, ga.Subgenre1, ga.Subgenre2, ga.Subgenre3, gr.Rating, gr.User_ID "
                    + "FROM Games ga, Gameratings gr "
                    + "WHERE gr.User_ID = " + quote + user + quote + " AND gr.game_id = ga.game_id";
            ResultSet combineRs = st.executeQuery(query);
            while(combineRs.next())
            {
                String title = combineRs.getString("Title");
                int rating = combineRs.getInt("Rating");
                int sub1 = combineRs.getInt("Subgenre1");
                int sub2 = combineRs.getInt("Subgenre2");
                int sub3 = combineRs.getInt("Subgenre3");
                
                String rate = String.valueOf(rating);
                String s1 = String.valueOf(sub1);
                String s2 = String.valueOf(sub2);
                String s3 = String.valueOf(sub3);
                
                
                switch(sub1)
                {
                    case 1:
                        s1 = "JRPG";
                        break;
                    case 2:
                        s1 = "Action RPG";
                        break;
                    case 3:
                        s1 = "MMORPG";
                        break;
                    case 4:
                        s1 = "Rogue";
                        break;
                    case 5:
                        s1 = "Turn Based";
                        break;
                    case 6:
                        s1 = "Tactics";
                        break;
                    case 7:
                        s1 = "Open World";
                        break;
                    case 8:
                        s3 = "";
                        break;
                    default:
                        break;
                }
                switch(sub2)
                {
                    case 1:
                        s2 = "JRPG";
                        break;
                    case 2:
                        s2 = "Action RPG";
                        break;
                    case 3:
                        s2 = "MMORPG";
                        break;
                    case 4:
                        s2 = "Rogue";
                        break;
                    case 5:
                        s2 = "Turn Based";
                        break;
                    case 6:
                        s2 = "Tactics";
                        break;
                    case 7:
                        s2 = "Open World";
                        break;
                    case 8:
                        s3 = "";
                        break;
                    default:
                        break;
                }
                switch(sub3)
                {
                    case 1:
                        s3 = "JRPG";
                        break;
                    case 2:
                        s3 = "Action RPG";
                        break;
                    case 3:
                        s3 = "MMORPG";
                        break;
                    case 4:
                        s3 = "Rogue";
                        break;
                    case 5:
                        s3 = "Turn Based";
                        break;
                    case 6:
                        s3 = "Tactics";
                        break;
                    case 7:
                        s3 = "Open World";
                        break;
                    case 8:
                        s3 = "";
                        break;
                    default:
                        break;
                }
                
                
                DefaultTableModel tbModel = (DefaultTableModel)myLibraryTable.getModel();
                String data[] = {title, rate, s1, s2, s3};
                tbModel.addRow(data);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
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
        secondGenreLabel = new javax.swing.JLabel();
        likedGenresLabel = new javax.swing.JLabel();
        firstGenreLabel = new javax.swing.JLabel();
        recommendationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(153, 153, 255));

        titlePanel.setBackground(new java.awt.Color(0, 0, 0));

        titleLabel.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("RPG Recommender");
        titleLabel.setName("Capstone"); // NOI18N

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
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeLabel)
                .addGap(502, 502, 502)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        myLibraryPanel.setBackground(new java.awt.Color(51, 51, 51));

        myLibraryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Your Rating", "Subgenre 1", "Subgenre 2", "Subgenre 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
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
                "Titles we Recommended", "Subgenre 1", "Subgenre 2", "Subgenre 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        secondGenreLabel.setBackground(new java.awt.Color(51, 51, 51));
        secondGenreLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        secondGenreLabel.setForeground(new java.awt.Color(255, 255, 255));

        likedGenresLabel.setBackground(new java.awt.Color(51, 51, 51));
        likedGenresLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        likedGenresLabel.setForeground(new java.awt.Color(255, 255, 255));
        likedGenresLabel.setText("Most Liked Genres:");

        firstGenreLabel.setBackground(new java.awt.Color(51, 51, 51));
        firstGenreLabel.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        firstGenreLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout usersPanelLayout = new javax.swing.GroupLayout(usersPanel);
        usersPanel.setLayout(usersPanelLayout);
        usersPanelLayout.setHorizontalGroup(
            usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usersPanelLayout.createSequentialGroup()
                .addComponent(likedGenresLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(166, 166, 166))
            .addGroup(usersPanelLayout.createSequentialGroup()
                .addGroup(usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondGenreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstGenreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        usersPanelLayout.setVerticalGroup(
            usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersPanelLayout.createSequentialGroup()
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(likedGenresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstGenreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondGenreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        recommendationButton.setText("See Recommendations");
        recommendationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recommendationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(recommendationButton)))
                .addContainerGap(52, Short.MAX_VALUE))
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
                .addGap(30, 30, 30)
                .addComponent(recommendationButton)
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
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void recommendationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recommendationButtonActionPerformed
        String user = User.getUsername();
        try 
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String quote = "'";
            
            
            String checkQuery = "SELECT Game_ID FROM GameRatings WHERE User_ID = " + quote + user + quote + " AND Rating = 1";
            ResultSet checkRs = st.executeQuery(checkQuery);
            String subCheck = "SELECT * FROM GAMES WHERE GAME_ID IN (";
            int size = 0;
            int count = 0;
            while(checkRs.next())
            {
                checkRs.last();
                size = checkRs.getRow();
            }
            checkRs.beforeFirst();
            while(checkRs.next())
            {
                count++;
                if(count < size)
                {
                    subCheck += checkRs.getInt("Game_ID") + ", ";
                }
                else 
                {
                    subCheck += checkRs.getInt("Game_ID");
                }
            }
            subCheck += ")";
            PreparedStatement subCheckPs = con.prepareStatement(subCheck);
            ResultSet subCheckRs = subCheckPs.executeQuery();
            int jrpg = 1;
            int arpg = 2;
            int mmo = 3;
            int rogue = 4;
            int turnBased = 5;
            int tactics = 6;
            int openWorld = 7;
            int jrpgCount = 0;
            int arpgCount = 0;
            int mmoCount = 0;
            int rogueCount = 0;
            int turnBasedCount = 0;
            int tacticsCount = 0;
            int openWorldCount = 0;
            
            while(subCheckRs.next())
            {
                String recTitle = subCheckRs.getString("Title");
                int recSub1 = subCheckRs.getInt("Subgenre1");
                int recSub2 = subCheckRs.getInt("Subgenre2");
                int recSub3 = subCheckRs.getInt("Subgenre3");
                    
                String recS1 = String.valueOf(recSub1);
                String recS2 = String.valueOf(recSub2);
                String recS3 = String.valueOf(recSub3);
                
                switch(recSub1)
                {
                    case 1:
                        jrpgCount++;
                        break;
                    case 2:
                        arpgCount++;
                        break;
                    case 3:
                        mmoCount++;
                        break;
                    case 4:
                        rogueCount++;
                        break;
                    case 5:
                        turnBasedCount++;
                        break;
                    case 6:
                        tacticsCount++;
                        break;
                    case 7:
                        openWorldCount++;
                        break;
                    default:
                        break;
                }
                switch(recSub2)
                {
                    case 1:
                        jrpgCount++;
                        break;
                    case 2:
                        arpgCount++;
                        break;
                    case 3:
                        mmoCount++;
                        break;
                    case 4:
                        rogueCount++;
                        break;
                    case 5:
                        turnBasedCount++;
                        break;
                    case 6:
                        tacticsCount++;
                        break;
                    case 7:
                        openWorldCount++;
                        break;
                    default:
                        break;
                }
                switch(recSub3)
                {
                    case 1:
                        jrpgCount++;
                        break;
                    case 2:
                        arpgCount++;
                        break;
                    case 3:
                        mmoCount++;
                        break;
                    case 4:
                        rogueCount++;
                        break;
                    case 5:
                        turnBasedCount++;
                        break;
                    case 6:
                        tacticsCount++;
                        break;
                    case 7:
                        openWorldCount++;
                        break;
                    default:
                        break;
                }
                
            }
            // most counted genre
            int prio1 = 0;
            // checks if prio1 is filled already. if filled will be true
            boolean prio1check = false;
            // 2nd most counted genre
            int prio2 = 0;
            // checks if prio2 is filled already. if filled will be true
            boolean prio2check = false;
            // 3rd most counted genre
            int prio3 = 0;
            // checks if prio3 is filled already. if filled will be true
            boolean prio3check = false;
            
            // array of all count values
            int[] countArray = {jrpgCount, arpgCount, mmoCount, rogueCount, turnBasedCount, tacticsCount, openWorldCount};
            // array of genre id values
            int[] genreArray = {jrpg, arpg, mmo, rogue, turnBased, tactics, openWorld};
            
            // first for loop determines what element to compare
            for (int i = 0; i < countArray.length; i++)
            {
                // second for loop lets countArray[i] compare to every other element in array
                for(int x = 0; x < countArray.length; x++)
                {
                    // if prio1 is not already filled and if original int wasn't removed
                    
                    // this number wont be used but it is to help start prio2 as the main priority
                    if(prio1check != true && countArray[i] != -1)
                    {
                        // if i > x or i = x, make i prio1
                        if (countArray[i] > countArray[x])
                        {
                            prio1 = genreArray[x];
                        }
                        // if i < x, make x prio1
                        else
                        {
                            prio1 = genreArray[i];
                        }
                    }
                    // if prio2 is not already filled and if original int wasn't removed
                    else if(prio2check != true && countArray[x] != -1)
                    {
                        // if i > x or i = x, make i prio2
                        if (countArray[i] > countArray[x])
                        {
                            prio2 = genreArray[i];
                        }
                        // if i < x, make x prio2
                        else
                        {
                            prio2 = genreArray[x];
                        }
                    }
                    // if prio3 is not already filled and if original int wasn't removed
                    else if(prio3check != true && countArray[x] != -1)
                    {
                        // if i > x or i = x, make i prio3
                        if (countArray[i] > countArray[x])
                        {
                            prio3 = genreArray[i];
                        }
                        // if i < x, make x prio3
                        else
                        {
                            prio3 = genreArray[x];
                        }
                    }
                }
                // if prio1 has new value, make prio1check true so it doesn't compare for it again
                if (prio1 != 0)
                {
                    prio1check = true;
                    // make element in countArray that was highest -1 so it is no longer the largest int
                    countArray[prio1 - 1] = -1;
                }
                // if prio2 has new value, make prio1check true so it doesn't compare for it again
                if (prio2 != 0)
                {
                    prio2check = true;
                     // make element in countArray that was highest -1 so it is no longer the largest int
                    countArray[prio2 - 1] = -1;
                }
                // if prio3 has new value, make prio1check true so it doesn't compare for it again
                if (prio3 != 0)
                {
                    prio3check = true;
                     // make element in countArray that was highest -1 so it is no longer the largest int
                    countArray[prio3 - 1] = -1;
                }
            }
           String recQuery = "SELECT DISTINCT ga.Game_ID, ga.Title, ga.Subgenre1, ga.Subgenre2, ga.Subgenre3, gr.Rating, gr.User_ID "
                    + "FROM Games ga, GameRatings gr "
                    + "WHERE gr.User_ID = " + quote + user + quote + " AND gr.Rating = 1 AND (ga.Subgenre1 = "+prio2+" OR ga.Subgenre2 = "+prio2+" OR ga.subgenre3 = "+prio2+")"
                    + "AND (ga.Subgenre1 = "+prio3+" OR ga.Subgenre2 = "+prio3+" OR ga.Subgenre3 = "+prio3+")";
            ResultSet recommendRs = st.executeQuery(recQuery);
            switch(prio2)
                {
                    case 1:
                        firstGenreLabel.setText("JRPG");
                        break;
                    case 2:
                        firstGenreLabel.setText("Action RPG");
                        break;
                    case 3:
                        firstGenreLabel.setText("MMORPG");
                        break;
                    case 4:
                        firstGenreLabel.setText("Rogue");
                        break;
                    case 5:
                        firstGenreLabel.setText("Turn Based");
                        break;
                    case 6:
                        firstGenreLabel.setText("Tactics");
                        break;
                    case 7:
                        firstGenreLabel.setText("Open World");
                        break;
                    default:
                        break;
                }
            switch(prio3)
                {
                    case 1:
                        secondGenreLabel.setText("JRPG");
                        break;
                    case 2:
                        secondGenreLabel.setText("Action RPG");
                        break;
                    case 3:
                        secondGenreLabel.setText("MMORPG");
                        break;
                    case 4:
                        secondGenreLabel.setText("Rogue");
                        break;
                    case 5:
                        secondGenreLabel.setText("Turn Based");
                        break;
                    case 6:
                        secondGenreLabel.setText("Tactics");
                        break;
                    case 7:
                        secondGenreLabel.setText("Open World");
                        break;
                    default:
                        break;
                }

            while(recommendRs.next())
            {
                // save each field as a variable
                String recTitle = recommendRs.getString("Title");
                int recSub1 = recommendRs.getInt("Subgenre1");
                int recSub2 = recommendRs.getInt("Subgenre2");
                int recSub3 = recommendRs.getInt("Subgenre3");
                
                // display genre names instead of id
                String recS1 = String.valueOf(recSub1);
                String recS2 = String.valueOf(recSub2);
                String recS3 = String.valueOf(recSub3);
                
                switch(recSub1)
                {
                    case 1:
                        recS1 = "JRPG";
                        break;
                    case 2:
                        recS1 = "Action RPG";
                        break;
                    case 3:
                        recS1 = "MMORPG";
                        break;
                    case 4:
                        recS1 = "Rogue";
                        break;
                    case 5:
                        recS1 = "Turn Based";
                        break;
                    case 6:
                        recS1 = "Tactics";
                        break;
                    case 7:
                        recS1 = "Open World";
                        break;
                    case 8:
                        recS1 = "";
                        break;
                    default:
                        break;
                }
                switch(recSub2)
                {
                    case 1:
                        recS2 = "JRPG";
                        break;
                    case 2:
                        recS2 = "Action RPG";
                        break;
                    case 3:
                        recS2 = "MMORPG";
                        break;
                    case 4:
                        recS2 = "Rogue";
                        break;
                    case 5:
                        recS2 = "Turn Based";
                        break;
                    case 6:
                        recS2 = "Tactics";
                        break;
                    case 7:
                        recS2 = "Open World";
                        break;
                    case 8:
                        recS2 = "";
                        break;
                    default:
                        break;
                }
                switch(recSub3)
                {
                    case 1:
                        recS3 = "JRPG";
                        break;
                    case 2:
                        recS3 = "Action RPG";
                        break;
                    case 3:
                        recS3 = "MMORPG";
                        break;
                    case 4:
                        recS3 = "Rogue";
                        break;
                    case 5:
                        recS3 = "Turn Based";
                        break;
                    case 6:
                        recS3 = "Tactics";
                        break;
                    case 7:
                        recS3 = "Open World";
                        break;
                    case 8:
                        recS3 = "";
                        break;
                    default:
                        break;
                }
                // declare table
                DefaultTableModel tbModel2 = (DefaultTableModel)recommendTable.getModel();
                // create row for current resultset
                String data2[] = {recTitle, recS1, recS2, recS3};
                // add row to table
                tbModel2.addRow(data2);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_recommendationButtonActionPerformed

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
    private javax.swing.JLabel firstGenreLabel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel likedGenresLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel myLibraryPanel;
    private javax.swing.JTable myLibraryTable;
    private javax.swing.JTable recommendTable;
    private javax.swing.JButton recommendationButton;
    private javax.swing.JPanel recommendationsPanel;
    private javax.swing.JLabel secondGenreLabel;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JPanel usersPanel;
    // End of variables declaration//GEN-END:variables
}

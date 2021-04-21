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
            String query = "SELECT ga.game_id, ga.Title, ga.Thumbnail, ga.Subgenre1, "
                    + "ga.Subgenre2, ga.Subgenre3, gr.Rating, gr.User_ID FROM Games ga, "
                    + "Gameratings gr WHERE gr.User_ID = "
                    + quote + user + quote + " AND gr.game_id = ga.game_id";

            ResultSet combineRs = st.executeQuery(query);

//            int i = 0;
            while(combineRs.next())
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
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
    }
    
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
        jButton1 = new javax.swing.JButton();
        usersPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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
        tabbedPanel.setName(""); // NOI18N

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

        jButton1.setText("Logout");
        jButton1.setMaximumSize(new java.awt.Dimension(24, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        tabbedPanel.addTab("Logout", jButton1);

        usersPanel.setBackground(new java.awt.Color(51, 51, 51));

        usernameLabel.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");
        usernameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setText("Most Like Subgenre");

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel2.setText("Subgenre 1");

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel3.setText("Subgenre 2");

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel4.setText("Subgenre 3");

        jLabel5.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel5.setText("a");

        jLabel6.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel6.setText("b");

        jLabel7.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel7.setText("c");

        javax.swing.GroupLayout usersPanelLayout = new javax.swing.GroupLayout(usersPanel);
        usersPanel.setLayout(usersPanelLayout);
        usersPanelLayout.setHorizontalGroup(
            usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
            .addGroup(usersPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(usersPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(usersPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        usersPanelLayout.setVerticalGroup(
            usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersPanelLayout.createSequentialGroup()
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(0, 310, Short.MAX_VALUE))
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

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user = User.getUsername();
        try 
        {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/CapstoneDatabase","root","root");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String quote = "'";
            String recQuery = "SELECT DISTINCT ga.Game_ID, ga.Title, ga.Thumbnail, ga.Subgenre1, ga.Subgenre2, ga.Subgenre3, gr.Rating, gr.User_ID "
                    + "FROM Games ga, GameRatings gr "
                    + "WHERE gr.User_ID = " + quote + user + quote + " AND gr.Rating = 1 AND (ga.Subgenre1 = 1 OR ga.Subgenre2 = 1)"
                    + "AND (ga.Subgenre1 = 7 OR ga.Subgenre2 = 7 OR ga.Subgenre3 = 7)";
            ResultSet recommendRs = st.executeQuery(recQuery);
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
                
                switch(recSub1)
                {
                    case 1:
                        jrpgCount += 1;
                        break;
                    case 2:
                        arpgCount += 1;
                        break;
                    case 3:
                        mmoCount += 1;
                        break;
                    case 4:
                        rogueCount += 1;
                        break;
                    case 5:
                        turnBasedCount += 1;
                        break;
                    case 6:
                        tacticsCount += 1;
                        break;
                    case 7:
                        openWorldCount += 1;
                        break;
                    default:
                        break;
                }
                switch(recSub2)
                {
                    case 1:
                        jrpgCount += 1;
                        break;
                    case 2:
                        arpgCount += 1;
                        break;
                    case 3:
                        mmoCount += 1;
                        break;
                    case 4:
                        rogueCount += 1;
                        break;
                    case 5:
                        turnBasedCount += 1;
                        break;
                    case 6:
                        tacticsCount += 1;
                        break;
                    case 7:
                        openWorldCount += 1;
                        break;
                    default:
                        break;
                }
                switch(recSub3)
                {
                    case 1:
                        jrpgCount += 1;
                        break;
                    case 2:
                        arpgCount += 1;
                        break;
                    case 3:
                        mmoCount += 1;
                        break;
                    case 4:
                        rogueCount += 1;
                        break;
                    case 5:
                        turnBasedCount += 1;
                        break;
                    case 6:
                        tacticsCount += 1;
                        break;
                    case 7:
                        openWorldCount += 1;
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
//            Prio3(prio3);
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
                    if(prio1check != true && countArray[i] != -1)
                    {
                        // if i > x or i = x, make i prio1
                        if (countArray[i] > countArray[x] || countArray[i] == countArray[x])
                        {
                            prio1 = genreArray[i];
                        }
                        // if i < x, make x prio1
                        else
                        {
                            prio1 = genreArray[x];
                        }
                    }
                    // if prio2 is not already filled and if original int wasn't removed
                    else if(prio2check != true && countArray[i] != -1)
                    {
                        // if i > x or i = x, make i prio2
                        if (countArray[i] > countArray[x] || countArray[i] == countArray[x])
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
                    else if(prio3check != true && countArray[i] != -1)
                    {
                        // if i > x or i = x, make i prio3
                        if (countArray[i] > countArray[x] || countArray[i] == countArray[x])
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
                    countArray[prio1] = -1;
                    
                }
                // if prio2 has new value, make prio1check true so it doesn't compare for it again
                if (prio2 != 0)
                {
                    prio2check = true;
                     // make element in countArray that was highest -1 so it is no longer the largest int
                    countArray[prio2] = -1;
                }
                // if prio3 has new value, make prio1check true so it doesn't compare for it again
                if (prio3 != 0)
                {
                    prio3check = true;
                     // make element in countArray that was highest -1 so it is no longer the largest int
                    countArray[prio3] = -1;
                }
            }
            
//            jLabel5 = prio1;
            String prior1 = String.valueOf(prio1);
            String prior2 = String.valueOf(prio2);
            String prior3 = String.valueOf(prio3);
            
            switch(prio1)

        {

          case 1:

            prior1 = "JRPG";

            break;

          case 2:

            prior1 = "Action RPG";

            break;

          case 3:

            prior1 = "MMORPG";

            break;

          case 4:

            prior1 = "Rogue";

            break;

          case 5:

            prior1 = "Turn Based";

            break;

          case 6:

            prior1 = "Tactics";

            break;

          case 7:

            prior1 = "Open World";

            break;

          default:

            break;

        }
            jLabel5.setText(prior1);
        
            switch(prio2)

        {

          case 1:

            prior2 = "JRPG";

            break;

          case 2:

            prior2 = "Action RPG";

            break;

          case 3:

            prior2 = "MMORPG";

            break;

          case 4:

            prior2 = "Rogue";

            break;

          case 5:

            prior2 = "Turn Based";

            break;

          case 6:

            prior2 = "Tactics";

            break;

          case 7:

            prior2 = "Open World";

            break;

          default:

            break;

        }
            jLabel6.setText(prior2);
            
            switch(prio3)

        {

          case 1:

            prior3 = "JRPG";

            break;

          case 2:

            prior3 = "Action RPG";

            break;

          case 3:

            prior3 = "MMORPG";

            break;

          case 4:

            prior3 = "Rogue";

            break;

          case 5:

            prior3 = "Turn Based";

            break;

          case 6:

            prior3 = "Tactics";

            break;

          case 7:

            prior3 = "Open World";

            break;

          default:

            break;

        }
            jLabel7.setText(prior3);
            
            // sql string to pull all games that contain at least one of the top 3 genres
            String subQuery = "SELECT * FROM games WHERE subgenre1 IN (?,?,?) OR subgenre2 IN(?,?,?) OR subgenre3 IN (?,?,?)";
            PreparedStatement subPS = con.prepareStatement(subQuery);
            // set '?' in sql statement to prio1, prio2, and prio3
            subPS.setInt(1, prio1);
            subPS.setInt(2, prio2);
            subPS.setInt(3, prio3);
            subPS.setInt(4, prio1);
            subPS.setInt(5, prio2);
            subPS.setInt(6, prio3);
            subPS.setInt(7, prio1);
            subPS.setInt(8, prio2);
            subPS.setInt(9, prio3);
            // save query results as a result set
            ResultSet subRS = subPS.executeQuery();
            // loop through result set
            while(subRS.next())
            {
                // save each field as a variable
                String recTitle = subRS.getString("Title");
                String recPic = subRS.getString("Thumbnail");
                int recSub1 = subRS.getInt("Subgenre1");
                int recSub2 = subRS.getInt("Subgenre2");
                int recSub3 = subRS.getInt("Subgenre3");
                
                // display genre names instead of id
                String recS1 = String.valueOf(recSub1);
                String recS2 = String.valueOf(recSub2);
                String recS3 = String.valueOf(recSub3);
                // declare table
                DefaultTableModel tbModel2 = (DefaultTableModel)recommendTable.getModel();
                // create row for current resultset
                String data2[] = {recTitle, recPic, recS1, recS2, recS3};
                // add row to table
                tbModel2.addRow(data2);
            }
            
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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

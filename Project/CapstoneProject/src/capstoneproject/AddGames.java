/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneproject;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jevon
 */
public class AddGames extends javax.swing.JFrame {
    public ImageIcon imgIconP;

    /**
     * Creates new form AddGames
     */
    public AddGames() {
        initComponents();
        ChooseImage();
    }
    // <editor-fold defaultstate="collapsed" desc="void ResizeImage() -- Scale an image On  AddGames">
    public ImageIcon ResizeImage(String path)
    {
        ImageIcon myImage = new ImageIcon(path);
        Image img = myImage.getImage();
        Image newImg = img.getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="void GetImageIcon() -- Get an image icon On  AddGames">
    private void SetImageIcon(ImageIcon img)
    {
        imgIconP = img;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="void ChooseImage() -- Allow users to add an image On  AddGames">
    public void ChooseImage()
    {
    browseButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
            file.addChoosableFileFilter(filter);
            int result = file.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION)
            {
                File selectedFile = file.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                imgLabel.setIcon(ResizeImage(path));
                SetImageIcon(ResizeImage(path));
                
            }
            else if(result == JFileChooser.CANCEL_OPTION)
            {
                System.out.println("No File Selected");
            }
            
    }
    });
    }
   // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="void SaveImage() -- Saves an image On  AddGames">
    private void SaveImage(ImageIcon icon)
    {
       
       Image img = icon.getImage();
       
       
       RenderedImage rendImage = myCreateImage(img);
       
       try
       {
           String title = titleText.getText();
           String titlePath = title.replaceAll("\\s", "").toLowerCase();
           File outputfile = new File(""+titlePath+".jpg");
           ImageIO.write(rendImage, "jpg", outputfile);
       }
       catch(IOException e)
       {
           e.printStackTrace();
       }
    }
    // </editor-fold>
    public RenderedImage myCreateImage(Image image) {
    int width = 384;  // or, = image.getWidth(this);
    int height = 288;
    // Create a buffered image in which to draw
    BufferedImage bufferedImage = new BufferedImage(width, height,
                                          BufferedImage.TYPE_INT_RGB);
    // Draw image into bufferedImage.
    Graphics2D g2 = bufferedImage.createGraphics();
    g2.drawImage(image, 0, 0, this);
    g2.dispose();
    return bufferedImage;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cap_nav = new javax.swing.JLabel();
        thumbnailLabel = new javax.swing.JLabel();
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
        browseButton = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();

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

        thumbnailLabel.setFont(new java.awt.Font("Cooper Black", 3, 24)); // NOI18N
        thumbnailLabel.setForeground(new java.awt.Color(255, 255, 255));
        thumbnailLabel.setText("ADD THUMBNAIL IMAGE *");

        formDesc.setFont(new java.awt.Font("Cooper Black", 2, 36)); // NOI18N
        formDesc.setForeground(new java.awt.Color(255, 255, 255));
        formDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formDesc.setText("ADD A GAME TO RPG RECOMMEND");

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

        browseButton.setBackground(new java.awt.Color(44, 47, 51));
        browseButton.setFont(new java.awt.Font("Cooper Black", 0, 11)); // NOI18N
        browseButton.setForeground(new java.awt.Color(255, 255, 255));
        browseButton.setText("Browse...");

        imgLabel.setBackground(new java.awt.Color(44, 47, 51));
        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

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
                            .addComponent(formDesc)
                            .addComponent(gameDescLabel)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sub3Label, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(sub2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sub2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub3Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 329, Short.MAX_VALUE)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thumbnailLabel)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(requiredFieldLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sub1Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(720, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(thumbnailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requiredFieldLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
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
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(sub1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(507, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1437, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
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
            path = title.replaceAll("\\s", "").toLowerCase();

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

            // SAVE IMAGE TO PROJECT
            SaveImage(imgIconP);
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

            con.close();

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
    private javax.swing.JButton browseButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cap_nav;
    private javax.swing.JLabel formDesc;
    private javax.swing.JLabel gameDescLabel;
    private javax.swing.JTextArea gameDescText;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel requiredFieldLabel;
    private javax.swing.JComboBox<String> sub1Combo;
    private javax.swing.JLabel sub1Label;
    private javax.swing.JComboBox<String> sub2Combo;
    private javax.swing.JLabel sub2Label;
    private javax.swing.JComboBox<String> sub3Combo;
    private javax.swing.JLabel sub3Label;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel thumbnailLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleText;
    // End of variables declaration//GEN-END:variables
}

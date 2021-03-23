/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneproject;

import GameForms.AssassinsCreed;
import GameForms.BannerSaga;
import GameForms.Bastion;
import GameForms.ChronoTrigger;
import GameForms.Cyberpunk;
import GameForms.DarkSouls3;
import GameForms.DarkestDungeon;
import GameForms.Destiny2;
import GameForms.Disgaea5;
import GameForms.Divinity2;
import GameForms.DragonCrystal;
import GameForms.DragonQuestXI;
import GameForms.DragonsDogma;
import GameForms.DyingLight;
import GameForms.Fallout76;
import GameForms.FillForms;
import GameForms.FinalFantasyX;
import GameForms.FinalFantasyXIV;
import GameForms.FinalFantasyXV;
import GameForms.FireEmblem;
import GameForms.Hades;
import GameForms.KingdomHearts3;
import GameForms.MassEffect;
import GameForms.PokemonMD;
import GameForms.RogueLegacy;
import GameForms.SMTDevilSurvivor;
import GameForms.Setsuna;
import GameForms.Skyrim;
import GameForms.StarTrek;
import GameForms.TalesOfVesperia;
import GameForms.ValkyriaChronicles;
import GameForms.Wasteland2;
import GameForms.Witcher3;
import GameForms.WorldOfWarcraft;
import GameForms.XCOM2;
import GameForms.Xenoblade;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author jevon
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        String ACO = FillForms.getPicture(30);
        String bastion = FillForms.getPicture(4);
        String chrono = FillForms.getPicture(32);
        String cyberpunk = FillForms.getPicture(27);
        String darksouls = FillForms.getPicture(1);
        String darkest = FillForms.getPicture(11);
        String destiny = FillForms.getPicture(9);
        String disgaea5 = FillForms.getPicture(22);
        String divinity = FillForms.getPicture(16);
        String dragonCry = FillForms.getPicture(14);
        String dragonQuest = FillForms.getPicture(33);
        String dragonDogma = FillForms.getPicture(29);
        String dyinglight = FillForms.getPicture(28);
        String fallout = FillForms.getPicture(7);
        String ffX = FillForms.getPicture(19);
        String ffXIV = FillForms.getPicture(6);
        String ffXV = FillForms.getPicture(5);
        String fireEmblem = FillForms.getPicture(24);
        String hades = FillForms.getPicture(12);
        String setsuna = FillForms.getPicture(17);
        String kingdomHearts = FillForms.getPicture(35);
        String massEffect = FillForms.getPicture(3);
        String pokemon = FillForms.getPicture(13);
        String rogue = FillForms.getPicture(15);
        String shinMegami = FillForms.getPicture(25);
        String starTrek = FillForms.getPicture(10);
        String tales = FillForms.getPicture(31);
        String bannerSaga = FillForms.getPicture(21);
        String skyrim = FillForms.getPicture(26);
        String witcher = FillForms.getPicture(2);
        String valkyria = FillForms.getPicture(20);
        String wasteland = FillForms.getPicture(23);
        String WoW = FillForms.getPicture(8);
        String xcom = FillForms.getPicture(18);
        String xenoblade = FillForms.getPicture(34);
        
        ImageIcon myImage = new ImageIcon((ACO));
        
        Image img1 = myImage.getImage();
        Image newimg = img1.getScaledInstance(ACOpic.getWidth(), ACOpic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x = new ImageIcon(newimg);
        
        ACOpic.setIcon(x);
        
        ImageIcon myImage2 = new ImageIcon((bastion));
        
        Image img2 = myImage2.getImage();
        Image newimg2 = img2.getScaledInstance(bastionPic.getWidth(), bastionPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x2 = new ImageIcon(newimg2);
        
        bastionPic.setIcon(x2);
        
        ImageIcon myImage3 = new ImageIcon((chrono));
        
        Image img3 = myImage3.getImage();
        Image newimg3 = img3.getScaledInstance(chronotriggerPic.getWidth(), chronotriggerPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x3 = new ImageIcon(newimg3);
        
        chronotriggerPic.setIcon(x3);
        
        ImageIcon myImage4 = new ImageIcon((cyberpunk));
        
        Image img4 = myImage4.getImage();
        Image newimg4 = img4.getScaledInstance(cyberpunkPic.getWidth(), cyberpunkPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x4 = new ImageIcon(newimg4);
        
        cyberpunkPic.setIcon(x4);
        
        ImageIcon myImage5 = new ImageIcon((darksouls));
        
        Image img5 = myImage5.getImage();
        Image newimg5 = img5.getScaledInstance(darksoulsPic.getWidth(), darksoulsPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x5 = new ImageIcon(newimg5);
        
        darksoulsPic.setIcon(x5);
        
        ImageIcon myImage6 = new ImageIcon((darkest));
        
        Image img6 = myImage6.getImage();
        Image newimg6 = img6.getScaledInstance(darkestdungeonPic.getWidth(), darkestdungeonPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x6 = new ImageIcon(newimg6);
        
        darkestdungeonPic.setIcon(x6);
        
        ImageIcon myImage7 = new ImageIcon((destiny));
        
        Image img7 = myImage7.getImage();
        Image newimg7 = img7.getScaledInstance(destinyPic.getWidth(), destinyPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x7 = new ImageIcon(newimg7);
        
        destinyPic.setIcon(x7);
        
        ImageIcon myImage8 = new ImageIcon((disgaea5));
        
        Image img8 = myImage8.getImage();
        Image newimg8 = img8.getScaledInstance(disgaeaPic.getWidth(), disgaeaPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x8 = new ImageIcon(newimg8);
        
        disgaeaPic.setIcon(x8);
        
        ImageIcon myImage9 = new ImageIcon((divinity));
        
        Image img9 = myImage9.getImage();
        Image newimg9 = img9.getScaledInstance(divinityPic.getWidth(), divinityPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x9 = new ImageIcon(newimg9);
        
        divinityPic.setIcon(x9);
        
        ImageIcon myImage10 = new ImageIcon((dragonCry));
        
        Image img10 = myImage10.getImage();
        Image newimg10 = img10.getScaledInstance(dragoncryPic.getWidth(), dragoncryPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x10 = new ImageIcon(newimg10);
        
        dragoncryPic.setIcon(x10);
        
        ImageIcon myImage11 = new ImageIcon((dragonQuest));
        
        Image img11 = myImage11.getImage();
        Image newimg11 = img11.getScaledInstance(dragonquestPic.getWidth(), dragonquestPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x11 = new ImageIcon(newimg11);
        
        dragonquestPic.setIcon(x11);
        
        ImageIcon myImage12 = new ImageIcon((dragonDogma));
        
        Image img12 = myImage12.getImage();
        Image newimg12 = img12.getScaledInstance(dragonsdogmaPic.getWidth(), dragonsdogmaPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x12 = new ImageIcon(newimg12);
        
        dragonsdogmaPic.setIcon(x12);
        
        ImageIcon myImage13 = new ImageIcon((dyinglight));
        
        Image img13 = myImage13.getImage();
        Image newimg13 = img13.getScaledInstance(dyinglightPic.getWidth(), dyinglightPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x13 = new ImageIcon(newimg13);
        
        dyinglightPic.setIcon(x13);
        
        ImageIcon myImage14 = new ImageIcon(fallout);
        
        Image img14 = myImage14.getImage();
        Image newimg14 = img14.getScaledInstance(fallout76Pic.getWidth(), fallout76Pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x14 = new ImageIcon(newimg14);
        
        fallout76Pic.setIcon(x14);
        
        ImageIcon myImage15 = new ImageIcon((ffX));
        
        Image img15 = myImage15.getImage();
        Image newimg15 = img15.getScaledInstance(ffxPic.getWidth(), ffxPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x15 = new ImageIcon(newimg15);
        
        ffxPic.setIcon(x15);
        
        ImageIcon myImage16 = new ImageIcon((ffXIV));
        
        Image img16 = myImage16.getImage();
        Image newimg16 = img16.getScaledInstance(ffXIVPic.getWidth(), ffXIVPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x16 = new ImageIcon(newimg16);
        
        ffXIVPic.setIcon(x16);
        
        ImageIcon myImage17 = new ImageIcon((ffXV));
        
        Image img17 = myImage17.getImage();
        Image newimg17 = img17.getScaledInstance(ffXVPic.getWidth(), ffXVPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x17 = new ImageIcon(newimg17);
        
        ffXVPic.setIcon(x17);
        
        ImageIcon myImage18 = new ImageIcon((fireEmblem));
        
        Image img18 = myImage18.getImage();
        Image newimg18 = img18.getScaledInstance(fireEmblemPic.getWidth(), fireEmblemPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x18 = new ImageIcon(newimg18);
        
        fireEmblemPic.setIcon(x18);
        
        ImageIcon myImage19 = new ImageIcon((hades));
        
        Image img19 = myImage19.getImage();
        Image newimg19 = img19.getScaledInstance(hadesPic.getWidth(), hadesPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x19 = new ImageIcon(newimg19);
        
        hadesPic.setIcon(x19);
        
        ImageIcon myImage20 = new ImageIcon((setsuna));
        
        Image img20 = myImage20.getImage();
        Image newimg20 = img20.getScaledInstance(setsunaPic.getWidth(), setsunaPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x20 = new ImageIcon(newimg20);
        
        setsunaPic.setIcon(x20);
        
        ImageIcon myImage21 = new ImageIcon((kingdomHearts));
        
        Image img21 = myImage21.getImage();
        Image newimg21 = img21.getScaledInstance(kingdomheartsPic.getWidth(), kingdomheartsPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x21 = new ImageIcon(newimg21);
        
        kingdomheartsPic.setIcon(x21);
        
        ImageIcon myImage22 = new ImageIcon((massEffect));
        
        Image img22 = myImage22.getImage();
        Image newimg22 = img22.getScaledInstance(masseffectPic.getWidth(), masseffectPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x22 = new ImageIcon(newimg22);
        
        masseffectPic.setIcon(x22);
        
        ImageIcon myImage23 = new ImageIcon((pokemon));
        
        Image img23 = myImage23.getImage();
        Image newimg23 = img23.getScaledInstance(pokemonPic.getWidth(), pokemonPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x23 = new ImageIcon(newimg23);
        
        pokemonPic.setIcon(x23);
        
        ImageIcon myImage24 = new ImageIcon((rogue));
        
        Image img24 = myImage24.getImage();
        Image newimg24 = img24.getScaledInstance(roguePic.getWidth(), roguePic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x24 = new ImageIcon(newimg24);
        
        roguePic.setIcon(x24);
        
        ImageIcon myImage25 = new ImageIcon((shinMegami));
        
        Image img25 = myImage25.getImage();
        Image newimg25 = img25.getScaledInstance(shinmegamiPic.getWidth(), shinmegamiPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x25 = new ImageIcon(newimg25);
        
        shinmegamiPic.setIcon(x25);
        
        ImageIcon myImage26 = new ImageIcon((starTrek));
        
        Image img26 = myImage26.getImage();
        Image newimg26 = img26.getScaledInstance(startrekPic.getWidth(), startrekPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x26 = new ImageIcon(newimg26);
        
        startrekPic.setIcon(x26);
        
        ImageIcon myImage27 = new ImageIcon((tales));
        
        Image img27 = myImage27.getImage();
        Image newimg27 = img27.getScaledInstance(talesPic.getWidth(), talesPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x27 = new ImageIcon(newimg27);
        
        talesPic.setIcon(x27);
        
        ImageIcon myImage28 = new ImageIcon((bannerSaga));
        
        Image img28 = myImage28.getImage();
        Image newimg28 = img28.getScaledInstance(bannerPic.getWidth(), bannerPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x28 = new ImageIcon(newimg28);
        
        bannerPic.setIcon(x28);
        
        ImageIcon myImage29 = new ImageIcon((skyrim));
        
        Image img29 = myImage29.getImage();
        Image newimg29 = img29.getScaledInstance(skyrimPic.getWidth(), skyrimPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x29 = new ImageIcon(newimg29);
        
        skyrimPic.setIcon(x29);
        
        ImageIcon myImage30 = new ImageIcon((witcher));
        
        Image img30 = myImage30.getImage();
        Image newimg30 = img30.getScaledInstance(witcherPic.getWidth(), witcherPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x30 = new ImageIcon(newimg30);
        
        witcherPic.setIcon(x30);
        
        ImageIcon myImage31 = new ImageIcon((valkyria));
        
        Image img31 = myImage31.getImage();
        Image newimg31 = img31.getScaledInstance(valkyriaPic.getWidth(), valkyriaPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x31 = new ImageIcon(newimg31);
        
        valkyriaPic.setIcon(x31);
        
        ImageIcon myImage32 = new ImageIcon((wasteland));
        
        Image img32 = myImage32.getImage();
        Image newimg32 = img32.getScaledInstance(wastelandPic.getWidth(), wastelandPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x32 = new ImageIcon(newimg32);
        
        wastelandPic.setIcon(x32);
        
        ImageIcon myImage33 = new ImageIcon((WoW));
        
        Image img33 = myImage33.getImage();
        Image newimg33 = img33.getScaledInstance(WoWPic.getWidth(), WoWPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x33 = new ImageIcon(newimg33);
        
        WoWPic.setIcon(x33);
        
        ImageIcon myImage34 = new ImageIcon((xcom));
        
        Image img34 = myImage34.getImage();
        Image newimg34 = img34.getScaledInstance(xcomPic.getWidth(), xcomPic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x34 = new ImageIcon(newimg34);
        
        xcomPic.setIcon(x34);
        
        ImageIcon myImage35 = new ImageIcon((xenoblade));
        
        Image img35 = myImage35.getImage();
        Image newimg35 = img35.getScaledInstance(xenobladePic.getWidth(), xenobladePic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon x35 = new ImageIcon(newimg35);
        
        xenobladePic.setIcon(x35);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        mainLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        ACOpic = new javax.swing.JLabel();
        bastionPic = new javax.swing.JLabel();
        chronotriggerPic = new javax.swing.JLabel();
        cyberpunkPic = new javax.swing.JLabel();
        darksoulsPic = new javax.swing.JLabel();
        destinyPic = new javax.swing.JLabel();
        disgaeaPic = new javax.swing.JLabel();
        divinityPic = new javax.swing.JLabel();
        dragoncryPic = new javax.swing.JLabel();
        dragonquestPic = new javax.swing.JLabel();
        dragonsdogmaPic = new javax.swing.JLabel();
        dyinglightPic = new javax.swing.JLabel();
        ffxPic = new javax.swing.JLabel();
        fallout76Pic = new javax.swing.JLabel();
        valkyriaPic = new javax.swing.JLabel();
        ffXIVPic = new javax.swing.JLabel();
        ffXVPic = new javax.swing.JLabel();
        fireEmblemPic = new javax.swing.JLabel();
        hadesPic = new javax.swing.JLabel();
        setsunaPic = new javax.swing.JLabel();
        kingdomheartsPic = new javax.swing.JLabel();
        masseffectPic = new javax.swing.JLabel();
        pokemonPic = new javax.swing.JLabel();
        roguePic = new javax.swing.JLabel();
        shinmegamiPic = new javax.swing.JLabel();
        talesPic = new javax.swing.JLabel();
        startrekPic = new javax.swing.JLabel();
        bannerPic = new javax.swing.JLabel();
        skyrimPic = new javax.swing.JLabel();
        witcherPic = new javax.swing.JLabel();
        wastelandPic = new javax.swing.JLabel();
        WoWPic = new javax.swing.JLabel();
        xcomPic = new javax.swing.JLabel();
        xenobladePic = new javax.swing.JLabel();
        darkestdungeonPic = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        mainLabel.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainLabel.setText("Capstone");

        loginButton.setBackground(new java.awt.Color(0, 0, 0));
        loginButton.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        profileButton.setBackground(new java.awt.Color(0, 0, 0));
        profileButton.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        profileButton.setForeground(new java.awt.Color(255, 255, 255));
        profileButton.setText("Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(mainLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(profileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1431, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel3);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel1.setText("Trending Games");

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        ACOpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ACOpic.setText("ACO");
        ACOpic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ACOpic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACOpicMouseClicked(evt);
            }
        });

        bastionPic.setText("bastion");
        bastionPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bastionPicMouseClicked(evt);
            }
        });

        chronotriggerPic.setText("chronotrigger");
        chronotriggerPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chronotriggerPicMouseClicked(evt);
            }
        });

        cyberpunkPic.setText("cyberpunk");
        cyberpunkPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cyberpunkPicMouseClicked(evt);
            }
        });

        darksoulsPic.setText("darksouls");
        darksoulsPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                darksoulsPicMouseClicked(evt);
            }
        });

        destinyPic.setText("destiny");
        destinyPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                destinyPicMouseClicked(evt);
            }
        });

        disgaeaPic.setText("digaea");
        disgaeaPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disgaeaPicMouseClicked(evt);
            }
        });

        divinityPic.setText("divinity");
        divinityPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divinityPicMouseClicked(evt);
            }
        });

        dragoncryPic.setText("dragoncrystal");
        dragoncryPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dragoncryPicMouseClicked(evt);
            }
        });

        dragonquestPic.setText("dragonquest");
        dragonquestPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dragonquestPicMouseClicked(evt);
            }
        });

        dragonsdogmaPic.setText("dragonsdogma");
        dragonsdogmaPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dragonsdogmaPicMouseClicked(evt);
            }
        });

        dyinglightPic.setText("dyinglight");
        dyinglightPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dyinglightPicMouseClicked(evt);
            }
        });

        ffxPic.setText("ffx");
        ffxPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ffxPicMouseClicked(evt);
            }
        });

        fallout76Pic.setText("fallout");
        fallout76Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fallout76PicMouseClicked(evt);
            }
        });

        valkyriaPic.setText("valkyria");
        valkyriaPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valkyriaPicMouseClicked(evt);
            }
        });

        ffXIVPic.setText("ffxiv");
        ffXIVPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ffXIVPicMouseClicked(evt);
            }
        });

        ffXVPic.setText("ffxv");
        ffXVPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ffXVPicMouseClicked(evt);
            }
        });

        fireEmblemPic.setText("fireEmblem");
        fireEmblemPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fireEmblemPicMouseClicked(evt);
            }
        });

        hadesPic.setText("hades");
        hadesPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hadesPicMouseClicked(evt);
            }
        });

        setsunaPic.setText("setsuna");
        setsunaPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setsunaPicMouseClicked(evt);
            }
        });

        kingdomheartsPic.setText("kingdomhearts");
        kingdomheartsPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kingdomheartsPicMouseClicked(evt);
            }
        });

        masseffectPic.setText("masseffect");
        masseffectPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masseffectPicMouseClicked(evt);
            }
        });

        pokemonPic.setText("pokemon");
        pokemonPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemonPicMouseClicked(evt);
            }
        });

        roguePic.setText("reoguelegacy");
        roguePic.setToolTipText("");
        roguePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roguePicMouseClicked(evt);
            }
        });

        shinmegamiPic.setText("shinmegami");
        shinmegamiPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shinmegamiPicMouseClicked(evt);
            }
        });

        talesPic.setText("talesofvesperia");
        talesPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                talesPicMouseClicked(evt);
            }
        });

        startrekPic.setText("startrek");
        startrekPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startrekPicMouseClicked(evt);
            }
        });

        bannerPic.setText("bannersaga");
        bannerPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bannerPicMouseClicked(evt);
            }
        });

        skyrimPic.setText("skyrim");
        skyrimPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skyrimPicMouseClicked(evt);
            }
        });

        witcherPic.setText("witcher");
        witcherPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                witcherPicMouseClicked(evt);
            }
        });

        wastelandPic.setText("wasteland2");
        wastelandPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wastelandPicMouseClicked(evt);
            }
        });

        WoWPic.setText("WoW");
        WoWPic.setToolTipText("");
        WoWPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WoWPicMouseClicked(evt);
            }
        });

        xcomPic.setText("xcom");
        xcomPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xcomPicMouseClicked(evt);
            }
        });

        xenobladePic.setText("xenoblade");
        xenobladePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xenobladePicMouseClicked(evt);
            }
        });

        darkestdungeonPic.setText("darkestdungeon");
        darkestdungeonPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                darkestdungeonPicMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(wastelandPic, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(ACOpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ffXVPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WoWPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fireEmblemPic, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(bastionPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hadesPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chronotriggerPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(xcomPic, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(setsunaPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cyberpunkPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kingdomheartsPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(darksoulsPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(masseffectPic, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(destinyPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pokemonPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(disgaeaPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roguePic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(divinityPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shinmegamiPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dragoncryPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startrekPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dragonquestPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(talesPic, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(dragonsdogmaPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bannerPic, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(dyinglightPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(skyrimPic, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(fallout76Pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(witcherPic, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(ffxPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ffXIVPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valkyriaPic, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(xenobladePic, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(darkestdungeonPic)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACOpic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bastionPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chronotriggerPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cyberpunkPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(darksoulsPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinyPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disgaeaPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divinityPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dragoncryPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dragonquestPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dragonsdogmaPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dyinglightPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ffxPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fallout76Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ffXIVPic, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ffXVPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fireEmblemPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hadesPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setsunaPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kingdomheartsPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masseffectPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pokemonPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roguePic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shinmegamiPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(talesPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startrekPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bannerPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(skyrimPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(witcherPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valkyriaPic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xcomPic, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WoWPic, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wastelandPic, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xenobladePic, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(darkestdungeonPic, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jScrollPane2.setViewportView(jPanel4);

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel2.setText("All Games");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ACOpicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACOpicMouseClicked
        AssassinsCreed ACO = new AssassinsCreed();
        ACO.show();
        dispose();
    }//GEN-LAST:event_ACOpicMouseClicked

    private void bastionPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bastionPicMouseClicked
        Bastion bastion = new Bastion();
        bastion.show();
        dispose();
    }//GEN-LAST:event_bastionPicMouseClicked

    private void chronotriggerPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chronotriggerPicMouseClicked
        ChronoTrigger chrono = new ChronoTrigger();
        chrono.show();
        dispose();
    }//GEN-LAST:event_chronotriggerPicMouseClicked

    private void cyberpunkPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cyberpunkPicMouseClicked
        Cyberpunk cyberpunk = new Cyberpunk();
        cyberpunk.show();
        dispose();
    }//GEN-LAST:event_cyberpunkPicMouseClicked

    private void darksoulsPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darksoulsPicMouseClicked
        DarkSouls3 darksouls = new DarkSouls3();
        darksouls.show();
        dispose();
    }//GEN-LAST:event_darksoulsPicMouseClicked

    private void destinyPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinyPicMouseClicked
        Destiny2 destiny = new Destiny2();
        destiny.show();
        dispose();
    }//GEN-LAST:event_destinyPicMouseClicked

    private void disgaeaPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disgaeaPicMouseClicked
        Disgaea5 disgaea = new Disgaea5();
        disgaea.show();
        dispose();
    }//GEN-LAST:event_disgaeaPicMouseClicked

    private void divinityPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divinityPicMouseClicked
        Divinity2 divinity = new Divinity2();
        divinity.show();
        dispose();
    }//GEN-LAST:event_divinityPicMouseClicked

    private void dragoncryPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragoncryPicMouseClicked
        DragonCrystal dragoncry = new DragonCrystal();
        dragoncry.show();
        dispose();
    }//GEN-LAST:event_dragoncryPicMouseClicked

    private void dragonquestPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragonquestPicMouseClicked
        DragonQuestXI dragonQuest = new DragonQuestXI();
        dragonQuest.show();
        dispose();
    }//GEN-LAST:event_dragonquestPicMouseClicked

    private void dragonsdogmaPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragonsdogmaPicMouseClicked
        DragonsDogma dragonsDogma = new DragonsDogma();
        dragonsDogma.show();
        dispose();
    }//GEN-LAST:event_dragonsdogmaPicMouseClicked

    private void dyinglightPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dyinglightPicMouseClicked
        DyingLight dyingLight = new DyingLight();
        dyingLight.show();
        dispose();
    }//GEN-LAST:event_dyinglightPicMouseClicked

    private void fallout76PicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fallout76PicMouseClicked
        Fallout76 fallout = new Fallout76();
        fallout.show();
        dispose();
    }//GEN-LAST:event_fallout76PicMouseClicked

    private void ffxPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ffxPicMouseClicked
        FinalFantasyX ffx = new FinalFantasyX();
        ffx.show();
        dispose();
    }//GEN-LAST:event_ffxPicMouseClicked

    private void ffXIVPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ffXIVPicMouseClicked
        FinalFantasyXIV ffxiv = new FinalFantasyXIV();
        ffxiv.show();
        dispose();
    }//GEN-LAST:event_ffXIVPicMouseClicked

    private void ffXVPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ffXVPicMouseClicked
        FinalFantasyXV ffxv = new FinalFantasyXV();
        ffxv.show();
        dispose();
    }//GEN-LAST:event_ffXVPicMouseClicked

    private void fireEmblemPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fireEmblemPicMouseClicked
        FireEmblem fireEmblem = new FireEmblem();
        fireEmblem.show();
        dispose();
    }//GEN-LAST:event_fireEmblemPicMouseClicked

    private void hadesPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hadesPicMouseClicked
        Hades hades = new Hades();
        hades.show();
        dispose();
    }//GEN-LAST:event_hadesPicMouseClicked

    private void setsunaPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setsunaPicMouseClicked
        Setsuna setsuna = new Setsuna();
        setsuna.show();
        dispose();
    }//GEN-LAST:event_setsunaPicMouseClicked

    private void kingdomheartsPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kingdomheartsPicMouseClicked
        KingdomHearts3 kh3 = new KingdomHearts3();
        kh3.show();
        dispose();
    }//GEN-LAST:event_kingdomheartsPicMouseClicked

    private void masseffectPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masseffectPicMouseClicked
        MassEffect massEffect = new MassEffect();
        massEffect.show();
        dispose();
    }//GEN-LAST:event_masseffectPicMouseClicked

    private void pokemonPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemonPicMouseClicked
        PokemonMD pokemon = new PokemonMD();
        pokemon.show();
        dispose();
    }//GEN-LAST:event_pokemonPicMouseClicked

    private void roguePicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roguePicMouseClicked
        RogueLegacy rogue = new RogueLegacy();
        rogue.show();
        dispose();
    }//GEN-LAST:event_roguePicMouseClicked

    private void shinmegamiPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shinmegamiPicMouseClicked
        SMTDevilSurvivor SMT = new SMTDevilSurvivor();
        SMT.show();
        dispose();
    }//GEN-LAST:event_shinmegamiPicMouseClicked

    private void startrekPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startrekPicMouseClicked
        StarTrek starTrek = new StarTrek();
        starTrek.show();
        dispose();
    }//GEN-LAST:event_startrekPicMouseClicked

    private void talesPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talesPicMouseClicked
        TalesOfVesperia tales = new TalesOfVesperia();
        tales.show();
        dispose();
    }//GEN-LAST:event_talesPicMouseClicked

    private void bannerPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bannerPicMouseClicked
        BannerSaga banner = new BannerSaga();
        banner.show();
        dispose();
    }//GEN-LAST:event_bannerPicMouseClicked

    private void skyrimPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skyrimPicMouseClicked
        Skyrim skyrim = new Skyrim();
        skyrim.show();
        dispose();
    }//GEN-LAST:event_skyrimPicMouseClicked

    private void witcherPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_witcherPicMouseClicked
        Witcher3 witcher = new Witcher3();
        witcher.show();
        dispose();
    }//GEN-LAST:event_witcherPicMouseClicked

    private void valkyriaPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valkyriaPicMouseClicked
        ValkyriaChronicles valkyria = new ValkyriaChronicles();
        valkyria.show();
        dispose();
    }//GEN-LAST:event_valkyriaPicMouseClicked

    private void wastelandPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wastelandPicMouseClicked
        Wasteland2 wasteland = new Wasteland2();
        wasteland.show();
        dispose();
    }//GEN-LAST:event_wastelandPicMouseClicked

    private void WoWPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WoWPicMouseClicked
        WorldOfWarcraft WoW = new WorldOfWarcraft();
        WoW.show();
        dispose();
    }//GEN-LAST:event_WoWPicMouseClicked

    private void xcomPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xcomPicMouseClicked
        XCOM2 xcom = new XCOM2();
        xcom.show();
        dispose();
    }//GEN-LAST:event_xcomPicMouseClicked

    private void xenobladePicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xenobladePicMouseClicked
        Xenoblade xenoblade = new Xenoblade();
        xenoblade.show();
        dispose();
    }//GEN-LAST:event_xenobladePicMouseClicked

    private void darkestdungeonPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darkestdungeonPicMouseClicked
        DarkestDungeon darkdungeon = new DarkestDungeon();
        darkdungeon.show();
        dispose();
    }//GEN-LAST:event_darkestdungeonPicMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        Login logForm = new Login();
        logForm.show();
        dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        ProfilePage viewProfile = new ProfilePage();
        viewProfile.show();
        dispose();
    }//GEN-LAST:event_profileButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACOpic;
    private javax.swing.JLabel WoWPic;
    private javax.swing.JLabel bannerPic;
    private javax.swing.JLabel bastionPic;
    private javax.swing.JLabel chronotriggerPic;
    private javax.swing.JLabel cyberpunkPic;
    private javax.swing.JLabel darkestdungeonPic;
    private javax.swing.JLabel darksoulsPic;
    private javax.swing.JLabel destinyPic;
    private javax.swing.JLabel disgaeaPic;
    private javax.swing.JLabel divinityPic;
    private javax.swing.JLabel dragoncryPic;
    private javax.swing.JLabel dragonquestPic;
    private javax.swing.JLabel dragonsdogmaPic;
    private javax.swing.JLabel dyinglightPic;
    private javax.swing.JLabel fallout76Pic;
    private javax.swing.JLabel ffXIVPic;
    private javax.swing.JLabel ffXVPic;
    private javax.swing.JLabel ffxPic;
    private javax.swing.JLabel fireEmblemPic;
    private javax.swing.JLabel hadesPic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel kingdomheartsPic;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel masseffectPic;
    private javax.swing.JLabel pokemonPic;
    private javax.swing.JButton profileButton;
    private javax.swing.JLabel roguePic;
    private javax.swing.JLabel setsunaPic;
    private javax.swing.JLabel shinmegamiPic;
    private javax.swing.JLabel skyrimPic;
    private javax.swing.JLabel startrekPic;
    private javax.swing.JLabel talesPic;
    private javax.swing.JLabel valkyriaPic;
    private javax.swing.JLabel wastelandPic;
    private javax.swing.JLabel witcherPic;
    private javax.swing.JLabel xcomPic;
    private javax.swing.JLabel xenobladePic;
    // End of variables declaration//GEN-END:variables
}

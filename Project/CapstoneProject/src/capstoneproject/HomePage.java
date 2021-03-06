package capstoneproject;

import GameForms.FillForms;
import GameForms.GameFormsTemplate;

public class HomePage extends javax.swing.JFrame {
    
    public HomePage() {
        initComponents();
        String user = User.getUsername();
        // if user isn't logged in you shouldn't access these specific buttons
        if(user == null)
        {
            profileButton.setVisible(false);
            profileButton.setEnabled(false);
            addGamesButton.setVisible(false);
            addGamesButton.setEnabled(false);
        }
        // if the user is logged in you should never login while your logged in
        else if(user == user)
        {
            loginButton.setVisible(false);
            loginButton.setEnabled(false);
        }
        // This is the where all the pictures are generated with a method
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
        
        // This is where the method applys the picture to the labels in the home page
        ACOpic = FillForms.getImage(ACOpic, ACO);
        bastionPic = FillForms.getImage(bastionPic, bastion);        
        chronotriggerPic = FillForms.getImage(chronotriggerPic, chrono);
        cyberpunkPic = FillForms.getImage(cyberpunkPic, cyberpunk);
        darksoulsPic = FillForms.getImage(darksoulsPic, darksouls);
        darkestdungeonPic = FillForms.getImage(darkestdungeonPic, darkest);
        destinyPic = FillForms.getImage(destinyPic, destiny);
        disgaeaPic = FillForms.getImage(disgaeaPic, disgaea5);
        divinityPic = FillForms.getImage(divinityPic, divinity);
        dragoncryPic = FillForms.getImage(dragoncryPic, dragonCry);
        dragonquestPic = FillForms.getImage(dragonquestPic, dragonQuest);      
        dragonsdogmaPic = FillForms.getImage(dragonsdogmaPic, dragonDogma);
        dyinglightPic = FillForms.getImage(dyinglightPic, dyinglight);
        fallout76Pic = FillForms.getImage(fallout76Pic, fallout);
        ffxPic = FillForms.getImage(ffxPic,ffX);
        ffXIVPic = FillForms.getImage(ffXIVPic, ffXIV);
        ffXVPic = FillForms.getImage(ffXVPic,ffXV);        
        fireEmblemPic = FillForms.getImage(fireEmblemPic, fireEmblem);
        hadesPic = FillForms.getImage(hadesPic, hades);
        setsunaPic = FillForms.getImage(setsunaPic, setsuna);
        kingdomheartsPic = FillForms.getImage(kingdomheartsPic, kingdomHearts);
        masseffectPic = FillForms.getImage(masseffectPic, massEffect);
        pokemonPic = FillForms.getImage(pokemonPic, pokemon);
        roguePic = FillForms.getImage(roguePic, rogue);
        shinmegamiPic = FillForms.getImage(shinmegamiPic, shinMegami);
        startrekPic = FillForms.getImage(startrekPic, starTrek);
        talesPic = FillForms.getImage(talesPic, tales);
        bannerPic = FillForms.getImage(bannerPic, bannerSaga);
        skyrimPic = FillForms.getImage(skyrimPic, skyrim);
        witcherPic = FillForms.getImage(witcherPic, witcher);        
        valkyriaPic = FillForms.getImage(valkyriaPic, valkyria);        
        wastelandPic = FillForms.getImage(wastelandPic, wasteland);
        WoWPic = FillForms.getImage(WoWPic, WoW);
        xcomPic = FillForms.getImage(xcomPic, xcom);
        xenobladePic = FillForms.getImage(xenobladePic, xenoblade);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        mainLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        addGamesButton = new javax.swing.JButton();
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
        mainLabel.setText("RPG Recommender");

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

        addGamesButton.setBackground(new java.awt.Color(0, 0, 0));
        addGamesButton.setFont(new java.awt.Font("Cooper Black", 0, 26)); // NOI18N
        addGamesButton.setForeground(new java.awt.Color(255, 255, 255));
        addGamesButton.setText("Add Games");
        addGamesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGamesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(mainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addGamesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addGamesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profileButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        ACOpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ACOpic.setText("Assassin's Creed Odyssey");
        ACOpic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ACOpic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACOpicMouseClicked(evt);
            }
        });

        bastionPic.setText("Bastion");
        bastionPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bastionPicMouseClicked(evt);
            }
        });

        chronotriggerPic.setText("Chronotrigger");
        chronotriggerPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chronotriggerPicMouseClicked(evt);
            }
        });

        cyberpunkPic.setText("CyberPunk 2077");
        cyberpunkPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cyberpunkPicMouseClicked(evt);
            }
        });

        darksoulsPic.setText("Dark Souls 3");
        darksoulsPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                darksoulsPicMouseClicked(evt);
            }
        });

        destinyPic.setText("Destiny 2");
        destinyPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                destinyPicMouseClicked(evt);
            }
        });

        disgaeaPic.setText("Disgaea 5");
        disgaeaPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disgaeaPicMouseClicked(evt);
            }
        });

        divinityPic.setText("Divinity Original Sin 2");
        divinityPic.setToolTipText("");
        divinityPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divinityPicMouseClicked(evt);
            }
        });

        dragoncryPic.setText("Dragon Crystal");
        dragoncryPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dragoncryPicMouseClicked(evt);
            }
        });

        dragonquestPic.setText("Dragon Quest XI");
        dragonquestPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dragonquestPicMouseClicked(evt);
            }
        });

        dragonsdogmaPic.setText("Dragon's Dogma");
        dragonsdogmaPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dragonsdogmaPicMouseClicked(evt);
            }
        });

        dyinglightPic.setText("Dying Light");
        dyinglightPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dyinglightPicMouseClicked(evt);
            }
        });

        ffxPic.setText("FInal Fantasy X");
        ffxPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ffxPicMouseClicked(evt);
            }
        });

        fallout76Pic.setText("Fallout 76");
        fallout76Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fallout76PicMouseClicked(evt);
            }
        });

        valkyriaPic.setText("Valkyria Chronoicles");
        valkyriaPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valkyriaPicMouseClicked(evt);
            }
        });

        ffXIVPic.setText("FInal Fantasy XIV");
        ffXIVPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ffXIVPicMouseClicked(evt);
            }
        });

        ffXVPic.setText("Final Fantasy XV");
        ffXVPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ffXVPicMouseClicked(evt);
            }
        });

        fireEmblemPic.setText("Fire Emblem");
        fireEmblemPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fireEmblemPicMouseClicked(evt);
            }
        });

        hadesPic.setText("Hades");
        hadesPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hadesPicMouseClicked(evt);
            }
        });

        setsunaPic.setText("I am Setsuna");
        setsunaPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setsunaPicMouseClicked(evt);
            }
        });

        kingdomheartsPic.setText("Kingdom Hearts 3");
        kingdomheartsPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kingdomheartsPicMouseClicked(evt);
            }
        });

        masseffectPic.setText("Mass Effect");
        masseffectPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masseffectPicMouseClicked(evt);
            }
        });

        pokemonPic.setText("Pokemon Mystery Dungeon");
        pokemonPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pokemonPicMouseClicked(evt);
            }
        });

        roguePic.setText("Rogue Legacy");
        roguePic.setToolTipText("");
        roguePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roguePicMouseClicked(evt);
            }
        });

        shinmegamiPic.setText("Shin Megami");
        shinmegamiPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shinmegamiPicMouseClicked(evt);
            }
        });

        talesPic.setText("Tales of Vesperia");
        talesPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                talesPicMouseClicked(evt);
            }
        });

        startrekPic.setText("Star Trek");
        startrekPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startrekPicMouseClicked(evt);
            }
        });

        bannerPic.setText("Banner Saga");
        bannerPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bannerPicMouseClicked(evt);
            }
        });

        skyrimPic.setText("Skyrim");
        skyrimPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skyrimPicMouseClicked(evt);
            }
        });

        witcherPic.setText("Witcher 3");
        witcherPic.setToolTipText("");
        witcherPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                witcherPicMouseClicked(evt);
            }
        });

        wastelandPic.setText("Wasteland 2");
        wastelandPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wastelandPicMouseClicked(evt);
            }
        });

        WoWPic.setText("World of Warcraft");
        WoWPic.setToolTipText("");
        WoWPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WoWPicMouseClicked(evt);
            }
        });

        xcomPic.setText("XCOM 2");
        xcomPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xcomPicMouseClicked(evt);
            }
        });

        xenobladePic.setText("Xenoblade ");
        xenobladePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xenobladePicMouseClicked(evt);
            }
        });

        darkestdungeonPic.setText("Darkest Dungeon");
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
                    .addComponent(wastelandPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ffXVPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ACOpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WoWPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fireEmblemPic, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(bastionPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hadesPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chronotriggerPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(xcomPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xenobladePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setsunaPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cyberpunkPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kingdomheartsPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(darksoulsPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(masseffectPic, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(destinyPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pokemonPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(disgaeaPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roguePic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(divinityPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shinmegamiPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dragoncryPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startrekPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dragonquestPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(talesPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(witcherPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ffxPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ffXIVPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valkyriaPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(darkestdungeonPic))
                .addContainerGap())
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void ACOpicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACOpicMouseClicked
        CurrGame.SetGameID(30);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_ACOpicMouseClicked

    private void bastionPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bastionPicMouseClicked
        CurrGame.SetGameID(4);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_bastionPicMouseClicked

    private void chronotriggerPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chronotriggerPicMouseClicked
        CurrGame.SetGameID(32);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_chronotriggerPicMouseClicked

    private void cyberpunkPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cyberpunkPicMouseClicked
        CurrGame.SetGameID(27);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_cyberpunkPicMouseClicked

    private void darksoulsPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darksoulsPicMouseClicked
        CurrGame.SetGameID(1);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_darksoulsPicMouseClicked

    private void destinyPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinyPicMouseClicked
        CurrGame.SetGameID(9);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_destinyPicMouseClicked

    private void disgaeaPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disgaeaPicMouseClicked
        CurrGame.SetGameID(22);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_disgaeaPicMouseClicked

    private void divinityPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divinityPicMouseClicked
        CurrGame.SetGameID(16);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_divinityPicMouseClicked

    private void dragoncryPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragoncryPicMouseClicked
        CurrGame.SetGameID(14);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_dragoncryPicMouseClicked

    private void dragonquestPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragonquestPicMouseClicked
        CurrGame.SetGameID(33);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_dragonquestPicMouseClicked

    private void dragonsdogmaPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragonsdogmaPicMouseClicked
        CurrGame.SetGameID(29);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_dragonsdogmaPicMouseClicked

    private void dyinglightPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dyinglightPicMouseClicked
        CurrGame.SetGameID(28);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_dyinglightPicMouseClicked

    private void ffxPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ffxPicMouseClicked
        CurrGame.SetGameID(19);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_ffxPicMouseClicked

    private void fallout76PicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fallout76PicMouseClicked
        CurrGame.SetGameID(7);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_fallout76PicMouseClicked

    private void valkyriaPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valkyriaPicMouseClicked
        CurrGame.SetGameID(20);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_valkyriaPicMouseClicked

    private void ffXIVPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ffXIVPicMouseClicked
        CurrGame.SetGameID(6);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_ffXIVPicMouseClicked

    private void ffXVPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ffXVPicMouseClicked
        CurrGame.SetGameID(5);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_ffXVPicMouseClicked

    private void fireEmblemPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fireEmblemPicMouseClicked
        CurrGame.SetGameID(24);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_fireEmblemPicMouseClicked

    private void hadesPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hadesPicMouseClicked
        CurrGame.SetGameID(12);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_hadesPicMouseClicked

    private void setsunaPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setsunaPicMouseClicked
        CurrGame.SetGameID(17);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_setsunaPicMouseClicked

    private void kingdomheartsPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kingdomheartsPicMouseClicked
        CurrGame.SetGameID(35);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_kingdomheartsPicMouseClicked

    private void masseffectPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masseffectPicMouseClicked
        CurrGame.SetGameID(3);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_masseffectPicMouseClicked

    private void pokemonPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pokemonPicMouseClicked
        CurrGame.SetGameID(13);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_pokemonPicMouseClicked

    private void roguePicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roguePicMouseClicked
        CurrGame.SetGameID(15);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_roguePicMouseClicked

    private void shinmegamiPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shinmegamiPicMouseClicked
        CurrGame.SetGameID(25);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_shinmegamiPicMouseClicked

    private void talesPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talesPicMouseClicked
        CurrGame.SetGameID(31);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_talesPicMouseClicked

    private void startrekPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startrekPicMouseClicked
        CurrGame.SetGameID(10);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_startrekPicMouseClicked

    private void bannerPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bannerPicMouseClicked
        CurrGame.SetGameID(21);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_bannerPicMouseClicked

    private void skyrimPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skyrimPicMouseClicked
        CurrGame.SetGameID(26);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_skyrimPicMouseClicked

    private void witcherPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_witcherPicMouseClicked
        CurrGame.SetGameID(2);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_witcherPicMouseClicked

    private void wastelandPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wastelandPicMouseClicked
        CurrGame.SetGameID(23);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_wastelandPicMouseClicked

    private void WoWPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WoWPicMouseClicked
        CurrGame.SetGameID(8);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_WoWPicMouseClicked

    private void xcomPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xcomPicMouseClicked
        CurrGame.SetGameID(18);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_xcomPicMouseClicked

    private void xenobladePicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xenobladePicMouseClicked
        CurrGame.SetGameID(34);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_xenobladePicMouseClicked

    private void darkestdungeonPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_darkestdungeonPicMouseClicked
        CurrGame.SetGameID(11);
        GameFormsTemplate gf = new GameFormsTemplate();
        gf.show();
        dispose();
    }//GEN-LAST:event_darkestdungeonPicMouseClicked

    private void addGamesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGamesButtonActionPerformed
        AddGames ad = new AddGames();
        ad.show();
        dispose();
    }//GEN-LAST:event_addGamesButtonActionPerformed

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
    private javax.swing.JButton addGamesButton;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
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

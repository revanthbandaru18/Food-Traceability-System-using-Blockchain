package com.mycompany.blockchain;
import com.google.gson.GsonBuilder;
import com.mycompany.blockchain.Food_Supply_Chain.consumer;
import com.mycompany.blockchain.Food_Supply_Chain.factory;
import java.util.ArrayList;
import com.mycompany.blockchain.Food_Supply_Chain.farm;
import com.mycompany.blockchain.Food_Supply_Chain.processing_plant;
import com.mycompany.blockchain.Food_Supply_Chain.retail;
import com.mycompany.blockchain.Food_Supply_Chain.warehouse;
import com.mycompany.blockchain.Food_Supply_Chain.wholesale;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.FileWriter;  
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        farm = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rfid_code = new javax.swing.JLabel();
        plant = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        rfid_code1 = new javax.swing.JLabel();
        factory = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        rfid_code2 = new javax.swing.JLabel();
        warehouse = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        rfid_code3 = new javax.swing.JLabel();
        wholesale = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        rfid_code4 = new javax.swing.JLabel();
        retail = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        rfid_code5 = new javax.swing.JLabel();
        consumer = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        rfid_code6 = new javax.swing.JLabel();
        endpanel = new javax.swing.JPanel();
        rfid_code7 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        newentry = new javax.swing.JButton();
        viewblock = new javax.swing.JButton();
        currentday = new javax.swing.JButton();
        tamper = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Food Traceability System");
        setMaximumSize(new java.awt.Dimension(1115, 550));
        setMinimumSize(new java.awt.Dimension(1115, 550));
        setPreferredSize(new java.awt.Dimension(1115, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Klein Text Trial Book", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FOOD SUPPLY CHAIN TRACEABILITY SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(257, 257, 257))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1120, 110);

        jPanel1.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        home.add(jLabel3);
        jLabel3.setBounds(201, 49, 739, 291);


        jButton1.setFont(new java.awt.Font("Klein Text Trial Book", 0, 14)); // NOI18N
        jButton1.setText("Start Supply Chain");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        home.add(jButton1);
        jButton1.setBounds(360, 330, 411, 44);

        jPanel1.add(home, "card2");

        farm.setBackground(new java.awt.Color(255, 255, 255));
        farm.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N
        farm.add(jLabel4);
        jLabel4.setBounds(25, 60, 154, 291);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel6.setText("The nutrition facts label is a label required on most packaged food in many countries,");
        farm.add(jLabel6);
        jLabel6.setBounds(190, 120, 739, 18);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel7.setText("showing what nutrients are in the food.");
        farm.add(jLabel7);
        jLabel7.setBounds(190, 140, 327, 18);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Klein Text Trial Book", 1, 18)); // NOI18N
        jLabel8.setText("Food Labeling");
        farm.add(jLabel8);
        jLabel8.setBounds(190, 90, 327, 22);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Klein Text Trial Book", 1, 18)); // NOI18N
        jLabel9.setText("Agrochemical Residues");
        farm.add(jLabel9);
        jLabel9.setBounds(190, 180, 327, 22);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel10.setText("Most people will tell you that their greatest worries about food are residues of chemicals ");
        farm.add(jLabel10);
        jLabel10.setBounds(190, 210, 739, 18);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel11.setText("from farming that food might contain,and genetic modification.");
        farm.add(jLabel11);
        jLabel11.setBounds(190, 230, 530, 18);

        rfid_code.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        rfid_code.setText("RFID CODE : ");
        farm.add(rfid_code);
        rfid_code.setBounds(400, 30, 450, 30);

        jPanel1.add(farm, "card3");

        plant.setBackground(new java.awt.Color(255, 255, 255));
        plant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plantMousePressed(evt);
            }
        });
        plant.setLayout(null);

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel24.setText("A factory where raw materials are treated or prepared by a special method, especially ");
        plant.add(jLabel24);
        jLabel24.setBounds(190, 120, 739, 18);

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel25.setText("one where food is treated in order to preserve it.");
        plant.add(jLabel25);
        jLabel25.setBounds(190, 140, 540, 18);

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Klein Text Trial Book", 1, 18)); // NOI18N
        jLabel26.setText("Freshness");
        plant.add(jLabel26);
        jLabel26.setBounds(190, 90, 327, 22);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.png"))); // NOI18N
        plant.add(jLabel30);
        jLabel30.setBounds(25, 60, 154, 291);

        rfid_code1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        rfid_code1.setText("RFID CODE : ");
        plant.add(rfid_code1);
        rfid_code1.setBounds(400, 30, 450, 30);

        jPanel1.add(plant, "card4");

        factory.setBackground(new java.awt.Color(255, 255, 255));
        factory.setLayout(null);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.png"))); // NOI18N
        factory.add(jLabel19);
        jLabel19.setBounds(25, 60, 154, 291);

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel20.setText("The production lot is a particular production unit of an assembly which is planned ");
        factory.add(jLabel20);
        jLabel20.setBounds(190, 120, 739, 18);

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel21.setText("and manufactured with reference to a number.");
        factory.add(jLabel21);
        jLabel21.setBounds(190, 140, 500, 18);

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Klein Text Trial Book", 1, 18)); // NOI18N
        jLabel22.setText("Lot Production");
        factory.add(jLabel22);
        jLabel22.setBounds(190, 90, 327, 22);

        rfid_code2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        rfid_code2.setText("RFID CODE : ");
        factory.add(rfid_code2);
        rfid_code2.setBounds(400, 30, 450, 30);

        jPanel1.add(factory, "card5");

        warehouse.setBackground(new java.awt.Color(255, 255, 255));
        warehouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                warehouseMousePressed(evt);
            }
        });
        warehouse.setLayout(null);

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel27.setText("Inventory or stock is the goods and materials that a business holds ");
        warehouse.add(jLabel27);
        jLabel27.setBounds(190, 120, 739, 18);

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel28.setText("for the ultimate goal of resale.");
        warehouse.add(jLabel28);
        jLabel28.setBounds(190, 140, 540, 18);

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Klein Text Trial Book", 1, 18)); // NOI18N
        jLabel29.setText("Inventory");
        warehouse.add(jLabel29);
        jLabel29.setBounds(190, 92, 327, 20);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ware.png"))); // NOI18N
        warehouse.add(jLabel31);
        jLabel31.setBounds(25, 60, 154, 291);

        jLabel44.setBackground(new java.awt.Color(0, 0, 0));
        jLabel44.setFont(new java.awt.Font("Klein Text Trial Book", 1, 18)); // NOI18N
        jLabel44.setText("Best Before Date");
        warehouse.add(jLabel44);
        jLabel44.setBounds(190, 180, 327, 20);

        jLabel45.setBackground(new java.awt.Color(0, 0, 0));
        jLabel45.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel45.setText("According to the manufacturer, the last date by which a products flavor ");
        warehouse.add(jLabel45);
        jLabel45.setBounds(190, 210, 739, 18);

        jLabel46.setBackground(new java.awt.Color(0, 0, 0));
        jLabel46.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel46.setText("and/or quality is best.");
        warehouse.add(jLabel46);
        jLabel46.setBounds(190, 230, 540, 18);

        rfid_code3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        rfid_code3.setText("RFID CODE : ");
        warehouse.add(rfid_code3);
        rfid_code3.setBounds(400, 30, 450, 30);

        jPanel1.add(warehouse, "card6");

        wholesale.setBackground(new java.awt.Color(255, 255, 255));
        wholesale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wholesaleMousePressed(evt);
            }
        });
        wholesale.setLayout(null);

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel32.setText("Process of overseeing the movement of goods from supplier ");
        wholesale.add(jLabel32);
        jLabel32.setBounds(190, 120, 739, 18);

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel33.setText("or manufacturer to point of sale.");
        wholesale.add(jLabel33);
        jLabel33.setBounds(190, 140, 540, 18);

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Klein Text Trial Book", 1, 18)); // NOI18N
        jLabel34.setText("Distribution ");
        wholesale.add(jLabel34);
        jLabel34.setBounds(190, 90, 327, 22);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whole.png"))); // NOI18N
        wholesale.add(jLabel35);
        jLabel35.setBounds(25, 60, 154, 291);

        rfid_code4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        rfid_code4.setText("RFID CODE : ");
        wholesale.add(rfid_code4);
        rfid_code4.setBounds(400, 30, 450, 30);

        jPanel1.add(wholesale, "card7");

        retail.setBackground(new java.awt.Color(255, 255, 255));
        retail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                retailMousePressed(evt);
            }
        });
        retail.setLayout(null);

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel36.setText("The measurement of sales activity against the goals outlined in product's sales plan.");
        retail.add(jLabel36);
        jLabel36.setBounds(200, 120, 739, 18);

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel37.setText("And how fast the particular product has been sold in the market.");
        retail.add(jLabel37);
        jLabel37.setBounds(200, 140, 540, 18);

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Klein Text Trial Book", 1, 18)); // NOI18N
        jLabel38.setText("Sales Performance");
        retail.add(jLabel38);
        jLabel38.setBounds(200, 90, 327, 22);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retail.png"))); // NOI18N
        retail.add(jLabel39);
        jLabel39.setBounds(10, 60, 210, 291);

        jLabel47.setBackground(new java.awt.Color(0, 0, 0));
        jLabel47.setFont(new java.awt.Font("Klein Text Trial Book", 1, 18)); // NOI18N
        jLabel47.setText("Traceability Of Products");
        retail.add(jLabel47);
        jLabel47.setBounds(200, 180, 327, 22);

        jLabel48.setBackground(new java.awt.Color(0, 0, 0));
        jLabel48.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel48.setText("For any products that has skipped any previous operations in the supply chain");
        retail.add(jLabel48);
        jLabel48.setBounds(200, 210, 739, 18);

        jLabel49.setBackground(new java.awt.Color(0, 0, 0));
        jLabel49.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel49.setText("will be caught using their RFID tag");
        retail.add(jLabel49);
        jLabel49.setBounds(200, 230, 540, 18);

        rfid_code5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        rfid_code5.setText("RFID CODE : ");
        retail.add(rfid_code5);
        rfid_code5.setBounds(400, 30, 450, 30);

        jPanel1.add(retail, "card8");

        consumer.setBackground(new java.awt.Color(255, 255, 255));
        consumer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                consumerMousePressed(evt);
            }
        });
        consumer.setLayout(null);

        jLabel40.setBackground(new java.awt.Color(0, 0, 0));
        jLabel40.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel40.setText("A consumer is a person or organization who consumes the food product. If the person finds ");
        consumer.add(jLabel40);
        jLabel40.setBounds(190, 120, 810, 18);

        jLabel41.setBackground(new java.awt.Color(0, 0, 0));
        jLabel41.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel41.setText("a product to be tampered can be resolved using the summary generated.");
        consumer.add(jLabel41);
        jLabel41.setBounds(190, 140, 650, 18);

        jLabel42.setBackground(new java.awt.Color(0, 0, 0));
        jLabel42.setFont(new java.awt.Font("Klein Text Trial Book", 1, 18)); // NOI18N
        jLabel42.setText("Consumer");
        consumer.add(jLabel42);
        jLabel42.setBounds(190, 90, 327, 22);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cons.png"))); // NOI18N
        consumer.add(jLabel43);
        jLabel43.setBounds(40, 30, 70, 291);

        rfid_code6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        rfid_code6.setText("RFID CODE : ");
        consumer.add(rfid_code6);
        rfid_code6.setBounds(400, 30, 450, 30);

        jPanel1.add(consumer, "card9");
        consumer.getAccessibleContext().setAccessibleName("");

        endpanel.setBackground(new java.awt.Color(255, 255, 255));
        endpanel.setLayout(null);

        rfid_code7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        rfid_code7.setText("RFID CODE : ");
        endpanel.add(rfid_code7);
        rfid_code7.setBounds(400, 30, 450, 30);

        jLabel50.setBackground(new java.awt.Color(0, 0, 0));
        jLabel50.setFont(new java.awt.Font("Klein Text Trial Book", 1, 18)); // NOI18N
        jLabel50.setText("Note:");
        endpanel.add(jLabel50);
        jLabel50.setBounds(240, 110, 327, 20);

        jLabel51.setBackground(new java.awt.Color(0, 0, 0));
        jLabel51.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel51.setText("If the product exceeds the Best Before Date ");
        endpanel.add(jLabel51);
        jLabel51.setBounds(240, 140, 420, 18);

        jLabel52.setBackground(new java.awt.Color(0, 0, 0));
        jLabel52.setFont(new java.awt.Font("Klein Text Trial Book", 1, 14)); // NOI18N
        jLabel52.setText("or Label is damaged the data will be deleted forever!");
        endpanel.add(jLabel52);
        jLabel52.setBounds(240, 160, 540, 18);

        newentry.setText("New Entry");
        newentry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newentryActionPerformed(evt);
            }
        });
        endpanel.add(newentry);
        newentry.setBounds(690, 230, 241, 47);

        viewblock.setText("View Blockchain");
        viewblock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewblockActionPerformed(evt);
            }
        });
        endpanel.add(viewblock);
        viewblock.setBounds(170, 230, 241, 47);

        currentday.setText("View Current Day Products");
        currentday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentdayActionPerformed(evt);
            }
        });
        endpanel.add(currentday);
        currentday.setBounds(430, 230, 241, 47);

        tamper.setText("Is This Product Tampered?");
        tamper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamperActionPerformed(evt);
            }
        });
        endpanel.add(tamper);
        tamper.setBounds(690, 120, 241, 44);

        jPanel1.add(endpanel, "card10");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 110, 1120, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public static rfid code = new rfid();
    public static String rf = code.getAlphaNumericString();
    public static String tag = rf;
    public static ArrayList<blockchain> blockchain = new ArrayList<blockchain>(); 
    public static String blockchainJson;
    public static int difficulty = 5;

    
    supplychain ob = new supplychain(null,true);
  
    
     public static Boolean isChainValid() {
		blockchain currentBlock; 
		blockchain previousBlock;
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		
		//loop through blockchain to check hashes:
		for(int i=1; i < blockchain.size(); i++) {
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);
			//compare registered hash and calculated hash:
			if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
			//check if hash is solved
			if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
		}
		return true;
	}
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(farm);
        jPanel1.repaint();
        jPanel1.revalidate();
        rfid_code.setText("RFID CODE : "+rf);
       
        try {
            Date date = new Date();
            LocalDate localDate = LocalDate.now();
            String filedate=DateTimeFormatter.ofPattern("yyy-MM-dd").format(localDate);
            Files.write(Paths.get("Database/Supplychain-logs.txt"), ("Date: "+filedate+"\nRFID Code:"+rf+"\n\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new File("Database/"+rf).mkdirs();
           
        try {   
            FileWriter fw=new FileWriter("Database/"+rf+"/Summary.txt");
      
        JOptionPane.showMessageDialog(null, "Food Supply Chain Established For \nRFID TAG: "+rf);
        fw.write("Summary Of RFID TAG: "+rf);
        ob.jSupplyTextArea.append("Summary Of RFID TAG: "+rf);
                ob.jSupplyTextArea.append("\n\nStage 1: Farm");
                fw.write("\n\nStage 1: Farm");
                farm pro1 = new farm();
                ob.jSupplyTextArea.append("\nCompleted On "+pro1.date);
                fw.write("\nCompleted On "+pro1.date);
                ob.jSupplyTextArea.append("\nLocation "+pro1.location);
                fw.write("\nLocation "+pro1.location);
                
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(plant);
        jPanel1.repaint();
        jPanel1.revalidate();
        rfid_code1.setText("RFID CODE : "+rf);
                
                JOptionPane.showMessageDialog(null, "Sent to Processing Plant");
                ob.jSupplyTextArea.append("\n\nStage 2: Sent to Processing Plant");
                fw.write("\n\nStage 2: Sent to Processing Plant");
                processing_plant pro2 = new processing_plant();
                ob.jSupplyTextArea.append("\nCompleted On "+pro2.date);
                fw.write("\nCompleted On "+pro2.date);
                ob.jSupplyTextArea.append("\nLocation "+pro2.location);
                fw.write("\nLocation "+pro2.location);
                
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(factory);
        jPanel1.repaint();
        jPanel1.revalidate();
        rfid_code2.setText("RFID CODE : "+rf);
                
                
                JOptionPane.showMessageDialog(null, "Sent to Factory");
                ob.jSupplyTextArea.append("\n\nStage 3: Sent to Factory");
                fw.write("\n\nStage 3: Sent to Factory");
                factory pro3 = new factory();
                ob.jSupplyTextArea.append("\nCompleted On "+pro3.date);
                fw.write("\nCompleted On "+pro3.date);
                ob.jSupplyTextArea.append("\nLocation "+pro3.location);
                fw.write("\nLocation "+pro3.location);
                
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(warehouse);
        jPanel1.repaint();
        jPanel1.revalidate();
        rfid_code3.setText("RFID CODE : "+rf);
                
                JOptionPane.showMessageDialog(null, "Sent to Warehouse");
                ob.jSupplyTextArea.append("\n\nStage 4: Sent to Warehouse");
                fw.write("\n\nStage 4: Sent to Warehouse");
                warehouse pro4 = new warehouse();
                ob.jSupplyTextArea.append("\nCompleted On "+pro4.date);
                fw.write("\nCompleted On "+pro4.date);
                ob.jSupplyTextArea.append("\nLocation "+pro4.location);
                fw.write("\nLocation "+pro4.location);
                
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(wholesale);
        jPanel1.repaint();
        jPanel1.revalidate();
        rfid_code4.setText("RFID CODE : "+rf);
        
                JOptionPane.showMessageDialog(null, "Sent to Wholesale Market");
                ob.jSupplyTextArea.append("\n\nStage 5: Sent to Wholesale Market");
                fw.write("\n\nStage 5: Sent to Wholesale Market");
                wholesale pro5 = new wholesale();
                ob.jSupplyTextArea.append("\nCompleted On "+pro5.date);
                fw.write("\nCompleted On "+pro5.date);
                ob.jSupplyTextArea.append("\nLocation "+pro5.location);
                fw.write("\nLocation "+pro5.location);
                
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(retail);
        jPanel1.repaint();
        jPanel1.revalidate();
        rfid_code5.setText("RFID CODE : "+rf);
                
                JOptionPane.showMessageDialog(null, "Sent to Retail Market");
                ob.jSupplyTextArea.append("\n\nStage 6: Sent to Retail Market");
                fw.write("\n\nStage 6: Sent to Retail Market");
                retail pro6 = new retail();
                ob.jSupplyTextArea.append("\nCompleted On "+pro6.date);
                fw.write("\nCompleted On "+pro6.date);
                ob.jSupplyTextArea.append("\nLocation "+pro6.location);
                fw.write("\nLocation "+pro6.location);
                
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(consumer);
        jPanel1.repaint();
        jPanel1.revalidate();
        rfid_code6.setText("RFID CODE : "+rf);
                
                JOptionPane.showMessageDialog(null, "Sent to Consumer");
                ob.jSupplyTextArea.append("\n\nStage 7: Sent to Consumer");
                fw.write("\n\nStage 7: Sent to Consumer");
                consumer pro7 = new consumer();
                ob.jSupplyTextArea.append("\nCompleted On "+pro7.date);
                fw.write("\nCompleted On "+pro7.date);
                ob.jSupplyTextArea.append("\nLocation "+pro7.location);
                fw.write("\nLocation "+pro7.location);
                
                JOptionPane.showMessageDialog(null, "Product Consumed...");
                ob.jSupplyTextArea.append("\n\nStage 8: Product Consumed...");
                fw.write("\n\nStage 8: Product Consumed...");
               
                ob.jSupplyTextArea.append("\n\nEnd Of Transaction for RFID TAG - "+rf);
                fw.write("\n\nEnd Of Transaction for RFID TAG - "+rf);
                
                fw.close();
                
                blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
               
                  try {
                       //write converted json data to a file named "CountryGSON.json"
                       FileWriter writer = new FileWriter("Database/"+rf+"/Blocks.json");
                       writer.write(blockchainJson);
                       JOptionPane.showMessageDialog(null, "Transaction Completed");
                       writer.close();
                       } catch (IOException e) {
                       e.printStackTrace();
                       }
                  
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(endpanel);
        jPanel1.repaint();
        jPanel1.revalidate();
        rfid_code7.setText("RFID CODE : "+rf);
        
                ob.setVisible(true);
                
                  } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void plantMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plantMousePressed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_plantMousePressed

    private void warehouseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warehouseMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_warehouseMousePressed

    private void wholesaleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wholesaleMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_wholesaleMousePressed

    private void retailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_retailMousePressed

    private void consumerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consumerMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_consumerMousePressed

    private void newentryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newentryActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
        jPanel1.add(home);
        jPanel1.repaint();
        jPanel1.revalidate();
        rf = code.getAlphaNumericString();
        tag=rf;
        
        
    }//GEN-LAST:event_newentryActionPerformed

    private void viewblockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewblockActionPerformed
        // TODO add your handling code here:
        viewBlocks ob = new viewBlocks(null,true);
        ob.setVisible(true);
    }//GEN-LAST:event_viewblockActionPerformed

    private void currentdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentdayActionPerformed
        // TODO add your handling code here:
        File example_file = new File("Database");
        File[] contents = example_file.listFiles();
        try {
            Desktop.getDesktop().open(example_file);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_currentdayActionPerformed

    private void tamperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamperActionPerformed
        // TODO add your handling code here:
        defective ob = new defective(null,true);
        ob.setVisible(true);
    }//GEN-LAST:event_tamperActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel consumer;
    private javax.swing.JButton currentday;
    private javax.swing.JPanel endpanel;
    private javax.swing.JPanel factory;
    public javax.swing.JPanel farm;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton newentry;
    private javax.swing.JPanel plant;
    private javax.swing.JPanel retail;
    public javax.swing.JLabel rfid_code;
    private javax.swing.JLabel rfid_code1;
    private javax.swing.JLabel rfid_code2;
    private javax.swing.JLabel rfid_code3;
    private javax.swing.JLabel rfid_code4;
    private javax.swing.JLabel rfid_code5;
    private javax.swing.JLabel rfid_code6;
    public javax.swing.JLabel rfid_code7;
    private javax.swing.JButton tamper;
    private javax.swing.JButton viewblock;
    private javax.swing.JPanel warehouse;
    private javax.swing.JPanel wholesale;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author a.qamer
 */
public class gamePanel extends javax.swing.JFrame {

    /**
     * Creates new form gamePanel
     */
    GridBagLayout layout = new GridBagLayout();

    burgerPanel p1;
    hotDogPanel p2;
    sandwichPanel p3;
    losePanel p4;
    powerUpMenu p5;

    public static int score = 0;
    public static int multiplier = 1;

    public gamePanel() {
        initComponents();

        p1 = new burgerPanel();
        p2 = new hotDogPanel();
        p3 = new sandwichPanel();
        p4 = new losePanel();
        p5 = new powerUpMenu();

        ingPanel.setLayout(layout);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;

        ingPanel.add(p1, c);
        c.gridx = 0;
        c.gridy = 0;
        ingPanel.add(p2, c);
        c.gridx = 0;
        c.gridy = 0;
        ingPanel.add(p3, c);
        c.gridx = 0;
        c.gridy = 0;
        ingPanel.add(p4, c);
        c.gridx = 0;
        c.gridy = 0;
        ingPanel.add(p5, c);
        c.gridx = 0;
        c.gridy = 0;

        p1.setVisible(false);

        acceptBut.setVisible(false);

        myTimer.scheduleAtFixedRate(task, 1000, 1000);

        orderField.setBorder(null);

        orderField.append("Item: \n      " + FinalProject.custList.get(currentCustomer).mealOrder.meal.name + "\n");
        orderField.append("Ingredients:" + "\n");

        orderField.append("      " + FinalProject.custList.get(currentCustomer).mealOrder.meal.ingredient1 + "\n");
        orderField.append("      " + FinalProject.custList.get(currentCustomer).mealOrder.meal.ingredient2 + "\n");
        orderField.append("      " + FinalProject.custList.get(currentCustomer).mealOrder.meal.ingredient3 + "\n");
        orderField.append("      " + FinalProject.custList.get(currentCustomer).mealOrder.meal.ingredient4 + "\n");
        orderField.append("Side:\n      " + FinalProject.custList.get(currentCustomer).mealOrder.side + "\n");
        orderField.append("Drink:\n      " + FinalProject.custList.get(currentCustomer).mealOrder.drink);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerPanel = new javax.swing.JPanel();
        timerPanel = new javax.swing.JPanel();
        timerText = new javax.swing.JLabel();
        acceptBut = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderField = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        scoreLabel = new javax.swing.JLabel();
        assemblyPanel = new javax.swing.JPanel();
        burgerButton = new javax.swing.JLabel();
        hotdogButton = new javax.swing.JLabel();
        sandwichButton = new javax.swing.JLabel();
        ingPanel = new javax.swing.JPanel();
        confirmLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerPanel.setBackground(new java.awt.Color(255, 255, 255));
        customerPanel.setForeground(new java.awt.Color(255, 255, 255));

        timerText.setBackground(new java.awt.Color(255, 51, 51));
        timerText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout timerPanelLayout = new javax.swing.GroupLayout(timerPanel);
        timerPanel.setLayout(timerPanelLayout);
        timerPanelLayout.setHorizontalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timerText, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        timerPanelLayout.setVerticalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timerText, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        acceptBut.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        acceptBut.setText("Accept Order");
        acceptBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptButMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/countertop.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Register.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Woman8.png"))); // NOI18N

        orderField.setEditable(false);
        orderField.setBackground(new java.awt.Color(255, 255, 255));
        orderField.setColumns(20);
        orderField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        orderField.setForeground(new java.awt.Color(51, 51, 51));
        orderField.setRows(5);
        orderField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(orderField);

        scoreLabel.setBackground(new java.awt.Color(255, 255, 255));
        scoreLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(0, 0, 0));
        scoreLabel.setText("Score: 0");
        scoreLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scoreLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(cImage, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customerPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(customerPanelLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(acceptBut)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customerPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerPanelLayout.createSequentialGroup()
                                .addComponent(timerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cImage))
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customerPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(acceptBut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(customerPanelLayout.createSequentialGroup()
                                .addComponent(timerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        assemblyPanel.setBackground(new java.awt.Color(0, 0, 0));

        burgerButton.setBackground(new java.awt.Color(255, 255, 255));
        burgerButton.setForeground(new java.awt.Color(255, 255, 255));
        burgerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/BugerButton_BW.png"))); // NOI18N
        burgerButton.setText("Burger");
        burgerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                burgerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                burgerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                burgerButtonMouseExited(evt);
            }
        });

        hotdogButton.setBackground(new java.awt.Color(255, 255, 255));
        hotdogButton.setForeground(new java.awt.Color(255, 255, 255));
        hotdogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/HotdogButton_BW.png"))); // NOI18N
        hotdogButton.setText("Hotdog");
        hotdogButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotdogButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hotdogButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hotdogButtonMouseExited(evt);
            }
        });

        sandwichButton.setBackground(new java.awt.Color(255, 255, 255));
        sandwichButton.setForeground(new java.awt.Color(255, 255, 255));
        sandwichButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/SandwichButton_BW.png"))); // NOI18N
        sandwichButton.setText("Sandwich");
        sandwichButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sandwichButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sandwichButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sandwichButtonMouseExited(evt);
            }
        });

        ingPanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout ingPanelLayout = new javax.swing.GroupLayout(ingPanel);
        ingPanel.setLayout(ingPanelLayout);
        ingPanelLayout.setHorizontalGroup(
            ingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ingPanelLayout.setVerticalGroup(
            ingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );

        confirmLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        confirmLabel.setText("Confirm Order");
        confirmLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout assemblyPanelLayout = new javax.swing.GroupLayout(assemblyPanel);
        assemblyPanel.setLayout(assemblyPanelLayout);
        assemblyPanelLayout.setHorizontalGroup(
            assemblyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assemblyPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(burgerButton)
                .addGap(102, 102, 102)
                .addComponent(hotdogButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(sandwichButton)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assemblyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(assemblyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        assemblyPanelLayout.setVerticalGroup(
            assemblyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assemblyPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(assemblyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burgerButton)
                    .addComponent(hotdogButton)
                    .addComponent(sandwichButton))
                .addGap(18, 18, 18)
                .addComponent(ingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assemblyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assemblyPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmLabelMouseEntered
        confirmLabel.setForeground(Color.white);
    }//GEN-LAST:event_confirmLabelMouseEntered

    private void confirmLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmLabelMouseClicked

        System.out.println("usermealorder " + (userMealOrder.size() - 1));

        if (panelNum == 0) {
            userMain.add(new Burger("Burger", ((String) burgerPanel.bBox1.getSelectedItem()), ((String) burgerPanel.bBox2.getSelectedItem()), ((String) burgerPanel.bBox3.getSelectedItem()), ((String) burgerPanel.bBox4.getSelectedItem())));
            userMealOrder.add(new MealOrder(userMain.get(userMain.size() - 1), ((String) burgerPanel.bSide.getSelectedItem()), ((String) burgerPanel.bDrink.getSelectedItem())));

        }
        if (panelNum == 1) {
            userMain.add(new Hotdog("Hotdog", ((String) hotDogPanel.hBox1.getSelectedItem()), ((String) hotDogPanel.hBox2.getSelectedItem()), ((String) hotDogPanel.hBox3.getSelectedItem()), ((String) hotDogPanel.hBox4.getSelectedItem())));
            userMealOrder.add(new MealOrder(userMain.get(userMain.size() - 1), ((String) hotDogPanel.hSide.getSelectedItem()), ((String) hotDogPanel.hDrink.getSelectedItem())));

        }
        if (panelNum == 2) {
            userMain.add(new Sandwich("Sandwich", ((String) sandwichPanel.sBox1.getSelectedItem()), ((String) sandwichPanel.sBox2.getSelectedItem()), ((String) sandwichPanel.sBox3.getSelectedItem()), ((String) sandwichPanel.sBox4.getSelectedItem())));
            userMealOrder.add(new MealOrder(userMain.get(userMain.size() - 1), ((String) sandwichPanel.sSide.getSelectedItem()), ((String) sandwichPanel.sDrink.getSelectedItem())));
        }

        System.out.println("usermealorder " + (userMealOrder.size() - 1));
        boolean correct = true;
        if (currentCustomer != 19) {
            correct = FinalProject.custList.get(currentCustomer).correctMeal(userMealOrder.get(userMealOrder.size() - 1)); //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= Comment out for testing
        } else {
            new WinScreen().setVisible(true);

            WinScreen.finalScore.setText("Score: " + score);

            this.dispose();

        }

        System.out.println(".............................combo box order");
        System.out.println(userMealOrder.get(userMealOrder.size() - 1).meal.name);
        System.out.println(userMealOrder.get(userMealOrder.size() - 1).meal.ingredient1);
        System.out.println(userMealOrder.get(userMealOrder.size() - 1).meal.ingredient2);
        System.out.println(userMealOrder.get(userMealOrder.size() - 1).meal.ingredient3);
        System.out.println(userMealOrder.get(userMealOrder.size() - 1).meal.ingredient4);

        System.out.println(userMealOrder.get(userMealOrder.size() - 1).side);
        System.out.println(userMealOrder.get(userMealOrder.size() - 1).drink);

        System.out.println(currentCustomer);

        System.out.println("panel " + panelNum);

        if (correct && currentCustomer < 19) { //---------------------------------------------------------------------CORRECT ORDER
            System.out.println("ok");
            currentCustomer++;
            stillPlaying = false;

            acceptBut.setVisible(true);

            orderField.setText("");
            orderField.append("Item: \n      " + FinalProject.custList.get(currentCustomer).mealOrder.meal.name + "\n");
            orderField.append("Ingredients:" + "\n");
            orderField.append("      " + FinalProject.custList.get(currentCustomer).mealOrder.meal.ingredient1 + "\n");
            orderField.append("      " + FinalProject.custList.get(currentCustomer).mealOrder.meal.ingredient2 + "\n");
            orderField.append("      " + FinalProject.custList.get(currentCustomer).mealOrder.meal.ingredient3 + "\n");
            orderField.append("      " + FinalProject.custList.get(currentCustomer).mealOrder.meal.ingredient4 + "\n");
            orderField.append("Side:\n      " + FinalProject.custList.get(currentCustomer).mealOrder.side + "\n");
            orderField.append("Drink:\n      " + FinalProject.custList.get(currentCustomer).mealOrder.drink);

            if (currentCustomer == 1) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Child1.png"))); // NOI18N
            } else if (currentCustomer == 2) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Couple1.png"))); // NOI18N
            } else if (currentCustomer == 3) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Child2.png"))); // NOI18N
            } else if (currentCustomer == 4) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Man1.png"))); // NOI18N
            } else if (currentCustomer == 5) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Woman1.png"))); // NOI18N
            } else if (currentCustomer == 6) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Child3.png"))); // NOI18N
            } else if (currentCustomer == 7) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Woman2.png"))); // NOI18N
            } else if (currentCustomer == 8) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Woman7.png"))); // NOI18N
            } else if (currentCustomer == 9) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Man6.png"))); // NOI18N
            } else if (currentCustomer == 10) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Woman4.png"))); // NOI18N
            } else if (currentCustomer == 11) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Woman5.png"))); // NOI18N
            } else if (currentCustomer == 12) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Man9.png"))); // NOI18N
            } else if (currentCustomer == 13) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Woman6.png"))); // NOI18N
            } else if (currentCustomer == 14) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Man7.png"))); // NOI18N
            } else if (currentCustomer == 15) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Man2.png"))); // NOI18N
            } else if (currentCustomer == 16) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Man3.png"))); // NOI18N
            } else if (currentCustomer == 17) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Man4.png"))); // NOI18N
            } else if (currentCustomer == 18) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Man5.png"))); // NOI18N
            } else if (currentCustomer == 19) {
                cImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/Woman3.png"))); // NOI18N
            }
            confirmLabel.setVisible(false);

            score += (500 - (timePassed * 5)) * multiplier;
            scoreLabel.setText("Score: " + score);

            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(false);

            powerUpMenu.power1.setForeground(Color.red);
            powerUpMenu.power2.setForeground(Color.red);
            powerUpMenu.power3.setForeground(Color.red);
            powerUpMenu.power4.setForeground(Color.red);
            powerUpMenu.power5.setForeground(Color.red);
            powerUpMenu.power6.setForeground(Color.red);
//            
//             powerUpMenu.power1.setForeground(Color.black);
//            powerUpMenu.power2.setForeground(Color.black);
//            powerUpMenu.power3.setForeground(Color.black);
//            powerUpMenu.power4.setForeground(Color.black);
//            powerUpMenu.power5.setForeground(Color.black);
//            powerUpMenu.power6.setForeground(Color.black);
//            

            if (gamePanel.score < 2000 && gamePanel.score >= 1500) {

                powerUpMenu.power1.setForeground(Color.black);
                powerUpMenu.power4.setForeground(Color.black);

            }

            if (gamePanel.score < 2500 && gamePanel.score >= 2000) {

                powerUpMenu.power1.setForeground(Color.black);
                powerUpMenu.power4.setForeground(Color.black);
                powerUpMenu.power5.setForeground(Color.black);

            }

            if (gamePanel.score < 3000 && gamePanel.score >= 2500) {

                powerUpMenu.power1.setForeground(Color.black);
                powerUpMenu.power2.setForeground(Color.black);
                powerUpMenu.power4.setForeground(Color.black);
                powerUpMenu.power5.setForeground(Color.black);

            }

            if (gamePanel.score < 4000 && gamePanel.score >= 3000) {

                powerUpMenu.power1.setForeground(Color.black);
                powerUpMenu.power2.setForeground(Color.black);
                powerUpMenu.power3.setForeground(Color.black);
                powerUpMenu.power4.setForeground(Color.black);
                powerUpMenu.power5.setForeground(Color.black);

            }

            if (gamePanel.score >= 4000) {

                powerUpMenu.power1.setForeground(Color.black);
                powerUpMenu.power2.setForeground(Color.black);
                powerUpMenu.power3.setForeground(Color.black);
                powerUpMenu.power4.setForeground(Color.black);
                powerUpMenu.power5.setForeground(Color.black);
                powerUpMenu.power6.setForeground(Color.black);

            }

            p5.setVisible(true);

            ///////////////////////SHOP CODE//////////////////////////////////
            ///////////////////////SHOP CODE//////////////////////////////////
        } else {
            System.out.println("not ok");
        }
        System.out.println(currentCustomer);
    }//GEN-LAST:event_confirmLabelMouseClicked

    private void sandwichButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sandwichButtonMouseClicked
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
        p5.setVisible(false);
        panelNum = 2;
        System.out.println(panelNum);
    }//GEN-LAST:event_sandwichButtonMouseClicked

    private void hotdogButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotdogButtonMouseClicked
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
        p5.setVisible(false);
        panelNum = 1;
        System.out.println(panelNum);
    }//GEN-LAST:event_hotdogButtonMouseClicked

    private void burgerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_burgerButtonMouseClicked

        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p5.setVisible(false);
        panelNum = 0;
        System.out.println(panelNum);
    }//GEN-LAST:event_burgerButtonMouseClicked

    private void confirmLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmLabelMouseExited
        confirmLabel.setForeground(Color.gray);


    }//GEN-LAST:event_confirmLabelMouseExited

    private void burgerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_burgerButtonMouseEntered
        burgerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/BugerButton_C.png")));
    }//GEN-LAST:event_burgerButtonMouseEntered

    private void burgerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_burgerButtonMouseExited
        if (panelNum == 0) {
        } else {
            burgerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/BugerButton_BW.png")));
        }
        if (panelNum == 1) {
        } else {
            hotdogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/HotdogButton_BW.png")));
        }
        if (panelNum == 2) {
        } else {
            sandwichButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/SandwichButton_BW.png")));
        }

    }//GEN-LAST:event_burgerButtonMouseExited

    private void hotdogButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotdogButtonMouseEntered
        hotdogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/HotdogButton_C.png")));
    }//GEN-LAST:event_hotdogButtonMouseEntered

    private void hotdogButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotdogButtonMouseExited
        if (panelNum == 0) {
        } else {
            burgerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/BugerButton_BW.png")));
        }
        if (panelNum == 1) {
        } else {
            hotdogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/HotdogButton_BW.png")));
        }
        if (panelNum == 2) {
        } else {
            sandwichButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/SandwichButton_BW.png")));
        }
    }//GEN-LAST:event_hotdogButtonMouseExited

    private void sandwichButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sandwichButtonMouseEntered
        sandwichButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/SandwichButton_C.png")));
    }//GEN-LAST:event_sandwichButtonMouseEntered

    private void sandwichButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sandwichButtonMouseExited
        if (panelNum == 0) {
        } else {
            burgerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/BugerButton_BW.png")));
        }
        if (panelNum == 1) {
        } else {
            hotdogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/HotdogButton_BW.png")));
        }
        if (panelNum == 2) {
        } else {
            sandwichButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/SandwichButton_BW.png")));
        }
    }//GEN-LAST:event_sandwichButtonMouseExited

    private void scoreLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreLabelMouseClicked

    }//GEN-LAST:event_scoreLabelMouseClicked

    private void acceptButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptButMouseClicked

        scoreLabel.setText("Score: " + score);

        totalSecondsPassed = FinalProject.time[currentCustomer];
        stillPlaying = true;

        p5.setVisible(false);
        p1.setVisible(true);

        acceptBut.setVisible(false);
        confirmLabel.setVisible(true);


    }//GEN-LAST:event_acceptButMouseClicked

    ArrayList<MealOrder> userMealOrder = new ArrayList();
    ArrayList<Main> userMain = new ArrayList();

    public static int currentCustomer = 0;
    int totalSecondsPassed = FinalProject.time[currentCustomer];
    int timePassed = 0;
    int panelNum = 0;
    boolean stillPlaying = true;

    Timer myTimer = new Timer();

    TimerTask task = new TimerTask() {

        @Override
        public void run() {

            if (stillPlaying) {

                totalSecondsPassed--;
                timePassed++;
                timerText.setText("Time Left: " + totalSecondsPassed);

            }

            if (totalSecondsPassed == 0) {

                stillPlaying = false;

                p1.setVisible(false);
                p2.setVisible(false);
                p3.setVisible(false);
                p5.setVisible(false);
                p4.setVisible(true);

                cImage.setVisible(false);
                orderField.setVisible(false);

            }

        }

    };
    /**
     * @param args the command line arguments
     */
    //    public static void main(String args[]) {
    //        /* Set the Nimbus look and feel */
    //        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    //         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
    //         */
    //        try {
    //            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //                if ("Nimbus".equals(info.getName())) {
    //                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                    break;
    //                }
    //            }
    //        } catch (ClassNotFoundException ex) {
    //            java.util.logging.Logger.getLogger(gamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (InstantiationException ex) {
    //            java.util.logging.Logger.getLogger(gamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (IllegalAccessException ex) {
    //            java.util.logging.Logger.getLogger(gamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //            java.util.logging.Logger.getLogger(gamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        }
    //        //</editor-fold>
    //
    //        /* Create and display the form */
    //       
    //    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acceptBut;
    private javax.swing.JPanel assemblyPanel;
    private javax.swing.JLabel burgerButton;
    private javax.swing.JLabel cImage;
    private javax.swing.JLabel confirmLabel;
    public javax.swing.JPanel customerPanel;
    private javax.swing.JLabel hotdogButton;
    private javax.swing.JPanel ingPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea orderField;
    private javax.swing.JLabel sandwichButton;
    public static javax.swing.JLabel scoreLabel;
    public javax.swing.JPanel timerPanel;
    public static javax.swing.JLabel timerText;
    // End of variables declaration//GEN-END:variables
}

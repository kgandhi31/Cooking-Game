/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.awt.Color;

/**
 *
 * @author a.qamer
 */
public class powerUpMenu extends javax.swing.JPanel {

    /**
     * Creates new form losePanel
     */
    public powerUpMenu() {
        initComponents();
        
        

        
        
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        power1 = new javax.swing.JLabel();
        power4 = new javax.swing.JLabel();
        power5 = new javax.swing.JLabel();
        power3 = new javax.swing.JLabel();
        power2 = new javax.swing.JLabel();
        power6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b1 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        b4 = new javax.swing.JRadioButton();
        b5 = new javax.swing.JRadioButton();
        b6 = new javax.swing.JRadioButton();
        buyButt = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(493, 676));

        power1.setForeground(new java.awt.Color(0, 0, 0));
        power1.setText("Add 10 seconds to timer (1500)");
        power1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                power1MouseClicked(evt);
            }
        });

        power4.setForeground(new java.awt.Color(0, 0, 0));
        power4.setText("Point Multiplier x5 (1500)");

        power5.setForeground(new java.awt.Color(0, 0, 0));
        power5.setText("Point Multiplier x10 (2000)");

        power3.setForeground(new java.awt.Color(0, 0, 0));
        power3.setText("Add 30 seconds to timer (3000)");

        power2.setForeground(new java.awt.Color(0, 0, 0));
        power2.setText("Add 20 seconds to timer (2500)");

        power6.setForeground(new java.awt.Color(0, 0, 0));
        power6.setText("Point Multiplier x15 (4000)");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Powerups for next round");

        buttonGroup1.add(b1);

        buttonGroup1.add(b3);

        buttonGroup1.add(b2);

        buttonGroup1.add(b4);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(b5);

        buttonGroup1.add(b6);

        buyButt.setText("Buy");
        buyButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyButtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(power3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(power1)
                                    .addComponent(power2)
                                    .addComponent(power4)
                                    .addComponent(power6)
                                    .addComponent(power5))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b5)
                                    .addComponent(b6)
                                    .addComponent(b4)
                                    .addComponent(b3)
                                    .addComponent(b1)
                                    .addComponent(b2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(buyButt)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(power1)
                    .addComponent(b1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(power2)
                    .addComponent(b2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(power3)
                    .addComponent(b3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(power4)
                    .addComponent(b4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(power5)
                    .addComponent(b5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(power6)
                    .addComponent(b6))
                .addGap(71, 71, 71)
                .addComponent(buyButt)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void power1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_power1MouseClicked
   
     
        
        
    }//GEN-LAST:event_power1MouseClicked

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void buyButtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyButtMouseClicked
       
        if(b1.isSelected() && gamePanel.score >= 1500){
          
            
            gamePanel.score -= 1500;
            
            FinalProject.time[gamePanel.currentCustomer] += 10;
            
  update();
            
            
        }
        
         
        if(b2.isSelected() && gamePanel.score >= 2500){
          
             gamePanel.score -= 2500;
            FinalProject.time[gamePanel.currentCustomer] += 20;
            
             update();
            
        }
        
         if(b3.isSelected() && gamePanel.score >= 3000){
          
              gamePanel.score -= 3000;
            FinalProject.time[gamePanel.currentCustomer] += 30;
            
             update();
            
        }
        
         if(b4.isSelected() && gamePanel.score >= 1500){
          
              gamePanel.score -= 1500;
            gamePanel.multiplier = 5;
             update();
            
            
        }
         
         if(b5.isSelected() && gamePanel.score >= 2000){
          
              gamePanel.score -= 2000;
             gamePanel.multiplier = 10;
            
             update();
            
        }
         
         if(b6.isSelected() && gamePanel.score >= 3000){
          
              gamePanel.score -= 3000;
             gamePanel.multiplier = 15;
            
            
             update();
        }
         
         
         
        
    }//GEN-LAST:event_buyButtMouseClicked

    
    
    
  public void update(){
      
      
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
      
                gamePanel.scoreLabel.setText("Score: " + gamePanel.score);
      
  }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JRadioButton b4;
    private javax.swing.JRadioButton b5;
    private javax.swing.JRadioButton b6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buyButt;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel power1;
    public static javax.swing.JLabel power2;
    public static javax.swing.JLabel power3;
    public static javax.swing.JLabel power4;
    public static javax.swing.JLabel power5;
    public static javax.swing.JLabel power6;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Krish
 */
public class removeHotdogItemsPanel extends javax.swing.JPanel {

    /**
     * Creates new form removeHotdogItemsPanel
     */
    public removeHotdogItemsPanel() {
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

        hotdogPicLLabel = new javax.swing.JLabel();
        removeHotdogItemsLabel = new javax.swing.JLabel();
        hotdogPicRLabel = new javax.swing.JLabel();
        hotdogIng1Label = new javax.swing.JLabel();
        hIng1Box = new javax.swing.JComboBox<>();
        hotdogIng2Label = new javax.swing.JLabel();
        hIng2Box = new javax.swing.JComboBox<>();
        hotdogIng3Label = new javax.swing.JLabel();
        hIng3Box = new javax.swing.JComboBox<>();
        hotdogIng4Label = new javax.swing.JLabel();
        hIng4Box = new javax.swing.JComboBox<>();
        sideLabel = new javax.swing.JLabel();
        sideBox = new javax.swing.JComboBox<>();
        drinkLabel = new javax.swing.JLabel();
        drinkBox = new javax.swing.JComboBox<>();
        saveRemoveHotdogItemsButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 0));
        setMaximumSize(new java.awt.Dimension(800, 370));
        setMinimumSize(new java.awt.Dimension(800, 370));

        hotdogPicLLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/HotdogButton_BW.png"))); // NOI18N

        removeHotdogItemsLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        removeHotdogItemsLabel.setText("Remove Hotdog Items");

        hotdogPicRLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/HotdogButton_BW.png"))); // NOI18N

        hotdogIng1Label.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        hotdogIng1Label.setText("Ingredient 1:");

        hIng1Box.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        hotdogIng2Label.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        hotdogIng2Label.setText("Ingredient 2:");

        hIng2Box.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        hotdogIng3Label.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        hotdogIng3Label.setText("Ingredient 3:");

        hIng3Box.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        hotdogIng4Label.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        hotdogIng4Label.setText("Ingredient 4:");

        hIng4Box.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        sideLabel.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        sideLabel.setText("Side:");

        sideBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        drinkLabel.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        drinkLabel.setText("Drink:");

        drinkBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        saveRemoveHotdogItemsButton.setBackground(new java.awt.Color(204, 255, 255));
        saveRemoveHotdogItemsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveRemoveHotdogItemsButton.setText("Remove Selected Items");
        saveRemoveHotdogItemsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveRemoveHotdogItemsButtonMouseClicked(evt);
            }
        });
        saveRemoveHotdogItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveRemoveHotdogItemsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hotdogPicLLabel)
                        .addGap(35, 35, 35)
                        .addComponent(removeHotdogItemsLabel)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hotdogIng1Label)
                            .addComponent(hotdogIng2Label)
                            .addComponent(hotdogIng3Label)
                            .addComponent(hotdogIng4Label))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hIng4Box, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hIng3Box, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hIng2Box, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hIng1Box, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sideBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(drinkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sideLabel)
                            .addComponent(drinkLabel)
                            .addComponent(saveRemoveHotdogItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(hotdogPicRLabel))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(removeHotdogItemsLabel))
                    .addComponent(hotdogPicRLabel)
                    .addComponent(hotdogPicLLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hIng1Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotdogIng1Label))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hIng2Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hotdogIng2Label))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hIng3Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hotdogIng3Label)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sideBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sideLabel))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drinkBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drinkLabel))))
                .addGap(9, 9, 9)
                .addComponent(saveRemoveHotdogItemsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hIng4Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotdogIng4Label))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveRemoveHotdogItemsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveRemoveHotdogItemsButtonMouseClicked
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to remove the selected item(s)?", "Save Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        // <editor-fold>//saveIngredients
        if (!hIng1Box.getSelectedItem().toString().equals("N/A")) {
            for (int i = 0; i < FinalProject.hingredients1.size(); i++) {
                if (FinalProject.hingredients1.get(i).equals(hIng1Box.getSelectedItem().toString())) {
                    FinalProject.hingredients1.remove(i);
                    break;
                }
            }
            addHotdogItemsPanel.saveHIng1();
        }
        if (!hIng2Box.getSelectedItem().toString().equals("N/A")) {
            for (int i = 0; i < FinalProject.hingredients2.size(); i++) {
                if (FinalProject.hingredients2.get(i).equals(hIng2Box.getSelectedItem().toString())) {
                    FinalProject.hingredients2.remove(i);
                    break;
                }
            }
            addHotdogItemsPanel.saveHIng2();
        }
        if (!hIng3Box.getSelectedItem().toString().equals("N/A")) {
            for (int i = 0; i < FinalProject.hingredients3.size(); i++) {
                if (FinalProject.hingredients3.get(i).equals(hIng3Box.getSelectedItem().toString())) {
                    FinalProject.hingredients3.remove(i);
                    break;
                }
            }
            addHotdogItemsPanel.saveHIng3();
        }
        if (!hIng4Box.getSelectedItem().toString().equals("N/A")) {
            for (int i = 0; i < FinalProject.hingredients4.size(); i++) {
                if (FinalProject.hingredients4.get(i).equals(hIng4Box.getSelectedItem().toString())) {
                    FinalProject.hingredients4.remove(i);
                    break;
                }
            }
            addHotdogItemsPanel.saveHIng4();
        }
        if (!sideBox.getSelectedItem().toString().equals("N/A")) {
            for (int i = 0; i < FinalProject.sideOrder.size(); i++) {
                if (FinalProject.sideOrder.get(i).equals(sideBox.getSelectedItem().toString())) {
                    FinalProject.sideOrder.remove(i);
                    break;
                }
            }
            addHotdogItemsPanel.saveSide();
        }
        if (!drinkBox.getSelectedItem().toString().equals("N/A")) {
            for (int i = 0; i < FinalProject.drinkOrder.size(); i++) {
                if (FinalProject.drinkOrder.get(i).equals(drinkBox.getSelectedItem().toString())) {
                    FinalProject.drinkOrder.remove(i);
                    break;
                }
            }
            addHotdogItemsPanel.saveDrink();
        }
        removeItems();
        loadItems();
        // </editor-fold>//ingredient arrays
    }//GEN-LAST:event_saveRemoveHotdogItemsButtonMouseClicked

    private void saveRemoveHotdogItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRemoveHotdogItemsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveRemoveHotdogItemsButtonActionPerformed

    public static void removeItems() {
        hIng1Box.removeAllItems();
        hIng2Box.removeAllItems();
        hIng3Box.removeAllItems();
        hIng4Box.removeAllItems();
        sideBox.removeAllItems();
        drinkBox.removeAllItems();
    }

    public static void loadItems() {
        // <editor-fold>//load Items       
        hIng1Box.addItem("N/A");
        hIng2Box.addItem("N/A");
        hIng3Box.addItem("N/A");
        hIng4Box.addItem("N/A");
        sideBox.addItem("N/A");
        drinkBox.addItem("N/A");
        for (int i = 0; i < FinalProject.hingredients1.size(); i++) {
            hIng1Box.addItem(FinalProject.hingredients1.get(i));
        }
        for (int i = 0; i < FinalProject.hingredients2.size(); i++) {
            hIng2Box.addItem(FinalProject.hingredients2.get(i));
        }
        for (int i = 0; i < FinalProject.hingredients3.size(); i++) {
            hIng3Box.addItem(FinalProject.hingredients3.get(i));
        }
        for (int i = 0; i < FinalProject.hingredients4.size(); i++) {
            hIng4Box.addItem(FinalProject.hingredients4.get(i));
        }
        for (int i = 0; i < FinalProject.sideOrder.size(); i++) {
            sideBox.addItem(FinalProject.sideOrder.get(i));
        }
        for (int i = 0; i < FinalProject.drinkOrder.size(); i++) {
            drinkBox.addItem(FinalProject.drinkOrder.get(i));
        }
        // </editor-fold>//end load Items
    }

    private JFrame frame;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> drinkBox;
    private javax.swing.JLabel drinkLabel;
    private static javax.swing.JComboBox<String> hIng1Box;
    private static javax.swing.JComboBox<String> hIng2Box;
    private static javax.swing.JComboBox<String> hIng3Box;
    private static javax.swing.JComboBox<String> hIng4Box;
    private javax.swing.JLabel hotdogIng1Label;
    private javax.swing.JLabel hotdogIng2Label;
    private javax.swing.JLabel hotdogIng3Label;
    private javax.swing.JLabel hotdogIng4Label;
    private javax.swing.JLabel hotdogPicLLabel;
    private javax.swing.JLabel hotdogPicRLabel;
    private javax.swing.JLabel removeHotdogItemsLabel;
    private javax.swing.JButton saveRemoveHotdogItemsButton;
    private static javax.swing.JComboBox<String> sideBox;
    private javax.swing.JLabel sideLabel;
    // End of variables declaration//GEN-END:variables
}

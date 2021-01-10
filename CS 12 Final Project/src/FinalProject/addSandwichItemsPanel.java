package FinalProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class addSandwichItemsPanel extends javax.swing.JPanel {

    public addSandwichItemsPanel() {
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

        saveNewSandwichtemsButton = new javax.swing.JButton();
        sandwichIng4TextField = new javax.swing.JTextField();
        sandwichIng4Label = new javax.swing.JLabel();
        drinkTextField = new javax.swing.JTextField();
        drinkLabel = new javax.swing.JLabel();
        sandwichIng3TextField = new javax.swing.JTextField();
        sandwichIng3Label = new javax.swing.JLabel();
        sideTextField = new javax.swing.JTextField();
        sideLabel = new javax.swing.JLabel();
        sandwichIng2TextField = new javax.swing.JTextField();
        sandwichIng2Label = new javax.swing.JLabel();
        sandwichIng1TextField = new javax.swing.JTextField();
        sandwichIng1Label = new javax.swing.JLabel();
        sandwichPicRLabel = new javax.swing.JLabel();
        addSandwichItemsLabel = new javax.swing.JLabel();
        sandwichPicLLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 0));
        setMaximumSize(new java.awt.Dimension(800, 370));
        setMinimumSize(new java.awt.Dimension(800, 370));

        saveNewSandwichtemsButton.setBackground(new java.awt.Color(204, 255, 255));
        saveNewSandwichtemsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveNewSandwichtemsButton.setText("Save New Items");
        saveNewSandwichtemsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveNewSandwichtemsButtonMouseClicked(evt);
            }
        });
        saveNewSandwichtemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewSandwichtemsButtonActionPerformed(evt);
            }
        });

        sandwichIng4Label.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        sandwichIng4Label.setText("Ingredient 4:");

        drinkLabel.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        drinkLabel.setText("Drink:");

        sandwichIng3Label.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        sandwichIng3Label.setText("Ingredient 3:");

        sideLabel.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        sideLabel.setText("Side:");

        sandwichIng2Label.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        sandwichIng2Label.setText("Ingredient 2:");

        sandwichIng1Label.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        sandwichIng1Label.setText("Ingredient 1:");

        sandwichPicRLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/SandwichButton_C.png"))); // NOI18N

        addSandwichItemsLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addSandwichItemsLabel.setText("Add Sandwich Items");

        sandwichPicLLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinalProject/Real Sprites/SandwichButton_C.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(sandwichPicLLabel)
                        .addGap(35, 35, 35)
                        .addComponent(addSandwichItemsLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sandwichIng1Label)
                                .addGap(30, 30, 30)
                                .addComponent(sandwichIng1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sandwichIng3Label)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sandwichIng4Label)
                                .addGap(30, 30, 30)
                                .addComponent(sandwichIng4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sandwichIng2Label)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sandwichIng2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sandwichIng3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sandwichPicRLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drinkLabel)
                            .addComponent(sideLabel))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drinkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sideTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(saveNewSandwichtemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(addSandwichItemsLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(sandwichPicRLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sandwichPicLLabel)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sandwichIng1Label)
                    .addComponent(sandwichIng1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sandwichIng2Label)
                            .addComponent(sandwichIng2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sandwichIng3Label)
                            .addComponent(sandwichIng3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sideLabel)
                            .addComponent(sideTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(drinkLabel)
                            .addComponent(drinkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(saveNewSandwichtemsButton)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sandwichIng4Label)
                    .addComponent(sandwichIng4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveNewSandwichtemsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveNewSandwichtemsButtonMouseClicked
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to add the new item(s)?", "Save Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
        }
        // <editor-fold>//saveIngredients
        if (sandwichIng1TextField.getText().isEmpty() == false) {
            FinalProject.singredients1.add(sandwichIng1TextField.getText());
            saveSIng1();
            sandwichIng1TextField.setText("");
        }
        if (sandwichIng2TextField.getText().isEmpty() == false) {
            FinalProject.singredients2.add(sandwichIng2TextField.getText());
            saveSIng2();
            sandwichIng2TextField.setText("");
        }
        if (sandwichIng3TextField.getText().isEmpty() == false) {
            FinalProject.singredients3.add(sandwichIng3TextField.getText());
            saveSIng3();
            sandwichIng3TextField.setText("");
        }
        if (sandwichIng4TextField.getText().isEmpty() == false) {
            FinalProject.singredients4.add(sandwichIng4TextField.getText());
            saveSIng4();
            sandwichIng4TextField.setText("");
        }
        if (sideTextField.getText().isEmpty() == false) {
            FinalProject.sideOrder.add(sideTextField.getText());
            saveSide();
            sideTextField.setText("");
        }
        if (drinkTextField.getText().isEmpty() == false) {
            FinalProject.drinkOrder.add(drinkTextField.getText());
            saveDrink();
            drinkTextField.setText("");
        }
        // </editor-fold>//ingredient arrays
    }//GEN-LAST:event_saveNewSandwichtemsButtonMouseClicked

    private void saveNewSandwichtemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewSandwichtemsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveNewSandwichtemsButtonActionPerformed

    public static void saveSIng1() {
        try {
            FileWriter fs1 = new FileWriter("savedIngredients/singredients1.txt");
            BufferedWriter bs1 = new BufferedWriter(fs1);
            for (int i = 0; i < FinalProject.singredients1.size(); i++) {
                bs1.write(FinalProject.singredients1.get(i) + "\n");
            }
            bs1.close();
        } catch (IOException e) {
            System.out.println("The save was unsuccessful.");
        }
    }

    public static void saveSIng2() {
        try {
            FileWriter fs2 = new FileWriter("savedIngredients/singredients2.txt");
            BufferedWriter bs2 = new BufferedWriter(fs2);
            for (int i = 0; i < FinalProject.singredients2.size(); i++) {
                bs2.write(FinalProject.singredients2.get(i) + "\n");
            }
            bs2.close();
        } catch (IOException e) {
            System.out.println("The save was unsuccessful.");
        }
    }

    public static void saveSIng3() {
        try {
            FileWriter fs3 = new FileWriter("savedIngredients/singredients3.txt");
            BufferedWriter bs3 = new BufferedWriter(fs3);
            for (int i = 0; i < FinalProject.singredients3.size(); i++) {
                bs3.write(FinalProject.singredients3.get(i) + "\n");
            }
            bs3.close();
        } catch (IOException e) {
            System.out.println("The save was unsuccessful.");
        }
    }

    public static void saveSIng4() {
        try {
            FileWriter fs4 = new FileWriter("savedIngredients/singredients4.txt");
            BufferedWriter bs4 = new BufferedWriter(fs4);
            for (int i = 0; i < FinalProject.singredients4.size(); i++) {
                bs4.write(FinalProject.singredients4.get(i) + "\n");
            }
            bs4.close();
        } catch (IOException e) {
            System.out.println("The save was unsuccessful.");
        }
    }

    public static void saveSide() {
        try {
            FileWriter fside = new FileWriter("savedIngredients/sideOrder.txt");
            BufferedWriter bside = new BufferedWriter(fside);
            for (int i = 0; i < FinalProject.sideOrder.size(); i++) {
                bside.write(FinalProject.sideOrder.get(i) + "\n");
            }
            bside.close();
        } catch (IOException e) {
            System.out.println("The save was unsuccessful.");
        }
    }

    public static void saveDrink() {
        try {
            FileWriter fdrink = new FileWriter("savedIngredients/drinkOrder.txt");
            BufferedWriter bdrink = new BufferedWriter(fdrink);
            for (int i = 0; i < FinalProject.drinkOrder.size(); i++) {
                bdrink.write(FinalProject.drinkOrder.get(i) + "\n");
            }
            bdrink.close();
        } catch (IOException e) {
            System.out.println("The save was unsuccessful.");
        }
    }

    private JFrame frame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addSandwichItemsLabel;
    private javax.swing.JLabel drinkLabel;
    private javax.swing.JTextField drinkTextField;
    private javax.swing.JLabel sandwichIng1Label;
    private javax.swing.JTextField sandwichIng1TextField;
    private javax.swing.JLabel sandwichIng2Label;
    private javax.swing.JTextField sandwichIng2TextField;
    private javax.swing.JLabel sandwichIng3Label;
    private javax.swing.JTextField sandwichIng3TextField;
    private javax.swing.JLabel sandwichIng4Label;
    private javax.swing.JTextField sandwichIng4TextField;
    private javax.swing.JLabel sandwichPicLLabel;
    private javax.swing.JLabel sandwichPicRLabel;
    private javax.swing.JButton saveNewSandwichtemsButton;
    private javax.swing.JLabel sideLabel;
    private javax.swing.JTextField sideTextField;
    // End of variables declaration//GEN-END:variables
}
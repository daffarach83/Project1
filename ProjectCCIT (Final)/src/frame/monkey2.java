/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import function.Encapsulation;
import function.PolymorphismAnimal;
import function.PolymorphismAnimalMonkey;

/**
 *
 * @author Office
 */
public class monkey2 extends javax.swing.JFrame {

    /**
     * Creates new form monkey2
     */
    public monkey2() {
        initComponents();
    }

    int Counter=3;
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_monkey = new javax.swing.JButton();
        btn_turtle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_ant = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_attempt = new javax.swing.JLabel();
        lbl_mainAnimalMonkey = new javax.swing.JLabel();
        lbl_animaldescMonkey = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_point = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/monkey.jpg"))); // NOI18N

        btn_monkey.setText("Monkey");
        btn_monkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_monkeyActionPerformed(evt);
            }
        });

        btn_turtle.setText("Turtle");
        btn_turtle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_turtleActionPerformed(evt);
            }
        });

        jLabel2.setText("CHOOSE YOUR ANSWER BELOW!");

        btn_ant.setText("Ant");
        btn_ant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_antActionPerformed(evt);
            }
        });

        jLabel3.setText("Attempt left :");

        lbl_attempt.setText("3");

        lbl_animaldescMonkey.setText("This is an animal, Guess this question correctly!");

        jLabel4.setText("point : ");

        lbl_point.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_animaldescMonkey)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_ant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_monkey)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_turtle)))
                .addGap(0, 78, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_attempt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_point, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_mainAnimalMonkey, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_mainAnimalMonkey, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lbl_animaldescMonkey)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_monkey)
                    .addComponent(btn_turtle)
                    .addComponent(btn_ant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_attempt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_point))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void counter(){
        Counter=Counter-1;
        lbl_attempt.setText(Integer.toString(Counter));
        
    }
    
    private void btn_monkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_monkeyActionPerformed
        hamster3 h=new hamster3();
        Encapsulation j=new Encapsulation();
        
        PolymorphismAnimal i=new PolymorphismAnimal();
        PolymorphismAnimalMonkey a=new PolymorphismAnimalMonkey();
        
        lbl_mainAnimalMonkey.setText(i.sound("animal"));
        lbl_animaldescMonkey.setText(a.sound("monkey"));
        
        j.setPoint(1);
        lbl_point.setText(Integer.toString(j.getPoint()));
        
        j.popupTrue();
        h.show();
        dispose();
    }//GEN-LAST:event_btn_monkeyActionPerformed

    private void btn_turtleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turtleActionPerformed
        counter();
        Encapsulation j=new Encapsulation();
        
        if(Counter==0){
            monkey2 m=new monkey2();
            j.popupFalse();

            m.show();
            dispose();
        }
    }//GEN-LAST:event_btn_turtleActionPerformed

    private void btn_antActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_antActionPerformed
        counter();
        Encapsulation j=new Encapsulation();

        if(Counter==0){
            monkey2 m=new monkey2();
            j.popupFalse();

            m.show();
            dispose();
        }
    }//GEN-LAST:event_btn_antActionPerformed

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
        } catch (ClassNotFoubtn_ant ex) {
            java.util.logging.Logger.getLogger(monkey2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(monkey2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(monkey2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(monkey2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new monkey2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ant;
    private javax.swing.JButton btn_monkey;
    private javax.swing.JButton btn_turtle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_animaldescMonkey;
    private javax.swing.JLabel lbl_attempt;
    private javax.swing.JLabel lbl_mainAnimalMonkey;
    private javax.swing.JLabel lbl_point;
    // End of variables declaration//GEN-END:variables
}

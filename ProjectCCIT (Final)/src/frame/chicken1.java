/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import function.Encapsulation;
import function.PolymorphismAnimal;
import function.PolymorphismAnimalChicken;

/**
 *
 * @author Office
 */
public class chicken1 extends javax.swing.JFrame {

    
    /**
     * Creates new form chicken1
     */
    public chicken1() {
        initComponents();
    }

    int Counter = 3;
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_chicken = new javax.swing.JButton();
        btn_elephant = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_lion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_attempt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_point = new javax.swing.JLabel();
        lbl_animaldesc = new javax.swing.JLabel();
        lbl_mainAnimal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chiken.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        btn_chicken.setText("Chicken");
        btn_chicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chickenActionPerformed(evt);
            }
        });

        btn_elephant.setText("Elephant");
        btn_elephant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elephantActionPerformed(evt);
            }
        });

        jLabel2.setText("CHOOSE YOUR ANSWER BELOW!");

        btn_lion.setText("Lion");
        btn_lion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lionActionPerformed(evt);
            }
        });

        jLabel3.setText("Attempt left :");

        lbl_attempt.setText("3");

        jLabel4.setText("point : ");

        lbl_point.setText("0");

        lbl_animaldesc.setText("This is an animal, Guess this question correctly!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_attempt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_point, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lbl_mainAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_animaldesc)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_chicken)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_elephant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_lion)))
                .addGap(0, 73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbl_mainAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lbl_animaldesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_chicken)
                    .addComponent(btn_elephant)
                    .addComponent(btn_lion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_attempt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_point))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void count(){
        Counter=Counter-1;
        lbl_attempt.setText(Integer.toString(Counter));
    }
    
//    public static void main(){
//        lbl_attempt.setVisible(false);
//    }
    
    public void result(){
        lbl_attempt.setText(Integer.toString(Counter));
    }
    
    private void btn_elephantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elephantActionPerformed
//        encapCounter itung=new encapCounter();
//        counterAbstract countA=new counterAbstract();
//        
//        
//        lbl_attempt.setText(countA.counter());
    
        count();
        Encapsulation j=new Encapsulation();
        
        if(Counter==0){
            chicken1 c=new chicken1();
            j.popupFalse();
        
            c.show();
            dispose();
        }
    }//GEN-LAST:event_btn_elephantActionPerformed

    private void btn_lionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lionActionPerformed
        count();
        Encapsulation j=new Encapsulation();
     
        if(Counter==0){
            j.popupFalse();
            chicken1 c=new chicken1();
        
            c.show();
            dispose();
        }
    }//GEN-LAST:event_btn_lionActionPerformed

    
    private void btn_chickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chickenActionPerformed
        monkey2 m=new monkey2();
        Encapsulation j=new Encapsulation();
        
        
        PolymorphismAnimal i=new PolymorphismAnimal();
        PolymorphismAnimalChicken a=new PolymorphismAnimalChicken();
        
        lbl_mainAnimal.setText(i.sound("animal"));
        lbl_animaldesc.setText(a.sound("chicken"));
        
//        lbl_operator.setVisible(false);
        j.setPoint(1);
        lbl_point.setText(Integer.toString(j.getPoint()));
        
        j.popupTrue();
        m.show();
        dispose();
    }//GEN-LAST:event_btn_chickenActionPerformed

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
            java.util.logging.Logger.getLogger(chicken1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chicken1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chicken1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chicken1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chicken1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chicken;
    private javax.swing.JButton btn_elephant;
    private javax.swing.JButton btn_lion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_animaldesc;
    private javax.swing.JLabel lbl_attempt;
    private javax.swing.JLabel lbl_mainAnimal;
    private javax.swing.JLabel lbl_point;
    // End of variables declaration//GEN-END:variables
}

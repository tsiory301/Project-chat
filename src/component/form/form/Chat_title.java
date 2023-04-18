
package component.form.form;

import java.awt.Color;
import java.awt.LayoutManager;


public class Chat_title extends javax.swing.JPanel {


    public Chat_title() {
        initComponents();
    }

     public void setUserName(String userName) {
        lbname.setText(userName);
    }

    public void statusActive() {
        lbstatus.setText("Active now");
        lbstatus.setForeground(new java.awt.Color(40, 147, 59));
    }

    public void setStatusText(String text) {
        lbstatus.setText(text);
        lbstatus.setForeground(new Color(160, 160, 160));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layer = new javax.swing.JLayeredPane();
        lbname = new javax.swing.JLabel();
        lbstatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        layer.setLayout(new java.awt.GridLayout(0, 1));

        lbname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbname.setForeground(new java.awt.Color(57, 57, 57));
        lbname.setText("Name");
        layer.add(lbname);

        lbstatus.setForeground(new java.awt.Color(40, 147, 59));
        lbstatus.setText("Status");
        layer.add(lbstatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layer, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane layer;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbstatus;
    // End of variables declaration//GEN-END:variables
}


package component.form.form;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static org.omg.CORBA.ORB.init;


public class nom_people extends javax.swing.JPanel {

 
    public nom_people(String name) {
        initComponents();
        lb.setText(name);
        init();
    }
    private void init(){
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(new Color(224, 224, 224));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(new Color(242, 242, 242));
            }
            
            
            
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar2 = new swing.ImageAvatar();
        lb = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));
        setPreferredSize(new java.awt.Dimension(200, 50));
        setRequestFocusEnabled(false);

        imageAvatar2.setBorderSize(0);
        imageAvatar2.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/PROFIL.png"))); // NOI18N

        lb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageAvatar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ImageAvatar imageAvatar2;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}

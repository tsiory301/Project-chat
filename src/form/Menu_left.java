
package form;

import component.form.form.*;
import net.miginfocom.swing.*;
import swing.ScrollBar;


public class Menu_left extends javax.swing.JPanel {

  
    public Menu_left() {
        initComponents();
        init();
    }
    private void init(){
       sp.setVerticalScrollBar(new ScrollBar());
        menulist.setLayout(new MigLayout("fillx", "0[]0", "2[]2"));
        showMessage();
    }
    private void showMessage(){
    //test kely
        menulist.removeAll();
        for (int i = 0; i < 20; i++) {
            menulist.add(new nom_people("People" + i), "wrap");
        }
        refreshMenuList();
    }
    private void showGroup() {
        //  test data
        menulist.removeAll();
        for (int i = 0; i < 2; i++) {
            menulist.add(new nom_people("Group" + i), "wrap");
        }
        refreshMenuList();
    }

    private void showBox() {
        //  test data
        menulist.removeAll();
        for (int i = 0; i < 20; i++) {
            menulist.add(new nom_people("Box" + i), "wrap");
        }
        refreshMenuList();
    }
    private void refreshMenuList() {
        menulist.repaint();
        menulist.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuButton1 = new component.form.form.MenuButton();
        menu = new javax.swing.JLayeredPane();
        menuGroup = new component.form.form.MenuButton();
        menuMessage = new component.form.form.MenuButton();
        menuBox = new component.form.form.MenuButton();
        sp = new javax.swing.JScrollPane();
        menulist = new javax.swing.JLayeredPane();

        menuButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_chat_16px.png"))); // NOI18N

        setBackground(new java.awt.Color(242, 242, 242));

        menu.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        menu.setLayout(new java.awt.BorderLayout());

        menuGroup.setBackground(new java.awt.Color(229, 229, 229));
        menuGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_group_24px_1.png"))); // NOI18N
        menuGroup.setIconSelcted(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_group_24px_2.png"))); // NOI18N
        menuGroup.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_group_24px_1.png"))); // NOI18N
        menuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupActionPerformed(evt);
            }
        });
        menu.add(menuGroup, java.awt.BorderLayout.CENTER);

        menuMessage.setBackground(new java.awt.Color(229, 229, 229));
        menuMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_messaging_24px.png"))); // NOI18N
        menuMessage.setIconSelcted(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_messaging_24px_3.png"))); // NOI18N
        menuMessage.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_messaging_24px.png"))); // NOI18N
        menuMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMessageActionPerformed(evt);
            }
        });
        menu.add(menuMessage, java.awt.BorderLayout.LINE_START);

        menuBox.setBackground(new java.awt.Color(229, 229, 229));
        menuBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_message_exchange_24px.png"))); // NOI18N
        menuBox.setIconSelcted(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_message_exchange_24px_1.png"))); // NOI18N
        menuBox.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_message_exchange_24px.png"))); // NOI18N
        menuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBoxActionPerformed(evt);
            }
        });
        menu.add(menuBox, java.awt.BorderLayout.LINE_END);

        sp.setBackground(new java.awt.Color(242, 242, 242));
        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menulist.setBackground(new java.awt.Color(242, 242, 242));
        menulist.setOpaque(true);

        javax.swing.GroupLayout menulistLayout = new javax.swing.GroupLayout(menulist);
        menulist.setLayout(menulistLayout);
        menulistLayout.setHorizontalGroup(
            menulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        menulistLayout.setVerticalGroup(
            menulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        sp.setViewportView(menulist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMessageActionPerformed
        if (!menuMessage.isSelected()) {
            menuMessage.setSelected(true);
            menuBox.setSelected(false);
            menuGroup.setSelected(false);
            showMessage();
        } 
            
        
    }//GEN-LAST:event_menuMessageActionPerformed

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupActionPerformed
        if (!menuGroup.isSelected()) {
            menuMessage.setSelected(false);
            menuBox.setSelected(false);
            menuGroup.setSelected(true);
            showGroup();
        } 
        
    }//GEN-LAST:event_menuGroupActionPerformed

    private void menuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBoxActionPerformed
        if (!menuBox.isSelected()) {
            menuMessage.setSelected(false);
            menuBox.setSelected(true);
            menuGroup.setSelected(false);
            showBox();
        }  
        
    }//GEN-LAST:event_menuBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane menu;
    private component.form.form.MenuButton menuBox;
    private component.form.form.MenuButton menuButton1;
    private component.form.form.MenuButton menuGroup;
    private component.form.form.MenuButton menuMessage;
    private javax.swing.JLayeredPane menulist;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}

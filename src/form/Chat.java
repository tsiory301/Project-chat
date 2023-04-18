
package form;

import component.form.form.Chat_body;
import component.form.form.Chat_button;
import component.form.form.Chat_title;
import event.EventChat;
import event.PublicEvent;
import net.miginfocom.swing.MigLayout;


public class Chat extends javax.swing.JPanel {


    public Chat() {
        initComponents();
        init();
    }

 private void init() {
        setLayout(new MigLayout("fillx", "0[fill]0", "0[]0[100%, bottom]0[shrink 0]0"));
        Chat_title chatTitle = new Chat_title();
        Chat_body chatBody = new Chat_body();
        Chat_button chatBottom = new Chat_button();
       PublicEvent.getInstance().addEventChat(new EventChat() {

            @Override
            public void sendMessage(String text) {
                chatBody.addItemright(text);
               }
        });
        add(chatTitle, "wrap");
        add(chatBody, "wrap");
        add(chatBottom, "h ::30%");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

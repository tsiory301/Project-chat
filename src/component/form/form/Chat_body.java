
package component.form.form;

import java.awt.Adjustable;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;


public class Chat_body extends javax.swing.JPanel {


    public Chat_body() {
        initComponents();
        init();
      addItemright("hello bhbchc bcebcze c cbcecz ebcbzecbueer beizbrcbd");
//        addItemleft("salut", "tsiory");
//        addItemright("hello bhbchc bcebcze c cbcecz ebcbzecbueer beizbrcbd");
//        addItemleft("salut", "tsiory");
//        addItemright("hello bhbchc bcebcze c cbcecz ebcbzecbueer beizbrcbd");
//        addItemleft("salut", "tsiory");
//        addItemleft("salut", "tsiory");
//         addDate("05/06/2021");
//         String img[]={"LRMj,K-:?G9G_JIon}WqD~ITRPs,", "LCGlO@00.R~o.9DOO[%L02?aJ7D*"};
//        addItemleft("bonjour,pio,beloha", "Tsiory", img);
//        addItemright("hello bhbchc bcebcze c cbcecz ebcbzecbueer beizbrcbd");
//        addItemleft("salut", "tsiory");
//        addItemleft("salut", "tsiory");
//        addItemright("hello bhbchc bcebcze c cbcecz ebcbzecbueer beizbrcbd", new ImageIcon(getClass().getResource("/icon/PROFIL.png")));
   //    addItemleft("salut", "tsiory", new ImageIcon(getClass().getResource("/icon/PRO.jpg")));
//        addItemright("hello bhbchc bcebcze c cbcecz ebcbzecbueer beizbrcbd");
//        addItemright("hello bhbchc bcebcze c cbcecz ebcbzecbueer beizbrcbd");
//        addItemleft("", "Ro", new ImageIcon(getClass().getResource("/icon/group.png")));
//         addItemFile("", "Dara", "my doc.pdf", "1 MB");
//         addItemFileRight("", "myfile.rar", "15 MB");
    }

    private void init(){
        body.setLayout(new MigLayout("fillx", "", "5[]5"));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground( Color.WHITE);
    }
    public void addItemleft(String text, String user, Icon... image){
        Chat_left8_Withe_Profil item =  new Chat_left8_Withe_Profil();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        body.add(item, "wrap, w 100:: 70%");
        body.repaint();
        body.validate();
    }
    public void addItemleft(String text, String user, String[] image){
        Chat_left8_Withe_Profil item =  new Chat_left8_Withe_Profil();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        body.add(item, "wrap, w 100:: 70%");
        body.repaint();
        body.validate();
    }
    public void addItemFile(String text, String user, String fileName, String fileSize) {
        Chat_left8_Withe_Profil item = new Chat_left8_Withe_Profil();
        item.setText(text);
        item.setFile(fileName, fileSize);
        item.setTime();
        item.setUserProfile(user);
        body.add(item, "wrap, w 100::80%");
        //  ::80% set max with 80%
        body.repaint();
        body.revalidate();
    }
    
    public void addItemright(String text, Icon... image){
        Chat_right item =  new Chat_right();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        body.add(item, "wrap, al right, w 100:: 70%");
        body.repaint();
        body.validate();
        scrollToBottom();
    }
    public void addItemFileRight(String text, String fileName, String fileSize) {
        Chat_right item = new Chat_right();
        item.setText(text);
        item.setFile(fileName, fileSize);
        body.add(item, "wrap, al right, w 100::80%");
        //  ::80% set max with 80%
        body.repaint();
        body.revalidate();
    }
    public void addDate(String date) {
        Chat_Date item = new Chat_Date();
        item.setDate(date);
        body.add(item, "wrap, al center");
        body.repaint();
        body.revalidate();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setAutoscrolls(true);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void scrollToBottom() {
        JScrollBar verticalBar = sp.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}

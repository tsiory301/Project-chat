package component.form.form;

import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import swing.blurhash.BlurHash;

public class Image_item extends javax.swing.JLayeredPane {

        public Image_item() {
        initComponents();
    }
        public void setImage(String image) {
        int width = 200;
        int height = 200;
        int[] data = BlurHash.decode(image, width, height, 1);
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        img.setRGB(0, 0, width, height, data, 0, width);
        Icon icon = new ImageIcon(img);
        pic.setImage(icon);
    }


       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new swing.PictureBox();
        progress1 = new swing.Progress();

        pic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progress1.setForeground(new java.awt.Color(255, 255, 255));
        progress1.setValue(50);
        progress1.setProgressType(swing.Progress.ProgressType.CANCEL);
        pic.add(progress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 50, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        setLayer(pic, javax.swing.JLayeredPane.DEFAULT_LAYER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.PictureBox pic;
    private swing.Progress progress1;
    // End of variables declaration//GEN-END:variables
}

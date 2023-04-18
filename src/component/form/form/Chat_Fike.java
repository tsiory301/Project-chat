
package component.form.form;


public class Chat_Fike extends javax.swing.JPanel {

 
    public Chat_Fike() {
        initComponents();
        setOpaque(false);
    }
    public void setFile(String fileName, String size) {
        lbfilename.setText(fileName);
        lbfilesize.setText(size);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress1 = new swing.Progress();
        jPanel1 = new javax.swing.JPanel();
        lbfilename = new javax.swing.JLabel();
        lbfilesize = new javax.swing.JLabel();

        progress1.setProgressType(swing.Progress.ProgressType.FILE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        lbfilename.setText("My file name.file");
        jPanel1.add(lbfilename);

        lbfilesize.setForeground(new java.awt.Color(7, 103, 217));
        lbfilesize.setText("5 MB");
        jPanel1.add(lbfilesize);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbfilename;
    private javax.swing.JLabel lbfilesize;
    private swing.Progress progress1;
    // End of variables declaration//GEN-END:variables
}

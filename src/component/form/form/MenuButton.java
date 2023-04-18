
package component.form.form;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;


public class MenuButton extends JButton{

    public Icon getIconSimple() {
        return iconSimple;
    }

    public void setIconSimple(Icon iconSimple) {
        this.iconSimple = iconSimple;
    }

    public Icon getIconSelcted() {
        return iconSelcted;
    }

    public void setIconSelcted(Icon iconSelcted) {
        this.iconSelcted = iconSelcted;
    }
    
    private Icon iconSimple;
    private Icon iconSelcted;
    public MenuButton(){
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
      @Override
    public void setSelected(boolean bln) {
        super.setSelected(bln);
        if (bln) {
            setIcon(iconSelcted);
        } else {
            setIcon(iconSimple);
        }
    }
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        if (isSelected()) {
            grphcs.setColor(new Color(110, 213, 255));
            grphcs.fillRect(0, getHeight() - 3, getWidth(), getHeight());
        }
    }
    
}

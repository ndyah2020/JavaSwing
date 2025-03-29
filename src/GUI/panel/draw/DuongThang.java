package GUI.panel.draw;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DuongThang extends javax.swing.JPanel {
    private int mouseX, mouseY;
    private boolean dragging = false;
    
    public DuongThang() {
        initComponents();
        setBounds(50, 50, 100, 100);
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                mouseX = evt.getX();
                mouseY = evt.getY();
                dragging = true;
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                dragging = false;
            }
        });
        
        addMouseMotionListener(new MouseAdapter() {
           @Override
           public void mouseDragged(MouseEvent evt) {
               if(dragging){
                   setLocation(getX() + evt.getX() - mouseX, getY() + evt.getY() - mouseY);
               }
           }
        });
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

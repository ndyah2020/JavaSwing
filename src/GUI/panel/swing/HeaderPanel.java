package GUI.panel.swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class HeaderPanel extends javax.swing.JPanel {
    public HeaderPanel() {
        initComponents();
        setOpaque(false);
        hinhTron2.setBorderColor(Color.WHITE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hinhTron1 = new GUI.panel.draw.HinhTron();
        panelMoving = new javax.swing.JPanel();
        tenLogo = new javax.swing.JLabel();
        exitApp = new javax.swing.JLabel();
        hinhTron2 = new GUI.panel.draw.HinhTron();

        javax.swing.GroupLayout hinhTron1Layout = new javax.swing.GroupLayout(hinhTron1);
        hinhTron1.setLayout(hinhTron1Layout);
        hinhTron1Layout.setHorizontalGroup(
            hinhTron1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        hinhTron1Layout.setVerticalGroup(
            hinhTron1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(1270, 52));

        panelMoving.setOpaque(false);

        tenLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tenLogo.setForeground(new java.awt.Color(255, 255, 255));
        tenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/logoQLCB.png"))); // NOI18N
        tenLogo.setText("Quản Lý Chuyến Bay");

        exitApp.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        exitApp.setForeground(new java.awt.Color(255, 255, 255));
        exitApp.setText("X");
        exitApp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitAppMouseClicked(evt);
            }
        });

        hinhTron2.setBackground(new java.awt.Color(255, 255, 255));
        hinhTron2.setForeground(new java.awt.Color(255, 255, 255));
        hinhTron2.setPreferredSize(new java.awt.Dimension(42, 42));

        javax.swing.GroupLayout hinhTron2Layout = new javax.swing.GroupLayout(hinhTron2);
        hinhTron2.setLayout(hinhTron2Layout);
        hinhTron2Layout.setHorizontalGroup(
            hinhTron2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        hinhTron2Layout.setVerticalGroup(
            hinhTron2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addComponent(tenLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 966, Short.MAX_VALUE)
                .addComponent(hinhTron2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitApp)
                .addContainerGap())
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addGroup(panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitApp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hinhTron2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exitAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitAppMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitAppMouseClicked
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#1CB5E0"), getWidth(), 0, Color.decode("#000046"));
        g2.setPaint(g);
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.fillRect(getWidth(), 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitApp;
    private GUI.panel.draw.HinhTron hinhTron1;
    private GUI.panel.draw.HinhTron hinhTron2;
    private javax.swing.JPanel panelMoving;
    private javax.swing.JLabel tenLogo;
    // End of variables declaration//GEN-END:variables
}

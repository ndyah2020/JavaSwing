package GUI.panel.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import GUI.panel.swing.MyComboboxUI;
import java.net.URL;
public class MyCombobox<E> extends JComboBox<E> {
    private JLabel arrow;

    public MyCombobox() {
        setBackground(Color.white);
        setUI(new MyComboboxUI());
        this.setRenderer(new MyRenderer());
        removeArrow(this);
        this.setLayout(null);

        arrow = new JLabel();
        URL imageUrl = getClass().getResource("/assets/icon/down.png");
        if (imageUrl != null) {
            ImageIcon icon = new ImageIcon(imageUrl);
            Image scaledImg = icon.getImage().getScaledInstance(13, 13, Image.SCALE_SMOOTH);
            arrow.setIcon(new ImageIcon(scaledImg));
        } else {
            System.out.println("Không tìm thấy ảnh: /assets/icon/down.png");
        }

        arrow.setBounds(getWidth() - getHeight(), (getHeight() - 13) / 2, 13, 13);
        this.add(arrow);
    }

    @Override
    public void doLayout() {
        super.doLayout();
        showArrow();
    }

    public void showArrow() {
        arrow.setBounds(getWidth() - getHeight(), (getHeight() - 13) / 2, 13, 13);
    }

    private static class MyRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JComponent comp = (JComponent) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            list.setBackground(Color.white);
            list.setForeground(new Color(0, 0, 0, 200));
            list.setSelectionForeground(Color.WHITE);
            list.setSelectionBackground(Color.decode("#3498db"));
            list.setOpaque(false);
            comp.setPreferredSize(new Dimension(200, 24));
            return comp;
        }
    }

    private static void removeArrow(Container container) {
        Component[] c = container.getComponents();
        for (Component res : c) {
            if (res instanceof AbstractButton) {
                container.remove(res);
            }
        }
    }
}


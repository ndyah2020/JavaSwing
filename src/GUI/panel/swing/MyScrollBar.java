package GUI.panel.swing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyScrollBar extends JScrollBar{
	 public MyScrollBar() {
	        setUI(new MyDesignScrollBar());
	        setPreferredSize(new Dimension(5, 0));
	        setBackground(new Color(242, 242, 242));
	        setUnitIncrement(16);           
	    }
}
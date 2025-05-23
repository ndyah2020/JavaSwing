package GUI.panel.swing.dateChooser;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;



public final class Dates extends javax.swing.JPanel {

    private Event event;
    private final int MONTH;
    private final int YEAR;
    private final int DAY;
    private int m;
    private int y;
    private int selectDay = 0;
    private int startDate;
    private int max_of_month;

    public Dates() {
        initComponents();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String toDay = df.format(date);
        DAY = Integer.valueOf(toDay.split("-")[0]);
        MONTH = Integer.valueOf(toDay.split("-")[1]);
        YEAR = Integer.valueOf(toDay.split("-")[2]);
    }

    public void showDate(int month, int year, SelectedDate select) {
        m = month;
        y = year;
        // selectDay = 0;
        Calendar cd = Calendar.getInstance();
        cd.set(year, month - 1, 1);
        int start = cd.get(Calendar.DAY_OF_WEEK);
        max_of_month = cd.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (start == 1) {
            start += 7;
        }
        clear();
        start += 5;
        startDate = start;
        for (int i = 1; i <= max_of_month; i++) {
            Button cmd = (Button) getComponent(start);
            cmd.setColorSelected(getForeground());
            cmd.setText(i + "");
            if (i == DAY && month == MONTH && year == YEAR) {
                cmd.setBackground(new Color(224, 214, 229));
            } else {
                cmd.setBackground(Color.WHITE);
            }
            if (i == select.getDay() && month == select.getMonth() && year == select.getYear()) {
                cmd.setBackground(getForeground());
                cmd.setForeground(new Color(255, 255, 255));
            }
            start++;
        }
    }

    private void clear() {
        for (int i = 7; i < getComponentCount(); i++) {
            ((JButton) getComponent(i)).setText("");
        }
    }

    public void clearSelected() {
        for (int i = 7; i < getComponentCount(); i++) {
            JButton cmd = (JButton) getComponent(i);
            if (MONTH == m && y == YEAR && !cmd.getText().equals("") && Integer.valueOf(cmd.getText()) == DAY) {
                cmd.setBackground(new Color(224, 214, 229));
                cmd.setForeground(new java.awt.Color(75, 75, 75));
            } else {
                cmd.setBackground(Color.WHITE);
                cmd.setForeground(new java.awt.Color(75, 75, 75));
            }
        }
        selectDay = 0;
    }

    private void addEvent() {
        for (int i = 7; i < getComponentCount(); i++) {
            ((Button) getComponent(i)).setEvent(event);
        }
    }

    public void setSelected(int index) {
        selectDay = index;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdMo = new GUI.panel.swing.dateChooser.Button();
        cmdTu = new GUI.panel.swing.dateChooser.Button();
        cmdWe = new GUI.panel.swing.dateChooser.Button();
        cmdTh = new GUI.panel.swing.dateChooser.Button();
        cmdFr = new GUI.panel.swing.dateChooser.Button();
        cmdSa = new GUI.panel.swing.dateChooser.Button();
        cmdSu = new GUI.panel.swing.dateChooser.Button();
        cmd1 = new GUI.panel.swing.dateChooser.Button();
        cmd2 = new GUI.panel.swing.dateChooser.Button();
        cmd3 = new GUI.panel.swing.dateChooser.Button();
        cmd4 = new GUI.panel.swing.dateChooser.Button();
        cmd5 = new GUI.panel.swing.dateChooser.Button();
        cmd6 = new GUI.panel.swing.dateChooser.Button();
        cmd7 = new GUI.panel.swing.dateChooser.Button();
        cmd8 = new GUI.panel.swing.dateChooser.Button();
        cmd9 = new GUI.panel.swing.dateChooser.Button();
        cmd10 = new GUI.panel.swing.dateChooser.Button();
        cmd11 = new GUI.panel.swing.dateChooser.Button();
        cmd12 = new GUI.panel.swing.dateChooser.Button();
        cmd13 = new GUI.panel.swing.dateChooser.Button();
        cmd14 = new GUI.panel.swing.dateChooser.Button();
        cmd15 = new GUI.panel.swing.dateChooser.Button();
        cmd16 = new GUI.panel.swing.dateChooser.Button();
        cmd17 = new GUI.panel.swing.dateChooser.Button();
        cmd18 = new GUI.panel.swing.dateChooser.Button();
        cmd19 = new GUI.panel.swing.dateChooser.Button();
        cmd20 = new GUI.panel.swing.dateChooser.Button();
        cmd21 = new GUI.panel.swing.dateChooser.Button();
        cmd22 = new GUI.panel.swing.dateChooser.Button();
        cmd23 = new GUI.panel.swing.dateChooser.Button();
        cmd24 = new GUI.panel.swing.dateChooser.Button();
        cmd25 = new GUI.panel.swing.dateChooser.Button();
        cmd26 = new GUI.panel.swing.dateChooser.Button();
        cmd27 = new GUI.panel.swing.dateChooser.Button();
        cmd28 = new GUI.panel.swing.dateChooser.Button();
        cmd29 = new GUI.panel.swing.dateChooser.Button();
        cmd30 = new GUI.panel.swing.dateChooser.Button();
        cmd31 = new GUI.panel.swing.dateChooser.Button();
        cmd32 = new GUI.panel.swing.dateChooser.Button();
        cmd33 = new GUI.panel.swing.dateChooser.Button();
        cmd34 = new GUI.panel.swing.dateChooser.Button();
        cmd35 = new GUI.panel.swing.dateChooser.Button();
        cmd36 = new GUI.panel.swing.dateChooser.Button();
        cmd37 = new GUI.panel.swing.dateChooser.Button();
        cmd38 = new GUI.panel.swing.dateChooser.Button();
        cmd39 = new GUI.panel.swing.dateChooser.Button();
        cmd40 = new GUI.panel.swing.dateChooser.Button();
        cmd41 = new GUI.panel.swing.dateChooser.Button();
        cmd42 = new GUI.panel.swing.dateChooser.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(7, 7));
        // font
        Font fontText = new Font("Arial",0,12);
        
        cmdMo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdMo.setForeground(new java.awt.Color(118, 118, 118));
        cmdMo.setText("Mo");
        cmdMo.setFont(fontText);
        add(cmdMo);

        cmdTu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdTu.setForeground(new java.awt.Color(118, 118, 118));
        cmdTu.setText("Tu");
        cmdTu.setFont(fontText);
        add(cmdTu);

        cmdWe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdWe.setForeground(new java.awt.Color(118, 118, 118));
        cmdWe.setText("We");
        cmdWe.setFont(fontText);
        add(cmdWe);

        cmdTh.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdTh.setForeground(new java.awt.Color(118, 118, 118));
        cmdTh.setText("Th");
        cmdTh.setFont(fontText);
        add(cmdTh);

        cmdFr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdFr.setForeground(new java.awt.Color(118, 118, 118));
        cmdFr.setText("Fr");
        cmdFr.setFont(fontText);
        add(cmdFr);

        cmdSa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdSa.setForeground(new java.awt.Color(118, 118, 118));
        cmdSa.setText("Sa");
        cmdSa.setFont(fontText);
        add(cmdSa);

        cmdSu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdSu.setForeground(new java.awt.Color(255, 1, 1));
        cmdSu.setText("Su");
        cmdSu.setFont(fontText);
        add(cmdSu);
        
        
        // my code
        ArrayList<JButton> myListDay = new ArrayList<>();
        myListDay.add(cmd1);
        myListDay.add(cmd2);
        myListDay.add(cmd3);
        myListDay.add(cmd4);
        myListDay.add(cmd5);
        myListDay.add(cmd6);
        myListDay.add(cmd7);
        myListDay.add(cmd8);
        myListDay.add(cmd9);
        myListDay.add(cmd10);
        myListDay.add(cmd11);
        myListDay.add(cmd12);
        myListDay.add(cmd13);
        myListDay.add(cmd14);
        myListDay.add(cmd15);
        myListDay.add(cmd16);
        myListDay.add(cmd17);
        myListDay.add(cmd18);
        myListDay.add(cmd19);
        myListDay.add(cmd20);
        myListDay.add(cmd21);
        myListDay.add(cmd22);
        myListDay.add(cmd23);
        myListDay.add(cmd24);
        myListDay.add(cmd25);
        myListDay.add(cmd26);
        myListDay.add(cmd27);
        myListDay.add(cmd28);
        myListDay.add(cmd29);
        myListDay.add(cmd30);
        myListDay.add(cmd31);
        myListDay.add(cmd32);
        myListDay.add(cmd33);
        myListDay.add(cmd34);
        myListDay.add(cmd35);
        myListDay.add(cmd36);
        myListDay.add(cmd37);
        myListDay.add(cmd38);
        myListDay.add(cmd39);
        myListDay.add(cmd40);
        myListDay.add(cmd41);
        myListDay.add(cmd41);
        for(int i=0;i<42;i++) {
        	myListDay.get(i).setBackground(new java.awt.Color(255, 255, 255));
        	myListDay.get(i).setForeground(new java.awt.Color(75, 75, 75));
        	myListDay.get(i).setName("day"); // NOI18N
        	myListDay.get(i).setFont(new Font("Arial",0,11));
            add(myListDay.get(i));
        }
        
        
//        cmd1.setBackground(new java.awt.Color(255, 255, 255));
//        cmd1.setForeground(new java.awt.Color(75, 75, 75));
//        cmd1.setName("day"); // NOI18N
//        cmd1.setFont(fontText);
//        add(cmd1);
//
//        cmd2.setBackground(new java.awt.Color(255, 255, 255));
//        cmd2.setForeground(new java.awt.Color(75, 75, 75));
//        cmd2.setName("day"); // NOI18N
//        cmd2.setFont(fontText);
//        add(cmd2);
//
//        cmd3.setBackground(new java.awt.Color(255, 255, 255));
//        cmd3.setForeground(new java.awt.Color(75, 75, 75));
//        cmd3.setText("1");
//        cmd3.setName("day"); // NOI18N
//        cmd3.setFont(fontText);
//        add(cmd3);
//
//        cmd4.setBackground(new java.awt.Color(255, 255, 255));
//        cmd4.setForeground(new java.awt.Color(75, 75, 75));
//        cmd4.setText("2");
//        cmd4.setName("day"); // NOI18N
//        cmd4.setFont(fontText);
//        add(cmd4);
//
//        cmd5.setBackground(new java.awt.Color(255, 255, 255));
//        cmd5.setForeground(new java.awt.Color(75, 75, 75));
//        cmd5.setText("3");
//        cmd5.setName("day"); // NOI18N
//        cmd5.setFont(fontText);
//        add(cmd5);
//
//        cmd6.setBackground(new java.awt.Color(255, 255, 255));
//        cmd6.setForeground(new java.awt.Color(75, 75, 75));
//        cmd6.setText("4");
//        cmd6.setName("day"); // NOI18N
//        cmd6.setFont(fontText);
//        add(cmd6);
//
//        cmd7.setBackground(new java.awt.Color(255, 255, 255));
//        cmd7.setForeground(new java.awt.Color(75, 75, 75));
//        cmd7.setText("5");
//        cmd7.setName("day"); // NOI18N
//        cmd7.setFont(fontText);
//        add(cmd7);
//
//        cmd8.setBackground(new java.awt.Color(255, 255, 255));
//        cmd8.setForeground(new java.awt.Color(75, 75, 75));
//        cmd8.setText("6");
//        cmd8.setName("day"); // NOI18N
//        cmd8.setFont(fontText);
//        add(cmd8);
//
//        cmd9.setBackground(new java.awt.Color(255, 255, 255));
//        cmd9.setForeground(new java.awt.Color(75, 75, 75));
//        cmd9.setText("7");
//        cmd9.setName("day"); // NOI18N
//        cmd9.setFont(fontText);
//        add(cmd9);
//
//        cmd10.setBackground(new java.awt.Color(255, 255, 255));
//        cmd10.setForeground(new java.awt.Color(75, 75, 75));
//        cmd10.setText("8");
//        cmd10.setName("day"); // NOI18N
//        cmd10.setFont(fontText);
//        add(cmd10);
//
//        cmd11.setBackground(new java.awt.Color(255, 255, 255));
//        cmd11.setForeground(new java.awt.Color(75, 75, 75));
//        cmd11.setText("9");
//        cmd11.setName("day"); // NOI18N
//        add(cmd11);
//
//        cmd12.setBackground(new java.awt.Color(255, 255, 255));
//        cmd12.setForeground(new java.awt.Color(75, 75, 75));
//        cmd12.setText("10");
//        cmd12.setName("day"); // NOI18N
//        add(cmd12);
//
//        cmd13.setBackground(new java.awt.Color(255, 255, 255));
//        cmd13.setForeground(new java.awt.Color(75, 75, 75));
//        cmd13.setText("11");
//        cmd13.setName("day"); // NOI18N
//        add(cmd13);
//
//        cmd14.setBackground(new java.awt.Color(255, 255, 255));
//        cmd14.setForeground(new java.awt.Color(75, 75, 75));
//        cmd14.setText("12");
//        cmd14.setName("day"); // NOI18N
//        add(cmd14);
//
//        cmd15.setBackground(new java.awt.Color(255, 255, 255));
//        cmd15.setForeground(new java.awt.Color(75, 75, 75));
//        cmd15.setText("13");
//        cmd15.setName("day"); // NOI18N
//        add(cmd15);
//
//        cmd16.setBackground(new java.awt.Color(255, 255, 255));
//        cmd16.setForeground(new java.awt.Color(75, 75, 75));
//        cmd16.setText("14");
//        cmd16.setName("day"); // NOI18N
//        add(cmd16);
//
//        cmd17.setBackground(new java.awt.Color(255, 255, 255));
//        cmd17.setForeground(new java.awt.Color(75, 75, 75));
//        cmd17.setText("15");
//        cmd17.setName("day"); // NOI18N
//        add(cmd17);
//
//        cmd18.setBackground(new java.awt.Color(255, 255, 255));
//        cmd18.setForeground(new java.awt.Color(75, 75, 75));
//        cmd18.setText("16");
//        cmd18.setName("day"); // NOI18N
//        add(cmd18);
//
//        cmd19.setBackground(new java.awt.Color(255, 255, 255));
//        cmd19.setForeground(new java.awt.Color(75, 75, 75));
//        cmd19.setText("17");
//        cmd19.setName("day"); // NOI18N
//        add(cmd19);
//
//        cmd20.setBackground(new java.awt.Color(255, 255, 255));
//        cmd20.setForeground(new java.awt.Color(75, 75, 75));
//        cmd20.setText("18");
//        cmd20.setName("day"); // NOI18N
//        add(cmd20);
//
//        cmd21.setBackground(new java.awt.Color(255, 255, 255));
//        cmd21.setForeground(new java.awt.Color(75, 75, 75));
//        cmd21.setText("19");
//        cmd21.setName("day"); // NOI18N
//        add(cmd21);
//
//        cmd22.setBackground(new java.awt.Color(255, 255, 255));
//        cmd22.setForeground(new java.awt.Color(75, 75, 75));
//        cmd22.setText("20");
//        cmd22.setName("day"); // NOI18N
//        add(cmd22);
//
//        cmd23.setBackground(new java.awt.Color(255, 255, 255));
//        cmd23.setForeground(new java.awt.Color(75, 75, 75));
//        cmd23.setText("21");
//        cmd23.setName("day"); // NOI18N
//        add(cmd23);
//
//        cmd24.setBackground(new java.awt.Color(255, 255, 255));
//        cmd24.setForeground(new java.awt.Color(75, 75, 75));
//        cmd24.setText("22");
//        cmd24.setName("day"); // NOI18N
//        add(cmd24);
//
//        cmd25.setBackground(new java.awt.Color(255, 255, 255));
//        cmd25.setForeground(new java.awt.Color(75, 75, 75));
//        cmd25.setText("23");
//        cmd25.setName("day"); // NOI18N
//        add(cmd25);
//
//        cmd26.setBackground(new java.awt.Color(255, 255, 255));
//        cmd26.setForeground(new java.awt.Color(75, 75, 75));
//        cmd26.setText("24");
//        cmd26.setName("day"); // NOI18N
//        add(cmd26);
//
//        cmd27.setBackground(new java.awt.Color(255, 255, 255));
//        cmd27.setForeground(new java.awt.Color(75, 75, 75));
//        cmd27.setText("25");
//        cmd27.setName("day"); // NOI18N
//        add(cmd27);
//
//        cmd28.setBackground(new java.awt.Color(255, 255, 255));
//        cmd28.setForeground(new java.awt.Color(75, 75, 75));
//        cmd28.setText("26");
//        cmd28.setName("day"); // NOI18N
//        add(cmd28);
//
//        cmd29.setBackground(new java.awt.Color(255, 255, 255));
//        cmd29.setForeground(new java.awt.Color(75, 75, 75));
//        cmd29.setText("27");
//        cmd29.setName("day"); // NOI18N
//        add(cmd29);
//
//        cmd30.setBackground(new java.awt.Color(255, 255, 255));
//        cmd30.setForeground(new java.awt.Color(75, 75, 75));
//        cmd30.setText("28");
//        cmd30.setName("day"); // NOI18N
//        add(cmd30);
//
//        cmd31.setBackground(new java.awt.Color(255, 255, 255));
//        cmd31.setForeground(new java.awt.Color(75, 75, 75));
//        cmd31.setText("29");
//        cmd31.setName("day"); // NOI18N
//        add(cmd31);
//
//        cmd32.setBackground(new java.awt.Color(255, 255, 255));
//        cmd32.setForeground(new java.awt.Color(75, 75, 75));
//        cmd32.setText("30");
//        cmd32.setName("day"); // NOI18N
//        add(cmd32);
//
//        cmd33.setBackground(new java.awt.Color(255, 255, 255));
//        cmd33.setForeground(new java.awt.Color(75, 75, 75));
//        cmd33.setText("31");
//        cmd33.setName("day"); // NOI18N
//        add(cmd33);
//
//        cmd34.setBackground(new java.awt.Color(255, 255, 255));
//        cmd34.setForeground(new java.awt.Color(75, 75, 75));
//        cmd34.setName("day"); // NOI18N
//        add(cmd34);
//
//        cmd35.setBackground(new java.awt.Color(255, 255, 255));
//        cmd35.setForeground(new java.awt.Color(75, 75, 75));
//        cmd35.setName("day"); // NOI18N
//        add(cmd35);
//
//        cmd36.setBackground(new java.awt.Color(255, 255, 255));
//        cmd36.setForeground(new java.awt.Color(75, 75, 75));
//        cmd36.setName("day"); // NOI18N
//        add(cmd36);
//
//        cmd37.setBackground(new java.awt.Color(255, 255, 255));
//        cmd37.setForeground(new java.awt.Color(75, 75, 75));
//        cmd37.setName("day"); // NOI18N
//        add(cmd37);
//
//        cmd38.setBackground(new java.awt.Color(255, 255, 255));
//        cmd38.setForeground(new java.awt.Color(75, 75, 75));
//        cmd38.setName("day"); // NOI18N
//        add(cmd38);
//
//        cmd39.setBackground(new java.awt.Color(255, 255, 255));
//        cmd39.setForeground(new java.awt.Color(75, 75, 75));
//        cmd39.setName("day"); // NOI18N
//        add(cmd39);
//
//        cmd40.setBackground(new java.awt.Color(255, 255, 255));
//        cmd40.setForeground(new java.awt.Color(75, 75, 75));
//        cmd40.setName("day"); // NOI18N
//        add(cmd40);
//
//        cmd41.setBackground(new java.awt.Color(255, 255, 255));
//        cmd41.setForeground(new java.awt.Color(75, 75, 75));
//        cmd41.setName("day"); // NOI18N
//        add(cmd41);
//
//        cmd42.setBackground(new java.awt.Color(255, 255, 255));
//        cmd42.setForeground(new java.awt.Color(75, 75, 75));
//        cmd42.setName("day"); // NOI18N
//        add(cmd42);
    }// </editor-fold>//GEN-END:initComponents

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
        addEvent();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.dateChooser.Button cmd1;
    private GUI.panel.swing.dateChooser.Button cmd10;
    private GUI.panel.swing.dateChooser.Button cmd11;
    private GUI.panel.swing.dateChooser.Button cmd12;
    private GUI.panel.swing.dateChooser.Button cmd13;
    private GUI.panel.swing.dateChooser.Button cmd14;
    private GUI.panel.swing.dateChooser.Button cmd15;
    private GUI.panel.swing.dateChooser.Button cmd16;
    private GUI.panel.swing.dateChooser.Button cmd17;
    private GUI.panel.swing.dateChooser.Button cmd18;
    private GUI.panel.swing.dateChooser.Button cmd19;
    private GUI.panel.swing.dateChooser.Button cmd2;
    private GUI.panel.swing.dateChooser.Button cmd20;
    private GUI.panel.swing.dateChooser.Button cmd21;
    private GUI.panel.swing.dateChooser.Button cmd22;
    private GUI.panel.swing.dateChooser.Button cmd23;
    private GUI.panel.swing.dateChooser.Button cmd24;
    private GUI.panel.swing.dateChooser.Button cmd25;
    private GUI.panel.swing.dateChooser.Button cmd26;
    private GUI.panel.swing.dateChooser.Button cmd27;
    private GUI.panel.swing.dateChooser.Button cmd28;
    private GUI.panel.swing.dateChooser.Button cmd29;
    private GUI.panel.swing.dateChooser.Button cmd3;
    private GUI.panel.swing.dateChooser.Button cmd30;
    private GUI.panel.swing.dateChooser.Button cmd31;
    private GUI.panel.swing.dateChooser.Button cmd32;
    private GUI.panel.swing.dateChooser.Button cmd33;
    private GUI.panel.swing.dateChooser.Button cmd34;
    private GUI.panel.swing.dateChooser.Button cmd35;
    private GUI.panel.swing.dateChooser.Button cmd36;
    private GUI.panel.swing.dateChooser.Button cmd37;
    private GUI.panel.swing.dateChooser.Button cmd38;
    private GUI.panel.swing.dateChooser.Button cmd39;
    private GUI.panel.swing.dateChooser.Button cmd4;
    private GUI.panel.swing.dateChooser.Button cmd40;
    private GUI.panel.swing.dateChooser.Button cmd41;
    private GUI.panel.swing.dateChooser.Button cmd42;
    private GUI.panel.swing.dateChooser.Button cmd5;
    private GUI.panel.swing.dateChooser.Button cmd6;
    private GUI.panel.swing.dateChooser.Button cmd7;
    private GUI.panel.swing.dateChooser.Button cmd8;
    private GUI.panel.swing.dateChooser.Button cmd9;
    private GUI.panel.swing.dateChooser.Button cmdFr;
    private GUI.panel.swing.dateChooser.Button cmdMo;
    private GUI.panel.swing.dateChooser.Button cmdSa;
    private GUI.panel.swing.dateChooser.Button cmdSu;
    private GUI.panel.swing.dateChooser.Button cmdTh;
    private GUI.panel.swing.dateChooser.Button cmdTu;
    private GUI.panel.swing.dateChooser.Button cmdWe;
    // End of variables declaration//GEN-END:variables

    public void next() {
        if (selectDay == max_of_month) {
            selectDay = 0;
        }
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay + 1);
        String n = cmd.getText();
        if (!n.equals("") && Integer.valueOf(n) <= max_of_month) {
            selectDay++;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void back() {
        if (selectDay <= 1) {
            selectDay = max_of_month + 1;
        }
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay - 1);
        String n = cmd.getText();
        if (!n.equals("") && cmd.getName() != null) {
            selectDay--;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void up() {
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay - 7);
        String n = cmd.getText();
        if (!n.equals("") && cmd.getName() != null) {
            selectDay -= 7;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void down() {
        if (getComponents().length > startDate - 1 + selectDay + 7) {
            JButton cmd = (JButton) getComponent(startDate - 1 + selectDay + 7);
            String n = cmd.getText();
            if (!n.equals("") && cmd.getName() != null) {
                selectDay += 7;
                event.execute(null, selectDay);
                cmd.setBackground(new Color(206, 110, 245));
            }
        }
    }

}

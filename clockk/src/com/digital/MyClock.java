   // part 1
package com.digital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MyClock extends JFrame // JFrame to iconify the window
         {
    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("", Font.BOLD, 35);

    MyClock() { // constructor
        super.setTitle("Digital clock");
        super.setSize(300, 300); //Size of Title
        super.setLocation(300, 80);// Set  location of clock
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }

   // part 2
    public void createGUI() {
        //GUI
        heading = new JLabel("      My Clock");// Project Heading
        clockLabel = new JLabel("Clock");// JLabel placing text in container
        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(clockLabel);
    }

   // part 3
   public void startClock() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String dateTime= new Date().toString(); // converts date to string
                 String dateTime=new Date().toLocaleString(); // to show AM/PM
                Date d = new Date();
               //SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : ss"); //simple format without AM/PM
               //String dateTime = sfd.format(d);
                clockLabel.setText(dateTime);
            }
        });
        timer.start();
    }
}


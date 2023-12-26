package event_management_system;
import event_management_system.Login1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Event_Management_System extends JFrame {
    Event_Management_System(){
        setBounds(300,300,1366,768);


        ImageIcon i1 = new ImageIcon("D:\\GRS\\java\\EventManagementSystem.jpg");
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1600,768);
        add(l1);

        JButton b1 = new JButton("Customer");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(500,300,150,50);
        l1.add(b1);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                new Login1("customer").setVisible(true);


            }
        });

        JButton b2 = new JButton("Admin");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(700,300,150,50);
        l1.add(b2);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                new Login1("admin").setVisible(true);


            }


        });
        setLayout(null);


        setVisible(true);
    }



    public static void main(String[] args) {
        Event_Management_System m = new Event_Management_System();


    }

}

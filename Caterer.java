
package event_management_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


  class caterer extends JFrame {
    JLabel l[] = new JLabel[]{new JLabel("id"),new JLabel("caterer"),new JLabel("menu"),new JLabel("budget")};
    JTextField t[] = new JTextField[4];

    JButton b1;
    caterer(){

        getContentPane().setBackground(Color.WHITE);
        int j = 0;
        for(int i=0;i<4;i++){
            l[i].setBounds(40,20+j,100,30);
            add(l[i]);
            j+= 50;

        }
        j =0;
        for(int i=0;i<4;i++){


                t[i] = new JTextField();
                t[i].setBounds(150,20+j,150,30);
                add(t[i]);
                j+= 50;

        }
        b1 = new JButton("ADD");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,260,100,30);
        add(b1);
        b1.addActionListener(new ActionListener(){
            Statement statement;
            public void actionPerformed(ActionEvent ae){

                try{



                   String q = "insert into catering values("+t[0].getText()+", '"+t[1].getText()+"', "+t[2].getText()+", '"+t[3].getText()+"')";
                    System.out.print(q);
                    setVisible(false);

                    statement.executeUpdate(q);
                    JOptionPane.showMessageDialog(null,"Successfully Added");
                    setVisible(false);

                }catch (SQLException ex) {
                    Logger.getLogger(Venue.class.getName()).log(Level.SEVERE, null, ex);
                }


            }
        });
        JButton b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(220,260,100,30);

        b2.addActionListener(new ActionListener(){
                                 public void actionPerformed(ActionEvent ae){
                                     try{
                                         setVisible(false);
                                         new Event_Management_System().setVisible(true);


                                     }catch(Exception e ){}

                                 }
                             }
        );

        add(b2);




        setLayout(null);
        setBounds(500,300,700,500);
        setVisible(true);




    }
    public static void main(String args[]){
        caterer r= new caterer();

    }

}

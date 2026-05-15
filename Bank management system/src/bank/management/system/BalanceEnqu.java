package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.util.*;



class BalanceEnqu extends JFrame implements ActionListener {

 
    JButton back;
    String pinnumber;

    BalanceEnqu(String pinnumber) {
        setLayout(null);
        this.pinnumber = pinnumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        back = new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        Conn c = new Conn();
        try
          {
              int balance = 0;
              ResultSet rs = c.s.executeQuery("select *from bank where pinnumber = '"+pinnumber+"'");
              while(rs.next())
              {
                 if(rs.getString("type").equals("Deposit")) 
                 {
                     balance += Integer.parseInt(rs.getString("amount"));
                 }
                 else
                 {
                     balance -= Integer.parseInt(rs.getString("amount"));
                 }
              }
                JLabel text = new JLabel("Your Current Amount balance is Rs" +balance);
                text.setForeground(Color.WHITE);
                text.setBounds(170, 300, 400, 30);
                image.add(text);
          }catch(Exception e)
          {
              System.out.println(e);
          }
        
      
     
        setSize(900, 900);
        setUndecorated(true);
        setLocation(500, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnqu("").setVisible(true);
    }
}

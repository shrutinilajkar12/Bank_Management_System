package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField adhar,pan;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,Category,Occupation,Qualification,income;
    String formno;
    
    SignupTwo(String formno)
    {
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM -- PAGE 2");
        
        JLabel additionaldetails = new JLabel("Page 2:Additional details");
        additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionaldetails.setBounds(290, 80, 400, 30);
        add(additionaldetails);
        
        JLabel Religion = new JLabel("Religion:");
        Religion.setFont(new Font("Raleway",Font.BOLD,22));
        Religion.setBounds(100, 140, 100, 30);
        add(Religion);
        
        String valreligion[] = {"Hindu","Muslim","Sikh","Christian","other"};
        religion = new  JComboBox(valreligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel category= new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,22));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String valCategory[] = {"General","OBC","SC","ST","other"};
        Category = new  JComboBox(valCategory);
        Category.setBounds(300, 190, 400, 30);
        Category.setBackground(Color.WHITE);
        add(Category);
       
        
        
        JLabel Income = new JLabel("Income :");
        Income.setFont(new Font("Raleway",Font.BOLD,22));
        Income.setBounds(100, 240, 200, 30);
        add(Income);
        
        String valincome[] = {"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
        income = new  JComboBox(valincome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
       
        
        JLabel educational = new JLabel("Educational:");
        educational.setFont(new Font("Raleway",Font.BOLD,22));
        educational.setBounds(100, 315, 200, 30);
        add(educational);
        
       
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,22));
        qualification.setBounds(100, 340, 200, 30);
        add(qualification);
        
        String valQualification[] = {"Non-Graduation","Graduation","Post-Graduation","Docterate","others"};
        Qualification = new  JComboBox(valQualification);
        Qualification.setBounds(300, 315, 400, 30);
        Qualification.setBackground(Color.WHITE);
        add(Qualification);
        
       
        JLabel occupation = new JLabel("Occupation");
        occupation.setFont(new Font("Raleway",Font.BOLD,22));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        String valOccupation[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","others"};
        Occupation = new  JComboBox(valOccupation);
        Occupation.setBounds(300, 390, 400, 30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation);
        
       
        JLabel panno = new JLabel("PAN NUMBER:");
        panno.setFont(new Font("Raleway",Font.BOLD,22));
        panno.setBounds(100, 440, 200, 30);
        add(panno);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        
        JLabel adharno = new JLabel("Adhar Number:");
        adharno.setFont(new Font("Raleway",Font.BOLD,22));
        adharno.setBounds(100, 490, 200, 30);
        add(adharno);
        
        adhar = new JTextField();
        adhar.setFont(new Font("Raleway",Font.BOLD,14));
        adhar.setBounds(300, 490, 400, 30);
        add(adhar);
        
        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD,22));
        seniorcitizen.setBounds(100, 540, 200, 30);
        add(seniorcitizen);
        
        syes = new JRadioButton("yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
     
        
        
        JLabel existacc = new JLabel("Exisiting Account:");
        existacc.setFont(new Font("Raleway",Font.BOLD,22));
        existacc.setBounds(100, 590, 200, 30);
        add(existacc);
        
        eyes = new JRadioButton("yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existaccgroup = new ButtonGroup();
        existaccgroup.add(eyes);
        existaccgroup.add(eno);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
                
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        String sreligion =(String) religion.getSelectedItem();
        String scategory =(String) Category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String squalification = (String) Qualification.getSelectedItem();
        String soccupation = (String) Occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected())
        {
            seniorcitizen = "syes";
            
        }
        else if(sno.isSelected())
        {
          seniorcitizen = "sno";
        }
        
        
        String existacc = null;
        if(eyes.isSelected())
        {
            existacc="eyes";
        }
        else if(eno.isSelected())
        {
            existacc="eno";
        }
        
        String span = pan.getText();
        String sadhar = adhar.getText(); 
        
        try
        {
               Conn c = new Conn();
               String query = "insert into signupTwo values('"+formno+"','"+sreligion+"','"+scategory +"','"+sincome+"','"+squalification+"','"+soccupation+"','"+span+"','"+sadhar+"','"+seniorcitizen+"','" +existacc+"')";
               c.s.executeUpdate(query);
               
               setVisible(false);
               new SignupThree(formno).setVisible(true);
            
        }
            
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void main(String args[])
    {
        new SignupTwo("");
    }
    
}

        
    
    


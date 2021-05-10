package Prectice;
import javax.swing.*;
import java.awt.event.*;
class Sw1 extends JFrame implements ActionListener{
    JTextField JT;
    JTextField JT1;
    JTextField JT2;
    Sw1(){
        JFrame Jf = new JFrame();
        setVisible(true);
        setSize(300,300);
        setTitle("Git");
        setLocation(450,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel JL1 = new JLabel();
        JL1.setText("Enter Two Number For Get The Sum");
        JL1.setBounds(30,10,300,15);
       // JL1.setLayout(new FlowLayout());
        add(JL1);
        

        JLabel JL = new JLabel("First Number : ");
        JL.setSize(23,23);
        setLayout(null);
        JL.setBounds(20,50,100,10);
        add(JL);

        JT = new JTextField();
        JT.setBounds(140,50,50,18);
        add(JT);

        JLabel JL2 = new JLabel("Second Number : ");
        JL2.setBounds(20,80,100,10);
        add(JL2);

        JT1 = new JTextField();
        JT1.setBounds(140,80,50,18);
        add(JT1);

        JButton JB = new JButton();
        JB.setText("Add");
        JB.setBounds(20,110,70,20);
        add(JB);

        JT2 = new JTextField();
        JT2.setBounds(140,108,50,22);
        add(JT2);

        JB.addActionListener(this);
    

    }
    public void actionPerformed(ActionEvent e){
     int Num1 = Integer.parseInt(JT.getText());
     int Num2 = Integer.parseInt(JT1.getText());
     int sum = Num1+Num2;
     JT2.setText(sum+"");

    }
}


public class Swi{
    public static void main(String [] args){
        Sw1 P  = new Sw1();

    }
}
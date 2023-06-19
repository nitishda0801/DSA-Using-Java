import javax.swing.*;  
import java.awt.event.*;  
public class SwingSum implements ActionListener{  
    JTextField tf1,tf2,tf3,tf4;  
    JButton b1; 
    SwingSum(){  
        JFrame f= new JFrame();  
        JLabel l1=new JLabel("Number1:");
        l1.setBounds(5,50,150,20); 
        JLabel l2=new JLabel("Number2:");
        l2.setBounds(5,100,150,20); 
        JLabel l3=new JLabel("Sum:");
        l3.setBounds(5,150,150,20);
        JLabel l4=new JLabel("Difference:");
        l4.setBounds(5,180,150,20);  
        tf1=new JTextField();  
        tf1.setBounds(80,50,150,20); 
        tf2=new JTextField();
        tf2.setBounds(80,100,150,20); 
        tf3=new JTextField();
        tf3.setBounds(80,150,150,20);
        tf4=new JTextField();
        tf4.setBounds(80,180,150,20);  
        b1=new JButton("Calculate");  
        b1.setBounds(50,210,100,30);  
        b1.addActionListener(this);  
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(tf4); 
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);
        f.setSize(600,600);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        tf3.setText(String.valueOf(Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText())));
        tf4.setText(String.valueOf(Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText()))); 
 
    }  
public static void main(String[] args) {  
    new SwingSum();  
} }
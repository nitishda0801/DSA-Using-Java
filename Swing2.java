import javax.swing.*;
public class Swing2{
    public static void main(String args[])
{
	JFrame f=new JFrame ("Label Example");
	JLabel l1;
	ImageIcon i=new ImageIcon("Screenshot(1)");
	l1=new JLabel(i);
	l1.setBounds(100,100,200,200);
	f.add(l1);
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
}
}

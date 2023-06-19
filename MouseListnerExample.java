import java.awt.*;  
import java.awt.event.*;  
public class MouseListnerExample extends Frame implements MouseListener{  
    Label l=new Label();    
   MouseListnerExample()
   {  
        addMouseListener(this);  
         //l=new Label();
        l.setBounds(300,300,300,200);  
        add(l);  
        setSize(500,500);  
        setLayout(null); 
        setVisible(true); 
    }  
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
   public void mouseDragged(MouseEvent e){
    l.setText("Mouse Dragged"); 
   }
public static void main(String[] args) {  
    new MouseListnerExample();  
}  
}
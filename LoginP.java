import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class LoginP extends JFrame
{   
     JLabel l1,l2,l3,l4;
     JTextField t1,t2;
     JButton b1,b2,b3;   

    LoginP(String s1)
     {

       super(s1);

     } 
    LoginP()
    {

    }
    void setComponents()
    { 
      ImageIcon i1=new ImageIcon("C:/Users/DELL/Desktop/usericon.png");
  
     l1=new JLabel("Welcome to CS");
     l2=new JLabel(i1);
     l3=new JLabel("Password");
     l4=new JLabel();
     t1=new JTextField();
     t2=new JTextField();
     b1=new JButton("Login");
     b2=new JButton("Clear");
     b3=new JButton("Add");
     Cursor c1=new Cursor(Cursor.HAND_CURSOR);
     Cursor c2=new Cursor(Cursor.CROSSHAIR_CURSOR);
     Font f1=new Font("Times new Roman",Font.BOLD,26);
     l1.setCursor(c1);
     l1.setFont(f1);
     l1.setForeground(Color.RED);
     l1.setBackground(Color.BLACK);

     setLayout(null);
     l1.setBounds(150,100,200,60);
     l2.setBounds(100,200,30,30);
     l3.setBounds(100,300,150,20);
     l4.setBounds(100,500,100,20);     
     t1.setBounds(400,200,100,20);
     t2.setBounds(400,300,100,20);
     b1.setBounds(100,400,100,20);
     b2.setBounds(300,400,100,20);
     b3.setBounds(500,400,100,20);
     add(l1);
     add(l2);
     add(l3);
     add(l4);
     add(t1);
     add(t2);
     add(b1);
     add(b2);
     add(b3);
     b1.addActionListener(new Log());
     b2.addActionListener(new Clear());
     b3.addActionListener(new Add());
     l1.addMouseListener(new Mouse1());

     }

    public static void main(String args[])
      { 
         LoginP p1=new LoginP("Welcome to CS"); 
         p1.setVisible(true);
         p1.setSize(600,600);
         p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         p1.setComponents();
      }
      class Mouse1 implements MouseListener
       {
          public void mouseExited(MouseEvent m1)
             {
               l1.setForeground(Color.BLACK);
              }
          public void mouseEntered(MouseEvent m2)
             {
                l1.setForeground(Color.BLUE);
             }
         public void mouseReleased(MouseEvent m3)
             {
               
             }
         public void mousePressed(MouseEvent m4)
             {

             }
        public void mouseClicked(MouseEvent m5)
             {
                l1.setText("Welcome to Coding Seekho");
             }
           
        }
     class Log implements ActionListener
       {
         public void actionPerformed(ActionEvent e1)
           {
              String d1= t1.getText();
              String d2= t2.getText();
              if(d1.equals("admin") && d2.equals("12345"))
               {
                   l4.setText("Login Successful");
                }
              else
                {
                   l4.setText("Login Unsuccessful");
                 } 
             }
       }

     class Clear implements ActionListener
       {
         public void actionPerformed(ActionEvent e1)
           {
              t1.setText("");
              t2.setText("");
             }
       }
     class Add implements ActionListener
       {
         public void actionPerformed(ActionEvent e1)
         {
            try
             {
              int a=Integer.parseInt(t1.getText());
              int b=Integer.parseInt(t2.getText());
              int c=a+b;
              l4.setText("Addition is" + c);
             }
            catch(Exception e2)
             {
                    JOptionPane.showMessageDialog(null,"Error1","Error2",JOptionPane.WARNING_MESSAGE);
       }
      }
     }
}
             
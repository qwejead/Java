//Event Dispatch Thread (EDT) GUI draw करते
import javax.swing.*;
/*
हे package event handling साठी वापरले जाते.
उदा:
* button click
* keyboard event
* mouse event
*/
import java.awt.event.*;
/*
यामध्ये खालील classes असतात:
* JFrame
* JButton
* JLabel
* JTextField
* JPasswordField
*/


class MarvellousLogin// implements ActionListener
{
    public JFrame fobj;
    public JButton bobj;
    public JTextField tobj;
    public JPasswordField pobj;
    public JLabel UserLabel,PassLabel,ResultLabel;
    
    public MarvellousLogin(String title,int width,int height)
    {
        fobj=new JFrame();

        UserLabel=new JLabel("User Name"); 
        UserLabel.setBounds(50,50,100,30);

        tobj=new JTextField();
        tobj.setBounds(150,50,150,30);

        PassLabel=new JLabel("Password");
        PassLabel.setBounds(50,100,100,30);

        pobj=new JPasswordField();
        pobj.setBounds(150,100,150,30);
        
        bobj=new JButton("Submit");
        bobj.setBounds(150,150,100,30); 

        ResultLabel=new JLabel("");
        ResultLabel.setBounds(150,200,250,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(UserLabel);
        fobj.add(PassLabel);
        fobj.add(ResultLabel);

        fobj.setTitle(title);
        fobj.setSize(width,height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class LoginFormXX
{
    public static void main(String A[])
    {
        MarvellousLogin mobj =new MarvellousLogin("Marvellous login",400,300);
    }
}
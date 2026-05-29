        import javax.swing.*;
        import java.awt.event.*;

        class GUIButtonXListner
        {
            public static void main(String A[])
            {
                JFrame fobj = new JFrame("Marvellous PPA");
                JButton bobj=new JButton("ok");

                bobj.setBounds(100,100,150,50);

                bobj.addActionListener(new ActionListener()//Java registered listener शोधते.
                {
                    public void actionPerformed(ActionEvent aobj)
           
            /*Step 1

            Mouse click OS detect करते.

            ⸻

            Step 2

            OS Java ला message पाठवते.

            ⸻

            Step 3

            Java Event Dispatch Thread (EDT) event process करते.

            ⸻

            Step 4

            Java internally ActionEvent object तयार करते.*/

            //actionPerformed() method automatically call होते.
            {
                System.out.println("button clicked");
            }
            
                });
                fobj.add(bobj);

                fobj.setSize(400,300);

                fobj.setLayout(null);

                fobj.setVisible(true);

                fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        }
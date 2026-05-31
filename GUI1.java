import javax.swing.*;

class GUI1
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("Marvellous ppa");
        /* JFrame → Frame → Window → Container → Component
        * म्हणजे inheritance chain वापरतो */

        fobj.setSize(400,300);

        fobj.setVisible(true);

    /*. 1. OS window show करतो
        2. Java repaint call करतो
        3. paint() / paintComponent() methods call होतात
        4. Graphics object वापरून UI draw होतं */

    }
}
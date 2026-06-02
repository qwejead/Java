import java.sql.*;

public class MarvellousJDBCself1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54", "root", "");
            Statement cobj=con.createStatement();

            System.out.println("--------------------------------");
            System.out.println("1.Display");
            ResultSet write=cobj.executeQuery("SELECT * FROM student");
            while(write.next())
            {
                System.out.println("Roll No: " + write.getInt("rno"));
                System.out.println("Name  : " + write.getString("name"));
                System.out.println("City  : " + write.getString("city"));
                System.out.println("Marks : " + write.getInt("marks"));
                System.out.println("--------------------------------");
            }
            write.close();
        }
        }
        }
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
            System.out.println("1.Update");
            cobj.executeUpdate("UPDATE student marks=95 WHERE rno=5");
            System.out.println("Data Updated Successfully");
            cobj.close();
        }
        }
        }
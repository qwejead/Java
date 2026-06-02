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
            System.out.println("1.Insert");
            cobj.executeUpdate("INSERT INTO student VALUES(5,'Pooja','Mumbai',90)");
            System.out.println("Data Inserted Successfully");
            System.out.println("--------------------------------");
            cobj.close();
        }
        }
        }
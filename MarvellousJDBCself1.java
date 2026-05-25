// Topic need to recall 
// Interface , class, abtraction, abstract method, packages, loop 
//create read update delete

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

            Statement stmt = con.createStatement();

            System.out.println("--------------------------------");

            System.out.println("1.Display");
            System.out.println("2.Insert");
            System.out.println("3.Update");
            System.out.println("4.Delete");

            System.out.println("--------------------------------");

            System.out.println("Enter choice :");
            int choice = sobj.nextInt();

            System.out.println("--------------------------------");
            
            switch(choice)
            {
                case 1:
                     ResultSet pr1=stmt.executeQuery("SELECT * FROM student");
                     while(pr1.next())
                     {
                        System.out.println("Roll No: " + pr1.getInt("rno"));
                        System.out.println("Name  : " + pr1.getString("name"));
                        System.out.println("City  : " + pr1.getString("city"));
                        System.out.println("Marks : " + pr1.getInt("marks"));
                        System.out.println("--------------------------------");
                     }
                     pr.close();
                     break;

                     case 2:
                        stmt.executeUpdate("INSERT INTO student VALUES(5,'Pooja','Mumbai',90)");
                        System.out.println("Data Inserted Successfully");
                        break;

                    case 3:
                        stmt.executeUpdate("UPDATE student SET marks=95 WHERE rno=5");
                        System.out.println("Data Updated Successfully");
                        break;

                    case 4:
                        stmt.executeUpdate("DELETE FROM student WHERE rno=5");
                        System.out.println("Data Deleted Successfully");
                        break;
                        
                    default:
                    System.out.println("Invalid choice");
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }
}
import java.sql.*;
import java.util.*;
public class Sq {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Pass@123");
//            PreparedStatement pt = con.prepareStatement("insert into emp values(?,?,?,?)");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter id");
//            int id = sc.nextInt();
//            System.out.println("Enter Name:");
//            String name = sc.next();
//            System.out.println("Enter the salary");
//            int sal = sc.nextInt();
//            System.out.println("enter the designation");
//            String desig = sc.next();
//
//            pt.setInt(1,id);
//            pt.setString(2,name);
//            pt.setInt(3,sal);
//            pt.setString(4,desig);
//            pt.execute();
            Statement st = con.createStatement();
            DatabaseMetaData metaData = con.getMetaData();
            ResultSet columns = metaData.getColumns(null, null, "sample_table", null);


            con.close();
            System.out.println("new Data entered");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

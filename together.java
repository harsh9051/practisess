import java.util.*;
import java.io.*;
import java.sql.*;
class Emp {
    Connection con = null;

    void insert() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Pass@123");
            PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?,?)");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the id");
            int id = sc.nextInt();
            System.out.println("Enter the name");
            String naame = sc.next();
            System.out.println("Enter the salary");
            int sal = sc.nextInt();
            System.out.println("Enter the designation");
            String desig = sc.next();

            ps.setInt(1, id);
            ps.setString(2, naame);
            ps.setInt(3, sal);
            ps.setString(4, desig);
            ps.execute();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            con.close();
        }
    }

    void update() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Pass@123");
            PreparedStatement ps = con.prepareStatement("update emp set salary = ? where id = ?");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the salary");
            int sal = sc.nextInt();
            System.out.println("Enter the id");
            int id = sc.nextInt();
            ps.setInt(1, sal);
            ps.setInt(2, id);

            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void display() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Pass@123");
            PreparedStatement ps = con.prepareStatement("select * from emp where desig=?");

            Scanner sc = new Scanner(System.in);
            String desig = sc.next();
            ps.setString(1,desig);
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" :"+rs.getString(2));
            }

        } catch (Exception e) {

        }
    }
}
public class together {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Emp p = new Emp();
        do {
            System.out.println("1.Create");
            System.out.println("2.Display");
            System.out.println("3.Update");
            System.out.println("4.exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("1.Developer");
                System.out.println("2.Manager");
                int ch1 = sc.nextInt();
                if (ch1 == 1) {
                    p.insert();
                } else
                    p.insert();
            } else if (ch == 2) {
                System.out.println("1.Developer");
                System.out.println("2.Manager");
                int ch1 = sc.nextInt();
                if (ch1 == 1) {
                    p.display();
                } else
                    p.display();
            }
            else if(ch==3)
            {
                System.out.println("1.Developer");
                System.out.println("2.Manager");
                int ch1 = sc.nextInt();
                if (ch1 == 1) {
                    p.update();
                } else
                    p.update();
            }else {
                System.exit(0);
            }
        }while (true);
    }
}


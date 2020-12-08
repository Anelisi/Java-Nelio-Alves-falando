package jdbc2_INSERT;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main_INSERT {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/y");
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = DB.getConnection();
            /*pst = conn.prepareStatement(
                    "INSERT INTO department"
                            + "(Name)"
                            + "VALUES "
                            +"(?)",
                    Statement.RETURN_GENERATED_KEYS);
            System.out.print("Nome do departamento novo: ");
            String newDepart = sc.nextLine();

            pst.setString(1,newDepart);*/

           pst = conn.prepareStatement(
                    "INSERT INTO seller"
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                    + "VALUES "
                    +"(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("\nEmail: ");
            String email = sc.nextLine();
            System.out.print("\nBirthday: ");
            Date birthday = new java.sql.Date(sdf.parse(sc.next()).getTime());
            System.out.print("\nBase salary: ");
            Double salary = sc.nextDouble();
            System.out.print("\nId department: ");
            int departmentId = sc.nextInt();

            pst.setString(1,name);
            pst.setString(2,email);
            pst.setDate(3,birthday);
            pst.setDouble(4,salary);
            pst.setInt(5,departmentId);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                ResultSet rs = pst.getGeneratedKeys();
                while (rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done! ID = " + id + "\nRows affected " + rows );
                }
            } else {
                System.out.println("No rows affected!");
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }

        finally {
            DB.closeStatement(pst);
            DB.closeConnection();
        }
    }
}

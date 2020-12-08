package jdbc3_UPDATE;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.util.Scanner;

public class Main_JDBC3 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = DB.getConnection();
            pst = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE "
                    + "(DepartmentId = ? )");

            System.out.print("Aumento salarial: ");
            double moreMoney = sc.nextDouble();
            System.out.print("\nDepartamento: ");
            int department = sc.nextInt();

            pst.setDouble(1,moreMoney);
            pst.setInt(2,department);

            int rows = pst.executeUpdate();

            System.out.println("Done! Rows affected " + rows);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(pst);
            DB.closeConnection();
        }
    }
}

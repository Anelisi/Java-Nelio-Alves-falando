package jdbc5_TRANSACTIONS;

import db.DB;
import db.DBIntegretException;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Scanner;

public class Main_TRANSACTIONS_JDBC5 {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false);
            st = conn.createStatement();
            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 4800 WHERE DepartmentId = 1 ");


           /* int x = 1;
            if (x < 2) {
                throw new SQLException("Fake Error!");
            }*/

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 8400 WHERE DepartmentId = 2 ");

            conn.commit();

            System.out.println("Done! Rows1 affected " + rows1);
            System.out.println("Done! Rows2 affected " + rows2);
        } catch (SQLException e) {
            conn.rollback();
            throw new DbException("Trasaction  rolled back! Caused by: " + e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}

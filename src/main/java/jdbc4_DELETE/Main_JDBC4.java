package jdbc4_DELETE;

import db.DB;
import db.DBIntegretException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class Main_JDBC4 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = DB.getConnection();
            pst = conn.prepareStatement(
                    "DELETE FROM department "
                    + "WHERE "
                    + "Id = ?");

            System.out.print("Id a ser excluido: ");
            int id = sc.nextInt();

            pst.setInt(1,id);

            int rows = pst.executeUpdate();

            System.out.println("Done! Rows affected " + rows);
        } catch (SQLException e) {
            throw new DBIntegretException(e.getMessage());
        }
        finally {
            DB.closeStatement(pst);
            DB.closeConnection();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kerja;

/**
 *
 * @author Arkhan
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KonekDB {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=login_db";
    private static final String USER = "sa";
    private static final String PASSWORD = "arkhan123";
    private static Connection KoneksiDB;

    public static Connection getKoneksiDB() {
        if (KoneksiDB == null) {
            try {
                String server = "(local)\\LEINAVON";
                String database = "bd";
                String user = "arkhan";
                String password = "root";
                String url = "jdbc:sqlserver://" + server + ":1433;databaseName=" + database + ";encrypt=false";

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                KoneksiDB = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil!");
            } catch (ClassNotFoundException e) {
                System.out.println("Driver tidak ditemukan: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        return KoneksiDB;
    }
}

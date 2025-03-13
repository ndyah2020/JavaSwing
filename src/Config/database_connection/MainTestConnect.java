/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config.database_connection;


import java.sql.Connection;

public class MainTestConnect {
     public static void main(String[] args) {
        Connection con = null;
        try {
            con = ConnectToSQLServer.getConnection();
            if (con != null) {
                System.out.println("Kết nối thành công đến SQL Server!");
            } else {
                System.out.println("Kết nối thất bại!");
            }
        } finally {
            ConnectToSQLServer.closeConnection(con);
        }
    }
}

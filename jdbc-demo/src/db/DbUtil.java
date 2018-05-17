package db;

import java.sql.*;

public class DbUtil {
    public static final String URL = "jdbc:mysql://121.40.163.176:3306/test?serverTimezone=UTC&useSSL=false";
    public static final String USER = "root";
    public static final String PASSWORD = "vcl111111";
    private static Connection conn = null;

    static {
        System.out.println("数据库开始连接");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return conn;
    }
}
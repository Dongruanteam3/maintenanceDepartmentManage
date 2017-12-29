package tools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPoolTools {
    private static JDBCPool jdbcPool = new JDBCPool();

    public static Connection getConnection() {
        Connection connection = null;
        try{
            connection = jdbcPool.getConnection();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void release(Connection connection, Statement statement, ResultSet resultSet){
        if (resultSet != null){
            try{
                resultSet.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        if (statement != null){
            try{
                statement.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        if (connection != null){
                JDBCPool.add(connection);
        }

    }
}
import tools.JDBCPool;
import tools.JDBCPoolTools;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class jdbcpooltest {
    public static void main(String[] args) {
        Connection connection =null;
        Statement statement =null;
        ResultSet resultSet =null;
        try {
            connection = JDBCPoolTools.getConnection();
            String sql = "SELECT * FROM ManageSystem";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String power = resultSet.getString("pow");
                String email = resultSet.getString("email");
                System.out.println(username);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            JDBCPoolTools.release(connection,statement,resultSet);
        }
        }
}
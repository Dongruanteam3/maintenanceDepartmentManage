package dao.repository;

import bean.repository.A6;
import bean.repository.A7;
import oracle.jdbc.proxy.annotation.Pre;
import tools.JDBCPoolTools;

import java.sql.*;

public class daoForRepositoryIMP  implements daoForRepository{
    /**
     * @param connection
     * @param newA7
     * @Description: Ìí¼ÓA7
     */
    @Override
    public void A7insert(Connection connection, A7 newA7) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "insert into A7 values (A7_1.nextval, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,newA7.getA72());
            preparedStatement.setString(2,newA7.getA73());
            preparedStatement.setDouble(3,newA7.getA74());
            preparedStatement.setInt(4,newA7.getA75());
            preparedStatement.setInt(5,newA7.getA76());
            preparedStatement.setString(6,newA7.getA77());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCPoolTools.release(connection,preparedStatement,resultSet);
        }

    }

    /**
     * @param connection
     * @param newA6
     * @Description: Ìí¼ÓA6
     */
    @Override
    public void A6insert(Connection connection, A6 newA6) {
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
        try{
            String sql = "insert into A6 values (A6_1.nextval, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,newA6.getA62());
            preparedStatement.setString(2,newA6.getA63());
            preparedStatement.setInt(3,newA6.getA64());
            preparedStatement.setDouble(4,newA6.getA65());
            preparedStatement.setDate(5,newA6.getA66());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCPoolTools.release(connection,preparedStatement,resultSet);
        }
    }
}

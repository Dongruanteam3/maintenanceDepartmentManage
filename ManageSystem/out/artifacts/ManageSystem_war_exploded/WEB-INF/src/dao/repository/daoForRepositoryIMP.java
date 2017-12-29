package dao.repository;

import bean.repair.A4;
import bean.repository.A5;
import bean.repository.A6;
import bean.repository.A7;
import oracle.jdbc.proxy.annotation.Pre;
import tools.JDBCPoolTools;

import java.sql.*;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

public class daoForRepositoryIMP  implements daoForRepository{
    /**
     * @param connection
     * @param newA7
     * @Description: 添加A7
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
     * @param state
     * @param name
     * @Description: 搜索A7
     */
    @Override
    public ArrayList<A7> A7select(Connection connection, String state, String name) {
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        String condition = null;
        ArrayList<A7> a7ArrayList = new ArrayList<>();

        try {
            String sql = null;
            if (state.equals("All") && name==null) {
                sql = "SELECT * FROM A7";
                preparedStatement = connection.prepareStatement(sql);
            } else if(state.equals("All")) {
                sql = "SELECT  * FROM A7 WHERE a72 = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, name);
            } else if(name == null){
                sql = "SELECT  * FROM A7 WHERE a77 = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, state);
            } else{
                sql = "SELECT  * FROM A7 WHERE a72 = ? AND a77 = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, state);
            }
//            System.out.println(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                String a72 = resultSet.getString("a72");
                String a73 = resultSet.getString("a73");
                double a74 = resultSet.getDouble("a74");
                int a75 = resultSet.getInt("a75");
                int a76 = resultSet.getInt("a76");
                String a77 = resultSet.getString("a77");
                A7 geta7 = new A7(a72, a73, a74, a75, a76, a77);

//                System.out.println(geta7.toString());
                a7ArrayList.add(geta7);
            }
            return a7ArrayList;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCPoolTools.release(connection, preparedStatement, resultSet);
        }
        return null;
    }

    /**
     * @param connection
     * @param name
     * @param type
     * @Description: 搜索A7-a72a73
     */
    @Override
    public A7 A7selecta72a73(Connection connection, String name, String type) {
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        A7 a7 = null;
        try {
            String sql = "SELECT  * FROM A7 WHERE a72 = ? AND a73 = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, type);
//            System.out.println(sql);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                String a72 = resultSet.getString("a72");
                String a73 = resultSet.getString("a73");
                double a74 = resultSet.getDouble("a74");
                int a75 = resultSet.getInt("a75");
                int a76 = resultSet.getInt("a76");
                String a77 = resultSet.getString("a77");
                a7 = new A7(a72, a73, a74, a75, a76, a77);
            }
            return a7;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCPoolTools.release(connection, preparedStatement, resultSet);
        }
        return null;
    }

    /**
     * @param connection
     * @param sum
     *
     * @Description: A7变更数量
     */
    @Override
    public void A7updatea75byA6(Connection connection, int sum, String a77update, String name, String type) {
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
        try {
            String sql = "UPDATE A7 SET a75=?, a77=? WHERE a72 = ? AND a73 = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, sum);
            preparedStatement.setString(2, a77update);
            preparedStatement.setString(3, name);
            preparedStatement.setString(4, type);
            preparedStatement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCPoolTools.release(connection, preparedStatement, resultSet);
        }
    }

    /**
     * @param connection
     * @param newA6
     * @Description: 添加A6
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

    /**
     * @param connection
     * @param newA5
     * @Description: 添加A5
     */
    @Override
    public void A5insert(Connection connection, A5 newA5) {
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
        try{
            String sql = "insert into A5 values (A5_1.nextval, ?, ?, ?, ?, ?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,newA5.getA52());
            preparedStatement.setString(2,newA5.getA53());
            preparedStatement.setInt(3,newA5.getA54());
            preparedStatement.setInt(4,newA5.getA55());
            preparedStatement.setDouble(5,newA5.getA56());
            preparedStatement.setDate(6,newA5.getA57());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCPoolTools.release(connection,preparedStatement,resultSet);
        }
    }

    /**
     * @param connection
     * @Description: 得到所有非完成状态的A4
     */
    @Override
    public ArrayList<A4> A4selectWorking(Connection connection) {
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        A4 a4 = null;
        ArrayList<A4> a4ArrayList = new ArrayList<>();
        try {
            String sql = "SELECT  * FROM A4 WHERE a48 != '维修完成'";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int a41 = resultSet.getInt("a41");
                int a42 = resultSet.getInt("a42");
                String a43 = resultSet.getString("a43");
                String a44 = resultSet.getString("a44");
                Date a45 = resultSet.getDate("a45");
                int a46 = resultSet.getInt("a46");
                String a47 = resultSet.getString("a47");
                String a48 = resultSet.getString("a48");
                String a49 = resultSet.getString("a49");
                a4 = new A4(a41,a42,a43,a44,a45,a46,a47,a48,a49);
                a4ArrayList.add(a4);
            }
            return a4ArrayList;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCPoolTools.release(connection, preparedStatement, resultSet);
        }
        return a4ArrayList;
    }

    /**
     * @param number
     * @Description: 维修编号查A4
     */
    @Override
    public A4 A4selectbyNum(Connection connection ,int number) {
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        A4 a4 = null;
        try {
            String sql = "SELECT  * FROM A4 WHERE a41 = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,number);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int a41 = resultSet.getInt("a41");
                int a42 = resultSet.getInt("a42");
                String a43 = resultSet.getString("a43");
                String a44 = resultSet.getString("a44");
                Date a45 = resultSet.getDate("a45");
                int a46 = resultSet.getInt("a46");
                String a47 = resultSet.getString("a47");
                String a48 = resultSet.getString("a48");
                String a49 = resultSet.getString("a49");
                a4 = new A4(a41,a42,a43,a44,a45,a46,a47,a48,a49);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCPoolTools.release(connection, preparedStatement, resultSet);
        }
        return a4;
    }

    /**
     * @param connection
     * @param a4
     * @Description: 修改A4的A47和a49
     */
    @Override
    public void A4Updatea47Anda49(Connection connection, A4 a4) {
        ResultSet resultSet =null;
        PreparedStatement preparedStatement = null;
        try{
            String sql = "UPDATE A4 SET a47=?, a49=? WHERE a41 = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, a4.getA47());
            preparedStatement.setString(2, a4.getA49());
            preparedStatement.setInt(3,a4.getA41());
            preparedStatement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCPoolTools.release(connection, preparedStatement, resultSet);
        }

    }
}

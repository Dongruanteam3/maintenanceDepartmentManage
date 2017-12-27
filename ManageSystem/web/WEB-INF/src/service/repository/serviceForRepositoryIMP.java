package service.repository;

import bean.repository.A6;
import bean.repository.A7;
import dao.repository.daoForRepositoryIMP;
import tools.JDBCPoolTools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class serviceForRepositoryIMP implements serviceForRepository {

    /**
     * @param newA7
     * @Description: 把一个A7类存到数据库的A7中
     */
    @Override
    public void addNewSpareParts(A7 newA7) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        daoForRepositoryIMP.A7insert(connection, newA7);
    }

    /**
     * @param newA6
     * @Description: 添加一个A6类到数据库A7中
     */
    @Override
    public void addProductIn(A6 newA6) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        daoForRepositoryIMP.A6insert(connection, newA6);

    }
}

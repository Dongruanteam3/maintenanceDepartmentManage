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
     * @Description: ��һ��A7��浽���ݿ��A7��
     */
    @Override
    public void addNewSpareParts(A7 newA7) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        daoForRepositoryIMP.A7insert(connection, newA7);
    }

    /**
     * @param newA6
     * @Description: ���һ��A6�ൽ���ݿ�A7��
     */
    @Override
    public void addProductIn(A6 newA6) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        daoForRepositoryIMP.A6insert(connection, newA6);

    }
}

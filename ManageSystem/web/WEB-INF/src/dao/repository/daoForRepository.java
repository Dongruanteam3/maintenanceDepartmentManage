package dao.repository;

import bean.repair.A4;
import bean.repository.A6;
import bean.repository.A7;

import java.sql.Connection;
import java.util.ArrayList;

public interface daoForRepository {
    /**
    * @Description: 添加A7
    **/
    void A7insert(Connection connection, A7 newA7);

    /**
    * @Description: 添加A6
    **/
    void A6insert(Connection connection, A6 newA6);

    /**
    * @Description: 搜索A7
    **/
    ArrayList<A7> A7select(Connection connection, String state, String name);
    /**
     * @Description: 搜索A7-a72a73
     **/
    A7 A7selecta72a73(Connection connection, String name, String type);
    /**
    * @Description: A7变更数量
    **/
    void A7updatea75byA6(Connection connection, int sum, String a77update , String name, String type);
    /**
    * @Description: 得到所有非完成状态的A4
    **/
    ArrayList<A4> A4selectWorking(Connection connection);
}

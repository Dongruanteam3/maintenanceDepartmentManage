package dao.repository;

import bean.repository.A6;
import bean.repository.A7;

import java.sql.Connection;

public interface daoForRepository {
    /**
    * @Description: ���A7
    **/
    void A7insert(Connection connection, A7 newA7);

    /**
    * @Description: ���A6
    **/
    void A6insert(Connection connection, A6 newA6);
}

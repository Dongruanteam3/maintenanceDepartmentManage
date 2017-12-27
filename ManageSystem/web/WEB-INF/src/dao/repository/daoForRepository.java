package dao.repository;

import bean.repository.A6;
import bean.repository.A7;

import java.sql.Connection;

public interface daoForRepository {
    /**
    * @Description: Ìí¼ÓA7
    **/
    void A7insert(Connection connection, A7 newA7);

    /**
    * @Description: Ìí¼ÓA6
    **/
    void A6insert(Connection connection, A6 newA6);
}

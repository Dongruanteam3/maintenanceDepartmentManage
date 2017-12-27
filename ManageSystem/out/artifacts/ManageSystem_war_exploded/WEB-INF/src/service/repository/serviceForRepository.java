package service.repository;

import bean.repository.A6;
import bean.repository.A7;

public interface serviceForRepository {
    /**
    * @Description: 把一个A7类存到数据库的A7中
    * @param: A7
    **/
    void addNewSpareParts(A7 newA7);

    /**
    * @Description: 添加一个A6类到数据库A7中
    * @param: A6
    **/
    void addProductIn(A6 newA6);
}

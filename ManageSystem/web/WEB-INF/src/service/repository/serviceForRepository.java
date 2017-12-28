package service.repository;

import bean.repair.A4;
import bean.repository.A6;
import bean.repository.A7;

import java.util.ArrayList;

public interface serviceForRepository {
    /**
    * @Description: 把一个A7类存到数据库的A7中
    **/
    void addNewSpareParts(A7 newA7);

    /**
    * @Description: 添加一个A6类到数据库A6中
    **/
    void addProductIn(A6 newA6);

    /**
    * @Description: 搜索得出库存状态 返回A7类
    **/
    ArrayList<A7> selectSpareParts(String state, String name);

    /**
     * @Description: 搜索得出库存数量 返回A7类
     **/
    int selectSparePartsNumber(String name, String type);

    /**
    * @Description: 比如添加了一个入库流水 那么对应的库存表也要加上去 但是注意 只是旧的 新的创建表的时候就有了
    **/
    void addProductInToorepository(A6 newA6);

    /**
    * @Description: 取得A4
    **/
    ArrayList<A4> selectWorkingA4();
}

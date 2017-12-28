package service.repository;

import bean.repair.A4;
import bean.repository.A6;
import bean.repository.A7;
import dao.repository.daoForRepositoryIMP;
import tools.JDBCPoolTools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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

    /**
     * @param newA6
     * @Description: 比如添加了一个入库流水 那么对应的库存表也要加上去 但是注意 只是旧的 新的创建表的时候就有了
     */
    @Override
    public void addProductInToorepository(A6 newA6) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        int add = newA6.getA64();
        // TODO: 2017/12/27  daoForRepositoryIMP.A7updatea75(connection, number);
        //先得到数量来判断是否修改状态 建立一个搜索a7273的dao
        A7 a7 = daoForRepositoryIMP.A7selecta72a73(connection, newA6.getA62(),newA6.getA63());
        int number = a7.getA75();
        int Vigilance = a7.getA76();
        String a77update = null;
        int state = number + add - Vigilance;
        if(state > 0)
            a77update = "正常";
        else if (state == 0 && number+add !=0)
            a77update = "临界";
        else if(number+add >0)
            a77update = "警示";
        else
            a77update = "缺货";
        //完成修改dao
        System.out.println("-----ceshi1-------");
        Connection connection2 = JDBCPoolTools.getConnection();
        daoForRepositoryIMP.A7updatea75byA6(connection2,number+add, a77update, newA6.getA62(), newA6.getA63());
    }

    /**
     * @param state
     * @param name
     * @Description: 搜索得出库存状态 返回A7类
     */
    @Override
    public ArrayList<A7> selectSpareParts(String state, String name) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();

        ArrayList<A7> a7ArrayList = daoForRepositoryIMP.A7select(connection,state,name);
        return a7ArrayList;
    }


    /**
     * @Description: 取得A4
     **/
    @Override
    public ArrayList<A4> selectWorkingA4() {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        ArrayList<A4> a4ArrayList = daoForRepositoryIMP.A4selectWorking(connection);
        return  a4ArrayList;
    }

    /**
     * @param name
     * @param type
     * @Description: 搜索得出库存数量 返回A7类
     */
    @Override
    public int selectSparePartsNumber(String name, String type) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();

        A7 a7 = daoForRepositoryIMP.A7selecta72a73(connection,name,type);
        int num = a7.getA75();
        return num;
    }
}

package service.repository;

import bean.repair.A4;
import bean.repository.A5;
import bean.repository.A6;
import bean.repository.A7;
import bean.repository.NameTypeNumber;
import dao.repository.daoForRepositoryIMP;
import tools.JDBCPool;
import tools.JDBCPoolTools;
import tools.StringTools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

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
        //过滤没有备件需求的维修
        Iterator<A4> a4Iterator = a4ArrayList.iterator();
        ArrayList<A4> newa4ArrayList = new ArrayList<>();
        while (a4Iterator.hasNext())
        {
            A4 a4 = a4Iterator.next();
            if (a4.getA47()!=null || a4.getA49()!=null)
                newa4ArrayList.add(a4);
        }
        return  newa4ArrayList;
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

    /**
     * @param number
     * @Description: 通过编号获取A4
     */
    @Override
    public A4 selectA4byNumber(int number) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        A4  a4 = daoForRepositoryIMP.A4selectbyNum(connection, number);
        return a4;
    }

    /**
     * @param newA5
     * @Description: 添加一个A5类到数据库A5中
     */
    @Override
    public void addProductOut(A5 newA5) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        daoForRepositoryIMP.A5insert(connection, newA5);
    }

    /**
     * @param newA5
     * @Description: 比如添加了一个出库流水 那么对应的库存表也要删掉
     */
    @Override
    public void addProductOutToorepository(A5 newA5) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        int add = newA5.getA55();
        //先得到数量来判断是否修改状态 建立一个搜索a7273的dao
        A7 a7 = daoForRepositoryIMP.A7selecta72a73(connection, newA5.getA52(),newA5.getA53());
        int number = a7.getA75();
        int Vigilance = a7.getA76();
        String a77update = null;
        int state = number - add - Vigilance;
        if(state > 0)
            a77update = "正常";
        else if (state == 0 && number-add !=0)
            a77update = "临界";
        else if(number+add >0)
            a77update = "警示";
        else
            a77update = "缺货";
        //完成修改dao
        Connection connection2 = JDBCPoolTools.getConnection();
        daoForRepositoryIMP.A7updatea75byA6(connection2,number-add, a77update, newA5.getA52(), newA5.getA53());
    }

    /**
     * @param a5
     * @Description: 出库之后修改对应A4的A47部分
     */
    @Override
    public void UpdateA47AfterOutFlow(A5 a5) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        //先搜索到A4
        int a41 = a5.getA54();
        A4 a4 = daoForRepositoryIMP.A4selectbyNum(connection,a41);
        String a47 = a4.getA47();

        ArrayList<NameTypeNumber> nameTypeNumberArrayList = StringTools.stringToArrayList(a47);
        ArrayList<NameTypeNumber> nameTypeNumberArrayList2 = new ArrayList<>();
        Iterator<NameTypeNumber> nameTypeNumberIterator = nameTypeNumberArrayList.iterator();
        while(nameTypeNumberIterator.hasNext()){
            NameTypeNumber nex = nameTypeNumberIterator.next();
            if(nex.getName().equals(a5.getA52()) && nex.getType().equals(a5.getA53()))
                continue;
            nameTypeNumberArrayList2.add(nex);
        }
        String na47 = StringTools.ArrayListToStirng(nameTypeNumberArrayList2);
        a4.setA47(na47);
//        System.out.println(na47);
        //修改A4
       daoForRepositoryIMP.A4Updatea47Anda49(connection, a4);
    }

    /**
     * @param a6
     * @param a41
     * @Description: 新品入库后修改对应A4的A47部分 传入A6
     */
    @Override
    public void UpdateA47A49AfterNewInFlow(A6 a6, int a41) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        //还是先搜索到A4

        A4 a4 = daoForRepositoryIMP.A4selectbyNum(connection,a41);
        String a47 = a4.getA47();
        String a49 = a4.getA49();
        ArrayList<NameTypeNumber> nameTypeNumberArrayList = StringTools.stringToArrayList(a49);
        ArrayList<NameTypeNumber> nameTypeNumberArrayList2 = new ArrayList<>();
        Iterator<NameTypeNumber> nameTypeNumberIterator = nameTypeNumberArrayList.iterator();
        while(nameTypeNumberIterator.hasNext()){
            NameTypeNumber nex = nameTypeNumberIterator.next();
            if(nex.getName().equals(a6.getA62()) && nex.getType().equals(a6.getA63()))
                continue;
            nameTypeNumberArrayList2.add(nex);
        }
        String na49 = StringTools.ArrayListToStirng(nameTypeNumberArrayList2);
        String na47 = StringTools.nullToEmpty(a47)+ a6.getA62() + " " + a6.getA63() + "*" + a6.getA64()+";";
        a4.setA47(na47);
        a4.setA49(na49);
        daoForRepositoryIMP.A4Updatea47Anda49(connection, a4);
    }
}

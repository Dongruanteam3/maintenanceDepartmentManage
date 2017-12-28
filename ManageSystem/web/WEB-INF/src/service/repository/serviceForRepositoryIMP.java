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

    /**
     * @param newA6
     * @Description: ���������һ�������ˮ ��ô��Ӧ�Ŀ���ҲҪ����ȥ ����ע�� ֻ�Ǿɵ� �µĴ������ʱ�������
     */
    @Override
    public void addProductInToorepository(A6 newA6) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        int add = newA6.getA64();
        // TODO: 2017/12/27  daoForRepositoryIMP.A7updatea75(connection, number);
        //�ȵõ��������ж��Ƿ��޸�״̬ ����һ������a7273��dao
        A7 a7 = daoForRepositoryIMP.A7selecta72a73(connection, newA6.getA62(),newA6.getA63());
        int number = a7.getA75();
        int Vigilance = a7.getA76();
        String a77update = null;
        int state = number + add - Vigilance;
        if(state > 0)
            a77update = "����";
        else if (state == 0 && number+add !=0)
            a77update = "�ٽ�";
        else if(number+add >0)
            a77update = "��ʾ";
        else
            a77update = "ȱ��";
        //����޸�dao
        System.out.println("-----ceshi1-------");
        Connection connection2 = JDBCPoolTools.getConnection();
        daoForRepositoryIMP.A7updatea75byA6(connection2,number+add, a77update, newA6.getA62(), newA6.getA63());
    }

    /**
     * @param state
     * @param name
     * @Description: �����ó����״̬ ����A7��
     */
    @Override
    public ArrayList<A7> selectSpareParts(String state, String name) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();

        ArrayList<A7> a7ArrayList = daoForRepositoryIMP.A7select(connection,state,name);
        return a7ArrayList;
    }


    /**
     * @Description: ȡ��A4
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
     * @Description: �����ó�������� ����A7��
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

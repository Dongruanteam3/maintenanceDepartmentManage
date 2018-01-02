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
        //����û�б��������ά��
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

    /**
     * @param number
     * @Description: ͨ����Ż�ȡA4
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
     * @Description: ���һ��A5�ൽ���ݿ�A5��
     */
    @Override
    public void addProductOut(A5 newA5) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        daoForRepositoryIMP.A5insert(connection, newA5);
    }

    /**
     * @param newA5
     * @Description: ���������һ��������ˮ ��ô��Ӧ�Ŀ���ҲҪɾ��
     */
    @Override
    public void addProductOutToorepository(A5 newA5) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        int add = newA5.getA55();
        //�ȵõ��������ж��Ƿ��޸�״̬ ����һ������a7273��dao
        A7 a7 = daoForRepositoryIMP.A7selecta72a73(connection, newA5.getA52(),newA5.getA53());
        int number = a7.getA75();
        int Vigilance = a7.getA76();
        String a77update = null;
        int state = number - add - Vigilance;
        if(state > 0)
            a77update = "����";
        else if (state == 0 && number-add !=0)
            a77update = "�ٽ�";
        else if(number+add >0)
            a77update = "��ʾ";
        else
            a77update = "ȱ��";
        //����޸�dao
        Connection connection2 = JDBCPoolTools.getConnection();
        daoForRepositoryIMP.A7updatea75byA6(connection2,number-add, a77update, newA5.getA52(), newA5.getA53());
    }

    /**
     * @param a5
     * @Description: ����֮���޸Ķ�ӦA4��A47����
     */
    @Override
    public void UpdateA47AfterOutFlow(A5 a5) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        //��������A4
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
        //�޸�A4
       daoForRepositoryIMP.A4Updatea47Anda49(connection, a4);
    }

    /**
     * @param a6
     * @param a41
     * @Description: ��Ʒ�����޸Ķ�ӦA4��A47���� ����A6
     */
    @Override
    public void UpdateA47A49AfterNewInFlow(A6 a6, int a41) {
        Connection connection = JDBCPoolTools.getConnection();
        daoForRepositoryIMP daoForRepositoryIMP = new daoForRepositoryIMP();
        //������������A4

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

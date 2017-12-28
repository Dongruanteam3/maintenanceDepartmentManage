package service.repository;

import bean.repair.A4;
import bean.repository.A6;
import bean.repository.A7;

import java.util.ArrayList;

public interface serviceForRepository {
    /**
    * @Description: ��һ��A7��浽���ݿ��A7��
    **/
    void addNewSpareParts(A7 newA7);

    /**
    * @Description: ���һ��A6�ൽ���ݿ�A6��
    **/
    void addProductIn(A6 newA6);

    /**
    * @Description: �����ó����״̬ ����A7��
    **/
    ArrayList<A7> selectSpareParts(String state, String name);

    /**
     * @Description: �����ó�������� ����A7��
     **/
    int selectSparePartsNumber(String name, String type);

    /**
    * @Description: ���������һ�������ˮ ��ô��Ӧ�Ŀ���ҲҪ����ȥ ����ע�� ֻ�Ǿɵ� �µĴ������ʱ�������
    **/
    void addProductInToorepository(A6 newA6);

    /**
    * @Description: ȡ��A4
    **/
    ArrayList<A4> selectWorkingA4();
}

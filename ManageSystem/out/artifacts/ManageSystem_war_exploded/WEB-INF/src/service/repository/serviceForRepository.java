package service.repository;

import bean.repair.A4;
import bean.repository.A5;
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
     * @Description: ���һ��A5�ൽ���ݿ�A5��
     **/
    void addProductOut(A5 newA5);

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
     * @Description: ���������һ��������ˮ ��ô��Ӧ�Ŀ���ҲҪɾ��
     **/
    void addProductOutToorepository(A5 newA5);

    /**
    * @Description: ȡ��A4
    **/
    ArrayList<A4> selectWorkingA4();
    /**
     * @Description: ͨ����Ż�ȡA4
     **/
    A4 selectA4byNumber(int number);
    /**
     * @Description: ����֮���޸Ķ�ӦA4��A47���� ����A5
     **/
    void UpdateA47AfterOutFlow(A5 a5);
    /**
     * @Description: ��Ʒ�����޸Ķ�ӦA4��A47���� ����A6
     **/
    void UpdateA47A49AfterNewInFlow(A6 a6, int a41);
}

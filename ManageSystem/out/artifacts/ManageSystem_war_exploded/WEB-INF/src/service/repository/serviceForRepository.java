package service.repository;

import bean.repository.A6;
import bean.repository.A7;

public interface serviceForRepository {
    /**
    * @Description: ��һ��A7��浽���ݿ��A7��
    * @param: A7
    **/
    void addNewSpareParts(A7 newA7);

    /**
    * @Description: ���һ��A6�ൽ���ݿ�A7��
    * @param: A6
    **/
    void addProductIn(A6 newA6);
}

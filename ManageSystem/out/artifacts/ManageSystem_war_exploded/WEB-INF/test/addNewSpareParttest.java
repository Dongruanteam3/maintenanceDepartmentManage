import bean.repository.A6;
import bean.repository.A7;
import service.repository.serviceForRepositoryIMP;

import java.sql.Date;

public class addNewSpareParttest {
    public static void main(String[] args) {
        A7 test = new A7(99,"�ߴ�","������",750,10,5,"����");
        A6 test6 = new A6("�ߴ�", "������", 60, 1220, Date.valueOf("1996-11-26"));
        serviceForRepositoryIMP serviceForRepositoryIMP = new serviceForRepositoryIMP();
        serviceForRepositoryIMP.addProductIn(test6);
    }
}

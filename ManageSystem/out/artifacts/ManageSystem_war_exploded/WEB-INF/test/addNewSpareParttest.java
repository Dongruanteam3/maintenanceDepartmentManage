import bean.repair.A4;
import bean.repository.A6;
import bean.repository.A7;
import service.repository.serviceForRepositoryIMP;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

public class addNewSpareParttest {
    public static void main(String[] args) {
        A7 test = new A7(99,"�ߴ�3","������2",750,10,5,"ȱ��");
        A6 test6 = new A6("�ߴ�", "������", 60, 1220, Date.valueOf("1996-11-26"));
        serviceForRepositoryIMP serviceForRepositoryIMP = new serviceForRepositoryIMP();
//        serviceForRepositoryIMP.addProductIn(test6);
//        serviceForRepositoryIMP.addNewSpareParts(test);
//        String state = "All";
//        String name = "�ߴ�1";
////        serviceForRepositoryIMP.selectSpareParts(state,namooe);
////        serviceForRepositoryIMP.addProductInToorepository(test6);
//        ArrayList<A4> a4ArrayList =  serviceForRepositoryIMP.selectWorkingA4();
//        Iterator<A4> a4Iterator = a4ArrayList.iterator();
//        while(a4Iterator.hasNext()){
//            A4 a4 = a4Iterator.next();
//            System.out.println(a4.toString());
        int num = serviceForRepositoryIMP.selectSparePartsNumber("����","����222");
        System.out.println(num);
        }

}

import bean.repair.A4;
import bean.repository.A6;
import bean.repository.A7;
import service.repository.serviceForRepositoryIMP;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

public class addNewSpareParttest {
    public static void main(String[] args) {
        A7 test = new A7(99,"高达3","独角兽2",750,10,5,"缺货");
        A6 test6 = new A6("高达", "独角兽", 60, 1220, Date.valueOf("1996-11-26"));
        serviceForRepositoryIMP serviceForRepositoryIMP = new serviceForRepositoryIMP();
//        serviceForRepositoryIMP.addProductIn(test6);
//        serviceForRepositoryIMP.addNewSpareParts(test);
//        String state = "All";
//        String name = "高达1";
////        serviceForRepositoryIMP.selectSpareParts(state,namooe);
////        serviceForRepositoryIMP.addProductInToorepository(test6);
//        ArrayList<A4> a4ArrayList =  serviceForRepositoryIMP.selectWorkingA4();
//        Iterator<A4> a4Iterator = a4ArrayList.iterator();
//        while(a4Iterator.hasNext()){
//            A4 a4 = a4Iterator.next();
//            System.out.println(a4.toString());
//        serviceForRepositoryIMP.addProductIn(test6);
//        serviceForRepositoryIMP.addProductInToorepository(test6);
//        serviceForRepositoryIMP.addProductIn(test6);
//        serviceForRepositoryIMP.addProductInToorepository(test6);

        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        serviceForRepositoryIMP.addProductInToorepository(test6);
        }

}

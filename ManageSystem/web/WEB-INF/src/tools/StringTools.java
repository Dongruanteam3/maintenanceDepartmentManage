package tools;

import bean.repository.NameTypeNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringTools {
    public static String emptyToNull(String str){
        if (str == "")
            return null;
        else return str;
    }
    public static String nullToEmpty(String str){
        if(str == null)
            str = "";
        return str;
    }
    public static ArrayList<NameTypeNumber> stringToArrayList(String str){
        ArrayList<NameTypeNumber> arrayList = new ArrayList<>();
        ArrayList<String> strings =new ArrayList<>();
        String[] str1 = str.split(";");
        for(String string1 : str1){
            string1 = string1.trim();
            String[] str2 = string1.split("\\*");
            for(String string2: str2){
//                System.out.println(string2);
                string2 = string2.trim();
                String[] str3 = string2.split(" ");
                for (String string3: str3)
                    strings.add(string3);
            }
        }
        Iterator<String> iterator = strings.iterator();
        while(true){
            NameTypeNumber nameTypeNumber = new NameTypeNumber();
            if (iterator.hasNext()) {
                String test = iterator.next();
                nameTypeNumber.setName(test);
            }
            if (iterator.hasNext())
                nameTypeNumber.setType(iterator.next());
            if (iterator.hasNext()) {
                nameTypeNumber.setNumber(Integer.valueOf(iterator.next()));
                //System.out.println(nameTypeNumber.toString());
                arrayList.add(nameTypeNumber);
            }
            else{
                break;
            }
        }
     return arrayList;
    }



}

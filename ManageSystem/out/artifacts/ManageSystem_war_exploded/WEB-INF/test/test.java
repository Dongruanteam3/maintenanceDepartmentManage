import bean.repository.NameTypeNumber;
import tools.StringTools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String test = "≤‚ ‘ ≤‚ ‘222*4;∏ﬂ¥Ô ∂¿Ω« ﬁ*3; ≤‚ ‘ ≤‚ ‘222*4;∏ﬂ¥Ô ∂¿Ω« ﬁ*3";
        String te2 = "";
        ArrayList<NameTypeNumber> arrayList = StringTools.stringToArrayList("test tset*3");
        Iterator<NameTypeNumber> iterator = arrayList.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next().toString());
    }
}

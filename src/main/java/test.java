import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Project name(项目名称)：遍历Map集合
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/20
 * Time(创建时间)： 9:58
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> p = new HashMap<Integer, String>();
        p.put(1, "one");
        p.put(2, "two");
        p.put(3, "three");
        p.put(4, "four");
        p.put(5, "five");
        p.put(6, "six");
        p.put(7, "seven");
        p.put(8, "eight");
        for (Integer i : p.keySet())
        {
            System.out.println(i);
        }
        for (String s : p.values())
        {
            System.out.println(s);
        }
        for (Integer i : p.keySet())
        {
            System.out.println(i + " , " + p.get(i));
        }
        Iterator<Map.Entry<Integer, String>> entry = p.entrySet().iterator();
        while (entry.hasNext())
        {
            Entry<Integer, String> e = entry.next();
            Integer key = e.getKey();
            String value = e.getValue();
            System.out.println(key + " , " + value);
        }
    }
}

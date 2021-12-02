
import java.util.Collection;
import java.util.HashSet;//引包
import java.util.Iterator;
import java.util.Set;

public class MainTest {
    public static void main(String[] args) {

        //自定义二元组、三元组
        Tuple2<Integer, String> tp2 = new Tuple2<Integer, String>(10, "haha");
        System.out.println(tp2.getLeft() + tp2.getRight());

        Tuple3<Integer, String, Boolean> t3p = new Tuple3<Integer, String, Boolean>(10, "haha", true);
        System.out.println(t3p.getLeft() + t3p.getMiddle() + t3p.getRight());

        //集合 Set 和 HashSet
        HashSet<myClass> hashSet = new HashSet<myClass>();
        hashSet.add(new myClass("小明"));
        hashSet.add(new myClass("炫羽"));
        hashSet.add(new myClass("天宇"));
        System.out.println(hashSet);
        for (myClass iter : hashSet)
            System.out.println(iter.name);

        Set<myClass> sss = new HashSet<myClass>();
        sss.add(new myClass("大一"));
        sss.add(new myClass("大二"));
        sss.add(new myClass("大三"));
        for (myClass iter : sss)
            System.out.println(iter.name);
    }
}

import java.util.Arrays;

public class hello{
    public static void main (String[] args){
        System.out.println("HelloWorld!");//普通打印
        System.out.println(133);//普通打印
        System.out.println(true);//普通打印

        int data[] = new int[3]; /*开辟了一个长度为3的数组*/
        data[0] = 10; // 第一个元素
        data[1] = 20; // 第二个元素
        data[2] = 30; // 第三个元素
        System.out.println(data);//
        System.out.println(Arrays.toString(data));//
//        for(int a:data)
//            System.out.println(a);
//        for(int i=0;i<data.length;i++)
//            System.out.println(data[i]);

        System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());//当前行
    }
}